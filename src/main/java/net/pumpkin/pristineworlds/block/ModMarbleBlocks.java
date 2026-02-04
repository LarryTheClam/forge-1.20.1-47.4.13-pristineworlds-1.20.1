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
import net.pumpkin.pristineworlds.PristineWorlds;
import net.pumpkin.pristineworlds.item.ModItems;

import java.util.function.Supplier;


public class ModMarbleBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PristineWorlds.MOD_ID);


    public static final RegistryObject<Block> BLACK_CALACATTA_MARBLE_BLOCK = registerBlock("black_calacatta_marble_block",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_CALACATTA_MARBLE_SLAB = registerBlock("black_calacatta_marble_slab",
            ()->new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_CALACATTA_MARBLE_STAIRS = registerBlock("black_calacatta_marble_stairs",
            ()->new StairBlock(()-> ModMarbleBlocks.BLACK_CALACATTA_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.BLACK_LABRADOR_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.BLUE_BAY_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.BLUE_CALCITE_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.BLUE_SODALITE_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.CALACATTA_VAGLI_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.CALACATTA_VIOLA_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.CARRARA_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.CASA_MARMI_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.FRENCH_CHIFFON_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.GIALLO_ANTICO_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.GOLDEN_WAVE_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.IMPERIAL_RED_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.MALACHITE_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.MING_GREEN_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.PORPHYRY_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.RED_LAGOON_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.RED_VENETIAN_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.SILVER_CHIANTI_MARBLE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.BLACK_CALACATTA_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.BLACK_LABRADOR_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.BLUE_BAY_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.BLUE_CALCITE_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.BLUE_SODALITE_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.CALACATTA_VAGLI_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.CALACATTA_VIOLA_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.CARRARA_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.CASA_MARMI_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.FRENCH_CHIFFON_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.GIALLO_ANTICO_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.GOLDEN_WAVE_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.IMPERIAL_RED_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.MALACHITE_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.MING_GREEN_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.PORPHYRY_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.RED_LAGOON_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.RED_VENETIAN_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
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
            ()->new StairBlock(()-> ModMarbleBlocks.SILVER_CHIANTI_MARBLE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SILVER_CHIANTI_MARBLE_BRICK_WALL = registerBlock("silver_chianti_marble_brick_wall",
            ()->new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops()));


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
