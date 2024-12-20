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

    public static final Supplier<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TAB.register("items_tab",
            () ->  CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.PLATINUM_INGOT.get()))
                    .title(Component.translatable("creativetab.soulsmod.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_PLATINUM);
                        output.accept(ModItems.RAW_HELLSTONE);
                        output.accept(ModItems.RAW_CHLOROPHYTE);
                        output.accept(ModItems.RAW_SPECTRE);
                        output.accept(ModItems.RAW_SHROOMITE);
                        output.accept(ModItems.RAW_PALLADIUM);
                        output.accept(ModItems.RAW_TITANIUM);

                        output.accept(ModItems.PLATINUM_INGOT);
                        output.accept(ModItems.HELLSTONE_INGOT);
                        output.accept(ModItems.CHLOROPHYTE_INGOT);
                        output.accept(ModItems.SPECTRE_INGOT);
                        output.accept(ModItems.SHROOMITE_INGOT);
                        output.accept(ModItems.PALLADIUM_INGOT);
                        output.accept(ModItems.TITANIUM_INGOT);

                        output.accept(ModItems.RUBY);
                        output.accept(ModItems.SAPPHIRE);
                        output.accept(ModItems.TOPAZ);
                    }).build());

    public static final Supplier<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TAB.register("blocks_tab",
            () ->  CreativeModeTab.builder()
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, "items_tab"))
                    .icon(() -> new ItemStack(ModBlocks.RUBY_ORE.get()))
                    .title(Component.translatable("creativetab.soulsmod.blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.GLOWING_MUSHROOM_BLOCK);

                        output.accept(ModBlocks.PLATINUM_ORE);
                        output.accept(ModBlocks.CHLOROPHYTE_ORE);
                        output.accept(ModBlocks.PALLADIUM_ORE);
                        output.accept(ModBlocks.TITANIUM_ORE);
                        output.accept(ModBlocks.RUBY_ORE);
                        output.accept(ModBlocks.SAPPHIRE_ORE);
                        output.accept(ModBlocks.TOPAZ_ORE);
                    }).build());


    public static final Supplier<CreativeModeTab> FOOD_TAB = CREATIVE_MODE_TAB.register("foods_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, "blocks_tab"))
                    .icon(() -> new ItemStack(ModItems.RUBY_APPLE.get()))
                    .title(Component.translatable("creativetab.soulsmod.foods"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GLOWING_MUSHROOM);

                        output.accept(ModItems.BOTTLE);

                        output.accept(ModItems.RUBY_APPLE);
                        output.accept(ModItems.SAPPHIRE_APPLE);
                        output.accept(ModItems.TOPAZ_APPLE);

                        output.accept(ModItems.MINT);
                        output.accept(ModItems.BLACKBERRY);
                        output.accept(ModItems.BLUEBERRY);
                        output.accept(ModItems.RASPBERRY);
                        output.accept(ModItems.STRAWBERRY);
                        output.accept(ModItems.ORANGE);
                        output.accept(ModItems.LEMON);

                        output.accept(ModItems.BLACKBERRY_JUICE);
                        output.accept(ModItems.BLUEBERRY_JUICE);
                        output.accept(ModItems.RASPBERRY_JUICE);
                        output.accept(ModItems.STRAWBERRY_JUICE);
                        output.accept(ModItems.ORANGE_JUICE);
                        output.accept(ModItems.LEMON_JUICE);
                        output.accept(ModItems.SWEET_BERRIES_JUICE);

                        output.accept(ModItems.ESTUS_FLASK);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> COMBAT_TAB = CREATIVE_MODE_TAB.register("combat_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, "foods_tab"))
                    .icon(() -> new ItemStack(ModItems.PLATINUM_SWORD.get()))
                    .title(Component.translatable("creativetab.soulsmod.combat"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PLATINUM_HELMET);
                        output.accept(ModItems.HELLSTONE_HELMET);
                        output.accept(ModItems.CHLOROPHYTE_HELMET);
                        output.accept(ModItems.SPECTRE_HELMET);
                        output.accept(ModItems.SHROOMITE_HELMET);
                        output.accept(ModItems.PALLADIUM_HELMET);
                        output.accept(ModItems.TITANIUM_HELMET);


                        output.accept(ModItems.PLATINUM_CHESTPLATE);
                        output.accept(ModItems.HELLSTONE_CHESTPLATE);
                        output.accept(ModItems.CHLOROPHYTE_CHESTPLATE);
                        output.accept(ModItems.SPECTRE_CHESTPLATE);
                        output.accept(ModItems.SHROOMITE_CHESTPLATE);
                        output.accept(ModItems.PALLADIUM_CHESTPLATE);
                        output.accept(ModItems.TITANIUM_CHESTPLATE);


                        output.accept(ModItems.PLATINUM_LEGGINGS);
                        output.accept(ModItems.HELLSTONE_LEGGINGS);
                        output.accept(ModItems.CHLOROPHYTE_LEGGINGS);
                        output.accept(ModItems.SPECTRE_LEGGINGS);
                        output.accept(ModItems.SHROOMITE_LEGGINGS);
                        output.accept(ModItems.PALLADIUM_LEGGINGS);
                        output.accept(ModItems.TITANIUM_LEGGINGS);


                        output.accept(ModItems.PLATINUM_BOOTS);
                        output.accept(ModItems.HELLSTONE_BOOTS);
                        output.accept(ModItems.CHLOROPHYTE_BOOTS);
                        output.accept(ModItems.SPECTRE_BOOTS);
                        output.accept(ModItems.SHROOMITE_BOOTS);
                        output.accept(ModItems.PALLADIUM_BOOTS);
                        output.accept(ModItems.TITANIUM_BOOTS);


                        output.accept(ModItems.PLATINUM_SWORD);
                        output.accept(ModItems.PALLADIUM_SWORD);
                        output.accept(ModItems.TITANIUM_SWORD);
                        output.accept(ModItems.CHLOROPHYTE_SWORD);
                        output.accept(ModItems.SPECTRE_SWORD);
                        output.accept(ModItems.SHROOMITE_SWORD);
                        output.accept(ModItems.HELLSTONE_SWORD);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> TOOLS_TAB = CREATIVE_MODE_TAB.register("tools_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID,"combat_tab"))
                    .icon(() -> new ItemStack(ModItems.PLATINUM_PICKAXE.get()))
                    .title(Component.translatable("creativetab.soulsmod.tools"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.WAYFINDER);

                        output.accept(ModItems.PLATINUM_PICKAXE);
                        output.accept(ModItems.PALLADIUM_PICKAXE);
                        output.accept(ModItems.TITANIUM_PICKAXE);
                        output.accept(ModItems.CHLOROPHYTE_PICKAXE);
                        output.accept(ModItems.SPECTRE_PICKAXE);
                        output.accept(ModItems.SHROOMITE_PICKAXE);
                        output.accept(ModItems.HELLSTONE_PICKAXE);

                        output.accept(ModItems.PLATINUM_AXE);
                        output.accept(ModItems.PALLADIUM_AXE);
                        output.accept(ModItems.TITANIUM_AXE);
                        output.accept(ModItems.CHLOROPHYTE_AXE);
                        output.accept(ModItems.SPECTRE_AXE);
                        output.accept(ModItems.SHROOMITE_AXE);
                        output.accept(ModItems.HELLSTONE_AXE);

                        output.accept(ModItems.PLATINUM_SHOVEL);
                        output.accept(ModItems.PALLADIUM_SHOVEL);
                        output.accept(ModItems.TITANIUM_SHOVEL);
                        output.accept(ModItems.CHLOROPHYTE_SHOVEL);
                        output.accept(ModItems.SPECTRE_SHOVEL);
                        output.accept(ModItems.SHROOMITE_SHOVEL);
                        output.accept(ModItems.HELLSTONE_SHOVEL);

                        output.accept(ModItems.PLATINUM_HOE);
                        output.accept(ModItems.PALLADIUM_HOE);
                        output.accept(ModItems.TITANIUM_HOE);
                        output.accept(ModItems.CHLOROPHYTE_HOE);
                        output.accept(ModItems.SPECTRE_HOE);
                        output.accept(ModItems.SHROOMITE_HOE);
                        output.accept(ModItems.HELLSTONE_HOE);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> SPAWN_EGGS_TAB = CREATIVE_MODE_TAB.register("spawn_eggs_tab",
            () -> CreativeModeTab.builder()
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, "tools_tab"))
                    .icon(() -> new ItemStack(ModItems.GHOST_SPAWN_EGG.get()))
                    .title(Component.translatable("creativetab.soulsmod.spawn_eggs"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GHOST_SPAWN_EGG);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
