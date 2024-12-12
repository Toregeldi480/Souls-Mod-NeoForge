package com.toregeldi.soulsmod.worldgen.features;

import com.toregeldi.soulsmod.SoulsMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.HugeMushroomFeatureConfiguration;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModFeatures{
    public static final DeferredRegister<Feature<?>> MOD_FEATURES = DeferredRegister.create(BuiltInRegistries.FEATURE, SoulsMod.MOD_ID);

    public void register(IEventBus eventBus) {
        MOD_FEATURES.register(eventBus);
    }
}
