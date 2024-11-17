package com.toregeldi.soulsmod.datagen;

import com.toregeldi.soulsmod.SoulsMod;
import com.toregeldi.soulsmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SoulsMod.MOD_ID, existingFileHelper);
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, "item/" + item.getId().getPath()));
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

//        basicItem(ModItems.CRANBERRY.get());
//        basicItem(ModItems.BLACKBERRY.get());
        basicItem(ModItems.BLUEBERRY.get());
//        basicItem(ModItems.RASPBERRY.get());
//        basicItem(ModItems.STRAWBERRY.get());
//        basicItem(ModItems.ORANGE.get());
//        basicItem(ModItems.LEMON.get());

        basicItem(ModItems.RUBY_APPLE.get());
        basicItem(ModItems.SAPPHIRE_APPLE.get());
        basicItem(ModItems.TOPAZ_APPLE.get());

        handheldItem(ModItems.PLATINUM_SWORD);
        handheldItem(ModItems.PALLADIUM_SWORD);
        handheldItem(ModItems.TITANIUM_SWORD);
        handheldItem(ModItems.CHLOROPHYTE_SWORD);
        handheldItem(ModItems.SPECTRE_SWORD);
        handheldItem(ModItems.SHROOMITE_SWORD);
        handheldItem(ModItems.HELLSTONE_SWORD);

        handheldItem(ModItems.PLATINUM_PICKAXE);
        handheldItem(ModItems.PALLADIUM_PICKAXE);
        handheldItem(ModItems.TITANIUM_PICKAXE);
        handheldItem(ModItems.CHLOROPHYTE_PICKAXE);
        handheldItem(ModItems.SPECTRE_PICKAXE);
        handheldItem(ModItems.SHROOMITE_PICKAXE);
        handheldItem(ModItems.HELLSTONE_PICKAXE);

        handheldItem(ModItems.PLATINUM_AXE);
        handheldItem(ModItems.PALLADIUM_AXE);
        handheldItem(ModItems.TITANIUM_AXE);
        handheldItem(ModItems.CHLOROPHYTE_AXE);
        handheldItem(ModItems.SPECTRE_AXE);
        handheldItem(ModItems.SHROOMITE_AXE);
        handheldItem(ModItems.HELLSTONE_AXE);

        handheldItem(ModItems.PLATINUM_SHOVEL);
        handheldItem(ModItems.PALLADIUM_SHOVEL);
        handheldItem(ModItems.TITANIUM_SHOVEL);
        handheldItem(ModItems.CHLOROPHYTE_SHOVEL);
        handheldItem(ModItems.SPECTRE_SHOVEL);
        handheldItem(ModItems.SHROOMITE_SHOVEL);
        handheldItem(ModItems.HELLSTONE_SHOVEL);

        handheldItem(ModItems.PLATINUM_HOE);
        handheldItem(ModItems.PALLADIUM_HOE);
        handheldItem(ModItems.TITANIUM_HOE);
        handheldItem(ModItems.CHLOROPHYTE_HOE);
        handheldItem(ModItems.SPECTRE_HOE);
        handheldItem(ModItems.SHROOMITE_HOE);
        handheldItem(ModItems.HELLSTONE_HOE);
    }
}
