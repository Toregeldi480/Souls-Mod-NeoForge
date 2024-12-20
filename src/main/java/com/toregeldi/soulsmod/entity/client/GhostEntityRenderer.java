package com.toregeldi.soulsmod.entity.client;

import com.google.common.collect.Maps;
import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.entity.GhostEntity;
import com.toregeldi.soulsmod.entity.GhostVariant;
import net.minecraft.Util;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;

public class GhostEntityRenderer extends MobRenderer<GhostEntity, GhostEntityModel<GhostEntity>> {
    private static final Map<GhostVariant, ResourceLocation> VARIANT_LOCATION = Util.make(Maps.newEnumMap(GhostVariant.class), map -> {
        map.put(GhostVariant.WHITE,
                ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, "textures/models/entity/ghost/ghost_white.png"));
        map.put(GhostVariant.BLUE,
                ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, "textures/models/entity/ghost/ghost_blue.png"));
    });

    @Override
    public ResourceLocation getTextureLocation(GhostEntity entity) {
        return VARIANT_LOCATION.get(entity.getVariant());
    }

    public GhostEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new GhostEntityModel(context.bakeLayer(GhostEntityModel.LAYER_LOCATION)), 0.5f);
    }
}
