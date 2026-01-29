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
import net.pumpkin.pristineworlds.block.ModBlocks;

@Mod.EventBusSubscriber(modid = PristineWorlds.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModFoliage {
    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        event.getItemColors().register((stack, tintIndex) -> {
                    BlockState state = ((BlockItem)stack.getItem()).getBlock().defaultBlockState();
                    return event.getBlockColors().getColor(state, null, null, tintIndex); },
                ModBlocks.CINNAMON_LEAVES.get(),
                ModBlocks.CYPRESS_LEAVES.get(),
                ModBlocks.EBONY_LEAVES.get(),
                ModBlocks.HICKORY_LEAVES.get(),
                ModBlocks.LARCH_LEAVES.get(),
                ModBlocks.LINDEN_LEAVES.get(),
                ModBlocks.MAPLE_LEAVES.get(),
                ModBlocks.OLIVE_LEAVES.get());
    }
    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        world != null && pos != null ? BiomeColors.getAverageFoliageColor(world, pos) : FoliageColor.getDefaultColor(),
                ModBlocks.CINNAMON_LEAVES.get(),
                ModBlocks.CYPRESS_LEAVES.get(),
                ModBlocks.EBONY_LEAVES.get(),
                ModBlocks.HICKORY_LEAVES.get(),
                ModBlocks.LARCH_LEAVES.get(),
                ModBlocks.LINDEN_LEAVES.get(),
                ModBlocks.MAPLE_LEAVES.get(),
                ModBlocks.OLIVE_LEAVES.get());
    }
}
