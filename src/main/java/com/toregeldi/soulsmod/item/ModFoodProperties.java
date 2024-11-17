package com.toregeldi.soulsmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties MINT = new FoodProperties.Builder()
            .nutrition(1)
            .build();
    public static final FoodProperties BLACKBERRY = new FoodProperties.Builder()
            .nutrition(3)
            .build();
    public static final FoodProperties BLUEBERRY = new FoodProperties.Builder()
            .nutrition(3)
            .build();
    public static final FoodProperties RASPBERRY = new FoodProperties.Builder()
            .nutrition(3)
            .build();
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder()
            .nutrition(3)
            .build();
    public static final FoodProperties ORANGE = new FoodProperties.Builder()
            .nutrition(3)
            .build();
    public static final FoodProperties LEMON = new FoodProperties.Builder()
            .nutrition(3)
            .build();

    public static final FoodProperties RUBY_APPLE = new FoodProperties.Builder()
            .nutrition(5)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 1800, 2), 100)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 10, 2), 100)
            .build();

    public static final FoodProperties SAPPHIRE_APPLE = new FoodProperties.Builder()
            .nutrition(5)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 1), 100)
            .build();

    public static final FoodProperties TOPAZ_APPLE = new FoodProperties.Builder()
            .nutrition(5)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 1), 100)
            .build();
}