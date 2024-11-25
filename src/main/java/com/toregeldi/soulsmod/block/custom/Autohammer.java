package com.toregeldi.soulsmod.block.custom;

import com.mojang.serialization.MapCodec;
import com.toregeldi.soulsmod.block.inventory.AutohammerMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class Autohammer extends Block {
    public static final MapCodec<Autohammer> CODEC = simpleCodec(Autohammer::new);
    private static final Component CONTAINER_TITLE = Component.translatable("container.autohammer");

    @Override
    protected MapCodec<? extends Block> codec() {
        return CODEC;
    }

    public Autohammer(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if(level.isClientSide()) {
            return InteractionResult.SUCCESS;
        } else {
            player.openMenu(state.getMenuProvider(level, pos));
            return InteractionResult.CONSUME;
        }
    }

    @Nullable
    @Override
    protected MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        return new SimpleMenuProvider(
                (containerId, playerInventory, player) -> new AutohammerMenu(containerId, playerInventory), CONTAINER_TITLE
        );
    }
}
