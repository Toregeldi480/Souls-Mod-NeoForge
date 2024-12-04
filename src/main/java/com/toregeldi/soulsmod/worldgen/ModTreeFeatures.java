package com.toregeldi.soulsmod.worldgen;

import com.toregeldi.soulsmod.block.ModBlocks;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HugeMushroomBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.HugeMushroomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class ModTreeFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> HUGE_SHROOMITE = FeatureUtils.createKey("huge_shroomite");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<Block> holder = context.lookup(Registries.BLOCK);

        FeatureUtils.register(
                context,
                HUGE_SHROOMITE,
                Feature.HUGE_BROWN_MUSHROOM,
                new HugeMushroomFeatureConfiguration(
                        BlockStateProvider.simple(
                                ModBlocks.GLOWING_MUSHROOM_BLOCK.get()
                                        .defaultBlockState()
                                        .setValue(HugeMushroomBlock.UP, Boolean.valueOf(true))
                                        .setValue(HugeMushroomBlock.DOWN, Boolean.valueOf(false))
                        ),
                        BlockStateProvider.simple(
                                Blocks.MUSHROOM_STEM
                                        .defaultBlockState()
                                        .setValue(HugeMushroomBlock.UP, Boolean.valueOf(false))
                                        .setValue(HugeMushroomBlock.DOWN, Boolean.valueOf(false))
                        ),
                        4
                )
        );
    }
}
