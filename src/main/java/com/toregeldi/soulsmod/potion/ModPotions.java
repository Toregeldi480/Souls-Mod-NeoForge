package com.toregeldi.soulsmod.potion;

import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.effect.ModEffects;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionContents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
        DeferredRegister.create(BuiltInRegistries.POTION, SoulsMod.MOD_ID);

    public static final Holder<Potion> MINT_WATER = POTIONS.register("mint_water",
            () -> new Potion(new MobEffectInstance(ModEffects.MINT_EFFECT, 4000, 0)));
    public static final Holder<Potion> CRANBERRY_JUICE = POTIONS.register("cranberry_juice",
            () -> new Potion(new MobEffectInstance(ModEffects.CRANBERRY, 4000, 0)));
    public static final Holder<Potion> BLACKBERRY_JUICE = POTIONS.register("blackberry_juice",
            () -> new Potion(new MobEffectInstance(ModEffects.BLACKBERRY_EFFECT, 4000, 0)));
    public static final Holder<Potion> BLUEBERRY_JUICE = POTIONS.register("blueberry_juice",
            () -> new Potion(new MobEffectInstance(ModEffects.BLUEBERRY_EFFECT, 4000, 0)));
    public static final Holder<Potion> RASPBERRY_JUICE = POTIONS.register("raspberry_juice",
            () -> new Potion(new MobEffectInstance(ModEffects.RASPBERRY_EFFECT, 4000, 0)));
    public static final Holder<Potion> STRAWBERRY_JUICE = POTIONS.register("strawberry_juice",
            () -> new Potion(new MobEffectInstance(ModEffects.STRAWBERRY_EFFECT, 4000, 0)));
    public static final Holder<Potion> ORANGE_JUICE = POTIONS.register("orange_juice",
            () -> new Potion(new MobEffectInstance(ModEffects.ORANGE_EFFECT, 4000, 0)));
    public static final Holder<Potion> LEMON_JUICE = POTIONS.register("lemon_juice",
            () -> new Potion(new MobEffectInstance(ModEffects.LEMON_EFFECT, 4000, 0)));

    public static final Holder<Potion> ESTUS_FLASK = POTIONS.register("estus_flask",
        () -> new Potion(new MobEffectInstance(MobEffects.REGENERATION, 300, 3)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}