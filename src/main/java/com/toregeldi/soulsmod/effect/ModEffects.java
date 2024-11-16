package com.toregeldi.soulsmod.effect;

import com.toregeldi.soulsmod.SoulsMod;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, SoulsMod.MOD_ID);

    public static final Holder<MobEffect> MINT_EFFECT = MOB_EFFECTS.register("mint_effect",
            () -> new FreshnessEffect(MobEffectCategory.BENEFICIAL, 0xe1fae8));
    public static final Holder<MobEffect> CRANBERRY = MOB_EFFECTS.register("cranberry_effect",
            () -> new FreshnessEffect(MobEffectCategory.BENEFICIAL, 0xfc3232));
    public static final Holder<MobEffect> BLACKBERRY_EFFECT = MOB_EFFECTS.register("blackberry_effect",
            () -> new FreshnessEffect(MobEffectCategory.BENEFICIAL, 0x7c3499));
    public static final Holder<MobEffect> BLUEBERRY_EFFECT = MOB_EFFECTS.register("blueberry_effect",
            () -> new FreshnessEffect(MobEffectCategory.BENEFICIAL, 0x873ac2));
    public static final Holder<MobEffect> RASPBERRY_EFFECT = MOB_EFFECTS.register("raspberry_effect",
            () -> new FreshnessEffect(MobEffectCategory.BENEFICIAL, 0xde7cab));
    public static final Holder<MobEffect> STRAWBERRY_EFFECT = MOB_EFFECTS.register("strawberry_effect",
            () -> new FreshnessEffect(MobEffectCategory.BENEFICIAL, 0xe61042));
    public static final Holder<MobEffect> ORANGE_EFFECT = MOB_EFFECTS.register("orange_effect",
            () -> new FreshnessEffect(MobEffectCategory.BENEFICIAL, 0xf7b440));
    public static final Holder<MobEffect> LEMON_EFFECT = MOB_EFFECTS.register("lemon_effect",
            () -> new FreshnessEffect(MobEffectCategory.BENEFICIAL, 0xedfaac));


    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
