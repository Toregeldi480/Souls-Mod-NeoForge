package com.toregeldi.soulsmod.entity;

import net.minecraft.Util;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
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
    private static final EntityDataAccessor<Integer> VARIANT = SynchedEntityData.defineId(GhostEntity.class, EntityDataSerializers.INT);

    public GhostEntity(EntityType<? extends Vex> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, Cat.class, 30f, 1, 1.2f));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, Ocelot.class, 30f, 1, 1.2f));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, Wolf.class, 30f, 1, 1.2f));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1f, false));
        this.goalSelector.addGoal(3, new FloatGoal(this));
        this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, 30f, 1f));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MOVEMENT_SPEED, 10)
                .add(Attributes.ATTACK_DAMAGE, 2f)
                .add(Attributes.MAX_HEALTH, 5)
                .add(Attributes.FOLLOW_RANGE, 50)
                .add(Attributes.ATTACK_SPEED, 1f);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(VARIANT, 0);
    }

    private int getTypeVariant() {
        return this.entityData.get(VARIANT);
    }

    public GhostVariant getVariant() {
        return GhostVariant.byId(this.getTypeVariant() & 255);
    }

    private void setVariant(GhostVariant variant) {
        this.entityData.set(VARIANT, variant.getId() & 255);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putInt("Variant", this.getTypeVariant());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        this.entityData.set(VARIANT, compound.getInt("Variant"));
    }

    @Override
    public @Nullable SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty, MobSpawnType spawnType, @Nullable SpawnGroupData spawnGroupData) {
        GhostVariant variant = Util.getRandom(GhostVariant.values(), this.random);
        this.setVariant(variant);

        return super.finalizeSpawn(level, difficulty, spawnType, spawnGroupData);
    }
}
