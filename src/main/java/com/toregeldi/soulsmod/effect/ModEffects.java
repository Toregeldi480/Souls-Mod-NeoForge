package com.toregeldi.soulsmod.effect;

import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.effect.custom.FreshnessEffect;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, SoulsMod.MOD_ID);

    public static final Holder<MobEffect> FRESHNESS_EFFECT = MOB_EFFECTS.register("freshness",
            () -> new FreshnessEffect(MobEffectCategory.BENEFICIAL, 0xffffff));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
