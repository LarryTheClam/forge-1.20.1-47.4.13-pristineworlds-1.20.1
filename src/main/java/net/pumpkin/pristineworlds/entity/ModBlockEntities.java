package net.pumpkin.pristineworlds.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pumpkin.pristineworlds.PristineWorlds;
import net.pumpkin.pristineworlds.block.ModBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PristineWorlds.MOD_ID);

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.CYPRESS_SIGN.get(),
                            ModBlocks.CYPRESS_WALL_SIGN.get(),
                            ModBlocks.HICKORY_SIGN.get(),
                            ModBlocks.HICKORY_WALL_SIGN.get(),
                            ModBlocks.LARCH_SIGN.get(),
                            ModBlocks.LARCH_WALL_SIGN.get(),
                            ModBlocks.LINDEN_SIGN.get(),
                            ModBlocks.LINDEN_WALL_SIGN.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
            BLOCK_ENTITIES.register("mod_hanging_sign", () ->
                    BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                            ModBlocks.CYPRESS_HANGING_SIGN.get(),
                            ModBlocks.CYPRESS_WALL_HANGING_SIGN.get(),
                            ModBlocks.HICKORY_HANGING_SIGN.get(),
                            ModBlocks.HICKORY_WALL_HANGING_SIGN.get(),
                            ModBlocks.LARCH_HANGING_SIGN.get(),
                            ModBlocks.LARCH_WALL_HANGING_SIGN.get(),
                            ModBlocks.LINDEN_HANGING_SIGN.get(),
                            ModBlocks.LINDEN_WALL_HANGING_SIGN.get()
                    ).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
