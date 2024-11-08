package com.toregeldi.soulsmod.datagen;

import com.toregeldi.soulsmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        createApple(ModItems.RUBY.get(), ModItems.RUBY_APPLE.get(), output);
        createApple(ModItems.SAPPHIRE.get(), ModItems.SAPPHIRE_APPLE.get(), output);

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
