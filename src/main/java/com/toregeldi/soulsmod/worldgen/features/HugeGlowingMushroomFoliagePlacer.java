package com.toregeldi.soulsmod.worldgen.features;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.DarkOakFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

public class HugeGlowingMushroomFoliagePlacer extends FoliagePlacer {
    private IntProvider radius;
    private IntProvider offset;

    public HugeGlowingMushroomFoliagePlacer(IntProvider radius, IntProvider offset) {
        super(radius, offset);
        this.radius = radius;
        this.offset = offset;
    }


    @Override
    protected FoliagePlacerType<?> type() {
        return ModFoliagePlacerTypes();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader level, FoliageSetter blockSetter, RandomSource random, TreeConfiguration config, int maxFreeTreeHeight, FoliageAttachment attachment, int foliageHeight, int foliageRadius, int offset) {
        BlockPos blockpos = attachment.pos().above(offset);

        for(int i = 10; i > 0; i--) {
            this.placeLeavesRow(level, blockSetter, random, config, blockpos, 11, i, false);
        }
    }

    @Override
    public int foliageHeight(RandomSource random, int height, TreeConfiguration config) {
        return 0;
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource random, int localX, int localY, int localZ, int range, boolean large) {
        return false;
    }
}
