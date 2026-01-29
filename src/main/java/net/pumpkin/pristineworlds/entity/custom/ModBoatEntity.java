package net.pumpkin.pristineworlds.entity.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.ByIdMap;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.pumpkin.pristineworlds.block.ModBlocks;
import net.pumpkin.pristineworlds.entity.ModEntities;
import net.pumpkin.pristineworlds.item.ModItems;

import java.util.function.IntFunction;


public class ModBoatEntity extends Boat {
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(Boat.class, EntityDataSerializers.INT);

    public ModBoatEntity(EntityType<? extends Boat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public ModBoatEntity(Level level, double pX, double pY, double pZ) {
        this(ModEntities.MOD_BOAT.get(), level);
        this.setPos(pX, pY, pZ);
        this.xo = pX;
        this.yo = pY;
        this.zo = pZ;
    }

    @Override
    public Item getDropItem() {
        return switch (getModVariant()) {
            case CINNAMON -> ModItems.CINNAMON_BOAT.get();
            case CYPRESS -> ModItems.CYPRESS_BOAT.get();
            case EBONY -> ModItems.EBONY_BOAT.get();
            case HICKORY -> ModItems.HICKORY_BOAT.get();
            case LARCH -> ModItems.LARCH_BOAT.get();
            case LINDEN -> ModItems.LINDEN_BOAT.get();
            case MAPLE -> ModItems.MAPLE_BOAT.get();
            case OLIVE -> ModItems.OLIVE_BOAT.get();
        };
    }

    public void setVariant(Type pVariant) {
        this.entityData.set(DATA_ID_TYPE, pVariant.ordinal());
    }

    public Type getModVariant() {
        return Type.byId(this.entityData.get(DATA_ID_TYPE));
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE, Type.CYPRESS.ordinal());
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag pCompound)
    {
        pCompound.putString("model", getModel().getName());
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag pCompound)
    {
        if (pCompound.contains("model", Tag.TAG_STRING))
        {
            this.entityData.set(DATA_ID_TYPE, Type.byName(pCompound.getString("model")).ordinal());
        }
    }

    public void setModel(Type type)
    {
        this.entityData.set(DATA_ID_TYPE, type.ordinal());
    }

    public Type getModel()
    {
        return Type.byId(this.entityData.get(DATA_ID_TYPE));
    }

    public static enum Type implements StringRepresentable {
        CINNAMON(ModBlocks.CINNAMON_PLANKS.get(), "cinnamon"),
        CYPRESS(ModBlocks.CYPRESS_PLANKS.get(), "cypress"),
        EBONY(ModBlocks.EBONY_PLANKS.get(), "ebony"),
        HICKORY(ModBlocks.HICKORY_PLANKS.get(), "hickory"),
        LARCH(ModBlocks.LARCH_PLANKS.get(), "larch"),
        LINDEN(ModBlocks.LINDEN_PLANKS.get(), "linden"),
        MAPLE(ModBlocks.MAPLE_PLANKS.get(), "maple"),
        OLIVE(ModBlocks.OLIVE_PLANKS.get(), "olive");

        private final String name;
        private final Block planks;
        public static final StringRepresentable.EnumCodec<ModBoatEntity.Type> CODEC = StringRepresentable.fromEnum(ModBoatEntity.Type::values);
        private static final IntFunction<ModBoatEntity.Type> BY_ID = ByIdMap.continuous(Enum::ordinal, values(), ByIdMap.OutOfBoundsStrategy.ZERO);

        private Type(Block pPlanks, String pName) {
            this.name = pName;
            this.planks = pPlanks;
        }

        public String getSerializedName() {
            return this.name;
        }

        public String getName() {
            return this.name;
        }

        public Block getPlanks() {
            return this.planks;
        }

        public String toString() {
            return this.name;
        }

        /**
         * Get a boat type by its enum ordinal
         */
        public static ModBoatEntity.Type byId(int pId) {
            return BY_ID.apply(pId);
        }

        public static ModBoatEntity.Type byName(String pName) {
            return CODEC.byName(pName, CYPRESS);
        }
    }
}
