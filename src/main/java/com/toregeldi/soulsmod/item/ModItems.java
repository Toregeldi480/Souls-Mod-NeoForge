package com.toregeldi.soulsmod.item;

import com.toregeldi.soulsmod.SoulsMod;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SoulsMod.MOD_ID);

    public static final DeferredItem<Item> RAW_PALLADIUM = ITEMS.register("raw_palladium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HELLSTONE_INGOT = ITEMS.register("hellstone_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHLOROPHYTE_INGOT = ITEMS.register("chlorophyte_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPECTRE_INGOT = ITEMS.register("spectre_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHROOMITE_INGOT = ITEMS.register("shroomite_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALLADIUM_INGOT = ITEMS.register("palladium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<ArmorItem> PLATINUM_HELMET = ITEMS.register("platinum_helmet",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> HELLSTONE_HELMET = ITEMS.register("hellstone_helmet",
            () -> new ArmorItem(ModArmorMaterials.HELLSTONE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> CHLOROPHYTE_HELMET = ITEMS.register("chlorophyte_helmet",
            () -> new ArmorItem(ModArmorMaterials.CHLOROPHYTE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> SPECTRE_HELMET = ITEMS.register("spectre_helmet",
            () -> new ArmorItem(ModArmorMaterials.SPECTRE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> SHROOMITE_HELMET = ITEMS.register("shroomite_helmet",
            () -> new ArmorItem(ModArmorMaterials.SHROOMITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> PALLADIUM_HELMET = ITEMS.register("palladium_helmet",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))
            ));

    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RUBY_APPLE = ITEMS.register("ruby_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RUBY_APPLE)));
    public static final DeferredItem<Item> SAPPHIRE_APPLE = ITEMS.register("sapphire_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SAPPHIRE_APPLE)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
