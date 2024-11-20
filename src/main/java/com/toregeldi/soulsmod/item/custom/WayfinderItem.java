package com.toregeldi.soulsmod.item.custom;

import com.toregeldi.soulsmod.component.ModDataComponents;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

import java.util.List;

public class WayfinderItem extends Item {
    public WayfinderItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();

        if(!level.isClientSide()) {
            level.playSound(null, context.getPlayer().getBlockPosBelowThatAffectsMyMovement(), SoundEvents.END_PORTAL_SPAWN, SoundSource.AMBIENT);
        }

        context.getItemInHand().set(ModDataComponents.COORDINATES, context.getPlayer().getBlockPosBelowThatAffectsMyMovement());

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
            tooltipComponents.add(Component.literal("Last portal coordinates: " + stack.get(ModDataComponents.COORDINATES)));
        }

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
