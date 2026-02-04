package net.pumpkin.pristineworlds.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pumpkin.pristineworlds.PristineWorlds;
import net.pumpkin.pristineworlds.block.ModWoodBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, PristineWorlds.MOD_ID);

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModWoodBlocks.CEDAR_SIGN.get(),
                            ModWoodBlocks.CEDAR_WALL_SIGN.get(),
                            ModWoodBlocks.CINNAMON_SIGN.get(),
                            ModWoodBlocks.CINNAMON_WALL_SIGN.get(),
                            ModWoodBlocks.CYPRESS_SIGN.get(),
                            ModWoodBlocks.CYPRESS_WALL_SIGN.get(),
                            ModWoodBlocks.EBONY_SIGN.get(),
                            ModWoodBlocks.EBONY_WALL_SIGN.get(),
                            ModWoodBlocks.HICKORY_SIGN.get(),
                            ModWoodBlocks.HICKORY_WALL_SIGN.get(),
                            ModWoodBlocks.LARCH_SIGN.get(),
                            ModWoodBlocks.LARCH_WALL_SIGN.get(),
                            ModWoodBlocks.LINDEN_SIGN.get(),
                            ModWoodBlocks.LINDEN_WALL_SIGN.get(),
                            ModWoodBlocks.MAPLE_SIGN.get(),
                            ModWoodBlocks.MAPLE_WALL_SIGN.get(),
                            ModWoodBlocks.OLIVE_SIGN.get(),
                            ModWoodBlocks.OLIVE_WALL_SIGN.get(),
                            ModWoodBlocks.PALM_SIGN.get(),
                            ModWoodBlocks.PALM_WALL_SIGN.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
            BLOCK_ENTITIES.register("mod_hanging_sign", () ->
                    BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                            ModWoodBlocks.CEDAR_HANGING_SIGN.get(),
                            ModWoodBlocks.CEDAR_WALL_HANGING_SIGN.get(),
                            ModWoodBlocks.CINNAMON_HANGING_SIGN.get(),
                            ModWoodBlocks.CINNAMON_WALL_HANGING_SIGN.get(),
                            ModWoodBlocks.CYPRESS_HANGING_SIGN.get(),
                            ModWoodBlocks.CYPRESS_WALL_HANGING_SIGN.get(),
                            ModWoodBlocks.EBONY_HANGING_SIGN.get(),
                            ModWoodBlocks.EBONY_WALL_HANGING_SIGN.get(),
                            ModWoodBlocks.HICKORY_HANGING_SIGN.get(),
                            ModWoodBlocks.HICKORY_WALL_HANGING_SIGN.get(),
                            ModWoodBlocks.LARCH_HANGING_SIGN.get(),
                            ModWoodBlocks.LARCH_WALL_HANGING_SIGN.get(),
                            ModWoodBlocks.LINDEN_HANGING_SIGN.get(),
                            ModWoodBlocks.LINDEN_WALL_HANGING_SIGN.get(),
                            ModWoodBlocks.MAPLE_HANGING_SIGN.get(),
                            ModWoodBlocks.MAPLE_WALL_HANGING_SIGN.get(),
                            ModWoodBlocks.OLIVE_HANGING_SIGN.get(),
                            ModWoodBlocks.OLIVE_WALL_HANGING_SIGN.get(),
                            ModWoodBlocks.PALM_HANGING_SIGN.get(),
                            ModWoodBlocks.PALM_WALL_HANGING_SIGN.get()
                    ).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
