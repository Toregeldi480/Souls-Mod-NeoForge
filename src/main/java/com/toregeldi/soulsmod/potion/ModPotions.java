package com.toregeldi.soulsmod.potion;

import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.effect.ModEffects;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
        DeferredRegister.create(BuiltInRegistries.POTION, SoulsMod.MOD_ID);

    public static final Holder<Potion> MINT_WATER = POTIONS.register("mint_water",
            () -> new Potion(new MobEffectInstance(ModEffects.FRESHNESS, 2000, 0)));

    public static final Holder<Potion> JUICE = POTIONS.register("juice",
            () -> new Potion(new MobEffectInstance(ModEffects.FRESHNESS, 2000, 0)));

    public static final Holder<Potion> ESTUS_FLASK = POTIONS.register("estus_flask",
        () -> new Potion(new MobEffectInstance(MobEffects.REGENERATION, 300, 3)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}