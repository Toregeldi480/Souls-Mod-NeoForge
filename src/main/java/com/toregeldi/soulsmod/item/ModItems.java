package com.toregeldi.soulsmod.item;

import com.toregeldi.soulsmod.SoulsMod;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SoulsMod.MOD_ID);

    public static final DeferredItem<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_HELLSTONE = ITEMS.register("raw_hellstone",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_CHLOROPHYTE = ITEMS.register("raw_chlorophyte",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SPECTRE = ITEMS.register("raw_spectre",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SHROOMITE = ITEMS.register("raw_shroomite",
            () -> new Item(new Item.Properties()));
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


    public static final DeferredItem<ArmorItem> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> HELLSTONE_CHESTPLATE = ITEMS.register("hellstone_chestplate",
            () -> new ArmorItem(ModArmorMaterials.HELLSTONE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> CHLOROPHYTE_CHESTPLATE = ITEMS.register("chlorophyte_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CHLOROPHYTE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> SPECTRE_CHESTPLATE = ITEMS.register("spectre_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SPECTRE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> SHROOMITE_CHESTPLATE = ITEMS.register("shroomite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SHROOMITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> PALLADIUM_CHESTPLATE = ITEMS.register("palladium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))
            ));


    public static final DeferredItem<ArmorItem> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> HELLSTONE_LEGGINGS = ITEMS.register("hellstone_leggings",
            () -> new ArmorItem(ModArmorMaterials.HELLSTONE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> CHLOROPHYTE_LEGGINGS = ITEMS.register("chlorophyte_leggings",
            () -> new ArmorItem(ModArmorMaterials.CHLOROPHYTE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> SPECTRE_LEGGINGS = ITEMS.register("spectre_leggings",
            () -> new ArmorItem(ModArmorMaterials.SPECTRE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> SHROOMITE_LEGGINGS = ITEMS.register("shroomite_leggings",
            () -> new ArmorItem(ModArmorMaterials.SHROOMITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> PALLADIUM_LEGGINGS = ITEMS.register("palladium_leggings",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))
            ));


    public static final DeferredItem<ArmorItem> PLATINUM_BOOTS = ITEMS.register("platinum_boots",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> HELLSTONE_BOOTS = ITEMS.register("hellstone_boots",
            () -> new ArmorItem(ModArmorMaterials.HELLSTONE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> CHLOROPHYTE_BOOTS = ITEMS.register("chlorophyte_boots",
            () -> new ArmorItem(ModArmorMaterials.CHLOROPHYTE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> SPECTRE_BOOTS = ITEMS.register("spectre_boots",
            () -> new ArmorItem(ModArmorMaterials.SPECTRE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> SHROOMITE_BOOTS = ITEMS.register("shroomite_boots",
            () -> new ArmorItem(ModArmorMaterials.SHROOMITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> PALLADIUM_BOOTS = ITEMS.register("palladium_boots",
            () -> new ArmorItem(ModArmorMaterials.PALLADIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))
            ));
    public static final DeferredItem<ArmorItem> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))
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
    public static final DeferredItem<Item> TOPAZ_APPLE = ITEMS.register("topaz_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOPAZ_APPLE)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
