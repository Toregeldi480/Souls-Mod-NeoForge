package com.toregeldi.soulsmod.entity;

import com.toregeldi.soulsmod.SoulsMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> MOD_ENTITIES = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, SoulsMod.MOD_ID);

    public static final Supplier<EntityType<GhostEntity>> GHOST = MOD_ENTITIES.register("ghost",
            () -> EntityType.Builder.of(GhostEntity::new, MobCategory.MONSTER).sized(0.75f, 2f).build(ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, "ghost").toString()));

    public void register(IEventBus eventBus) {
        MOD_ENTITIES.register(eventBus);
    }
}
