package com.toregeldi.soulsmod;

import com.toregeldi.soulsmod.block.ModBlocks;
import com.toregeldi.soulsmod.item.ModCreativeTabs;
import com.toregeldi.soulsmod.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(SoulsMod.MOD_ID)
public class SoulsMod
{
    public static final String MOD_ID = "soulsmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SoulsMod(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        ModCreativeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.RUBY_APPLE);
            event.accept(ModItems.SAPPHIRE_APPLE);

            event.accept(ModItems.RAW_PLATINUM);
            event.accept(ModItems.RAW_HELLSTONE);
            event.accept(ModItems.RAW_CHLOROPHYTE);
            event.accept(ModItems.RAW_SPECTRE);
            event.accept(ModItems.RAW_SHROOMITE);
            event.accept(ModItems.RAW_PALLADIUM);
            event.accept(ModItems.RAW_TITANIUM);

            event.accept(ModItems.PLATINUM_HELMET);
            event.accept(ModItems.HELLSTONE_HELMET);
            event.accept(ModItems.CHLOROPHYTE_HELMET);
            event.accept(ModItems.SPECTRE_HELMET);
            event.accept(ModItems.SHROOMITE_HELMET);
            event.accept(ModItems.PALLADIUM_HELMET);
            event.accept(ModItems.TITANIUM_HELMET);

            event.accept(ModItems.PLATINUM_CHESTPLATE);
            event.accept(ModItems.HELLSTONE_CHESTPLATE);
            event.accept(ModItems.CHLOROPHYTE_CHESTPLATE);
            event.accept(ModItems.SPECTRE_CHESTPLATE);
            event.accept(ModItems.SHROOMITE_CHESTPLATE);
            event.accept(ModItems.PALLADIUM_CHESTPLATE);
            event.accept(ModItems.TITANIUM_CHESTPLATE);

            event.accept(ModItems.PLATINUM_LEGGINGS);
            event.accept(ModItems.HELLSTONE_LEGGINGS);
            event.accept(ModItems.CHLOROPHYTE_LEGGINGS);
            event.accept(ModItems.SPECTRE_LEGGINGS);
            event.accept(ModItems.SHROOMITE_LEGGINGS);
            event.accept(ModItems.PALLADIUM_LEGGINGS);
            event.accept(ModItems.TITANIUM_LEGGINGS);

            event.accept(ModItems.PLATINUM_BOOTS);
            event.accept(ModItems.HELLSTONE_BOOTS);
            event.accept(ModItems.CHLOROPHYTE_BOOTS);
            event.accept(ModItems.SPECTRE_BOOTS);
            event.accept(ModItems.SHROOMITE_BOOTS);
            event.accept(ModItems.PALLADIUM_BOOTS);
            event.accept(ModItems.TITANIUM_BOOTS);

            event.accept(ModItems.PLATINUM_INGOT);
            event.accept(ModItems.HELLSTONE_INGOT);
            event.accept(ModItems.CHLOROPHYTE_INGOT);
            event.accept(ModItems.SPECTRE_INGOT);
            event.accept(ModItems.SHROOMITE_INGOT);
            event.accept(ModItems.PALLADIUM_INGOT);
            event.accept(ModItems.TITANIUM_INGOT);

            event.accept(ModItems.RUBY);
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModItems.TOPAZ);
        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.PALLADIUM_ORE);
            event.accept(ModBlocks.TITANIUM_ORE);
            event.accept(ModBlocks.RUBY_ORE);
            event.accept(ModBlocks.SAPPHIRE_ORE);
            event.accept(ModBlocks.TOPAZ_ORE);
        }
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("HELLO from server starting");
    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
