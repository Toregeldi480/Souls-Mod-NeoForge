package com.toregeldi.soulsmod.item;

import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SoulsMod.MOD_ID);

    public static final Supplier<CreativeModeTab> FOSSIL_ITEMS_TAB = CREATIVE_MODE_TAB.register("fossil_items_tab",
            () ->  CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.soulsmod.fossil_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_TITANIUM);
                        output.accept(ModItems.RAW_PALLADIUM);

                        output.accept(ModItems.CHLOROPHYTE_INGOT);
                        output.accept(ModItems.SHROOMITE_INGOT);
                        output.accept(ModItems.PALLADIUM_INGOT);
                        output.accept(ModItems.TITANIUM_INGOT);

                        output.accept(ModItems.RUBY);
                        output.accept(ModItems.SAPPHIRE);
                        output.accept(ModItems.TOPAZ);
                    }).build());

    public static final Supplier<CreativeModeTab> FOSSIL_BLOCKS_TAB = CREATIVE_MODE_TAB.register("fossils_blocks_tab",
            () ->  CreativeModeTab.builder()
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, "fossil_items_tab"))
                    .icon(() -> new ItemStack(ModBlocks.RUBY_ORE.get()))
                    .title(Component.translatable("creativetab.soulsmod.fossil_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.PALLADIUM_ORE);
                        output.accept(ModBlocks.TITANIUM_ORE);
                        output.accept(ModBlocks.RUBY_ORE);
                        output.accept(ModBlocks.SAPPHIRE_ORE);
                        output.accept(ModBlocks.TOPAZ_ORE);
                    }).build());

    public static final Supplier<CreativeModeTab> POTION_TAB = CREATIVE_MODE_TAB.register("potions_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, "fossil_blocks_tab"))
//                    .icon(() -> new ItemStack(ModItems.ESTUS_FLASK.get()))
                    .title(Component.translatable("creativetab.soulsmod.potions"))
                    .displayItems((itemDisplayParameters, output) -> {
//                        output.accept(ModItems.ESTUS_FLASK);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> FOOD_TAB = CREATIVE_MODE_TAB.register("foods_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, "potions_tab"))
                    .icon(() -> new ItemStack(ModItems.RUBY_APPLE.get()))
                    .title(Component.translatable("creativetab.soulsmod.foods"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RUBY_APPLE);
                        output.accept(ModItems.SAPPHIRE_APPLE);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
