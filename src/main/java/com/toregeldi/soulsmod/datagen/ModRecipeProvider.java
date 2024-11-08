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
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        createApple(ModItems.RUBY.get(), ModItems.RUBY_APPLE.get());

        createHelmet(ModItems.PLATINUM_INGOT.get(), ModItems.PLATINUM_HELMET.get());
        createHelmet(ModItems.HELLSTONE_INGOT.get(), ModItems.HELLSTONE_HELMET.get());
        createHelmet(ModItems.CHLOROPHYTE_INGOT.get(), ModItems.CHLOROPHYTE_HELMET.get());
        createHelmet(ModItems.SPECTRE_INGOT.get(), ModItems.SPECTRE_HELMET.get());
        createHelmet(ModItems.SHROOMITE_INGOT.get(), ModItems.SHROOMITE_HELMET.get());
        createHelmet(ModItems.PALLADIUM_INGOT.get(), ModItems.PALLADIUM_HELMET.get());
        createHelmet(ModItems.TITANIUM_INGOT.get(), ModItems.TITANIUM_HELMET.get());

        createChestplate(ModItems.PLATINUM_INGOT.get(), ModItems.PLATINUM_CHESTPLATE.get());
        createChestplate(ModItems.HELLSTONE_INGOT.get(), ModItems.HELLSTONE_CHESTPLATE.get());
        createChestplate(ModItems.CHLOROPHYTE_INGOT.get(), ModItems.CHLOROPHYTE_CHESTPLATE.get());
        createChestplate(ModItems.SPECTRE_INGOT.get(), ModItems.SPECTRE_CHESTPLATE.get());
        createChestplate(ModItems.SHROOMITE_INGOT.get(), ModItems.SHROOMITE_CHESTPLATE.get());
        createChestplate(ModItems.PALLADIUM_INGOT.get(), ModItems.PALLADIUM_CHESTPLATE.get());
        createChestplate(ModItems.TITANIUM_INGOT.get(), ModItems.TITANIUM_CHESTPLATE.get());

        createLeggings(ModItems.PLATINUM_INGOT.get(), ModItems.PLATINUM_LEGGINGS.get());
        createLeggings(ModItems.HELLSTONE_INGOT.get(), ModItems.HELLSTONE_LEGGINGS.get());
        createLeggings(ModItems.CHLOROPHYTE_INGOT.get(), ModItems.CHLOROPHYTE_LEGGINGS.get());
        createLeggings(ModItems.SPECTRE_INGOT.get(), ModItems.SPECTRE_LEGGINGS.get());
        createLeggings(ModItems.SHROOMITE_INGOT.get(), ModItems.SHROOMITE_LEGGINGS.get());
        createLeggings(ModItems.PALLADIUM_INGOT.get(), ModItems.PALLADIUM_LEGGINGS.get());
        createLeggings(ModItems.TITANIUM_INGOT.get(), ModItems.TITANIUM_LEGGINGS.get());

        createBoots(ModItems.PLATINUM_INGOT.get(), ModItems.PLATINUM_BOOTS.get());
        createBoots(ModItems.HELLSTONE_INGOT.get(), ModItems.HELLSTONE_BOOTS.get());
        createBoots(ModItems.CHLOROPHYTE_INGOT.get(), ModItems.CHLOROPHYTE_BOOTS.get());
        createBoots(ModItems.SPECTRE_INGOT.get(), ModItems.SPECTRE_BOOTS.get());
        createBoots(ModItems.SHROOMITE_INGOT.get(), ModItems.SHROOMITE_BOOTS.get());
        createBoots(ModItems.PALLADIUM_INGOT.get(), ModItems.PALLADIUM_BOOTS.get());
        createBoots(ModItems.TITANIUM_INGOT.get(), ModItems.TITANIUM_BOOTS.get());
    }

    private void createApple(Item item, Item result) {
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, (ItemLike) result)
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', (ItemLike) item)
                .define('#', Items.APPLE);
    }

    private void createHelmet(Item item, ArmorItem result) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, (ItemLike) result)
                .pattern("XXX")
                .pattern("X X")
                .define('X', (ItemLike) item);
    }
    private void createChestplate(Item item, Item result) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, (ItemLike) result)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', (ItemLike) item);
    }
    private void createLeggings(Item item, Item result) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, (ItemLike) result)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', (ItemLike) item);
    }
    private void createBoots(Item item, Item result) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, (ItemLike) result)
                .pattern("X X")
                .pattern("X X")
                .define('X', (ItemLike) item);
    }

}
