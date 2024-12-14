package com.toregeldi.soulsmod.event;

import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.entity.GhostEntity;
import com.toregeldi.soulsmod.entity.ModEntities;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = SoulsMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModCommonEvents {
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.GHOST.get(), GhostEntity.createAttributes().build());
    }
}
