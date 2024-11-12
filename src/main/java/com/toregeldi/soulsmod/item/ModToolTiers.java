package com.toregeldi.soulsmod.item;

import com.toregeldi.soulsmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier PLATINUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_PLATINUM_TOOL,
            1400, 4f, 3f, 28, () -> Ingredient.of(ModItems.PLATINUM_INGOT));

    public static final Tier PALLADIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_PALLADIUM_TOOL,
            1600, 5f, 3f, 28, () -> Ingredient.of(ModItems.PALLADIUM_INGOT));

    public static final Tier TITANIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_TITANIUM_TOOL,
            2000, 6f, 3f, 28, () -> Ingredient.of(ModItems.TITANIUM_INGOT));

    public static final Tier CHLOROPHYTE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_CHLOROPHYTE_TOOL,
            3000, 7f, 3f, 28, () -> Ingredient.of(ModItems.CHLOROPHYTE_INGOT));

    public static final Tier SPECTRE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_SPECTRE_TOOL,
            3200, 8f, 3f, 28, () -> Ingredient.of(ModItems.SPECTRE_INGOT));

    public static final Tier SHROOMITE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_SHROOMITE_TOOL,
            3200, 8f, 3f, 28, () -> Ingredient.of(ModItems.SHROOMITE_INGOT));

    public static final Tier HELLSTONE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_HELLSTONE_TOOL,
            5000, 10f, 3f, 28, () -> Ingredient.of(ModItems.HELLSTONE_INGOT));
}
