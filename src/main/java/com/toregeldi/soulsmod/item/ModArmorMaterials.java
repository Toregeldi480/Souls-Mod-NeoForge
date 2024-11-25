package com.toregeldi.soulsmod.item;

import com.toregeldi.soulsmod.SoulsMod;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final Holder<ArmorMaterial> PLATINUM_ARMOR_MATERIAL = register("platinum",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.BODY, 5);
            }), 16, 2f, 0.2f, () -> ModItems.PLATINUM_INGOT.get());

    public static final Holder<ArmorMaterial> PALLADIUM_ARMOR_MATERIAL = register("palladium",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 7);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.BOOTS, 4);
                attribute.put(ArmorItem.Type.BODY, 7);
            }), 16, 2f, 0.2f, () -> ModItems.PALLADIUM_INGOT.get());

    public static final Holder<ArmorMaterial> TITANIUM_ARMOR_MATERIAL = register("titanium",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 10);
                attribute.put(ArmorItem.Type.CHESTPLATE, 14);
                attribute.put(ArmorItem.Type.LEGGINGS, 12);
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.BODY, 14);
            }), 16, 2f, 0.2f, () -> ModItems.TITANIUM_INGOT.get());

    public static final Holder<ArmorMaterial> CHLOROPHYTE_ARMOR_MATERIAL = register("chlorophyte",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 13);
                attribute.put(ArmorItem.Type.CHESTPLATE, 18);
                attribute.put(ArmorItem.Type.LEGGINGS, 16);
                attribute.put(ArmorItem.Type.BOOTS, 11);
                attribute.put(ArmorItem.Type.BODY, 18);
            }), 16, 2f, 0.2f, () -> ModItems.CHLOROPHYTE_INGOT.get());

    public static final Holder<ArmorMaterial> SPECTRE_ARMOR_MATERIAL = register("spectre",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 15);
                attribute.put(ArmorItem.Type.CHESTPLATE, 20);
                attribute.put(ArmorItem.Type.LEGGINGS, 18);
                attribute.put(ArmorItem.Type.BOOTS, 13);
                attribute.put(ArmorItem.Type.BODY, 20);
            }), 16, 2f, 0.2f, () -> ModItems.SPECTRE_INGOT.get());

    public static final Holder<ArmorMaterial> SHROOMITE_ARMOR_MATERIAL = register("shroomite",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 15);
                attribute.put(ArmorItem.Type.CHESTPLATE, 20);
                attribute.put(ArmorItem.Type.LEGGINGS, 18);
                attribute.put(ArmorItem.Type.BOOTS, 13);
                attribute.put(ArmorItem.Type.BODY, 20);
            }), 16, 2f, 0.2f, () -> ModItems.SHROOMITE_INGOT.get());

    public static final Holder<ArmorMaterial> HELLSTONE_ARMOR_MATERIAL = register("hellstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.HELMET, 18);
                attribute.put(ArmorItem.Type.CHESTPLATE, 24);
                attribute.put(ArmorItem.Type.LEGGINGS, 22);
                attribute.put(ArmorItem.Type.BOOTS, 16);
                attribute.put(ArmorItem.Type.BODY, 24);
            }), 16, 2f, 0.2f, () -> ModItems.HELLSTONE_INGOT.get());


    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, float toughness, float knockbackResistanse,
                                                  Supplier<Item> ingredientItem) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, name);
        Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for(ArmorItem.Type type: ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistanse)
        );
    }
}
