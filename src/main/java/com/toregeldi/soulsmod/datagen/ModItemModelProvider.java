package com.toregeldi.soulsmod.datagen;

import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SoulsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RAW_PLATINUM.get());
        basicItem(ModItems.RAW_HELLSTONE.get());
        basicItem(ModItems.RAW_CHLOROPHYTE.get());
        basicItem(ModItems.RAW_SPECTRE.get());
        basicItem(ModItems.RAW_SHROOMITE.get());
        basicItem(ModItems.RAW_PALLADIUM.get());
        basicItem(ModItems.RAW_TITANIUM.get());

        basicItem(ModItems.PLATINUM_INGOT.get());
        basicItem(ModItems.HELLSTONE_INGOT.get());
        basicItem(ModItems.CHLOROPHYTE_INGOT.get());
        basicItem(ModItems.SPECTRE_INGOT.get());
        basicItem(ModItems.SHROOMITE_INGOT.get());
        basicItem(ModItems.PALLADIUM_INGOT.get());
        basicItem(ModItems.TITANIUM_INGOT.get());

        basicItem(ModItems.PLATINUM_HELMET.get());
        basicItem(ModItems.HELLSTONE_HELMET.get());
        basicItem(ModItems.CHLOROPHYTE_HELMET.get());
        basicItem(ModItems.SPECTRE_HELMET.get());
        basicItem(ModItems.SHROOMITE_HELMET.get());
        basicItem(ModItems.PALLADIUM_HELMET.get());
        basicItem(ModItems.TITANIUM_HELMET.get());

        basicItem(ModItems.PLATINUM_CHESTPLATE.get());
        basicItem(ModItems.HELLSTONE_CHESTPLATE.get());
        basicItem(ModItems.CHLOROPHYTE_CHESTPLATE.get());
        basicItem(ModItems.SPECTRE_CHESTPLATE.get());
        basicItem(ModItems.SHROOMITE_CHESTPLATE.get());
        basicItem(ModItems.PALLADIUM_CHESTPLATE.get());
        basicItem(ModItems.TITANIUM_CHESTPLATE.get());

        basicItem(ModItems.PLATINUM_LEGGINGS.get());
        basicItem(ModItems.HELLSTONE_LEGGINGS.get());
        basicItem(ModItems.CHLOROPHYTE_LEGGINGS.get());
        basicItem(ModItems.SPECTRE_LEGGINGS.get());
        basicItem(ModItems.SHROOMITE_LEGGINGS.get());
        basicItem(ModItems.PALLADIUM_LEGGINGS.get());
        basicItem(ModItems.TITANIUM_LEGGINGS.get());

        basicItem(ModItems.PLATINUM_BOOTS.get());
        basicItem(ModItems.HELLSTONE_BOOTS.get());
        basicItem(ModItems.CHLOROPHYTE_BOOTS.get());
        basicItem(ModItems.SPECTRE_BOOTS.get());
        basicItem(ModItems.SHROOMITE_BOOTS.get());
        basicItem(ModItems.PALLADIUM_BOOTS.get());
        basicItem(ModItems.TITANIUM_BOOTS.get());

        basicItem(ModItems.RUBY.get());
        basicItem(ModItems.SAPPHIRE.get());
        basicItem(ModItems.TOPAZ.get());

        basicItem(ModItems.RUBY_APPLE.get());
        basicItem(ModItems.SAPPHIRE_APPLE.get());
        basicItem(ModItems.TOPAZ_APPLE.get());
    }
}
