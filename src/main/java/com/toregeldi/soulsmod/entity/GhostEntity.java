package com.toregeldi.soulsmod.entity;

import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.Ocelot;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Vex;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import org.jetbrains.annotations.Nullable;

public class GhostEntity extends Vex {
    public GhostEntity(EntityType<? extends Vex> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, Cat.class, 30, 1, 1.2f));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, Ocelot.class, 30, 1, 1.2f));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, Wolf.class, 30, 1, 1.2f));
        this.goalSelector.addGoal(4, new FloatGoal(this));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 30, 1.0f));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Mob.class, 8.f));
        this.targetSelector.addGoal(2, new MeleeAttackGoal(this, 0.5f, true));
    }

    @Override
    public @Nullable SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty, MobSpawnType spawnType, @Nullable SpawnGroupData spawnGroupData) {
        return super.finalizeSpawn(level, difficulty, spawnType, spawnGroupData);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MOVEMENT_SPEED, 10)
                .add(Attributes.ATTACK_DAMAGE, 2f)
                .add(Attributes.MAX_HEALTH, 5)
                .add(Attributes.FOLLOW_RANGE, 50)
                .add(Attributes.ATTACK_SPEED, 1f);
    }
}
