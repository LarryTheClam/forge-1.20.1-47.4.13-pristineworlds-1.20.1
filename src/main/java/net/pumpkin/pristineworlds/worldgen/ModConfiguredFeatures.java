package net.pumpkin.pristineworlds.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.pumpkin.pristineworlds.PristineWorlds;
import net.pumpkin.pristineworlds.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_CALACATTA_KEY = registerKey("black_calacatta");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_LABRADOR_KEY = registerKey("black_labrador");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_BAY_KEY = registerKey("blue_bay");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_CALCITE_KEY = registerKey("blue_calcite");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_SODALITE_KEY = registerKey("blue_sodalite");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CALACATTA_VAGLI_KEY = registerKey("calacatta_vagli");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CALACATTA_VIOLA_KEY = registerKey("calacatta_viola");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CARRARA_KEY = registerKey("carrara_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CASA_MARMI_KEY = registerKey("casa_marmi_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FRENCH_CHIFFON_KEY = registerKey("french_chiffon");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GIALLO_ANTICO_KEY = registerKey("giallo_antico");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_WAVE_KEY = registerKey("golden_wave");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IMPERIAL_RED_KEY = registerKey("imperial_red");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MALACHITE_KEY = registerKey("malachite");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MING_GREEN_KEY = registerKey("ming_green");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PORPHYRY_KEY = registerKey("porphyry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_LAGOON_KEY = registerKey("red_lagoon");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_VENETIAN_KEY = registerKey("red_venetian");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_CHIANTI_KEY = registerKey("silver_chianti");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplacables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> BLACK_CALACATTA_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.BLACK_CALACATTA_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.BLACK_CALACATTA_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> BLACK_LABRADOR_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.BLACK_LABRADOR_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.BLACK_LABRADOR_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> BLUE_BAY_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.BLUE_BAY_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.BLUE_BAY_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> BLUE_CALCITE_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.BLUE_CALCITE_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.BLUE_CALCITE_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> BLUE_SODALITE_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.BLUE_SODALITE_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.BLUE_SODALITE_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> CALACATTA_VAGLI_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.CALACATTA_VAGLI_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.CALACATTA_VAGLI_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> CALACATTA_VIOLA_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.CALACATTA_VIOLA_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.CALACATTA_VIOLA_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> CARRARA_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.CARRARA_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.CARRARA_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> CASA_MARMI_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.CASA_MARMI_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.CASA_MARMI_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> FRENCH_CHIFFON_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.FRENCH_CHIFFON_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.FRENCH_CHIFFON_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> GIALLO_ANTICO_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.GIALLO_ANTICO_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.GIALLO_ANTICO_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> GOLDEN_WAVE_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.GOLDEN_WAVE_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.GOLDEN_WAVE_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> IMPERIAL_RED_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.IMPERIAL_RED_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.IMPERIAL_RED_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> MALACHITE_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.MALACHITE_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.MALACHITE_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> MING_GREEN_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.MING_GREEN_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.MING_GREEN_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> PORPHYRY_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.PORPHYRY_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.PORPHYRY_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> RED_LAGOON_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.RED_LAGOON_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.RED_LAGOON_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> RED_VENETIAN_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.RED_VENETIAN_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.RED_VENETIAN_MARBLE_BLOCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> SILVER_CHIANTI_SPAWN = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.SILVER_CHIANTI_MARBLE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.SILVER_CHIANTI_MARBLE_BLOCK.get().defaultBlockState()));

        register(context, BLACK_CALACATTA_KEY, Feature.ORE, new OreConfiguration(BLACK_CALACATTA_SPAWN,64));
        register(context, BLACK_LABRADOR_KEY, Feature.ORE, new OreConfiguration(BLACK_LABRADOR_SPAWN,64));
        register(context, BLUE_BAY_KEY, Feature.ORE, new OreConfiguration(BLUE_BAY_SPAWN,64));
        register(context, BLUE_CALCITE_KEY, Feature.ORE, new OreConfiguration(BLUE_CALCITE_SPAWN,64));
        register(context, BLUE_SODALITE_KEY, Feature.ORE, new OreConfiguration(BLUE_SODALITE_SPAWN,64));
        register(context, CALACATTA_VAGLI_KEY, Feature.ORE, new OreConfiguration(CALACATTA_VAGLI_SPAWN,64));
        register(context, CALACATTA_VIOLA_KEY, Feature.ORE, new OreConfiguration(CALACATTA_VIOLA_SPAWN,64));
        register(context, CARRARA_KEY, Feature.ORE, new OreConfiguration(CARRARA_SPAWN,64));
        register(context, CASA_MARMI_KEY, Feature.ORE, new OreConfiguration(CASA_MARMI_SPAWN,64));
        register(context, FRENCH_CHIFFON_KEY, Feature.ORE, new OreConfiguration(FRENCH_CHIFFON_SPAWN,64));
        register(context, GIALLO_ANTICO_KEY, Feature.ORE, new OreConfiguration(GIALLO_ANTICO_SPAWN,64));
        register(context, GOLDEN_WAVE_KEY, Feature.ORE, new OreConfiguration(GOLDEN_WAVE_SPAWN,64));
        register(context, IMPERIAL_RED_KEY, Feature.ORE, new OreConfiguration(IMPERIAL_RED_SPAWN,64));
        register(context, MALACHITE_KEY, Feature.ORE, new OreConfiguration(MALACHITE_SPAWN,64));
        register(context, MING_GREEN_KEY, Feature.ORE, new OreConfiguration(MING_GREEN_SPAWN,64));
        register(context, PORPHYRY_KEY, Feature.ORE, new OreConfiguration(PORPHYRY_SPAWN,64));
        register(context, RED_LAGOON_KEY, Feature.ORE, new OreConfiguration(RED_LAGOON_SPAWN,64));
        register(context, RED_VENETIAN_KEY, Feature.ORE, new OreConfiguration(RED_VENETIAN_SPAWN,64));
        register(context, SILVER_CHIANTI_KEY, Feature.ORE, new OreConfiguration(SILVER_CHIANTI_SPAWN,64));
    }
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(PristineWorlds.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
