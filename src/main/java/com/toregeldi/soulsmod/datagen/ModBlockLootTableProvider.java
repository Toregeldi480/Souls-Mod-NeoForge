package com.toregeldi.soulsmod.datagen;

import com.toregeldi.soulsmod.block.ModBlocks;
import com.toregeldi.soulsmod.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        add(ModBlocks.PLATINUM_ORE.get(),
                block -> createOreDrop(ModBlocks.PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get()));
        add(ModBlocks.PALLADIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.PALLADIUM_ORE.get(), ModItems.RAW_PALLADIUM.get()));
        add(ModBlocks.TITANIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.TITANIUM_ORE.get(), ModItems.RAW_TITANIUM.get()));
        add(ModBlocks.CHLOROPHYTE_ORE.get(),
                block -> createOreDrop(ModBlocks.CHLOROPHYTE_ORE.get(), ModItems.RAW_CHLOROPHYTE.get()));

        add(ModBlocks.RUBY_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get(), 2, 5));
        add(ModBlocks.SAPPHIRE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get(), 2, 5));
        add(ModBlocks.TOPAZ_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.TOPAZ_ORE.get(), ModItems.TOPAZ.get(), 2, 5));

        dropSelf(ModBlocks.GLOWING_MUSHROOM.get());

        add(ModBlocks.GLOWING_MUSHROOM_BLOCK.get(),
                block -> createMushroomBlockDrop(ModBlocks.GLOWING_MUSHROOM_BLOCK.get(), ModBlocks.GLOWING_MUSHROOM.get()));

//        dropSelf(ModBlocks.AUTOHAMMER.get());

        createBushDrop(ModBlocks.MINT_BUSH.get(), ModItems.MINT.get());
        createBushDrop(ModBlocks.BLACKBERRY_BUSH.get(), ModItems.BLACKBERRY.get());
        createBushDrop(ModBlocks.BLUEBERRY_BUSH.get(), ModItems.BLACKBERRY.get());
        createBushDrop(ModBlocks.RASPBERRY_BUSH.get(), ModItems.RASPBERRY.get());
        createBushDrop(ModBlocks.STRAWBERRY_BUSH.get(), ModItems.STRAWBERRY.get());
    }

    protected void createBushDrop(Block bushBlock, Item item) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        this.add(bushBlock, block -> this.applyExplosionDecay(
                block, LootTable.lootTable().withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(bushBlock)
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3))
                                ).add(LootItem.lootTableItem(item))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))
                ).withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(bushBlock)
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2))
                                ).add(LootItem.lootTableItem(item))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))
                )));
    }

    protected LootTable.Builder createMultipleOreDrops(Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block,
                this.applyExplosionDecay(block, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))
                ));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
