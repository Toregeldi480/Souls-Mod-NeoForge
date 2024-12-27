package com.toregeldi.soulsmod.datagen;

import com.toregeldi.soulsmod.block.ModBlocks;
import com.toregeldi.soulsmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        List<ItemLike> PLATINUM_SMELTABLES = List.of(ModItems.RAW_PLATINUM, ModBlocks.PLATINUM_ORE);
        List<ItemLike> PALLADIUM_SMELTABLES = List.of(ModItems.RAW_PALLADIUM, ModBlocks.PALLADIUM_ORE);
        List<ItemLike> TITANIUM_SMELTABLES = List.of(ModItems.RAW_PLATINUM, ModBlocks.TITANIUM_ORE);
        List<ItemLike> CHLOROPHYTE_SMELTABLES = List.of(ModItems.RAW_CHLOROPHYTE, ModBlocks.CHLOROPHYTE_ORE);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GLOWING_MUSHROOM_BLOCK)
                .requires(ModItems.GLOWING_MUSHROOM, 9)
                .unlockedBy("has_glowing_mushroom", has(ModItems.GLOWING_MUSHROOM)).save(output);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.ESTUS_FLASK)
                .requires(ModItems.BOTTLE, 1)
                .requires(Items.GOLD_NUGGET, 1)
                .requires(ModItems.MINT, 1)
                .requires(ModItems.ORANGE, 1)
                .requires(ModItems.LEMON, 1)
                .unlockedBy("has_bottle", has(ModItems.BOTTLE)).save(output);

        createJuice(ModItems.BLACKBERRY.get(), ModItems.BLACKBERRY_JUICE.get(), output);
        createJuice(ModItems.BLUEBERRY.get(), ModItems.BLUEBERRY_JUICE.get(), output);
        createJuice(ModItems.RASPBERRY.get(), ModItems.RASPBERRY_JUICE.get(), output);
        createJuice(ModItems.STRAWBERRY.get(), ModItems.STRAWBERRY_JUICE.get(), output);
        createJuice(ModItems.ORANGE.get(), ModItems.ORANGE_JUICE.get(), output);
        createJuice(ModItems.LEMON.get(), ModItems.LEMON_JUICE.get(), output);
        createJuice(Items.SWEET_BERRIES, ModItems.SWEET_BERRIES_JUICE.get(), output);

        createApple(ModItems.RUBY.get(), ModItems.RUBY_APPLE.get(), output);
        createApple(ModItems.SAPPHIRE.get(), ModItems.SAPPHIRE_APPLE.get(), output);
        createApple(ModItems.TOPAZ.get(), ModItems.TOPAZ_APPLE.get(), output);

        createSword(ModItems.PLATINUM_INGOT.get(), ModItems.PLATINUM_SWORD.get(), output);
        createSword(ModItems.PALLADIUM_INGOT.get(), ModItems.PALLADIUM_SWORD.get(), output);
        createSword(ModItems.TITANIUM_INGOT.get(), ModItems.TITANIUM_SWORD.get(), output);
        createSword(ModItems.CHLOROPHYTE_INGOT.get(), ModItems.CHLOROPHYTE_SWORD.get(), output);
        createSword(ModItems.SPECTRE_INGOT.get(), ModItems.SPECTRE_SWORD.get(), output);
        createSword(ModItems.SHROOMITE_INGOT.get(), ModItems.SHROOMITE_SWORD.get(), output);
        createSword(ModItems.HELLSTONE_INGOT.get(), ModItems.HELLSTONE_SWORD.get(), output);

        createPickaxe(ModItems.PLATINUM_INGOT.get(), ModItems.PLATINUM_PICKAXE.get(), output);
        createPickaxe(ModItems.PALLADIUM_INGOT.get(), ModItems.PALLADIUM_PICKAXE.get(), output);
        createPickaxe(ModItems.TITANIUM_INGOT.get(), ModItems.TITANIUM_PICKAXE.get(), output);
        createPickaxe(ModItems.CHLOROPHYTE_INGOT.get(), ModItems.CHLOROPHYTE_PICKAXE.get(), output);
        createPickaxe(ModItems.SPECTRE_INGOT.get(), ModItems.SPECTRE_PICKAXE.get(), output);
        createPickaxe(ModItems.SHROOMITE_INGOT.get(), ModItems.SHROOMITE_PICKAXE.get(), output);
        createPickaxe(ModItems.HELLSTONE_INGOT.get(), ModItems.HELLSTONE_PICKAXE.get(), output);

        createAxe(ModItems.PLATINUM_INGOT.get(), ModItems.PLATINUM_AXE.get(), output);
        createAxe(ModItems.PALLADIUM_INGOT.get(), ModItems.PALLADIUM_AXE.get(), output);
        createAxe(ModItems.TITANIUM_INGOT.get(), ModItems.TITANIUM_AXE.get(), output);
        createAxe(ModItems.CHLOROPHYTE_INGOT.get(), ModItems.CHLOROPHYTE_AXE.get(), output);
        createAxe(ModItems.SPECTRE_INGOT.get(), ModItems.SPECTRE_AXE.get(), output);
        createAxe(ModItems.SHROOMITE_INGOT.get(), ModItems.SHROOMITE_AXE.get(), output);
        createAxe(ModItems.HELLSTONE_INGOT.get(), ModItems.HELLSTONE_AXE.get(), output);

        createShovel(ModItems.PLATINUM_INGOT.get(), ModItems.PLATINUM_SHOVEL.get(), output);
        createShovel(ModItems.PALLADIUM_INGOT.get(), ModItems.PALLADIUM_SHOVEL.get(), output);
        createShovel(ModItems.TITANIUM_INGOT.get(), ModItems.TITANIUM_SHOVEL.get(), output);
        createShovel(ModItems.CHLOROPHYTE_INGOT.get(), ModItems.CHLOROPHYTE_SHOVEL.get(), output);
        createShovel(ModItems.SPECTRE_INGOT.get(), ModItems.SPECTRE_SHOVEL.get(), output);
        createShovel(ModItems.SHROOMITE_INGOT.get(), ModItems.SHROOMITE_SHOVEL.get(), output);
        createShovel(ModItems.HELLSTONE_INGOT.get(), ModItems.HELLSTONE_SHOVEL.get(), output);

        createHoe(ModItems.PLATINUM_INGOT.get(), ModItems.PLATINUM_HOE.get(), output);
        createHoe(ModItems.PALLADIUM_INGOT.get(), ModItems.PALLADIUM_HOE.get(), output);
        createHoe(ModItems.TITANIUM_INGOT.get(), ModItems.TITANIUM_HOE.get(), output);
        createHoe(ModItems.CHLOROPHYTE_INGOT.get(), ModItems.CHLOROPHYTE_HOE.get(), output);
        createHoe(ModItems.SPECTRE_INGOT.get(), ModItems.SPECTRE_HOE.get(), output);
        createHoe(ModItems.SHROOMITE_INGOT.get(), ModItems.SHROOMITE_HOE.get(), output);
        createHoe(ModItems.HELLSTONE_INGOT.get(), ModItems.HELLSTONE_HOE.get(), output);

        createHelmet(ModItems.PLATINUM_INGOT.get(), ModItems.PLATINUM_HELMET.get(), output);
        createHelmet(ModItems.HELLSTONE_INGOT.get(), ModItems.HELLSTONE_HELMET.get(), output);
        createHelmet(ModItems.CHLOROPHYTE_INGOT.get(), ModItems.CHLOROPHYTE_HELMET.get(), output);
        createHelmet(ModItems.SPECTRE_INGOT.get(), ModItems.SPECTRE_HELMET.get(), output);
        createHelmet(ModItems.SHROOMITE_INGOT.get(), ModItems.SHROOMITE_HELMET.get(), output);
        createHelmet(ModItems.PALLADIUM_INGOT.get(), ModItems.PALLADIUM_HELMET.get(), output);
        createHelmet(ModItems.TITANIUM_INGOT.get(), ModItems.TITANIUM_HELMET.get(), output);

        createChestplate(ModItems.PLATINUM_INGOT.get(), ModItems.PLATINUM_CHESTPLATE.get(), output);
        createChestplate(ModItems.HELLSTONE_INGOT.get(), ModItems.HELLSTONE_CHESTPLATE.get(), output);
        createChestplate(ModItems.CHLOROPHYTE_INGOT.get(), ModItems.CHLOROPHYTE_CHESTPLATE.get(), output);
        createChestplate(ModItems.SPECTRE_INGOT.get(), ModItems.SPECTRE_CHESTPLATE.get(), output);
        createChestplate(ModItems.SHROOMITE_INGOT.get(), ModItems.SHROOMITE_CHESTPLATE.get(), output);
        createChestplate(ModItems.PALLADIUM_INGOT.get(), ModItems.PALLADIUM_CHESTPLATE.get(), output);
        createChestplate(ModItems.TITANIUM_INGOT.get(), ModItems.TITANIUM_CHESTPLATE.get(), output);

        createLeggings(ModItems.PLATINUM_INGOT.get(), ModItems.PLATINUM_LEGGINGS.get(), output);
        createLeggings(ModItems.HELLSTONE_INGOT.get(), ModItems.HELLSTONE_LEGGINGS.get(), output);
        createLeggings(ModItems.CHLOROPHYTE_INGOT.get(), ModItems.CHLOROPHYTE_LEGGINGS.get(), output);
        createLeggings(ModItems.SPECTRE_INGOT.get(), ModItems.SPECTRE_LEGGINGS.get(), output);
        createLeggings(ModItems.SHROOMITE_INGOT.get(), ModItems.SHROOMITE_LEGGINGS.get(), output);
        createLeggings(ModItems.PALLADIUM_INGOT.get(), ModItems.PALLADIUM_LEGGINGS.get(), output);
        createLeggings(ModItems.TITANIUM_INGOT.get(), ModItems.TITANIUM_LEGGINGS.get(), output);

        createBoots(ModItems.PLATINUM_INGOT.get(), ModItems.PLATINUM_BOOTS.get(), output);
        createBoots(ModItems.HELLSTONE_INGOT.get(), ModItems.HELLSTONE_BOOTS.get(), output);
        createBoots(ModItems.CHLOROPHYTE_INGOT.get(), ModItems.CHLOROPHYTE_BOOTS.get(), output);
        createBoots(ModItems.SPECTRE_INGOT.get(), ModItems.SPECTRE_BOOTS.get(), output);
        createBoots(ModItems.SHROOMITE_INGOT.get(), ModItems.SHROOMITE_BOOTS.get(), output);
        createBoots(ModItems.PALLADIUM_INGOT.get(), ModItems.PALLADIUM_BOOTS.get(), output);
        createBoots(ModItems.TITANIUM_INGOT.get(), ModItems.TITANIUM_BOOTS.get(), output);

        oreSmelting(output, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 0.25f, 250, "platinum");
        oreSmelting(output, PALLADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 0.25f, 250, "palladium");
        oreSmelting(output, CHLOROPHYTE_SMELTABLES, RecipeCategory.MISC, ModItems.CHLOROPHYTE_INGOT.get(), 0.25f, 250, "chlorophyte");
        oreSmelting(output, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 0.25f, 250, "titanium");

        oreBlasting(output, PLATINUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLATINUM_INGOT.get(), 0.25f, 250, "platinum");
        oreBlasting(output, PALLADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PALLADIUM_INGOT.get(), 0.25f, 250, "palladium");
        oreBlasting(output, CHLOROPHYTE_SMELTABLES, RecipeCategory.MISC, ModItems.CHLOROPHYTE_INGOT.get(), 0.25f, 250, "chlorophyte");
        oreBlasting(output, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_INGOT.get(), 0.25f, 250, "titanium");
    }

    private void createJuice(Item item, Item result, RecipeOutput output) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, result)
                .requires(item, 1)
                .requires(ModItems.BOTTLE, 1)
                .requires(ModItems.MINT, 1)
                .unlockedBy("has_" + item.toString().toLowerCase(), has(item)).save(output);
    }

    private void createApple(Item item, Item result, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, result)
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', item)
                .define('#', Items.APPLE)
                .unlockedBy("has_" + item.toString().toLowerCase(), has(item)).save(output);
    }

    private void createSword(Item item, Item result, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern(" X ")
                .pattern(" X ")
                .pattern(" # ")
                .define('X', item)
                .define('#', Items.STICK)
                .unlockedBy("has_" + item.toString().toLowerCase(), has(item)).save(output);
    }

    private void createPickaxe(Item item, Item result, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', item)
                .define('#', Items.STICK)
                .unlockedBy("has_" + item.toString().toLowerCase(), has(item)).save(output);
    }

    private void createAxe(Item item, Item result, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("XX ")
                .pattern("X# ")
                .pattern(" # ")
                .define('X', item)
                .define('#', Items.STICK)
                .unlockedBy("has_" + item.toString().toLowerCase(), has(item)).save(output);
    }

    private void createShovel(Item item, Item result, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern(" X ")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', item)
                .define('#', Items.STICK)
                .unlockedBy("has_" + item.toString().toLowerCase(), has(item)).save(output);
    }

    private void createHoe(Item item, Item result, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("XX ")
                .pattern(" # ")
                .pattern(" # ")
                .define('X', item)
                .define('#', Items.STICK)
                .unlockedBy("has_" + item.toString().toLowerCase(), has(item)).save(output);
    }

    private void createHelmet(Item item, ArmorItem result, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("XXX")
                .pattern("X X")
                .define('X', item)
                .unlockedBy("has_" + item.toString().toLowerCase(), has(item)).save(output);
    }
    private void createChestplate(Item item, Item result, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', item)
                .unlockedBy("has_" + item.toString().toLowerCase(), has(item)).save(output);
    }
    private void createLeggings(Item item, Item result, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', item)
                .unlockedBy("has_" + item.toString().toLowerCase(), has(item)).save(output);
    }
    private void createBoots(Item item, Item result, RecipeOutput output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("X X")
                .pattern("X X")
                .define('X', item)
                .unlockedBy("has_" + item.toString().toLowerCase(), has(item)).save(output);
    }

}
