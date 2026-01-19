package net.pumpkin.pristineworlds.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import net.pumpkin.pristineworlds.PristineWorlds;
import net.pumpkin.pristineworlds.block.custom.*;
import net.pumpkin.pristineworlds.item.ModItems;
import net.pumpkin.pristineworlds.util.ModWoodTypes;
import net.pumpkin.pristineworlds.worldgen.tree.CypressTreeGrower;
import net.pumpkin.pristineworlds.worldgen.tree.HickoryTreeGrower;
import net.pumpkin.pristineworlds.worldgen.tree.LarchTreeGrower;
import net.pumpkin.pristineworlds.worldgen.tree.LindenTreeGrower;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PristineWorlds.MOD_ID);

    public static final RegistryObject<Block> BLACK_CALACATTA_MARBLE_BLOCK = registerBlock("black_calacatta_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_CALACATTA_MARBLE_SLAB = registerBlock("black_calacatta_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_CALACATTA_MARBLE_STAIRS = registerBlock("black_calacatta_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.BLACK_CALACATTA_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_CALACATTA_MARBLE_WALL = registerBlock("black_calacatta_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_CALACATTA_MARBLE_PILLAR = registerBlock("black_calacatta_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACK_LABRADOR_MARBLE_BLOCK = registerBlock("black_labrador_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_LABRADOR_MARBLE_SLAB = registerBlock("black_labrador_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_LABRADOR_MARBLE_STAIRS = registerBlock("black_labrador_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.BLACK_LABRADOR_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_LABRADOR_MARBLE_WALL = registerBlock("black_labrador_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_LABRADOR_MARBLE_PILLAR = registerBlock("black_labrador_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_BAY_MARBLE_BLOCK = registerBlock("blue_bay_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_BAY_MARBLE_SLAB = registerBlock("blue_bay_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_BAY_MARBLE_STAIRS = registerBlock("blue_bay_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.BLUE_BAY_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_BAY_MARBLE_WALL = registerBlock("blue_bay_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_BAY_MARBLE_PILLAR = registerBlock("blue_bay_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_CALCITE_MARBLE_BLOCK = registerBlock("blue_calcite_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CALCITE_MARBLE_SLAB = registerBlock("blue_calcite_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CALCITE_MARBLE_STAIRS = registerBlock("blue_calcite_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.BLUE_CALCITE_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CALCITE_MARBLE_WALL = registerBlock("blue_calcite_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CALCITE_MARBLE_PILLAR = registerBlock("blue_calcite_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_SODALITE_MARBLE_BLOCK = registerBlock("blue_sodalite_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_SODALITE_MARBLE_SLAB = registerBlock("blue_sodalite_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_SODALITE_MARBLE_STAIRS = registerBlock("blue_sodalite_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.BLUE_SODALITE_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_SODALITE_MARBLE_WALL = registerBlock("blue_sodalite_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_SODALITE_MARBLE_PILLAR = registerBlock("blue_sodalite_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CALACATTA_VAGLI_MARBLE_BLOCK = registerBlock("calacatta_vagli_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALACATTA_VAGLI_MARBLE_SLAB = registerBlock("calacatta_vagli_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALACATTA_VAGLI_MARBLE_STAIRS = registerBlock("calacatta_vagli_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.CALACATTA_VAGLI_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALACATTA_VAGLI_MARBLE_WALL = registerBlock("calacatta_vagli_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALACATTA_VAGLI_MARBLE_PILLAR = registerBlock("calacatta_vagli_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CALACATTA_VIOLA_MARBLE_BLOCK = registerBlock("calacatta_viola_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALACATTA_VIOLA_MARBLE_SLAB = registerBlock("calacatta_viola_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALACATTA_VIOLA_MARBLE_STAIRS = registerBlock("calacatta_viola_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.CALACATTA_VIOLA_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALACATTA_VIOLA_MARBLE_WALL = registerBlock("calacatta_viola_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALACATTA_VIOLA_MARBLE_PILLAR = registerBlock("calacatta_viola_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CARRARA_MARBLE_BLOCK = registerBlock("carrara_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CARRARA_MARBLE_SLAB = registerBlock("carrara_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CARRARA_MARBLE_STAIRS = registerBlock("carrara_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.CARRARA_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CARRARA_MARBLE_WALL = registerBlock("carrara_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CARRARA_MARBLE_PILLAR = registerBlock("carrara_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CASA_MARMI_MARBLE_BLOCK = registerBlock("casa_marmi_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CASA_MARMI_MARBLE_SLAB = registerBlock("casa_marmi_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CASA_MARMI_MARBLE_STAIRS = registerBlock("casa_marmi_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.CASA_MARMI_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CASA_MARMI_MARBLE_WALL = registerBlock("casa_marmi_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CASA_MARMI_MARBLE_PILLAR = registerBlock("casa_marmi_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> FRENCH_CHIFFON_MARBLE_BLOCK = registerBlock("french_chiffon_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FRENCH_CHIFFON_MARBLE_SLAB = registerBlock("french_chiffon_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FRENCH_CHIFFON_MARBLE_STAIRS = registerBlock("french_chiffon_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.FRENCH_CHIFFON_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FRENCH_CHIFFON_MARBLE_WALL = registerBlock("french_chiffon_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FRENCH_CHIFFON_MARBLE_PILLAR = registerBlock("french_chiffon_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GIALLO_ANTICO_MARBLE_BLOCK = registerBlock("giallo_antico_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GIALLO_ANTICO_MARBLE_SLAB = registerBlock( "giallo_antico_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GIALLO_ANTICO_MARBLE_STAIRS = registerBlock("giallo_antico_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.GIALLO_ANTICO_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GIALLO_ANTICO_MARBLE_WALL = registerBlock("giallo_antico_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GIALLO_ANTICO_MARBLE_PILLAR = registerBlock("giallo_antico_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GOLDEN_WAVE_MARBLE_BLOCK = registerBlock("golden_wave_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GOLDEN_WAVE_MARBLE_SLAB = registerBlock("golden_wave_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GOLDEN_WAVE_MARBLE_STAIRS = registerBlock("golden_wave_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.GOLDEN_WAVE_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GOLDEN_WAVE_MARBLE_WALL = registerBlock("golden_wave_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GOLDEN_WAVE_MARBLE_PILLAR = registerBlock("golden_wave_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> IMPERIAL_RED_MARBLE_BLOCK = registerBlock("imperial_red_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> IMPERIAL_RED_MARBLE_SLAB = registerBlock("imperial_red_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> IMPERIAL_RED_MARBLE_STAIRS = registerBlock("imperial_red_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.IMPERIAL_RED_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> IMPERIAL_RED_MARBLE_WALL = registerBlock("imperial_red_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> IMPERIAL_RED_MARBLE_PILLAR = registerBlock("imperial_red_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MALACHITE_MARBLE_BLOCK = registerBlock("malachite_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MALACHITE_MARBLE_SLAB = registerBlock("malachite_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MALACHITE_MARBLE_STAIRS = registerBlock("malachite_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.MALACHITE_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MALACHITE_MARBLE_WALL = registerBlock("malachite_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MALACHITE_MARBLE_PILLAR = registerBlock("malachite_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MING_GREEN_MARBLE_BLOCK = registerBlock("ming_green_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MING_GREEN_MARBLE_SLAB = registerBlock("ming_green_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MING_GREEN_MARBLE_STAIRS = registerBlock("ming_green_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.MING_GREEN_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MING_GREEN_MARBLE_WALL = registerBlock("ming_green_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MING_GREEN_MARBLE_PILLAR = registerBlock("ming_green_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PORPHYRY_MARBLE_BLOCK = registerBlock("porphyry_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PORPHYRY_MARBLE_SLAB = registerBlock("porphyry_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PORPHYRY_MARBLE_STAIRS = registerBlock("porphyry_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.PORPHYRY_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PORPHYRY_MARBLE_WALL = registerBlock("porphyry_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PORPHYRY_MARBLE_PILLAR = registerBlock("porphyry_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_LAGOON_MARBLE_BLOCK = registerBlock("red_lagoon_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_LAGOON_MARBLE_SLAB = registerBlock("red_lagoon_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_LAGOON_MARBLE_STAIRS = registerBlock("red_lagoon_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.RED_LAGOON_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_LAGOON_MARBLE_WALL = registerBlock("red_lagoon_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_LAGOON_MARBLE_PILLAR = registerBlock("red_lagoon_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_VENETIAN_MARBLE_BLOCK = registerBlock("red_venetian_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_VENETIAN_MARBLE_SLAB = registerBlock("red_venetian_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_VENETIAN_MARBLE_STAIRS = registerBlock("red_venetian_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.RED_VENETIAN_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_VENETIAN_MARBLE_WALL = registerBlock("red_venetian_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_VENETIAN_MARBLE_PILLAR = registerBlock("red_venetian_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SILVER_CHIANTI_MARBLE_BLOCK = registerBlock("silver_chianti_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SILVER_CHIANTI_MARBLE_SLAB = registerBlock("silver_chianti_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SILVER_CHIANTI_MARBLE_STAIRS = registerBlock("silver_chianti_marble_stairs",
            ()->new StairBlock(()-> ModBlocks.SILVER_CHIANTI_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SILVER_CHIANTI_MARBLE_WALL = registerBlock("silver_chianti_marble_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SILVER_CHIANTI_MARBLE_PILLAR = registerBlock("silver_chianti_marble_pillar",
            ()->new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACK_CALACATTA_MARBLE_BRICKS = registerBlock("black_calacatta_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_CALACATTA_MARBLE_BRICK_SLAB = registerBlock("black_calacatta_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_CALACATTA_MARBLE_BRICK_STAIRS = registerBlock("black_calacatta_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.BLACK_CALACATTA_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_CALACATTA_MARBLE_BRICK_WALL = registerBlock("black_calacatta_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACK_LABRADOR_MARBLE_BRICKS = registerBlock("black_labrador_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_LABRADOR_MARBLE_BRICK_SLAB = registerBlock("black_labrador_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_LABRADOR_MARBLE_BRICK_STAIRS = registerBlock("black_labrador_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.BLACK_LABRADOR_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_LABRADOR_MARBLE_BRICK_WALL = registerBlock("black_labrador_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_BAY_MARBLE_BRICKS = registerBlock("blue_bay_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_BAY_MARBLE_BRICK_SLAB = registerBlock("blue_bay_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_BAY_MARBLE_BRICK_STAIRS = registerBlock("blue_bay_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.BLUE_BAY_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_BAY_MARBLE_BRICK_WALL = registerBlock("blue_bay_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_CALCITE_MARBLE_BRICKS = registerBlock("blue_calcite_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CALCITE_MARBLE_BRICK_SLAB = registerBlock("blue_calcite_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CALCITE_MARBLE_BRICK_STAIRS = registerBlock("blue_calcite_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.BLUE_CALCITE_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CALCITE_MARBLE_BRICK_WALL = registerBlock("blue_calcite_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_SODALITE_MARBLE_BRICKS = registerBlock("blue_sodalite_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_SODALITE_MARBLE_BRICK_SLAB = registerBlock("blue_sodalite_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_SODALITE_MARBLE_BRICK_STAIRS = registerBlock("blue_sodalite_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.BLUE_SODALITE_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_SODALITE_MARBLE_BRICK_WALL = registerBlock("blue_sodalite_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CALACATTA_VAGLI_MARBLE_BRICKS = registerBlock("calacatta_vagli_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALACATTA_VAGLI_MARBLE_BRICK_SLAB = registerBlock("calacatta_vagli_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALACATTA_VAGLI_MARBLE_BRICK_STAIRS = registerBlock("calacatta_vagli_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.CALACATTA_VAGLI_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALACATTA_VAGLI_MARBLE_BRICK_WALL = registerBlock("calacatta_vagli_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CALACATTA_VIOLA_MARBLE_BRICKS = registerBlock("calacatta_viola_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALACATTA_VIOLA_MARBLE_BRICK_SLAB = registerBlock("calacatta_viola_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALACATTA_VIOLA_MARBLE_BRICK_STAIRS = registerBlock("calacatta_viola_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.CALACATTA_VIOLA_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALACATTA_VIOLA_MARBLE_BRICK_WALL = registerBlock("calacatta_viola_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CARRARA_MARBLE_BRICKS = registerBlock("carrara_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CARRARA_MARBLE_BRICK_SLAB = registerBlock("carrara_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CARRARA_MARBLE_BRICK_STAIRS = registerBlock("carrara_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.CARRARA_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CARRARA_MARBLE_BRICK_WALL = registerBlock("carrara_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CASA_MARMI_MARBLE_BRICKS = registerBlock("casa_marmi_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CASA_MARMI_MARBLE_BRICK_SLAB = registerBlock("casa_marmi_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CASA_MARMI_MARBLE_BRICK_STAIRS = registerBlock("casa_marmi_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.CASA_MARMI_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CASA_MARMI_MARBLE_BRICK_WALL = registerBlock("casa_marmi_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> FRENCH_CHIFFON_MARBLE_BRICKS = registerBlock("french_chiffon_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FRENCH_CHIFFON_MARBLE_BRICK_SLAB = registerBlock("french_chiffon_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FRENCH_CHIFFON_MARBLE_BRICK_STAIRS = registerBlock("french_chiffon_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.FRENCH_CHIFFON_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FRENCH_CHIFFON_MARBLE_BRICK_WALL = registerBlock("french_chiffon_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GIALLO_ANTICO_MARBLE_BRICKS = registerBlock("giallo_antico_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GIALLO_ANTICO_MARBLE_BRICK_SLAB = registerBlock("giallo_antico_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GIALLO_ANTICO_MARBLE_BRICK_STAIRS = registerBlock("giallo_antico_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.GIALLO_ANTICO_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GIALLO_ANTICO_MARBLE_BRICK_WALL = registerBlock("giallo_antico_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> GOLDEN_WAVE_MARBLE_BRICKS = registerBlock("golden_wave_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GOLDEN_WAVE_MARBLE_BRICK_SLAB = registerBlock("golden_wave_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GOLDEN_WAVE_MARBLE_BRICK_STAIRS = registerBlock("golden_wave_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.GOLDEN_WAVE_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GOLDEN_WAVE_MARBLE_BRICK_WALL = registerBlock("golden_wave_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> IMPERIAL_RED_MARBLE_BRICKS = registerBlock("imperial_red_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> IMPERIAL_RED_MARBLE_BRICK_SLAB = registerBlock("imperial_red_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> IMPERIAL_RED_MARBLE_BRICK_STAIRS = registerBlock("imperial_red_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.IMPERIAL_RED_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> IMPERIAL_RED_MARBLE_BRICK_WALL = registerBlock("imperial_red_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MALACHITE_MARBLE_BRICKS = registerBlock("malachite_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MALACHITE_MARBLE_BRICK_SLAB = registerBlock("malachite_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MALACHITE_MARBLE_BRICK_STAIRS = registerBlock("malachite_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.MALACHITE_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MALACHITE_MARBLE_BRICK_WALL = registerBlock("malachite_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> MING_GREEN_MARBLE_BRICKS = registerBlock("ming_green_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MING_GREEN_MARBLE_BRICK_SLAB = registerBlock("ming_green_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MING_GREEN_MARBLE_BRICK_STAIRS = registerBlock("ming_green_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.MING_GREEN_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MING_GREEN_MARBLE_BRICK_WALL = registerBlock("ming_green_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PORPHYRY_MARBLE_BRICKS = registerBlock("porphyry_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PORPHYRY_MARBLE_BRICK_SLAB = registerBlock("porphyry_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PORPHYRY_MARBLE_BRICK_STAIRS = registerBlock("porphyry_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.PORPHYRY_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PORPHYRY_MARBLE_BRICK_WALL = registerBlock("porphyry_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_LAGOON_MARBLE_BRICKS = registerBlock("red_lagoon_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_LAGOON_MARBLE_BRICK_SLAB = registerBlock("red_lagoon_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_LAGOON_MARBLE_BRICK_STAIRS = registerBlock("red_lagoon_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.RED_LAGOON_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_LAGOON_MARBLE_BRICK_WALL = registerBlock("red_lagoon_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RED_VENETIAN_MARBLE_BRICKS = registerBlock("red_venetian_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_VENETIAN_MARBLE_BRICK_SLAB = registerBlock("red_venetian_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_VENETIAN_MARBLE_BRICK_STAIRS = registerBlock("red_venetian_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.RED_VENETIAN_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_VENETIAN_MARBLE_BRICK_WALL = registerBlock("red_venetian_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SILVER_CHIANTI_MARBLE_BRICKS = registerBlock("silver_chianti_marble_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SILVER_CHIANTI_MARBLE_BRICK_SLAB = registerBlock("silver_chianti_marble_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SILVER_CHIANTI_MARBLE_BRICK_STAIRS = registerBlock("silver_chianti_marble_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.SILVER_CHIANTI_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SILVER_CHIANTI_MARBLE_BRICK_WALL = registerBlock("silver_chianti_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> BLACK_BRICKS = registerBlock("black_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_BRICKS = registerBlock("blue_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_BRICKS = registerBlock("brown_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_BRICKS = registerBlock("cyan_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_BRICKS = registerBlock("gray_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_BRICKS = registerBlock("green_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_BRICKS = registerBlock("light_blue_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_BRICKS = registerBlock("light_gray_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_BRICKS = registerBlock("lime_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_BRICKS = registerBlock("magenta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_BRICKS = registerBlock("orange_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_BRICKS = registerBlock("pink_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_BRICKS = registerBlock("purple_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_BRICKS = registerBlock("red_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_BRICKS = registerBlock("white_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_BRICKS = registerBlock("yellow_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACK_BRICK_SLAB = registerBlock("black_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_BRICK_SLAB = registerBlock("blue_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_BRICK_SLAB = registerBlock("brown_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_BRICK_SLAB = registerBlock("cyan_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_BRICK_SLAB = registerBlock("gray_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_BRICK_SLAB = registerBlock("green_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_SLAB = registerBlock("light_blue_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_SLAB = registerBlock("light_gray_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_BRICK_SLAB = registerBlock("lime_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_BRICK_SLAB = registerBlock("magenta_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_BRICK_SLAB = registerBlock("orange_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_BRICK_SLAB = registerBlock("pink_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_BRICK_SLAB = registerBlock("purple_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_BRICK_SLAB = registerBlock("red_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_BRICK_SLAB = registerBlock("white_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_BRICK_SLAB = registerBlock("yellow_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACK_BRICK_STAIRS = registerBlock("black_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.BLACK_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_BRICK_STAIRS = registerBlock("blue_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.BLUE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_BRICK_STAIRS = registerBlock("brown_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.BROWN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_BRICK_STAIRS = registerBlock("cyan_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.CYAN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_BRICK_STAIRS = registerBlock("gray_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.GRAY_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_BRICK_STAIRS = registerBlock("green_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.GREEN_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_STAIRS = registerBlock("light_blue_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.LIGHT_BLUE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_STAIRS = registerBlock("light_gray_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.LIGHT_GRAY_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_BRICK_STAIRS = registerBlock("lime_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.LIME_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_BRICK_STAIRS = registerBlock("magenta_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.MAGENTA_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_BRICK_STAIRS = registerBlock("orange_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.ORANGE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_BRICK_STAIRS = registerBlock("pink_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.PINK_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_BRICK_STAIRS = registerBlock("purple_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.PURPLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_BRICK_STAIRS = registerBlock("red_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.RED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_BRICK_STAIRS = registerBlock("white_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.WHITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_BRICK_STAIRS = registerBlock("yellow_brick_stairs",
            ()->new StairBlock(()-> ModBlocks.YELLOW_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> BLACK_BRICK_WALL = registerBlock("black_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_BRICK_WALL = registerBlock("blue_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_BRICK_WALL = registerBlock("brown_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_BRICK_WALL = registerBlock("cyan_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_BRICK_WALL = registerBlock("gray_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_BRICK_WALL = registerBlock("green_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_WALL = registerBlock("light_blue_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_WALL = registerBlock("light_gray_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_BRICK_WALL = registerBlock("lime_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_BRICK_WALL = registerBlock("magenta_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_BRICK_WALL = registerBlock("orange_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_BRICK_WALL = registerBlock("pink_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_BRICK_WALL = registerBlock("purple_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_BRICK_WALL = registerBlock("red_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_BRICK_WALL = registerBlock("white_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_BRICK_WALL = registerBlock("yellow_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));

    //The Apotheosis of Stone
    public static final RegistryObject<Block> STONE_WALL = registerBlock("stone_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_STONE = registerBlock("polished_stone",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            ()->new StairBlock(()-> Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_GRANITE_WALL = registerBlock("polished_granite_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_GRANITE_BRICKS = registerBlock("chiseled_granite_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRANITE_BRICKS = registerBlock("granite_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs",
            ()->new StairBlock(()-> Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRANITE_BRICK_WALL = registerBlock("granite_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_DIORITE_WALL = registerBlock("polished_diorite_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIORITE_BRICKS = registerBlock("diorite_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_DIORITE_BRICKS = registerBlock("chiseled_diorite_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            ()->new StairBlock(()-> Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = registerBlock("polished_andesite_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_ANDESITE_BRICKS = registerBlock("chiseled_andesite_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ANDESITE_BRICKS = registerBlock("andesite_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            ()->new StairBlock(()-> Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PERIDOTITE = registerBlock("peridotite",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PERIDOTITE_STAIRS = registerBlock("peridotite_stairs",
            ()->new StairBlock(()-> Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PERIDOTITE_SLAB = registerBlock("peridotite_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PERIDOTITE_WALL = registerBlock("peridotite_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> BRIMSTONE = registerBlock("brimstone",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BRIMSTONE_STAIRS = registerBlock("brimstone_stairs",
            ()->new StairBlock(()-> Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BRIMSTONE_SLAB = registerBlock("brimstone_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BRIMSTONE_WALL = registerBlock("brimstone_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    
    
    public static final RegistryObject<Block> BLUESTONE = registerBlock("bluestone",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUESTONE_STAIRS = registerBlock("bluestone_stairs",
            ()->new StairBlock(()-> Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUESTONE_SLAB = registerBlock("bluestone_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUESTONE_WALL = registerBlock("bluestone_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    
    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            ()->new StairBlock(()-> Blocks.STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIMESTONE_SLAB = registerBlock("limestone_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIMESTONE_WALL = registerBlock("limestone_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CALCITE_STAIRS = registerBlock("calcite_stairs",
            ()->new StairBlock(()-> Blocks.CALCITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALCITE_SLAB = registerBlock("calcite_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALCITE_WALL = registerBlock("calcite_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_CALCITE = registerBlock("polished_calcite",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs",
            ()->new StairBlock(()-> Blocks.CALCITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            ()->new StairBlock(()-> Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_WALL = registerBlock("deepslate_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> END_STONE_STAIRS = registerBlock("end_stone_stairs",
            ()->new StairBlock(()-> Blocks.END_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_SLAB = registerBlock("end_stone_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_WALL = registerBlock("end_stone_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> POLISHED_END_STONE = registerBlock("polished_end_stone",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_END_STONE_STAIRS = registerBlock("polished_end_stone_stairs",
            ()->new StairBlock(()-> Blocks.END_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_END_STONE_SLAB = registerBlock("polished_end_stone_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_END_STONE_WALL = registerBlock("polished_end_stone_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_END_STONE_BRICKS = registerBlock("chiseled_end_stone_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(6f).requiresCorrectToolForDrops()));


    //dird

    public static final RegistryObject<Block> SILT = registerBlock("silt",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)
                    .strength(2f)));
    public static final RegistryObject<Block> PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            ()->new StairBlock(()-> Blocks.PACKED_MUD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DIRT)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIRT)
                    .strength(2f).requiresCorrectToolForDrops()));


/*
Trees I want to add
    Cypress - Added
    Hickory - Added
    Larch - Added
    Linden - Added

    Pine
    Cedar
    Maple
    Redwood

    also the woods are down here

And also more stones, and to fix the current stones added in the game by filling in the holes left behind by their in game counterparts

Bober Kurwa
 */


    public static final RegistryObject<Block> CYPRESS_LOG = registerBlock("cypress_log",
            ()->new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_CYPRESS_LOG = registerBlock("stripped_cypress_log",
            ()->new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> CYPRESS_WOOD = registerBlock("cypress_wood",
            ()->new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_CYPRESS_WOOD = registerBlock("stripped_cypress_wood",
            ()->new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> CYPRESS_SAPLING = registerBlock("cypress_sapling",
            ()->new SaplingBlock(new CypressTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> CYPRESS_LEAVES = registerBlock("cypress_leaves",
            ()->new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            });

    public static final RegistryObject<Block> CYPRESS_PLANKS = registerBlock("cypress_planks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });

    public static final RegistryObject<Block> CYPRESS_STAIRS = registerBlock("cypress_stairs",
            ()->new StairBlock(()-> Blocks.OAK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> CYPRESS_SLAB = registerBlock("cypress_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> CYPRESS_FENCE = registerBlock("cypress_fence",
            ()->new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> CYPRESS_FENCE_GATE = registerBlock("cypress_fence_gate",
            ()->new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.CYPRESS_PLANKS.get())
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> CYPRESS_BUTTON = registerBlock("cypress_button",
            ()->new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.CYPRESS_PLANKS.get()).sound(SoundType.WOOD).noCollission().strength(0.5F)
                    .sound(SoundType.WOOD), BlockSetType.OAK, 30, true) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> CYPRESS_PRESSURE_PLATE = registerBlock("cypress_pressure_plate",
            ()->new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(ModBlocks.CYPRESS_PLANKS.get()).sound(SoundType.WOOD).noCollission(),
                    BlockSetType.OAK) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> CYPRESS_SIGN = BLOCKS.register("cypress_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.CYPRESS));
    public static final RegistryObject<Block> CYPRESS_WALL_SIGN = BLOCKS.register("cypress_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.CYPRESS));

    public static final RegistryObject<Block> CYPRESS_HANGING_SIGN = BLOCKS.register("cypress_hanging_sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.CYPRESS));
    public static final RegistryObject<Block> CYPRESS_WALL_HANGING_SIGN = BLOCKS.register("cypress_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.CYPRESS));

    public static final RegistryObject<Block> CYPRESS_DOOR = registerBlock("cypress_door",
            ()-> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).noOcclusion(),
            BlockSetType.OAK));
    public static final RegistryObject<Block> CYPRESS_TRAPDOOR = registerBlock("cypress_trapdoor",
            ()-> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).noOcclusion(),
                    BlockSetType.OAK));


    public static final RegistryObject<Block> HICKORY_LOG = registerBlock("hickory_log",
            ()->new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_HICKORY_LOG = registerBlock("stripped_hickory_log",
            ()->new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> HICKORY_WOOD = registerBlock("hickory_wood",
            ()->new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_HICKORY_WOOD = registerBlock("stripped_hickory_wood",
            ()->new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> HICKORY_SAPLING = registerBlock("hickory_sapling",
            ()->new SaplingBlock(new HickoryTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> HICKORY_LEAVES = registerBlock("hickory_leaves",
            ()->new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            });

    public static final RegistryObject<Block> HICKORY_PLANKS = registerBlock("hickory_planks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> HICKORY_STAIRS = registerBlock("hickory_stairs",
            ()->new StairBlock(()-> Blocks.OAK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> HICKORY_SLAB = registerBlock("hickory_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> HICKORY_FENCE = registerBlock("hickory_fence",
            ()->new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> HICKORY_FENCE_GATE = registerBlock("hickory_fence_gate",
            ()->new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.HICKORY_PLANKS.get())
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> HICKORY_BUTTON = registerBlock("hickory_button",
            ()->new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.HICKORY_PLANKS.get()).sound(SoundType.WOOD).noCollission().strength(0.5F)
                    .sound(SoundType.WOOD), BlockSetType.OAK, 30, true) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> HICKORY_PRESSURE_PLATE = registerBlock("hickory_pressure_plate",
            ()->new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(ModBlocks.HICKORY_PLANKS.get()).sound(SoundType.WOOD).noCollission(),
                    BlockSetType.OAK) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> HICKORY_SIGN = BLOCKS.register("hickory_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.HICKORY));
    public static final RegistryObject<Block> HICKORY_WALL_SIGN = BLOCKS.register("hickory_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.HICKORY));

    public static final RegistryObject<Block> HICKORY_HANGING_SIGN = BLOCKS.register("hickory_hanging_sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.HICKORY));
    public static final RegistryObject<Block> HICKORY_WALL_HANGING_SIGN = BLOCKS.register("hickory_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.HICKORY));

    public static final RegistryObject<Block> HICKORY_DOOR = registerBlock("hickory_door",
            ()-> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).noOcclusion(),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> HICKORY_TRAPDOOR = registerBlock("hickory_trapdoor",
            ()-> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).noOcclusion(),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> LARCH_LOG = registerBlock("larch_log",
            ()->new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_LARCH_LOG = registerBlock("stripped_larch_log",
            ()->new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> LARCH_WOOD = registerBlock("larch_wood",
            ()->new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_LARCH_WOOD = registerBlock("stripped_larch_wood",
            ()->new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> LARCH_SAPLING = registerBlock("larch_sapling",
            ()->new SaplingBlock(new LarchTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> LARCH_LEAVES = registerBlock("larch_leaves",
            ()->new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            });

    public static final RegistryObject<Block> LARCH_PLANKS = registerBlock("larch_planks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> LARCH_STAIRS = registerBlock("larch_stairs",
            ()->new StairBlock(()-> Blocks.OAK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> LARCH_SLAB = registerBlock("larch_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> LARCH_FENCE = registerBlock("larch_fence",
            ()->new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> LARCH_FENCE_GATE = registerBlock("larch_fence_gate",
            ()->new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.LARCH_PLANKS.get())
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> LARCH_BUTTON = registerBlock("larch_button",
            ()->new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.LARCH_PLANKS.get()).sound(SoundType.WOOD).noCollission().strength(0.5F)
                    .sound(SoundType.WOOD), BlockSetType.OAK, 30, true) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> LARCH_PRESSURE_PLATE = registerBlock("larch_pressure_plate",
            ()->new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(ModBlocks.LARCH_PLANKS.get()).sound(SoundType.WOOD).noCollission(),
                    BlockSetType.OAK) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> LARCH_SIGN = BLOCKS.register("larch_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.LARCH));
    public static final RegistryObject<Block> LARCH_WALL_SIGN = BLOCKS.register("larch_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.LARCH));

    public static final RegistryObject<Block> LARCH_HANGING_SIGN = BLOCKS.register("larch_hanging_sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.LARCH));
    public static final RegistryObject<Block> LARCH_WALL_HANGING_SIGN = BLOCKS.register("larch_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.LARCH));

    public static final RegistryObject<Block> LARCH_DOOR = registerBlock("larch_door",
            ()-> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).noOcclusion(),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> LARCH_TRAPDOOR = registerBlock("larch_trapdoor",
            ()-> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).noOcclusion(),
                    BlockSetType.OAK));


    public static final RegistryObject<Block> LINDEN_LOG = registerBlock("linden_log",
            ()->new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_LINDEN_LOG = registerBlock("stripped_linden_log",
            ()->new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> LINDEN_WOOD = registerBlock("linden_wood",
            ()->new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_LINDEN_WOOD = registerBlock("stripped_linden_wood",
            ()->new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> LINDEN_SAPLING = registerBlock("linden_sapling",
            ()->new SaplingBlock(new LindenTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> LINDEN_LEAVES = registerBlock("linden_leaves",
            ()->new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            });

    public static final RegistryObject<Block> LINDEN_PLANKS = registerBlock("linden_planks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> LINDEN_STAIRS = registerBlock("linden_stairs",
            ()->new StairBlock(()-> Blocks.OAK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> LINDEN_SLAB = registerBlock("linden_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> LINDEN_FENCE = registerBlock("linden_fence",
            ()->new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> LINDEN_FENCE_GATE = registerBlock("linden_fence_gate",
            ()->new FenceGateBlock(BlockBehaviour.Properties.copy(ModBlocks.LINDEN_PLANKS.get())
                    .strength(2.0F, 3.0F).sound(SoundType.WOOD),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> LINDEN_BUTTON = registerBlock("linden_button",
            ()->new ButtonBlock(BlockBehaviour.Properties.copy(ModBlocks.LINDEN_PLANKS.get()).sound(SoundType.WOOD).noCollission().strength(0.5F)
                    .sound(SoundType.WOOD), BlockSetType.OAK, 30, true) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> LINDEN_PRESSURE_PLATE = registerBlock("linden_pressure_plate",
            ()->new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(ModBlocks.HICKORY_PLANKS.get()).sound(SoundType.WOOD).noCollission(),
                    BlockSetType.OAK) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> LINDEN_SIGN = BLOCKS.register("linden_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.LINDEN));
    public static final RegistryObject<Block> LINDEN_WALL_SIGN = BLOCKS.register("linden_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.LINDEN));

    public static final RegistryObject<Block> LINDEN_HANGING_SIGN = BLOCKS.register("linden_hanging_sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.LINDEN));
    public static final RegistryObject<Block> LINDEN_WALL_HANGING_SIGN = BLOCKS.register("linden_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.LINDEN));

    public static final RegistryObject<Block> LINDEN_DOOR = registerBlock("linden_door",
            ()-> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).noOcclusion(),
                    BlockSetType.OAK));
    public static final RegistryObject<Block> LINDEN_TRAPDOOR = registerBlock("linden_trapdoor",
            ()-> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).noOcclusion(),
                    BlockSetType.OAK));

    public static final RegistryObject<Block> BANANA_BLOCK = registerBlock("banana_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.MELON)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
