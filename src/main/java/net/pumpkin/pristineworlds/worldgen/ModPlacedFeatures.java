package net.pumpkin.pristineworlds.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.pumpkin.pristineworlds.PristineWorlds;
import net.pumpkin.pristineworlds.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> BLACK_CALACATTA_PLACED_KEY= registerKey("black_calacatta_placed");
    public static final ResourceKey<PlacedFeature> BLACK_LABRADOR_PLACED_KEY= registerKey("black_labrador_placed");
    public static final ResourceKey<PlacedFeature> BLUE_BAY_PLACED_KEY= registerKey("blue_bay_placed");
    public static final ResourceKey<PlacedFeature> BLUE_CALCITE_PLACED_KEY= registerKey("blue_calcite_placed");
    public static final ResourceKey<PlacedFeature> BLUE_SODALITE_PLACED_KEY= registerKey("blue_sodalite_placed");
    public static final ResourceKey<PlacedFeature> CALACATTA_VAGLI_PLACED_KEY= registerKey("calacatta_vagli_placed");
    public static final ResourceKey<PlacedFeature> CALACATTA_VIOLA_PLACED_KEY= registerKey("calacatta_viola_placed");
    public static final ResourceKey<PlacedFeature> CARRARA_PLACED_KEY= registerKey("carrara_key_placed");
    public static final ResourceKey<PlacedFeature> CASA_MARMI_PLACED_KEY= registerKey("casa_marmi_key_placed");
    public static final ResourceKey<PlacedFeature> FRENCH_CHIFFON_PLACED_KEY= registerKey("french_chiffon_placed");
    public static final ResourceKey<PlacedFeature> GIALLO_ANTICO_PLACED_KEY= registerKey("giallo_antico_placed");
    public static final ResourceKey<PlacedFeature> GOLDEN_WAVE_PLACED_KEY= registerKey("golden_wave_placed");
    public static final ResourceKey<PlacedFeature> IMPERIAL_RED_PLACED_KEY= registerKey("imperial_red_placed");
    public static final ResourceKey<PlacedFeature> MALACHITE_PLACED_KEY= registerKey("malachite_placed");
    public static final ResourceKey<PlacedFeature> MING_GREEN_PLACED_KEY= registerKey("ming_green_placed");
    public static final ResourceKey<PlacedFeature> PORPHYRY_PLACED_KEY= registerKey("porphyry_placed");
    public static final ResourceKey<PlacedFeature> RED_LAGOON_PLACED_KEY= registerKey("red_lagoon_placed");
    public static final ResourceKey<PlacedFeature> RED_VENETIAN_PLACED_KEY= registerKey("red_venetian_placed");
    public static final ResourceKey<PlacedFeature> SILVER_CHIANTI_PLACED_KEY= registerKey("silver_chianti_placed");

    public static final ResourceKey<PlacedFeature> BRIMSTONE_PLACED_KEY = registerKey("brimstone_placed");
    public static final ResourceKey<PlacedFeature> BLUESTONE_PLACED_KEY = registerKey("bluestone_placed");
    public static final ResourceKey<PlacedFeature> LIMESTONE_PLACED_KEY = registerKey("limestone_placed");
    public static final ResourceKey<PlacedFeature> PERIDOTITE_PLACED_KEY = registerKey("peridotite_placed");


    public static final ResourceKey<PlacedFeature> CINNAMON_PLACED_KEY = registerKey("cinnamon_placed");
    public static final ResourceKey<PlacedFeature> CYPRESS_PLACED_KEY = registerKey("cypress_placed");
    public static final ResourceKey<PlacedFeature> EBONY_PLACED_KEY = registerKey("ebony_placed");
    public static final ResourceKey<PlacedFeature> HICKORY_PLACED_KEY = registerKey("hickory_placed");
    public static final ResourceKey<PlacedFeature> LARCH_PLACED_KEY = registerKey("larch_placed");
    public static final ResourceKey<PlacedFeature> LINDEN_PLACED_KEY = registerKey("linden_placed");
    public static final ResourceKey<PlacedFeature> MAPLE_PLACED_KEY = registerKey("maple_placed");
    public static final ResourceKey<PlacedFeature> OLIVE_PLACED_KEY = registerKey("olive_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        register(context, BLACK_CALACATTA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACK_CALACATTA_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-54), VerticalAnchor.absolute(-9))));
        register(context, BLACK_LABRADOR_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACK_LABRADOR_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-54), VerticalAnchor.absolute(-8))));
        register(context, BLUE_BAY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUE_BAY_KEY),
                ModOrePlacement.commonOrePlacement(1,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-54), VerticalAnchor.absolute(-8))));
        register(context, BLUE_CALCITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUE_CALCITE_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-8), VerticalAnchor.absolute(40))));
        register(context, BLUE_SODALITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUE_SODALITE_KEY),
                ModOrePlacement.commonOrePlacement(1,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-54), VerticalAnchor.absolute(-8))));
        register(context, CALACATTA_VAGLI_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CALACATTA_VAGLI_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(62), VerticalAnchor.absolute(240))));
        register(context, CALACATTA_VIOLA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CALACATTA_VIOLA_KEY),
                ModOrePlacement.commonOrePlacement(1,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(50), VerticalAnchor.absolute(80))));
        register(context, CARRARA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CARRARA_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(80), VerticalAnchor.absolute(240))));
        register(context, CASA_MARMI_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CASA_MARMI_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-8), VerticalAnchor.absolute(40))));
        register(context, FRENCH_CHIFFON_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FRENCH_CHIFFON_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-8), VerticalAnchor.absolute(40))));
        register(context, GIALLO_ANTICO_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GIALLO_ANTICO_KEY),
                ModOrePlacement.commonOrePlacement(5,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-8), VerticalAnchor.absolute(240))));
        register(context, GOLDEN_WAVE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_WAVE_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(40), VerticalAnchor.absolute(90))));
        register(context, IMPERIAL_RED_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.IMPERIAL_RED_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-8), VerticalAnchor.absolute(40))));
        register(context, MALACHITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MALACHITE_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-8), VerticalAnchor.absolute(40))));
        register(context, MING_GREEN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MING_GREEN_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-8), VerticalAnchor.absolute(40))));
        register(context, PORPHYRY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PORPHYRY_KEY),
                ModOrePlacement.commonOrePlacement(1,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-54), VerticalAnchor.absolute(90))));
        register(context, RED_LAGOON_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_LAGOON_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-54), VerticalAnchor.absolute(-8))));
        register(context, RED_VENETIAN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_VENETIAN_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-8), VerticalAnchor.absolute(40))));
        register(context, SILVER_CHIANTI_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SILVER_CHIANTI_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-8), VerticalAnchor.absolute(40))));

        register(context, BRIMSTONE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BRIMSTONE_KEY),
                ModOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(34))));
        register(context, BLUESTONE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUESTONE_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
        register(context, LIMESTONE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LIMESTONE_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
        register(context, PERIDOTITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PERIDOTITE_KEY),
                ModOrePlacement.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));


        register(context, CINNAMON_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CINNAMON_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.CINNAMON_SAPLING.get()));
        register(context, CYPRESS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CYPRESS_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.CYPRESS_SAPLING.get()));
        register(context, EBONY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.EBONY_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.EBONY_SAPLING.get()));
        register(context, HICKORY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.HICKORY_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.HICKORY_SAPLING.get()));
        register(context, LARCH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LARCH_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.LARCH_SAPLING.get()));
        register(context, LINDEN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LINDEN_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.LINDEN_SAPLING.get()));
        register(context, MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAPLE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.MAPLE_SAPLING.get()));
        register(context, OLIVE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OLIVE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 2),
                        ModBlocks.OLIVE_SAPLING.get()));

    }
    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(PristineWorlds.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
