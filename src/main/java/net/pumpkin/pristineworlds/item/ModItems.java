package net.pumpkin.pristineworlds.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pumpkin.pristineworlds.PristineWorlds;
import net.pumpkin.pristineworlds.block.ModBlocks;
import net.pumpkin.pristineworlds.entity.custom.ModBoatEntity;
import net.pumpkin.pristineworlds.item.custom.ModBoatItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PristineWorlds.MOD_ID);

//You got me bricked up
    public static final RegistryObject<Item> BLACK_BRICK = ITEMS.register("black_brick",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_BRICK = ITEMS.register("blue_brick",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> BROWN_BRICK = ITEMS.register("brown_brick",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> CYAN_BRICK = ITEMS.register("cyan_brick",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAY_BRICK = ITEMS.register("gray_brick",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_BRICK = ITEMS.register("green_brick",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_BRICK = ITEMS.register("light_blue_brick",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_BRICK = ITEMS.register("light_gray_brick",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIME_BRICK = ITEMS.register("lime_brick",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_BRICK = ITEMS.register("magenta_brick",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_BRICK = ITEMS.register("orange_brick",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINK_BRICK = ITEMS.register("pink_brick",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_BRICK = ITEMS.register("purple_brick",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_BRICK = ITEMS.register("red_brick",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_BRICK = ITEMS.register("white_brick",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_BRICK = ITEMS.register("yellow_brick",
            ()->new Item(new Item.Properties()));


//Suh-amdiches and Food
    public static final RegistryObject<Item> KELP_SANDWICH = ITEMS.register("kelp_sandwich",
            ()->new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(8).saturationMod(6f).build())));
    public static final RegistryObject<Item> KELP_AND_PORK_SANDWICH = ITEMS.register("kelp_and_pork_sandwich",
            ()->new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(14).saturationMod(12f).build())));


//Woodden Signs and boats
    public static final RegistryObject<Item> CYPRESS_SIGN = ITEMS.register("cypress_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CYPRESS_SIGN.get(), ModBlocks.CYPRESS_WALL_SIGN.get()));
    public static final RegistryObject<Item> CYPRESS_HANGING_SIGN = ITEMS.register("cypress_hanging_sign",
            () -> new HangingSignItem(ModBlocks.CYPRESS_HANGING_SIGN.get(), ModBlocks.CYPRESS_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> CYPRESS_BOAT = ITEMS.register("cypress_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.CYPRESS, new Item.Properties()));
    public static final RegistryObject<Item> CYPRESS_CHEST_BOAT = ITEMS.register("cypress_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.CYPRESS, new Item.Properties()));


    public static final RegistryObject<Item> HICKORY_SIGN = ITEMS.register("hickory_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.HICKORY_SIGN.get(), ModBlocks.HICKORY_WALL_SIGN.get()));
    public static final RegistryObject<Item> HICKORY_HANGING_SIGN = ITEMS.register("hickory_hanging_sign",
            () -> new HangingSignItem(ModBlocks.HICKORY_HANGING_SIGN.get(), ModBlocks.HICKORY_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> HICKORY_BOAT = ITEMS.register("hickory_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.HICKORY, new Item.Properties()));
    public static final RegistryObject<Item> HICKORY_CHEST_BOAT = ITEMS.register("hickory_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.HICKORY, new Item.Properties()));

    public static final RegistryObject<Item> LARCH_SIGN = ITEMS.register("larch_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.LARCH_SIGN.get(), ModBlocks.LARCH_WALL_SIGN.get()));
    public static final RegistryObject<Item> LARCH_HANGING_SIGN = ITEMS.register("larch_hanging_sign",
            () -> new HangingSignItem(ModBlocks.LARCH_HANGING_SIGN.get(), ModBlocks.LARCH_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> LARCH_BOAT = ITEMS.register("larch_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.LARCH, new Item.Properties()));
    public static final RegistryObject<Item> LARCH_CHEST_BOAT = ITEMS.register("larch_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.LARCH, new Item.Properties()));

    public static final RegistryObject<Item> LINDEN_SIGN = ITEMS.register("linden_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.LINDEN_SIGN.get(), ModBlocks.LINDEN_WALL_SIGN.get()));
    public static final RegistryObject<Item> LINDEN_HANGING_SIGN = ITEMS.register("linden_hanging_sign",
            () -> new HangingSignItem(ModBlocks.LINDEN_HANGING_SIGN.get(), ModBlocks.LINDEN_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> LINDEN_BOAT = ITEMS.register("linden_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.LINDEN, new Item.Properties()));
    public static final RegistryObject<Item> LINDEN_CHEST_BOAT = ITEMS.register("linden_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.LINDEN, new Item.Properties()));
    //I want to breed


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
