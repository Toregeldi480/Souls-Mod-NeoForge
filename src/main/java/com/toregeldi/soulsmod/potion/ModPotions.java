package com.toregeldi.soulsmod.potion;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS = 
        DeferredRegister.create(BuiltInRegistries.POTION, Soulsmod.MOD_ID);

    public static final Holder<Potion> ESTUS_FLASK = POTIONS.register("estus_flask",
        () -> new Potion(new MobEffectInstance(Effects.HEAL, 3000, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}