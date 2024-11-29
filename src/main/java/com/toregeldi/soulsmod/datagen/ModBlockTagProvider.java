package com.toregeldi.soulsmod.datagen;

import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.block.ModBlocks;
import com.toregeldi.soulsmod.util.ModTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SoulsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.PLATINUM_ORE.get())
                .add(ModBlocks.PALLADIUM_ORE.get())
                .add(ModBlocks.TITANIUM_ORE.get())
                .add(ModBlocks.CHLOROPHYTE_ORE.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.TOPAZ_ORE.get());


        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PLATINUM_ORE.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.TOPAZ_ORE.get());

        tag(ModTags.Blocks.NEEDS_PLATINUM_TOOL)
                .add(ModBlocks.PALLADIUM_ORE.get());

        tag(ModTags.Blocks.NEEDS_PALLADIUM_TOOL)
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.DIAMOND_BLOCK);

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TITANIUM_ORE.get());

        tag(ModTags.Blocks.NEEDS_TITANIUM_TOOL)
                .add(ModBlocks.CHLOROPHYTE_ORE.get());

        tag(ModTags.Blocks.NEEDS_CHLOROPHYTE_TOOL)
                .add(Blocks.NETHERITE_BLOCK)
                .add(Blocks.NETHERRACK);

        tag(ModTags.Blocks.NEEDS_SPECTRE_TOOL)
                .add(Blocks.NETHERITE_BLOCK)
                .add(Blocks.NETHERRACK);

        tag(ModTags.Blocks.NEEDS_SHROOMITE_TOOL)
                .add(Blocks.NETHERITE_BLOCK)
                .add(Blocks.NETHERRACK);


        tag(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .addTag(ModTags.Blocks.NEEDS_PLATINUM_TOOL)
                .addTag(ModTags.Blocks.INCORRECT_FOR_PLATINUM_TOOL)
                .add(Blocks.DIAMOND_ORE)
                .add(Blocks.DEEPSLATE_DIAMOND_ORE)
                .add(Blocks.DIAMOND_BLOCK);

        tag(ModTags.Blocks.INCORRECT_FOR_PLATINUM_TOOL)
                .addTag(ModTags.Blocks.NEEDS_PALLADIUM_TOOL)
                .addTag(ModTags.Blocks.INCORRECT_FOR_PALLADIUM_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_PALLADIUM_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);

        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .addTag(ModTags.Blocks.NEEDS_TITANIUM_TOOL)
                .addTag(ModTags.Blocks.INCORRECT_FOR_TITANIUM_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_TITANIUM_TOOL)
                .addTag(ModTags.Blocks.NEEDS_CHLOROPHYTE_TOOL)
                .addTag(ModTags.Blocks.INCORRECT_FOR_CHLOROPHYTE_TOOL)
                .add(Blocks.NETHERRACK)
                .add(Blocks.NETHERITE_BLOCK);

        tag(ModTags.Blocks.INCORRECT_FOR_CHLOROPHYTE_TOOL)
                .addTag(ModTags.Blocks.INCORRECT_FOR_NETHERITE_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_NETHERITE_TOOL);
    }
}
