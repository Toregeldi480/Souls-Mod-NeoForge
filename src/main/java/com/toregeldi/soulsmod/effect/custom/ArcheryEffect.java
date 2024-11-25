package com.toregeldi.soulsmod.effect.custom;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class ArcheryEffect extends MobEffect {
    public ArcheryEffect(MobEffectCategory category, int color) {
        super(category, color);
    }


    @Override
    public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
        onMobHurt(livingEntity, 2, livingEntity.damageSources().source(DamageTypes.ARROW), 10);

        return super.applyEffectTick(livingEntity, amplifier);
    }

    @Override
    public void onMobHurt(LivingEntity livingEntity, int amplifier, DamageSource damageSource, float amount) {
        if(damageSource.is(DamageTypes.ARROW)) {
            livingEntity.getProjectile(livingEntity.getMainHandItem()).setDamageValue(livingEntity.getMainHandItem().getDamageValue() + ((int) amount));
        }

        super.onMobHurt(livingEntity, amplifier, damageSource, amount);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}
