package com.toregeldi.soulsmod.worldgen;

import com.toregeldi.soulsmod.SoulsMod;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> PLACED_PLATINUM_ORE_KEY = registerKey("placed_platinum_ore");
    public static final ResourceKey<PlacedFeature> PLACED_PALLADIUM_ORE_KEY = registerKey("placed_palladium_ore");
    public static final ResourceKey<PlacedFeature> PLACED_TITANIUM_ORE_KEY = registerKey("placed_titanium_ore");
    public static final ResourceKey<PlacedFeature> PLACED_CHLOROPHYTE_ORE_KEY = registerKey("placed_chlorophyte_ore");
    public static final ResourceKey<PlacedFeature> PLACED_RUBY_ORE_KEY = registerKey("placed_ruby_ore");
    public static final ResourceKey<PlacedFeature> PLACED_SAPPHIRE_ORE_KEY = registerKey("placed_sapphire_ore");
    public static final ResourceKey<PlacedFeature> PLACED_TOPAZ_ORE_KEY = registerKey("placed_topaz_ore");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, PLACED_PLATINUM_ORE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PLATINUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(20, HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(190))));

        register(context, PLACED_PALLADIUM_ORE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_PALLADIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(90, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(150))));

        register(context, PLACED_TITANIUM_ORE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TITANIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(50, HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(100))));

        register(context, PLACED_CHLOROPHYTE_ORE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_CHLOROPHYTE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(70, HeightRangePlacement.triangle(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(80))));

        register(context, PLACED_RUBY_ORE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RUBY_ORE_KEY),
                ModOrePlacement.commonOrePlacement(30, HeightRangePlacement.uniform(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(400))));

        register(context, PLACED_SAPPHIRE_ORE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(30, HeightRangePlacement.uniform(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(400))));

        register(context, PLACED_TOPAZ_ORE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TOPAZ_ORE_KEY),
                ModOrePlacement.commonOrePlacement(30, HeightRangePlacement.uniform(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(400))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(SoulsMod.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
