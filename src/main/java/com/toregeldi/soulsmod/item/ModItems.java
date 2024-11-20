package com.toregeldi.soulsmod.item;

import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.item.custom.WayfinderItem;
import com.toregeldi.soulsmod.potion.ModPotions;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SoulsMod.MOD_ID);

    public static final DeferredItem<Item> WAYFINDER =  ITEMS.register("wayfinder",
            () -> new WayfinderItem(new Item.Properties()));

    public static final DeferredItem<Item> BOTTLE = ITEMS.register("bottle",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MINT = ITEMS.register("mint",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MINT)));
    public static final DeferredItem<Item> BLACKBERRY = ITEMS.register("blackberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLACKBERRY)));
    public static final DeferredItem<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLUEBERRY)));
    public static final DeferredItem<Item> RASPBERRY = ITEMS.register("raspberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RASPBERRY)));
    public static final DeferredItem<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STRAWBERRY)));
    public static final DeferredItem<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ORANGE)));
    public static final DeferredItem<Item> LEMON = ITEMS.register("lemon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LEMON)));


    public static final DeferredItem<Item> BLACKBERRY_JUICE = ITEMS.register("blackberry_juice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLACKBERRY_JUICE)));
    public static final DeferredItem<Item> BLUEBERRY_JUICE = ITEMS.register("blueberry_juice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLUEBERRY_JUICE)));
    public static final DeferredItem<Item> RASPBERRY_JUICE = ITEMS.register("raspberry_juice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RASPBERRY_JUICE)));
    public static final DeferredItem<Item> STRAWBERRY_JUICE = ITEMS.register("strawberry_juice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STRAWBERRY_JUICE)));
    public static final DeferredItem<Item> ORANGE_JUICE = ITEMS.register("orange_juice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ORANGE_JUICE)));
    public static final DeferredItem<Item> LEMON_JUICE = ITEMS.register("lemon_juice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LEMON_JUICE)));
    public static final DeferredItem<Item> SWEET_BERRIES_JUICE = ITEMS.register("sweet_berries_juice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SWEET_BERRIES_JUICE)));

    public static final DeferredItem<Item> ESTUS_FLASK = ITEMS.register("estus_flask",
            () -> new Item(new Item.Properties()
                    .food(ModFoodProperties.ESTUS_FLASK)
                    .stacksTo(16)));


    public static final DeferredItem<Item> RUBY_APPLE = ITEMS.register("ruby_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RUBY_APPLE)));
    public static final DeferredItem<Item> SAPPHIRE_APPLE = ITEMS.register("sapphire_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SAPPHIRE_APPLE)));
    public static final DeferredItem<Item> TOPAZ_APPLE = ITEMS.register("topaz_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOPAZ_APPLE)));


    public static final DeferredItem<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_PALLADIUM = ITEMS.register("raw_palladium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_CHLOROPHYTE = ITEMS.register("raw_chlorophyte",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SPECTRE = ITEMS.register("raw_spectre",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SHROOMITE = ITEMS.register("raw_shroomite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_HELLSTONE = ITEMS.register("raw_hellstone",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALLADIUM_INGOT = ITEMS.register("palladium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHLOROPHYTE_INGOT = ITEMS.register("chlorophyte_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPECTRE_INGOT = ITEMS.register("spectre_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHROOMITE_INGOT = ITEMS.register("shroomite_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HELLSTONE_INGOT = ITEMS.register("hellstone_ingot",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<ArmorItem> PLATINUM_HELMET = ITEMS.register("platinum_helmet",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
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
    public static final DeferredItem<ArmorItem> HELLSTONE_HELMET = ITEMS.register("hellstone_helmet",
            () -> new ArmorItem(ModArmorMaterials.HELLSTONE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19)).fireResistant()
            ));


    public static final DeferredItem<ArmorItem> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
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
    public static final DeferredItem<ArmorItem> HELLSTONE_CHESTPLATE = ITEMS.register("hellstone_chestplate",
            () -> new ArmorItem(ModArmorMaterials.HELLSTONE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19)).fireResistant()
            ));


    public static final DeferredItem<ArmorItem> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
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
    public static final DeferredItem<ArmorItem> HELLSTONE_LEGGINGS = ITEMS.register("hellstone_leggings",
            () -> new ArmorItem(ModArmorMaterials.HELLSTONE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19)).fireResistant()
            ));


    public static final DeferredItem<ArmorItem> PLATINUM_BOOTS = ITEMS.register("platinum_boots",
            () -> new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
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
    public static final DeferredItem<ArmorItem> HELLSTONE_BOOTS = ITEMS.register("hellstone_boots",
            () -> new ArmorItem(ModArmorMaterials.HELLSTONE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19)).fireResistant()
            ));


    public static final DeferredItem<SwordItem> PLATINUM_SWORD = ITEMS.register("platinum_sword",
            () -> new SwordItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.PLATINUM, 5, -2.4f))));
    public static final DeferredItem<SwordItem> PALLADIUM_SWORD = ITEMS.register("palladium_sword",
            () -> new SwordItem(ModToolTiers.PALLADIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.PALLADIUM, 10, -2.4f))));
    public static final DeferredItem<SwordItem> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(ModToolTiers.TITANIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.TITANIUM, 14, -2.4f))));
    public static final DeferredItem<SwordItem> CHLOROPHYTE_SWORD = ITEMS.register("chlorophyte_sword",
            () -> new SwordItem(ModToolTiers.CHLOROPHYTE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.CHLOROPHYTE, 16, -2.4f))));
    public static final DeferredItem<SwordItem> SPECTRE_SWORD = ITEMS.register("spectre_sword",
            () -> new SwordItem(ModToolTiers.SPECTRE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SPECTRE, 18, -2.4f))));
    public static final DeferredItem<SwordItem> SHROOMITE_SWORD = ITEMS.register("shroomite_sword",
            () -> new SwordItem(ModToolTiers.SHROOMITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SHROOMITE, 18, -2.4f))));
    public static final DeferredItem<SwordItem> HELLSTONE_SWORD = ITEMS.register("hellstone_sword",
            () -> new SwordItem(ModToolTiers.HELLSTONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.HELLSTONE, 22, -2.4f))));


    public static final DeferredItem<PickaxeItem> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.PLATINUM, 1, -2.8f))));
    public static final DeferredItem<PickaxeItem> PALLADIUM_PICKAXE = ITEMS.register("palladium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PALLADIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.PALLADIUM, 2, -2.8f))));
    public static final DeferredItem<PickaxeItem> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TITANIUM, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.TITANIUM, 2, -2.8f))));
    public static final DeferredItem<PickaxeItem> CHLOROPHYTE_PICKAXE = ITEMS.register("chlorophyte_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CHLOROPHYTE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.CHLOROPHYTE, 3, -2.8f))));
    public static final DeferredItem<PickaxeItem> SPECTRE_PICKAXE = ITEMS.register("spectre_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SPECTRE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SPECTRE, 3, -2.8f))));
    public static final DeferredItem<PickaxeItem> SHROOMITE_PICKAXE = ITEMS.register("shroomite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SHROOMITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SHROOMITE, 3, -2.8f))));
    public static final DeferredItem<PickaxeItem> HELLSTONE_PICKAXE = ITEMS.register("hellstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HELLSTONE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.HELLSTONE, 4, -2.8f))));



    public static final DeferredItem<AxeItem> PLATINUM_AXE = ITEMS.register("platinum_axe",
            () -> new AxeItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.PLATINUM, 5, -3f))));
    public static final DeferredItem<AxeItem> PALLADIUM_AXE = ITEMS.register("palladium_axe",
            () -> new AxeItem(ModToolTiers.PALLADIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.PALLADIUM, 7, -3f))));
    public static final DeferredItem<AxeItem> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(ModToolTiers.TITANIUM, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.TITANIUM, 9, -3f))));
    public static final DeferredItem<AxeItem> CHLOROPHYTE_AXE = ITEMS.register("chlorophyte_axe",
            () -> new AxeItem(ModToolTiers.CHLOROPHYTE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.CHLOROPHYTE, 11, -3f))));
    public static final DeferredItem<AxeItem> SPECTRE_AXE = ITEMS.register("spectre_axe",
            () -> new AxeItem(ModToolTiers.SPECTRE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.SPECTRE, 12, -3f))));
    public static final DeferredItem<AxeItem> SHROOMITE_AXE = ITEMS.register("shroomite_axe",
            () -> new AxeItem(ModToolTiers.SHROOMITE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.SHROOMITE, 12, -3f))));
    public static final DeferredItem<AxeItem> HELLSTONE_AXE = ITEMS.register("hellstone_axe",
            () -> new AxeItem(ModToolTiers.HELLSTONE, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.HELLSTONE, 13, -3f))));


    public static final DeferredItem<ShovelItem> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",
            () -> new ShovelItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.PLATINUM, 1, -3f))));
    public static final DeferredItem<ShovelItem> PALLADIUM_SHOVEL = ITEMS.register("palladium_shovel",
            () -> new ShovelItem(ModToolTiers.PALLADIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.PALLADIUM, 2, -3f))));
    public static final DeferredItem<ShovelItem> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(ModToolTiers.TITANIUM, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.TITANIUM, 2, -3f))));
    public static final DeferredItem<ShovelItem> CHLOROPHYTE_SHOVEL = ITEMS.register("chlorophyte_shovel",
            () -> new ShovelItem(ModToolTiers.CHLOROPHYTE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.CHLOROPHYTE, 3, -3f))));
    public static final DeferredItem<ShovelItem> SPECTRE_SHOVEL = ITEMS.register("spectre_shovel",
            () -> new ShovelItem(ModToolTiers.SPECTRE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.SPECTRE, 3, -3f))));
    public static final DeferredItem<ShovelItem> SHROOMITE_SHOVEL = ITEMS.register("shroomite_shovel",
            () -> new ShovelItem(ModToolTiers.SHROOMITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.SHROOMITE, 3, -3f))));
    public static final DeferredItem<ShovelItem> HELLSTONE_SHOVEL = ITEMS.register("hellstone_shovel",
            () -> new ShovelItem(ModToolTiers.HELLSTONE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.HELLSTONE, 4, -3f))));


    public static final DeferredItem<HoeItem> PLATINUM_HOE = ITEMS.register("platinum_hoe",
            () -> new HoeItem(ModToolTiers.PLATINUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.PLATINUM, 1, 0f))));
    public static final DeferredItem<HoeItem> PALLADIUM_HOE = ITEMS.register("palladium_hoe",
            () -> new HoeItem(ModToolTiers.PALLADIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.PALLADIUM, 2, 0f))));
    public static final DeferredItem<HoeItem> TITANIUM_HOE = ITEMS.register("titanium_hoe",
            () -> new HoeItem(ModToolTiers.TITANIUM, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.TITANIUM, 2, 0f))));
    public static final DeferredItem<HoeItem> CHLOROPHYTE_HOE = ITEMS.register("chlorophyte_hoe",
            () -> new HoeItem(ModToolTiers.CHLOROPHYTE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.CHLOROPHYTE, 3, 0f))));
    public static final DeferredItem<HoeItem> SPECTRE_HOE = ITEMS.register("spectre_hoe",
            () -> new HoeItem(ModToolTiers.SPECTRE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.SPECTRE, 3, 0f))));
    public static final DeferredItem<HoeItem> SHROOMITE_HOE = ITEMS.register("shroomite_hoe",
            () -> new HoeItem(ModToolTiers.SHROOMITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.SHROOMITE, 3, 0f))));
    public static final DeferredItem<HoeItem> HELLSTONE_HOE = ITEMS.register("hellstone_hoe",
            () -> new HoeItem(ModToolTiers.HELLSTONE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.HELLSTONE, 4, 0f))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
