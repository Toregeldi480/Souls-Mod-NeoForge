package com.toregeldi.soulsmod.entity.client;

import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.entity.GhostEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GhostEntityRenderer extends MobRenderer<GhostEntity, GhostEntityModel<GhostEntity>> {
    public GhostEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new GhostEntityModel(context.bakeLayer(GhostEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(GhostEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, "textures/models/entity/ghost.png");
    }
}
