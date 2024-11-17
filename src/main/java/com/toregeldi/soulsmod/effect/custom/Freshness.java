package com.toregeldi.soulsmod.effect.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class Freshness extends MobEffect {
    public Freshness(MobEffectCategory category, int color) {
            super(category, color);
    }


    @Override
    public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
        livingEntity.addEffect(new MobEffectInstance(MobEffects.LUCK, 4000, 1, true, false, false));
        livingEntity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 4000, 1, true, false, false));
        livingEntity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 4000, 1,true, false, false));

        return super.applyEffectTick(livingEntity, amplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}
