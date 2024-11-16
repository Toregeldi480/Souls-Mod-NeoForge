package com.toregeldi.soulsmod.event;

import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.item.ModItems;
import com.toregeldi.soulsmod.potion.ModPotions;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;

@EventBusSubscriber(modid = SoulsMod.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void onBrewingRecipeRegister(RegisterBrewingRecipesEvent event) {
        PotionBrewing.Builder builder = event.getBuilder();

        builder.addMix(Potions.WATER, ModItems.MINT.get(), ModPotions.MINT_WATER);

        builder.addMix(ModPotions.MINT_WATER, ModItems.CRANBERRY.get(), ModPotions.CRANBERRY_JUICE);
        builder.addMix(ModPotions.MINT_WATER, ModItems.BLACKBERRY.get(), ModPotions.BLACKBERRY_JUICE);
        builder.addMix(ModPotions.MINT_WATER, ModItems.BLUEBERRY.get(), ModPotions.BLUEBERRY_JUICE);
        builder.addMix(ModPotions.MINT_WATER, ModItems.RASPBERRY.get(), ModPotions.RASPBERRY_JUICE);
        builder.addMix(ModPotions.MINT_WATER, ModItems.STRAWBERRY.get(), ModPotions.STRAWBERRY_JUICE);
        builder.addMix(ModPotions.MINT_WATER, ModItems.ORANGE.get(), ModPotions.ORANGE_JUICE);
        builder.addMix(ModPotions.MINT_WATER, ModItems.LEMON.get(), ModPotions.LEMON_JUICE);

        builder.addMix(ModPotions.ORANGE_JUICE, ModItems.LEMON.get(), ModPotions.ESTUS_FLASK);
        builder.addMix(ModPotions.LEMON_JUICE, ModItems.ORANGE.get(), ModPotions.ESTUS_FLASK);

    }
}