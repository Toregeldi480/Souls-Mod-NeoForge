package com.toregeldi.soulsmod.datagen;

import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.item.ModItems;
import com.toregeldi.soulsmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, SoulsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.RAW_PLATINUM.get())
                .add(ModItems.RAW_HELLSTONE.get())
                .add(ModItems.RAW_CHLOROPHYTE.get())
                .add(ModItems.RAW_SPECTRE.get())
                .add(ModItems.RAW_SHROOMITE.get())
                .add(ModItems.RAW_PALLADIUM.get())
                .add(ModItems.RAW_TITANIUM.get());
    }
}
