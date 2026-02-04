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
import net.pumpkin.pristineworlds.worldgen.tree.*;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PristineWorlds.MOD_ID);

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

    public static final RegistryObject<Block> TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_BRICKS = registerBlock("black_terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_BRICKS = registerBlock("blue_terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_BRICKS = registerBlock("brown_terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_BRICKS = registerBlock("cyan_terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_TERRACOTTA_BRICKS = registerBlock("gray_terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_TERRACOTTA_BRICKS = registerBlock("green_terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlock("light_blue_terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlock("light_gray_terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_TERRACOTTA_BRICKS = registerBlock("lime_terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_BRICKS = registerBlock("magenta_terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_BRICKS = registerBlock("orange_terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_TERRACOTTA_BRICKS = registerBlock("pink_terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_BRICKS = registerBlock("purple_terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_TERRACOTTA_BRICKS = registerBlock("red_terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_BRICKS = registerBlock("white_terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_BRICKS = registerBlock("yellow_terracotta_bricks",
            ()->new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)
                    .strength(1.5f).requiresCorrectToolForDrops()));

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
