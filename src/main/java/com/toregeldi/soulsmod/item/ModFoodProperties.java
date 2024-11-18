package com.toregeldi.soulsmod.item;

import com.toregeldi.soulsmod.effect.ModEffects;
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

    public static final FoodProperties BLACKBERRY_JUICE = new FoodProperties.Builder()
            .nutrition(6)
            .effect(() -> new MobEffectInstance(ModEffects.FRESHNESS, 2000, 0), 100)
            .usingConvertsTo(ModItems.BOTTLE)
            .build();
    public static final FoodProperties BLUEBERRY_JUICE = new FoodProperties.Builder()
            .nutrition(6)
            .effect(() -> new MobEffectInstance(ModEffects.FRESHNESS, 2000, 0), 100)
            .usingConvertsTo(ModItems.BOTTLE)
            .build();
    public static final FoodProperties RASPBERRY_JUICE = new FoodProperties.Builder()
            .nutrition(6)
            .effect(() -> new MobEffectInstance(ModEffects.FRESHNESS, 2000, 0), 100)
            .usingConvertsTo(ModItems.BOTTLE)
            .build();
    public static final FoodProperties STRAWBERRY_JUICE = new FoodProperties.Builder()
            .nutrition(6)
            .effect(() -> new MobEffectInstance(ModEffects.FRESHNESS, 2000, 0), 100)
            .usingConvertsTo(ModItems.BOTTLE)
            .build();
    public static final FoodProperties ORANGE_JUICE = new FoodProperties.Builder()
            .nutrition(6)
            .effect(() -> new MobEffectInstance(ModEffects.FRESHNESS, 2000, 0), 100)
            .usingConvertsTo(ModItems.BOTTLE)
            .build();
    public static final FoodProperties LEMON_JUICE = new FoodProperties.Builder()
            .nutrition(6)
            .effect(() -> new MobEffectInstance(ModEffects.FRESHNESS, 2000, 0), 100)
            .usingConvertsTo(ModItems.BOTTLE)
            .build();
    public static final FoodProperties SWEET_BERRIES_JUICE = new FoodProperties.Builder()
            .nutrition(6)
            .effect(() -> new MobEffectInstance(ModEffects.FRESHNESS, 2000, 0), 100)
            .usingConvertsTo(ModItems.BOTTLE)
            .build();

    public static final FoodProperties ESTUS_FLASK = new FoodProperties.Builder()
            .nutrition(10)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 300, 4), 100)
            .alwaysEdible()
            .usingConvertsTo(ModItems.BOTTLE)
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