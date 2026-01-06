package net.pumpkin.pristineworlds.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.pumpkin.pristineworlds.PristineWorlds;
import net.pumpkin.pristineworlds.entity.ModEntities;
import net.pumpkin.pristineworlds.entity.custom.EeperEntity;

@Mod.EventBusSubscriber(modid = PristineWorlds.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.EEPER.get(), EeperEntity.createAttributes().build());
    }
}
