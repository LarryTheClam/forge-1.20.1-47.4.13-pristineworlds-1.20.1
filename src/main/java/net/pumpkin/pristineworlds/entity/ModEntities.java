package net.pumpkin.pristineworlds.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pumpkin.pristineworlds.PristineWorlds;
import net.pumpkin.pristineworlds.entity.custom.EeperEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PristineWorlds.MOD_ID);

    public static final RegistryObject<EntityType<EeperEntity>> EEPER =
            ENTITY_TYPES.register("eeper", ()-> EntityType.Builder.of(EeperEntity::new, MobCategory.MONSTER)
                    .sized(0.5f, 0.5f).build("eeper"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
