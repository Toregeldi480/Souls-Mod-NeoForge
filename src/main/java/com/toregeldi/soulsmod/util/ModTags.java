package com.toregeldi.soulsmod.util;

import com.toregeldi.soulsmod.SoulsMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_PLATINUM_TOOL = createTag("needs_platinum_tool");
        public static final TagKey<Block> NEEDS_PALLADIUM_TOOL = createTag("needs_palladium_tool");
        public static final TagKey<Block> NEEDS_TITANIUM_TOOL = createTag("needs_titanium_tool");
        public static final TagKey<Block> NEEDS_CHLOROPHYTE_TOOL = createTag("needs_chlorophyte_tool");
        public static final TagKey<Block> NEEDS_SPECTRE_TOOL = createTag("needs_spectre_tool");
        public static final TagKey<Block> NEEDS_SHROOMITE_TOOL = createTag("needs_shroomite_tool");
        public static final TagKey<Block> NEEDS_HELLSTONE_TOOL = createTag("needs_hellstone_tool");

        public static final TagKey<Block> INCORRECT_FOR_PLATINUM_TOOL = createTag("incorrect_for_platinum_tool");
        public static final TagKey<Block> INCORRECT_FOR_PALLADIUM_TOOL = createTag("incorrect_for_palladium_tool");
        public static final TagKey<Block> INCORRECT_FOR_TITANIUM_TOOL = createTag("incorrect_for_titanium_tool");
        public static final TagKey<Block> INCORRECT_FOR_CHLOROPHYTE_TOOL = createTag("incorrect_for_chlorophyte_tool");
        public static final TagKey<Block> INCORRECT_FOR_SPECTRE_TOOL = createTag("incorrect_for_spectre_tool");
        public static final TagKey<Block> INCORRECT_FOR_SHROOMITE_TOOL = createTag("incorrect_for_shroomite_tool");
        public static final TagKey<Block> INCORRECT_FOR_HELLSTONE_TOOL = createTag("incorrect_for_hellstone_tool");

        private static TagKey<Block> createTag(String name) {

            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, name));
        }
    }
}
