package net.pumpkin.pristineworlds.util;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.pumpkin.pristineworlds.PristineWorlds;

public class ModWoodTypes {
    public static final WoodType CYPRESS = WoodType.register(new WoodType(PristineWorlds.MOD_ID + ":cypress", BlockSetType.OAK));
    public static final WoodType HICKORY = WoodType.register(new WoodType(PristineWorlds.MOD_ID + ":hickory", BlockSetType.OAK));
    public static final WoodType LARCH = WoodType.register(new WoodType(PristineWorlds.MOD_ID + ":larch", BlockSetType.OAK));
    public static final WoodType LINDEN = WoodType.register(new WoodType(PristineWorlds.MOD_ID + ":linden", BlockSetType.OAK));
}
