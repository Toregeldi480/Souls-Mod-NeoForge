package com.toregeldi.soulsmod.item.custom;

import com.toregeldi.soulsmod.component.ModDataComponents;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

import java.util.List;

public class WayfinderItem extends Item {
    public WayfinderItem(Properties properties) {
        super(properties);
    }


    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.SPEAR;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
        return super.use(level, player, usedHand);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();

        if(!level.isClientSide()) {
            level.playSound(null, context.getClickedPos(), SoundEvents.END_PORTAL_SPAWN, SoundSource.AMBIENT);

            context.getItemInHand().set(ModDataComponents.COORDINATES, context.getClickedPos());
        }


        return InteractionResult.SUCCESS;
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
