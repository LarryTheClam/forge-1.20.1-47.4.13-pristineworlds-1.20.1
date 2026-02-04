package net.pumpkin.pristineworlds.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pumpkin.pristineworlds.PristineWorlds;
import net.pumpkin.pristineworlds.block.ModBlocks;
import net.pumpkin.pristineworlds.block.ModMarbleBlocks;
import net.pumpkin.pristineworlds.block.ModWoodBlocks;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PristineWorlds.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PRISTINEWORLDS_BRICKS = CREATIVE_MODE_TAB.register("pristineworlds_bricks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLACK_BRICK.get()))
                    .title(Component.translatable("creativetab.pristineworlds_bricks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BLACK_BRICK.get());
                        pOutput.accept(ModBlocks.BLACK_BRICKS.get());
                        pOutput.accept(ModBlocks.BLACK_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.BLACK_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.BLACK_BRICK_WALL.get());
                        pOutput.accept(ModItems.BLUE_BRICK.get());
                        pOutput.accept(ModBlocks.BLUE_BRICKS.get());
                        pOutput.accept(ModBlocks.BLUE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.BLUE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.BLUE_BRICK_WALL.get());
                        pOutput.accept(ModItems.BROWN_BRICK.get());
                        pOutput.accept(ModBlocks.BROWN_BRICKS.get());
                        pOutput.accept(ModBlocks.BROWN_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.BROWN_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.BROWN_BRICK_WALL.get());
                        pOutput.accept(ModItems.CYAN_BRICK.get());
                        pOutput.accept(ModBlocks.CYAN_BRICKS.get());
                        pOutput.accept(ModBlocks.CYAN_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CYAN_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CYAN_BRICK_WALL.get());
                        pOutput.accept(ModItems.GRAY_BRICK.get());
                        pOutput.accept(ModBlocks.GRAY_BRICKS.get());
                        pOutput.accept(ModBlocks.GRAY_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.GRAY_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.GRAY_BRICK_WALL.get());
                        pOutput.accept(ModItems.GREEN_BRICK.get());
                        pOutput.accept(ModBlocks.GREEN_BRICKS.get());
                        pOutput.accept(ModBlocks.GREEN_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.GREEN_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.GREEN_BRICK_WALL.get());
                        pOutput.accept(ModItems.LIGHT_BLUE_BRICK.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_BRICKS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_BRICK_WALL.get());
                        pOutput.accept(ModItems.LIGHT_GRAY_BRICK.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_BRICKS.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_BRICK_WALL.get());
                        pOutput.accept(ModItems.LIME_BRICK.get());
                        pOutput.accept(ModBlocks.LIME_BRICKS.get());
                        pOutput.accept(ModBlocks.LIME_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.LIME_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.LIME_BRICK_WALL.get());
                        pOutput.accept(ModItems.MAGENTA_BRICK.get());
                        pOutput.accept(ModBlocks.MAGENTA_BRICKS.get());
                        pOutput.accept(ModBlocks.MAGENTA_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.MAGENTA_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.MAGENTA_BRICK_WALL.get());
                        pOutput.accept(ModItems.ORANGE_BRICK.get());
                        pOutput.accept(ModBlocks.ORANGE_BRICKS.get());
                        pOutput.accept(ModBlocks.ORANGE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.ORANGE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.ORANGE_BRICK_WALL.get());
                        pOutput.accept(ModItems.PINK_BRICK.get());
                        pOutput.accept(ModBlocks.PINK_BRICKS.get());
                        pOutput.accept(ModBlocks.PINK_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.PINK_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.PINK_BRICK_WALL.get());
                        pOutput.accept(ModItems.PURPLE_BRICK.get());
                        pOutput.accept(ModBlocks.PURPLE_BRICKS.get());
                        pOutput.accept(ModBlocks.PURPLE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.PURPLE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.PURPLE_BRICK_WALL.get());
                        pOutput.accept(ModItems.RED_BRICK.get());
                        pOutput.accept(ModBlocks.RED_BRICKS.get());
                        pOutput.accept(ModBlocks.RED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.RED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.RED_BRICK_WALL.get());
                        pOutput.accept(ModItems.WHITE_BRICK.get());
                        pOutput.accept(ModBlocks.WHITE_BRICKS.get());
                        pOutput.accept(ModBlocks.WHITE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.WHITE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.WHITE_BRICK_WALL.get());
                        pOutput.accept(ModItems.YELLOW_BRICK.get());
                        pOutput.accept(ModBlocks.YELLOW_BRICKS.get());
                        pOutput.accept(ModBlocks.YELLOW_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.YELLOW_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.YELLOW_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.BLACK_TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.BLUE_TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.BROWN_TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.CYAN_TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.GRAY_TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.GREEN_TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.LIME_TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.MAGENTA_TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.ORANGE_TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.PINK_TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.PURPLE_TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.RED_TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.YELLOW_TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.WHITE_TERRACOTTA_BRICKS.get());
                        pOutput.accept(ModBlocks.BLUE_TERRACOTTA_BRICKS.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> PRISTINEWORLDS_MARBLES = CREATIVE_MODE_TAB.register("pristineworlds_marbles",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModMarbleBlocks.CARRARA_MARBLE_BLOCK.get()))
                    .title(Component.translatable("creativetab.pristineworlds_marble"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModMarbleBlocks.BLACK_CALACATTA_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.BLACK_CALACATTA_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.BLACK_CALACATTA_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.BLACK_CALACATTA_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.BLACK_CALACATTA_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.BLACK_CALACATTA_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.BLACK_CALACATTA_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.BLACK_CALACATTA_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.BLACK_CALACATTA_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.BLACK_LABRADOR_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.BLACK_LABRADOR_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.BLACK_LABRADOR_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.BLACK_LABRADOR_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.BLACK_LABRADOR_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.BLACK_LABRADOR_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.BLACK_LABRADOR_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.BLACK_LABRADOR_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.BLACK_LABRADOR_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.BLUE_BAY_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_BAY_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_BAY_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_BAY_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_BAY_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_BAY_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_BAY_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_BAY_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_BAY_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.BLUE_CALCITE_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_CALCITE_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_CALCITE_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_CALCITE_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_CALCITE_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_CALCITE_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_CALCITE_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_CALCITE_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_CALCITE_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.BLUE_SODALITE_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_SODALITE_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_SODALITE_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_SODALITE_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_SODALITE_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_SODALITE_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_SODALITE_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_SODALITE_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.BLUE_SODALITE_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.CALACATTA_VAGLI_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.CALACATTA_VAGLI_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.CALACATTA_VAGLI_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.CALACATTA_VAGLI_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.CALACATTA_VAGLI_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.CALACATTA_VAGLI_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.CALACATTA_VAGLI_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.CALACATTA_VAGLI_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.CALACATTA_VAGLI_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.CALACATTA_VIOLA_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.CALACATTA_VIOLA_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.CALACATTA_VIOLA_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.CALACATTA_VIOLA_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.CALACATTA_VIOLA_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.CALACATTA_VIOLA_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.CALACATTA_VIOLA_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.CALACATTA_VIOLA_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.CALACATTA_VIOLA_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.CARRARA_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.CARRARA_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.CARRARA_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.CARRARA_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.CARRARA_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.CARRARA_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.CARRARA_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.CARRARA_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.CARRARA_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.CASA_MARMI_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.CASA_MARMI_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.CASA_MARMI_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.CASA_MARMI_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.CASA_MARMI_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.CASA_MARMI_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.CASA_MARMI_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.CASA_MARMI_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.CASA_MARMI_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.FRENCH_CHIFFON_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.FRENCH_CHIFFON_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.FRENCH_CHIFFON_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.FRENCH_CHIFFON_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.FRENCH_CHIFFON_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.FRENCH_CHIFFON_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.FRENCH_CHIFFON_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.FRENCH_CHIFFON_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.FRENCH_CHIFFON_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.GIALLO_ANTICO_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.GIALLO_ANTICO_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.GIALLO_ANTICO_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.GIALLO_ANTICO_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.GIALLO_ANTICO_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.GIALLO_ANTICO_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.GIALLO_ANTICO_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.GIALLO_ANTICO_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.GIALLO_ANTICO_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.GOLDEN_WAVE_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.GOLDEN_WAVE_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.GOLDEN_WAVE_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.GOLDEN_WAVE_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.GOLDEN_WAVE_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.GOLDEN_WAVE_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.GOLDEN_WAVE_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.GOLDEN_WAVE_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.GOLDEN_WAVE_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.IMPERIAL_RED_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.IMPERIAL_RED_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.IMPERIAL_RED_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.IMPERIAL_RED_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.IMPERIAL_RED_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.IMPERIAL_RED_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.IMPERIAL_RED_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.IMPERIAL_RED_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.IMPERIAL_RED_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.MALACHITE_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.MALACHITE_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.MALACHITE_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.MALACHITE_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.MALACHITE_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.MALACHITE_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.MALACHITE_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.MALACHITE_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.MALACHITE_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.MING_GREEN_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.MING_GREEN_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.MING_GREEN_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.MING_GREEN_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.MING_GREEN_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.MING_GREEN_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.MING_GREEN_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.MING_GREEN_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.MING_GREEN_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.PORPHYRY_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.PORPHYRY_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.PORPHYRY_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.PORPHYRY_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.PORPHYRY_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.PORPHYRY_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.PORPHYRY_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.PORPHYRY_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.PORPHYRY_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.RED_LAGOON_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.RED_LAGOON_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.RED_LAGOON_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.RED_LAGOON_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.RED_LAGOON_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.RED_LAGOON_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.RED_LAGOON_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.RED_LAGOON_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.RED_LAGOON_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.RED_VENETIAN_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.RED_VENETIAN_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.RED_VENETIAN_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.RED_VENETIAN_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.RED_VENETIAN_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.RED_VENETIAN_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.RED_VENETIAN_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.RED_VENETIAN_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.RED_VENETIAN_MARBLE_WALL.get());

                        pOutput.accept(ModMarbleBlocks.SILVER_CHIANTI_MARBLE_BLOCK.get());
                        pOutput.accept(ModMarbleBlocks.SILVER_CHIANTI_MARBLE_PILLAR.get());
                        pOutput.accept(ModMarbleBlocks.SILVER_CHIANTI_MARBLE_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.SILVER_CHIANTI_MARBLE_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.SILVER_CHIANTI_MARBLE_WALL.get());
                        pOutput.accept(ModMarbleBlocks.SILVER_CHIANTI_MARBLE_BRICKS.get());
                        pOutput.accept(ModMarbleBlocks.SILVER_CHIANTI_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModMarbleBlocks.SILVER_CHIANTI_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModMarbleBlocks.SILVER_CHIANTI_MARBLE_WALL.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> PRISTINEWORLDS_STONE = CREATIVE_MODE_TAB.register("pristineworlds_stone",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CHISELED_GRANITE_BRICKS.get()))
                    .title(Component.translatable("creativetab.pristineworlds_stone"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.ANDESITE_BRICKS.get());
                        pOutput.accept(ModBlocks.CHISELED_ANDESITE_BRICKS.get());
                        pOutput.accept(ModBlocks.ANDESITE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.ANDESITE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.ANDESITE_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_ANDESITE_WALL.get());

                        pOutput.accept(ModBlocks.DIORITE_BRICKS.get());
                        pOutput.accept(ModBlocks.CHISELED_DIORITE_BRICKS.get());
                        pOutput.accept(ModBlocks.DIORITE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.DIORITE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.DIORITE_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_DIORITE_WALL.get());

                        pOutput.accept(ModBlocks.GRANITE_BRICKS.get());
                        pOutput.accept(ModBlocks.CHISELED_GRANITE_BRICKS.get());
                        pOutput.accept(ModBlocks.GRANITE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.GRANITE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.GRANITE_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_GRANITE_WALL.get());

                        pOutput.accept(ModBlocks.CHISELED_END_STONE_BRICKS.get());
                        pOutput.accept(ModBlocks.POLISHED_END_STONE.get());
                        pOutput.accept(ModBlocks.POLISHED_END_STONE_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_END_STONE_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_END_STONE_WALL.get());
                        pOutput.accept(ModBlocks.END_STONE_STAIRS.get());
                        pOutput.accept(ModBlocks.END_STONE_SLAB.get());
                        pOutput.accept(ModBlocks.END_STONE_WALL.get());

                        pOutput.accept(ModBlocks.POLISHED_CALCITE.get());
                        pOutput.accept(ModBlocks.POLISHED_CALCITE_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_CALCITE_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_CALCITE_WALL.get());
                        pOutput.accept(ModBlocks.CALCITE_STAIRS.get());
                        pOutput.accept(ModBlocks.CALCITE_SLAB.get());
                        pOutput.accept(ModBlocks.CALCITE_WALL.get());

                        pOutput.accept(ModBlocks.POLISHED_STONE.get());
                        pOutput.accept(ModBlocks.POLISHED_STONE_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_STONE_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_STONE_WALL.get());
                        pOutput.accept(ModBlocks.STONE_WALL.get());

                        pOutput.accept(ModBlocks.DEEPSLATE_STAIRS.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SLAB.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_WALL.get());

                        pOutput.accept(ModBlocks.PERIDOTITE.get());
                        pOutput.accept(ModBlocks.PERIDOTITE_STAIRS.get());
                        pOutput.accept(ModBlocks.PERIDOTITE_SLAB.get());
                        pOutput.accept(ModBlocks.PERIDOTITE_WALL.get());

                        pOutput.accept(ModBlocks.BRIMSTONE.get());
                        pOutput.accept(ModBlocks.BRIMSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.BRIMSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.BRIMSTONE_WALL.get());

                        pOutput.accept(ModBlocks.BLUESTONE.get());
                        pOutput.accept(ModBlocks.BLUESTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.BLUESTONE_SLAB.get());
                        pOutput.accept(ModBlocks.BLUESTONE_WALL.get());

                        pOutput.accept(ModBlocks.LIMESTONE.get());
                        pOutput.accept(ModBlocks.LIMESTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.LIMESTONE_SLAB.get());
                        pOutput.accept(ModBlocks.LIMESTONE_WALL.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> PRISTINEWORLDS_WOODS = CREATIVE_MODE_TAB.register("pristineworlds_woodss",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModWoodBlocks.CYPRESS_LOG.get()))
                    .title(Component.translatable("creativetab.pristineworlds_woods"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModWoodBlocks.CEDAR_LOG.get());
                        pOutput.accept(ModWoodBlocks.CEDAR_WOOD.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_CEDAR_LOG.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_CEDAR_WOOD.get());
                        pOutput.accept(ModWoodBlocks.CEDAR_PLANKS.get());
                        pOutput.accept(ModWoodBlocks.CEDAR_STAIRS.get());
                        pOutput.accept(ModWoodBlocks.CEDAR_SLAB.get());
                        pOutput.accept(ModWoodBlocks.CEDAR_FENCE.get());
                        pOutput.accept(ModWoodBlocks.CEDAR_FENCE_GATE.get());
                        pOutput.accept(ModWoodBlocks.CEDAR_BUTTON.get());
                        pOutput.accept(ModWoodBlocks.CEDAR_PRESSURE_PLATE.get());
                        pOutput.accept(ModWoodBlocks.CEDAR_DOOR.get());
                        pOutput.accept(ModWoodBlocks.CEDAR_TRAPDOOR.get());
                        pOutput.accept(ModItems.CEDAR_SIGN.get());
                        pOutput.accept(ModItems.CEDAR_HANGING_SIGN.get());
                        pOutput.accept(ModItems.CEDAR_BOAT.get());
                        pOutput.accept(ModItems.CEDAR_CHEST_BOAT.get());
                        pOutput.accept(ModWoodBlocks.CEDAR_LEAVES.get());
                        pOutput.accept(ModWoodBlocks.CEDAR_SAPLING.get());


                        pOutput.accept(ModWoodBlocks.CINNAMON_LOG.get());
                        pOutput.accept(ModWoodBlocks.CINNAMON_WOOD.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_CINNAMON_LOG.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_CINNAMON_WOOD.get());
                        pOutput.accept(ModWoodBlocks.CINNAMON_PLANKS.get());
                        pOutput.accept(ModWoodBlocks.CINNAMON_STAIRS.get());
                        pOutput.accept(ModWoodBlocks.CINNAMON_SLAB.get());
                        pOutput.accept(ModWoodBlocks.CINNAMON_FENCE.get());
                        pOutput.accept(ModWoodBlocks.CINNAMON_FENCE_GATE.get());
                        pOutput.accept(ModWoodBlocks.CINNAMON_BUTTON.get());
                        pOutput.accept(ModWoodBlocks.CINNAMON_PRESSURE_PLATE.get());
                        pOutput.accept(ModWoodBlocks.CINNAMON_DOOR.get());
                        pOutput.accept(ModWoodBlocks.CINNAMON_TRAPDOOR.get());
                        pOutput.accept(ModItems.CINNAMON_SIGN.get());
                        pOutput.accept(ModItems.CINNAMON_HANGING_SIGN.get());
                        pOutput.accept(ModItems.CINNAMON_BOAT.get());
                        pOutput.accept(ModItems.CINNAMON_CHEST_BOAT.get());
                        pOutput.accept(ModWoodBlocks.CINNAMON_LEAVES.get());
                        pOutput.accept(ModWoodBlocks.CINNAMON_SAPLING.get());


                        pOutput.accept(ModWoodBlocks.CYPRESS_LOG.get());
                        pOutput.accept(ModWoodBlocks.CYPRESS_WOOD.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_CYPRESS_LOG.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_CYPRESS_WOOD.get());
                        pOutput.accept(ModWoodBlocks.CYPRESS_PLANKS.get());
                        pOutput.accept(ModWoodBlocks.CYPRESS_STAIRS.get());
                        pOutput.accept(ModWoodBlocks.CYPRESS_SLAB.get());
                        pOutput.accept(ModWoodBlocks.CYPRESS_FENCE.get());
                        pOutput.accept(ModWoodBlocks.CYPRESS_FENCE_GATE.get());
                        pOutput.accept(ModWoodBlocks.CYPRESS_BUTTON.get());
                        pOutput.accept(ModWoodBlocks.CYPRESS_PRESSURE_PLATE.get());
                        pOutput.accept(ModWoodBlocks.CYPRESS_DOOR.get());
                        pOutput.accept(ModWoodBlocks.CYPRESS_TRAPDOOR.get());
                        pOutput.accept(ModItems.CYPRESS_SIGN.get());
                        pOutput.accept(ModItems.CYPRESS_HANGING_SIGN.get());
                        pOutput.accept(ModItems.CYPRESS_BOAT.get());
                        pOutput.accept(ModItems.CYPRESS_CHEST_BOAT.get());
                        pOutput.accept(ModWoodBlocks.CYPRESS_LEAVES.get());
                        pOutput.accept(ModWoodBlocks.CYPRESS_SAPLING.get());

                        pOutput.accept(ModWoodBlocks.EBONY_LOG.get());
                        pOutput.accept(ModWoodBlocks.EBONY_WOOD.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_EBONY_LOG.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_EBONY_WOOD.get());
                        pOutput.accept(ModWoodBlocks.EBONY_PLANKS.get());
                        pOutput.accept(ModWoodBlocks.EBONY_STAIRS.get());
                        pOutput.accept(ModWoodBlocks.EBONY_SLAB.get());
                        pOutput.accept(ModWoodBlocks.EBONY_FENCE.get());
                        pOutput.accept(ModWoodBlocks.EBONY_FENCE_GATE.get());
                        pOutput.accept(ModWoodBlocks.EBONY_BUTTON.get());
                        pOutput.accept(ModWoodBlocks.EBONY_PRESSURE_PLATE.get());
                        pOutput.accept(ModWoodBlocks.EBONY_DOOR.get());
                        pOutput.accept(ModWoodBlocks.EBONY_TRAPDOOR.get());
                        pOutput.accept(ModItems.EBONY_SIGN.get());
                        pOutput.accept(ModItems.EBONY_HANGING_SIGN.get());
                        pOutput.accept(ModItems.EBONY_BOAT.get());
                        pOutput.accept(ModItems.EBONY_CHEST_BOAT.get());
                        pOutput.accept(ModWoodBlocks.EBONY_LEAVES.get());
                        pOutput.accept(ModWoodBlocks.EBONY_SAPLING.get());


                        pOutput.accept(ModWoodBlocks.HICKORY_LOG.get());
                        pOutput.accept(ModWoodBlocks.HICKORY_WOOD.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_HICKORY_LOG.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_HICKORY_WOOD.get());
                        pOutput.accept(ModWoodBlocks.HICKORY_PLANKS.get());
                        pOutput.accept(ModWoodBlocks.HICKORY_STAIRS.get());
                        pOutput.accept(ModWoodBlocks.HICKORY_SLAB.get());
                        pOutput.accept(ModWoodBlocks.HICKORY_FENCE.get());
                        pOutput.accept(ModWoodBlocks.HICKORY_FENCE_GATE.get());
                        pOutput.accept(ModWoodBlocks.HICKORY_BUTTON.get());
                        pOutput.accept(ModWoodBlocks.HICKORY_PRESSURE_PLATE.get());
                        pOutput.accept(ModWoodBlocks.HICKORY_DOOR.get());
                        pOutput.accept(ModWoodBlocks.HICKORY_TRAPDOOR.get());
                        pOutput.accept(ModItems.HICKORY_SIGN.get());
                        pOutput.accept(ModItems.HICKORY_HANGING_SIGN.get());
                        pOutput.accept(ModItems.HICKORY_BOAT.get());
                        pOutput.accept(ModItems.HICKORY_CHEST_BOAT.get());
                        pOutput.accept(ModWoodBlocks.HICKORY_LEAVES.get());
                        pOutput.accept(ModWoodBlocks.HICKORY_SAPLING.get());

                        pOutput.accept(ModWoodBlocks.LARCH_LOG.get());
                        pOutput.accept(ModWoodBlocks.LARCH_WOOD.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_LARCH_LOG.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_LARCH_WOOD.get());
                        pOutput.accept(ModWoodBlocks.LARCH_PLANKS.get());
                        pOutput.accept(ModWoodBlocks.LARCH_STAIRS.get());
                        pOutput.accept(ModWoodBlocks.LARCH_SLAB.get());
                        pOutput.accept(ModWoodBlocks.LARCH_FENCE.get());
                        pOutput.accept(ModWoodBlocks.LARCH_FENCE_GATE.get());
                        pOutput.accept(ModWoodBlocks.LARCH_BUTTON.get());
                        pOutput.accept(ModWoodBlocks.LARCH_PRESSURE_PLATE.get());
                        pOutput.accept(ModWoodBlocks.LARCH_DOOR.get());
                        pOutput.accept(ModWoodBlocks.LARCH_TRAPDOOR.get());
                        pOutput.accept(ModItems.LARCH_SIGN.get());
                        pOutput.accept(ModItems.LARCH_HANGING_SIGN.get());
                        pOutput.accept(ModItems.LARCH_BOAT.get());
                        pOutput.accept(ModItems.LARCH_CHEST_BOAT.get());
                        pOutput.accept(ModWoodBlocks.LARCH_LEAVES.get());
                        pOutput.accept(ModWoodBlocks.LARCH_SAPLING.get());

                        pOutput.accept(ModWoodBlocks.LINDEN_LOG.get());
                        pOutput.accept(ModWoodBlocks.LINDEN_WOOD.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_LINDEN_LOG.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_LINDEN_WOOD.get());
                        pOutput.accept(ModWoodBlocks.LINDEN_PLANKS.get());
                        pOutput.accept(ModWoodBlocks.LINDEN_STAIRS.get());
                        pOutput.accept(ModWoodBlocks.LINDEN_SLAB.get());
                        pOutput.accept(ModWoodBlocks.LINDEN_FENCE.get());
                        pOutput.accept(ModWoodBlocks.LINDEN_FENCE_GATE.get());
                        pOutput.accept(ModWoodBlocks.LINDEN_BUTTON.get());
                        pOutput.accept(ModWoodBlocks.LINDEN_PRESSURE_PLATE.get());
                        pOutput.accept(ModWoodBlocks.LINDEN_DOOR.get());
                        pOutput.accept(ModWoodBlocks.LINDEN_TRAPDOOR.get());
                        pOutput.accept(ModItems.LINDEN_SIGN.get());
                        pOutput.accept(ModItems.LINDEN_HANGING_SIGN.get());
                        pOutput.accept(ModItems.LINDEN_BOAT.get());
                        pOutput.accept(ModItems.LINDEN_CHEST_BOAT.get());
                        pOutput.accept(ModWoodBlocks.LINDEN_LEAVES.get());
                        pOutput.accept(ModWoodBlocks.LINDEN_SAPLING.get());

                        pOutput.accept(ModWoodBlocks.MAPLE_LOG.get());
                        pOutput.accept(ModWoodBlocks.MAPLE_WOOD.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_MAPLE_LOG.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_MAPLE_WOOD.get());
                        pOutput.accept(ModWoodBlocks.MAPLE_PLANKS.get());
                        pOutput.accept(ModWoodBlocks.MAPLE_STAIRS.get());
                        pOutput.accept(ModWoodBlocks.MAPLE_SLAB.get());
                        pOutput.accept(ModWoodBlocks.MAPLE_FENCE.get());
                        pOutput.accept(ModWoodBlocks.MAPLE_FENCE_GATE.get());
                        pOutput.accept(ModWoodBlocks.MAPLE_BUTTON.get());
                        pOutput.accept(ModWoodBlocks.MAPLE_PRESSURE_PLATE.get());
                        pOutput.accept(ModWoodBlocks.MAPLE_DOOR.get());
                        pOutput.accept(ModWoodBlocks.MAPLE_TRAPDOOR.get());
                        pOutput.accept(ModItems.MAPLE_SIGN.get());
                        pOutput.accept(ModItems.MAPLE_HANGING_SIGN.get());
                        pOutput.accept(ModItems.MAPLE_BOAT.get());
                        pOutput.accept(ModItems.MAPLE_CHEST_BOAT.get());
                        pOutput.accept(ModWoodBlocks.MAPLE_LEAVES.get());
                        pOutput.accept(ModWoodBlocks.MAPLE_SAPLING.get());

                        pOutput.accept(ModWoodBlocks.OLIVE_LOG.get());
                        pOutput.accept(ModWoodBlocks.OLIVE_WOOD.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_OLIVE_LOG.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_OLIVE_WOOD.get());
                        pOutput.accept(ModWoodBlocks.OLIVE_PLANKS.get());
                        pOutput.accept(ModWoodBlocks.OLIVE_STAIRS.get());
                        pOutput.accept(ModWoodBlocks.OLIVE_SLAB.get());
                        pOutput.accept(ModWoodBlocks.OLIVE_FENCE.get());
                        pOutput.accept(ModWoodBlocks.OLIVE_FENCE_GATE.get());
                        pOutput.accept(ModWoodBlocks.OLIVE_BUTTON.get());
                        pOutput.accept(ModWoodBlocks.OLIVE_PRESSURE_PLATE.get());
                        pOutput.accept(ModWoodBlocks.OLIVE_DOOR.get());
                        pOutput.accept(ModWoodBlocks.OLIVE_TRAPDOOR.get());
                        pOutput.accept(ModItems.OLIVE_SIGN.get());
                        pOutput.accept(ModItems.OLIVE_HANGING_SIGN.get());
                        pOutput.accept(ModItems.OLIVE_BOAT.get());
                        pOutput.accept(ModItems.OLIVE_CHEST_BOAT.get());
                        pOutput.accept(ModWoodBlocks.OLIVE_LEAVES.get());
                        pOutput.accept(ModWoodBlocks.OLIVE_SAPLING.get());

                        pOutput.accept(ModWoodBlocks.PALM_LOG.get());
                        pOutput.accept(ModWoodBlocks.PALM_WOOD.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_PALM_LOG.get());
                        pOutput.accept(ModWoodBlocks.STRIPPED_PALM_WOOD.get());
                        pOutput.accept(ModWoodBlocks.PALM_PLANKS.get());
                        pOutput.accept(ModWoodBlocks.PALM_STAIRS.get());
                        pOutput.accept(ModWoodBlocks.PALM_SLAB.get());
                        pOutput.accept(ModWoodBlocks.PALM_FENCE.get());
                        pOutput.accept(ModWoodBlocks.PALM_FENCE_GATE.get());
                        pOutput.accept(ModWoodBlocks.PALM_BUTTON.get());
                        pOutput.accept(ModWoodBlocks.PALM_PRESSURE_PLATE.get());
                        pOutput.accept(ModWoodBlocks.PALM_DOOR.get());
                        pOutput.accept(ModWoodBlocks.PALM_TRAPDOOR.get());
                        pOutput.accept(ModItems.PALM_SIGN.get());
                        pOutput.accept(ModItems.PALM_HANGING_SIGN.get());
                        pOutput.accept(ModItems.PALM_BOAT.get());
                        pOutput.accept(ModItems.PALM_CHEST_BOAT.get());
                        pOutput.accept(ModWoodBlocks.PALM_LEAVES.get());
                        pOutput.accept(ModWoodBlocks.PALM_SAPLING.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> PRISTINEWORLDS_DIRTS = CREATIVE_MODE_TAB.register("pristineworlds_dirts",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.PACKED_MUD_STAIRS.get()))
                    .title(Component.translatable("creativetab.pristineworlds_dirts"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.PACKED_MUD_STAIRS.get());
                        pOutput.accept(ModBlocks.PACKED_MUD_SLAB.get());
                        pOutput.accept(ModBlocks.PACKED_MUD_WALL.get());
                        pOutput.accept(ModBlocks.SILT.get());
                    }).build());






            
            
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

