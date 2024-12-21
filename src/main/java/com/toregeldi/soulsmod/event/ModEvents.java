package com.toregeldi.soulsmod.event;

import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.entity.GhostEntity;
import com.toregeldi.soulsmod.entity.ModEntities;
import com.toregeldi.soulsmod.entity.client.GhostEntityModel;
import com.toregeldi.soulsmod.entity.client.GhostEntityRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.network.config.JoinWorldTask;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelWriter;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.neoforged.neoforge.event.entity.EntityEvent;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;

@EventBusSubscriber(modid = SoulsMod.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {
    @SubscribeEvent
    public static void onEntityDie(LivingDeathEvent event) {
        if(!(event.getEntity() instanceof GhostEntity) && event.getEntity() instanceof Monster && !event.getEntity().level().isClientSide()) {
            ModEntities.GHOST.get().spawn((ServerLevel) event.getEntity().level(), event.getEntity().getOnPos(), MobSpawnType.EVENT);
        }
    }
}