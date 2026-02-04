package net.pumpkin.pristineworlds.entity.custom;


import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.pumpkin.pristineworlds.entity.ModEntities;
import net.pumpkin.pristineworlds.item.ModItems;

public class ModChestBoatEntity extends ChestBoat {
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(Boat.class, EntityDataSerializers.INT);

    public ModChestBoatEntity(EntityType<? extends ChestBoat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public ModChestBoatEntity(Level pLevel, double pX, double pY, double pZ) {
        this(ModEntities.MOD_CHEST_BOAT.get(), pLevel);
        this.setPos(pX, pY, pZ);
        this.xo = pX;
        this.yo = pY;
        this.zo = pZ;
    }

    @Override
    public Item getDropItem() {
        switch (getModel()) {
            case CEDAR -> {
                return ModItems.CEDAR_CHEST_BOAT.get();
            }
            case CINNAMON -> {
                return ModItems.CINNAMON_CHEST_BOAT.get();
            }
            case CYPRESS -> {
                return ModItems.CYPRESS_CHEST_BOAT.get();
            }
            case EBONY -> {
                return ModItems.EBONY_CHEST_BOAT.get();
            }
            case HICKORY -> {
                return ModItems.HICKORY_CHEST_BOAT.get();
            }
            case LARCH -> {
                return ModItems.LARCH_CHEST_BOAT.get();
            }
            case LINDEN -> {
                return ModItems.LINDEN_CHEST_BOAT.get();
            }
            case MAPLE -> {
                return ModItems.MAPLE_CHEST_BOAT.get();
            }
            case OLIVE -> {
                return ModItems.OLIVE_CHEST_BOAT.get();
            }
            case PALM -> {
                return ModItems.PALM_CHEST_BOAT.get();
            }
        }
        return super.getDropItem();
    }

    public void setVariant(ModBoatEntity.Type pVariant) {
        this.entityData.set(DATA_ID_TYPE, pVariant.ordinal());
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE, ModBoatEntity.Type.CYPRESS.ordinal());
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
            this.entityData.set(DATA_ID_TYPE, ModBoatEntity.Type.byName(pCompound.getString("model")).ordinal());
        }
    }

    public void setModel(ModBoatEntity.Type type)
    {
        this.entityData.set(DATA_ID_TYPE, type.ordinal());
    }

    public ModBoatEntity.Type getModel()
    {
        return ModBoatEntity.Type.byId(this.entityData.get(DATA_ID_TYPE));
    }

}
