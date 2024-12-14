package com.toregeldi.soulsmod.event;

import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.entity.ModEntities;
import com.toregeldi.soulsmod.entity.client.GhostEntityModel;
import com.toregeldi.soulsmod.entity.client.GhostEntityRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = SoulsMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.GHOST.get(), GhostEntityRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(GhostEntityModel.LAYER_LOCATION, GhostEntityModel::createBodyLayer);
    }
}
