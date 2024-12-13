package com.toregeldi.soulsmod.entity.client;

import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.entity.GhostEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class GhostEntityRenderer extends EntityRenderer<GhostEntity> {
    protected GhostEntityRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(GhostEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, "ghost");
    }
}
