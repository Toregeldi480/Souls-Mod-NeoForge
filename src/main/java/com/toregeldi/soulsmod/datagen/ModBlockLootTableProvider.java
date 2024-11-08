package com.toregeldi.soulsmod.datagen;

import com.toregeldi.soulsmod.block.ModBlocks;
import com.toregeldi.soulsmod.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        add(ModBlocks.PALLADIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.PALLADIUM_ORE.get(), ModItems.PALLADIUM_INGOT.get(), 2, 5));
        add(ModBlocks.TITANIUM_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.TITANIUM_ORE.get(), ModItems.TITANIUM_INGOT.get(), 2, 5));
        add(ModBlocks.RUBY_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get(), 2, 5));
        add(ModBlocks.SAPPHIRE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.SAPPHIRE.get(), 2, 5));
        add(ModBlocks.TOPAZ_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.TOPAZ_ORE.get(), ModItems.TOPAZ.get(), 2, 5));
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
