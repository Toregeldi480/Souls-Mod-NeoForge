package com.toregeldi.soulsmod.event;

import com.toregeldi.soulsmod.SoulsMod;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;

import java.util.List;

@EventBusSubscriber(modid = SoulsMod.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void onBrewingRecipeRegister(RegisterBrewingRecipesEvent event) {

        PotionBrewing.Builder builder = event.getBuilder();

    }
}