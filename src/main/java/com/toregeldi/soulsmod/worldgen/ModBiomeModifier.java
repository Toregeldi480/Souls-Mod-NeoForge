package com.toregeldi.soulsmod.worldgen;

import com.toregeldi.soulsmod.SoulsMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifier {
    public static final ResourceKey<BiomeModifier> ADD_PLATINUM_ORE = registryKey("add_platinum_ore");
    public static final ResourceKey<BiomeModifier> ADD_PALLADIUM_ORE = registryKey("add_palladium_ore");
    public static final ResourceKey<BiomeModifier> ADD_TITANIUM_ORE = registryKey("add_titanium_ore");
    public static final ResourceKey<BiomeModifier> ADD_CHLOROPHYTE_ORE = registryKey("add_chlorophyte_ore");
    public static final ResourceKey<BiomeModifier> ADD_RUBY_ORE = registryKey("add_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_SAPPHIRE_ORE = registryKey("add_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_TOPAZ_ORE = registryKey("add_topaz_ore");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_PLATINUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PLACED_PLATINUM_ORE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_PALLADIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.DESERT)),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PLACED_PALLADIUM_ORE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_TITANIUM_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.SNOWY_BEACH), biomes.getOrThrow(Biomes.SNOWY_PLAINS), biomes.getOrThrow(Biomes.SNOWY_SLOPES), biomes.getOrThrow(Biomes.SNOWY_TAIGA)),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PLACED_TITANIUM_ORE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_CHLOROPHYTE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.JUNGLE), biomes.getOrThrow(Biomes.BAMBOO_JUNGLE), biomes.getOrThrow(Biomes.SPARSE_JUNGLE)),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PLACED_CHLOROPHYTE_ORE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_RUBY_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PLACED_RUBY_ORE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_SAPPHIRE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PLACED_SAPPHIRE_ORE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_TOPAZ_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PLACED_TOPAZ_ORE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
    }

    private static ResourceKey<BiomeModifier> registryKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, name));
    }
}
