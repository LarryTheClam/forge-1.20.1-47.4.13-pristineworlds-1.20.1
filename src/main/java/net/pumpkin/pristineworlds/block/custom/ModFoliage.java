package net.pumpkin.pristineworlds.block.custom;

import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.pumpkin.pristineworlds.PristineWorlds;
import net.pumpkin.pristineworlds.block.ModWoodBlocks;

@Mod.EventBusSubscriber(modid = PristineWorlds.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModFoliage {
    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        event.getItemColors().register((stack, tintIndex) -> {
                    BlockState state = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
                    return event.getBlockColors().getColor(state, null, null, tintIndex); },
                ModWoodBlocks.CEDAR_LEAVES.get(),
                ModWoodBlocks.CINNAMON_LEAVES.get(),
                ModWoodBlocks.CYPRESS_LEAVES.get(),
                ModWoodBlocks.EBONY_LEAVES.get(),
                ModWoodBlocks.HICKORY_LEAVES.get(),
                ModWoodBlocks.LARCH_LEAVES.get(),
                ModWoodBlocks.LINDEN_LEAVES.get(),
                ModWoodBlocks.MAPLE_LEAVES.get(),
                ModWoodBlocks.OLIVE_LEAVES.get(),
                ModWoodBlocks.PALM_LEAVES.get());
    }
    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(),
                ModWoodBlocks.CEDAR_LEAVES.get(),
                ModWoodBlocks.CINNAMON_LEAVES.get(),
                ModWoodBlocks.CYPRESS_LEAVES.get(),
                ModWoodBlocks.EBONY_LEAVES.get(),
                ModWoodBlocks.HICKORY_LEAVES.get(),
                ModWoodBlocks.LARCH_LEAVES.get(),
                ModWoodBlocks.LINDEN_LEAVES.get(),
                ModWoodBlocks.MAPLE_LEAVES.get(),
                ModWoodBlocks.OLIVE_LEAVES.get(),
                ModWoodBlocks.PALM_LEAVES.get());
    }
}
