//package com.toregeldi.soulsmod.block.entity;
//
//import net.minecraft.core.BlockPos;
//import net.minecraft.network.chat.Component;
//import net.minecraft.world.MenuProvider;
//import net.minecraft.world.entity.player.Inventory;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.inventory.AbstractContainerMenu;
//import net.minecraft.world.level.block.entity.BlockEntity;
//import net.minecraft.world.level.block.entity.BlockEntityType;
//import net.minecraft.world.level.block.state.BlockState;
//import net.neoforged.neoforge.items.ItemStackHandler;
//import org.jetbrains.annotations.Nullable;
//
//public class AutohammerBlockEntity extends BlockEntity implements MenuProvider {
//    private final ItemStackHandler itemHandler = new ItemStackHandler(2);
//
//    private static final int INPUT_SLOT = 0;
//    private static final int OUTPUT_SLOT = 1;
//
//
//
//    @Override
//    public void onLoad() {
//        super.onLoad();
//    }
//
//    @Override
//    public void invalidateCapabilities() {
//        super.invalidateCapabilities();
//    }
//
//    public AutohammerBlockEntity(BlockPos pos, BlockState blockState) {
//        super(BlockEntityType.BREWING_STAND, pos, blockState);
//    }
//
//    @Override
//    public Component getDisplayName() {
//        return null;
//    }
//
//    @Override
//    public @Nullable AbstractContainerMenu createMenu(int containerId, Inventory playerInventory, Player player) {
//        return new AutohammerMenu(containerId, playerInventory, this, this.dataAccess);
//    }
//}
