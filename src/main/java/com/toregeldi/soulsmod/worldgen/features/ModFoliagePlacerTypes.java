package com.toregeldi.soulsmod.worldgen.features;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

public class ModFoliagePlacerTypes<P extends FoliagePlacer> {
    public static final FoliagePlacerType<HugeGlowingMushroomFoliagePlacer> HUGE_GLOWING_MUSHROOM_FOLIAGE_PLACER_TYPE = register("huge_glowing_mushroom_foliage_placer_type",
            HugeGlowingMushroomFoliagePlacer);

    private static <P extends FoliagePlacer> FoliagePlacerType<P> register(String name, MapCodec<P> codec) {
        return Registry.register(BuiltInRegistries.FOLIAGE_PLACER_TYPE, name, new FoliagePlacerType<>(codec));
    }
}
