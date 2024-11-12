package com.toregeldi.soulsmod.datagen;

import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.item.ModItems;
import com.toregeldi.soulsmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
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

        tag(ItemTags.SWORDS)
                .add(ModItems.PLATINUM_SWORD.get())
                .add(ModItems.PALLADIUM_SWORD.get())
                .add(ModItems.TITANIUM_SWORD.get())
                .add(ModItems.CHLOROPHYTE_SWORD.get())
                .add(ModItems.SPECTRE_SWORD.get())
                .add(ModItems.SHROOMITE_SWORD.get())
                .add(ModItems.HELLSTONE_SWORD.get());

        tag(ItemTags.PICKAXES)
                .add(ModItems.PLATINUM_PICKAXE.get())
                .add(ModItems.PLATINUM_PICKAXE.get())
                .add(ModItems.PALLADIUM_PICKAXE.get())
                .add(ModItems.TITANIUM_PICKAXE.get())
                .add(ModItems.CHLOROPHYTE_PICKAXE.get())
                .add(ModItems.SPECTRE_PICKAXE.get())
                .add(ModItems.SHROOMITE_PICKAXE.get())
                .add(ModItems.HELLSTONE_PICKAXE.get());

        tag(ItemTags.AXES)
                .add(ModItems.PLATINUM_AXE.get())
                .add(ModItems.PLATINUM_AXE.get())
                .add(ModItems.PALLADIUM_AXE.get())
                .add(ModItems.TITANIUM_AXE.get())
                .add(ModItems.CHLOROPHYTE_AXE.get())
                .add(ModItems.SPECTRE_AXE.get())
                .add(ModItems.SHROOMITE_AXE.get())
                .add(ModItems.HELLSTONE_AXE.get());

        tag(ItemTags.SHOVELS)
                .add(ModItems.PLATINUM_SHOVEL.get())
                .add(ModItems.PLATINUM_SHOVEL.get())
                .add(ModItems.PALLADIUM_SHOVEL.get())
                .add(ModItems.TITANIUM_SHOVEL.get())
                .add(ModItems.CHLOROPHYTE_SHOVEL.get())
                .add(ModItems.SPECTRE_SHOVEL.get())
                .add(ModItems.SHROOMITE_SHOVEL.get())
                .add(ModItems.HELLSTONE_SHOVEL.get());

        tag(ItemTags.HOES)
                .add(ModItems.PLATINUM_HOE.get())
                .add(ModItems.PLATINUM_HOE.get())
                .add(ModItems.PALLADIUM_HOE.get())
                .add(ModItems.TITANIUM_HOE.get())
                .add(ModItems.CHLOROPHYTE_HOE.get())
                .add(ModItems.SPECTRE_HOE.get())
                .add(ModItems.SHROOMITE_HOE.get())
                .add(ModItems.HELLSTONE_HOE.get());
    }
}
