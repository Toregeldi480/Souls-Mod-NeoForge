package com.toregeldi.soulsmod.item.custom;

import com.toregeldi.soulsmod.component.ModDataComponents;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class WayfinderItem extends Item {
    public WayfinderItem(Properties properties) {
        super(properties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.BOW;
    }

    @Override
    public int getUseDuration(ItemStack stack, LivingEntity entity) {
        return 40;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        super.finishUsingItem(stack, level, livingEntity);

        if(livingEntity instanceof ServerPlayer serverPlayer) {
            CriteriaTriggers.USING_ITEM.trigger(serverPlayer, stack);
        }

        if(!level.isClientSide()) {
            if(livingEntity.isCrouching() ) {
                livingEntity.teleportTo(
                        livingEntity.getUseItem().get(ModDataComponents.COORDINATES).get(Direction.Axis.X),
                        livingEntity.getUseItem().get(ModDataComponents.COORDINATES).get(Direction.Axis.Y) + 1,
                        livingEntity.getUseItem().get(ModDataComponents.COORDINATES).get(Direction.Axis.Z));

                level.playSound(null, livingEntity.getX(), livingEntity.getY(), livingEntity.getZ(), SoundEvents.PORTAL_TRAVEL, SoundSource.AMBIENT, 0.5f, 1f);
            } else {
                level.playSound(null, livingEntity.getX(), livingEntity.getY(), livingEntity.getZ(), SoundEvents.END_PORTAL_SPAWN, SoundSource.AMBIENT, 0.5f, 1f);

                livingEntity.getUseItem().set(ModDataComponents.COORDINATES, livingEntity.getBlockPosBelowThatAffectsMyMovement());
            }
        }

        return stack;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        return ItemUtils.startUsingInstantly(level, player, usedHand);
    }


    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if(Screen.hasShiftDown()) {
            tooltipComponents.add(Component.translatable("tooltip.soulsmod.wayfinder_shift_down"));
        }
        else {
            tooltipComponents.add(Component.translatable("tooltip.soulsmod.wayfinder"));
        }

        if(stack.get(ModDataComponents.COORDINATES) != null) {
            tooltipComponents.add(Component.literal("Portal Position " + stack.get(ModDataComponents.COORDINATES)));
        }

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
