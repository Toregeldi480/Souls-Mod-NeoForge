package com.toregeldi.soulsmod.block.inventory;

import com.toregeldi.soulsmod.block.ModBlocks;
import com.toregeldi.soulsmod.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class AutohammerMenu extends AbstractContainerMenu {
    public static final int CHLOROPHYTE_SLOT = 0;
    public static final int GLOWING_MUSHROOM_SLOT = 1;
    public static final int FUEL_SLOT = 2;
    public static final int RESULT_SLOT = 3;
    private final ContainerLevelAccess access;
    long lastSoundTime;

    public final Container container = new SimpleContainer(4) {
        @Override
        public void setChanged() {
            AutohammerMenu.this.slotsChanged(this);
            super.setChanged();
        }
    };
    private final ResultContainer resultContainer = new ResultContainer() {
        @Override
        public void setChanged() {
            AutohammerMenu.this.slotsChanged(this);
            super.setChanged();
        }
    };

    public AutohammerMenu(int containerId, Inventory playerInventory, ContainerLevelAccess access) {
        this(containerId, playerInventory, ContainerLevelAccess.NULL, access);
    }

    public AutohammerMenu(int containerId, Inventory playerInventory, final ContainerLevelAccess access, ContainerLevelAccess access1) {
        super(MenuType.FURNACE, containerId);
        this.access = access1;

        this.addSlot(new Slot(this.container, 0, 8, 16) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return stack.is(ModItems.CHLOROPHYTE_INGOT);
            }
        });
        this.addSlot(new Slot(this.container, 1, 8, 32) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return stack.is(ModItems.CHLOROPHYTE_INGOT);
            }
        });
        this.addSlot(new Slot(this.container, 2, 8, 48) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return stack.is(Items.BLAZE_POWDER);
            }
        });
        this.addSlot(new Slot(this.resultContainer, 3, 8, 64) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return false;
            }

            @Override
            public void onTake(Player player, ItemStack stack) {
                AutohammerMenu.this.slots.get(0).remove(1);
                AutohammerMenu.this.slots.get(1).remove(1);
                stack.getItem().onCraftedBy(stack, player.level(), player);
                access.execute((level, blockPos) -> {
                    long l = level.getGameTime();
                    if(AutohammerMenu.this.lastSoundTime != l) {
                        level.playSound(null, blockPos, SoundEvents.ANVIL_USE, SoundSource.BLOCKS, 1.0F, 1.0F);
                        AutohammerMenu.this.lastSoundTime = l;
                    }
                    super.onTake(player, stack);
                });

                super.onTake(player, stack);
            }
        });
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        return null;
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(this.access, player, ModBlocks.AUTOHAMMER.get());
    }

    @Override
    public void removed(Player player) {
        super.removed(player);
        this.resultContainer.removeItemNoUpdate(2);
        this.access.execute((level, blockPos) -> this.clearContainer(player, this.container));
    }
}
