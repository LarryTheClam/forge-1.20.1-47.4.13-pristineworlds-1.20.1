package net.pumpkin.pristineworlds;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.pumpkin.pristineworlds.block.ModBlocks;
import net.pumpkin.pristineworlds.block.ModMarbleBlocks;
import net.pumpkin.pristineworlds.block.ModWoodBlocks;
import net.pumpkin.pristineworlds.entity.ModBlockEntities;
import net.pumpkin.pristineworlds.entity.ModEntities;
import net.pumpkin.pristineworlds.entity.client.ModBoatRenderer;
import net.pumpkin.pristineworlds.item.ModCreativeModeTab;
import net.pumpkin.pristineworlds.item.ModItems;
import net.pumpkin.pristineworlds.util.ModWoodTypes;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PristineWorlds.MOD_ID)
public class PristineWorlds
{
    public static final String MOD_ID = "pristineworlds";
    public static final Logger LOGGER = LogUtils.getLogger();


    public PristineWorlds(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        ModItems.register(modEventBus);
        ModCreativeModeTab.register(modEventBus);
        ModEntities.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        ModBlocks.register(modEventBus);
        ModMarbleBlocks.register(modEventBus);
        ModWoodBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {


    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(ModWoodTypes.CEDAR);
            Sheets.addWoodType(ModWoodTypes.CINNAMON);
            Sheets.addWoodType(ModWoodTypes.CYPRESS);
            Sheets.addWoodType(ModWoodTypes.EBONY);
            Sheets.addWoodType(ModWoodTypes.HICKORY);
            Sheets.addWoodType(ModWoodTypes.LARCH);
            Sheets.addWoodType(ModWoodTypes.LINDEN);
            Sheets.addWoodType(ModWoodTypes.MAPLE);
            Sheets.addWoodType(ModWoodTypes.OLIVE);
            Sheets.addWoodType(ModWoodTypes.PALM);

            EntityRenderers.register(ModEntities.MOD_BOAT.get(), pContext -> new ModBoatRenderer(pContext, false));
            EntityRenderers.register(ModEntities.MOD_CHEST_BOAT.get(), pContext -> new ModBoatRenderer(pContext, true));

        }
    }
}
