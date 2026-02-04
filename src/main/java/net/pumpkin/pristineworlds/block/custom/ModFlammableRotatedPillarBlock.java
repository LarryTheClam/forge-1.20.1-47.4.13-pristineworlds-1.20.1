package net.pumpkin.pristineworlds.block.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.pumpkin.pristineworlds.block.ModWoodBlocks;
import net.pumpkin.pristineworlds.item.ModItems;
import org.jetbrains.annotations.Nullable;


public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public ModFlammableRotatedPillarBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(state.is(ModWoodBlocks.CEDAR_LOG.get())) {
                return ModWoodBlocks.STRIPPED_CEDAR_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModWoodBlocks.CEDAR_WOOD.get())) {
                return ModWoodBlocks.STRIPPED_CEDAR_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModWoodBlocks.CINNAMON_LOG.get())) {
                return ModWoodBlocks.STRIPPED_CINNAMON_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModWoodBlocks.CINNAMON_WOOD.get())) {
                return ModWoodBlocks.STRIPPED_CINNAMON_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModWoodBlocks.CYPRESS_LOG.get())) {
                return ModWoodBlocks.STRIPPED_CYPRESS_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModWoodBlocks.CYPRESS_WOOD.get())) {
                return ModWoodBlocks.STRIPPED_CYPRESS_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModWoodBlocks.EBONY_LOG.get())) {
                return ModWoodBlocks.STRIPPED_EBONY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModWoodBlocks.EBONY_WOOD.get())) {
                return ModWoodBlocks.STRIPPED_EBONY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModWoodBlocks.HICKORY_LOG.get())) {
                return ModWoodBlocks.STRIPPED_HICKORY_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModWoodBlocks.HICKORY_WOOD.get())) {
                return ModWoodBlocks.STRIPPED_HICKORY_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModWoodBlocks.LARCH_LOG.get())) {
                return ModWoodBlocks.STRIPPED_LARCH_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModWoodBlocks.LARCH_WOOD.get())) {
                return ModWoodBlocks.STRIPPED_LARCH_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModWoodBlocks.LINDEN_LOG.get())) {
                return ModWoodBlocks.STRIPPED_LINDEN_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModWoodBlocks.LINDEN_WOOD.get())) {
                return ModWoodBlocks.STRIPPED_LINDEN_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModWoodBlocks.MAPLE_LOG.get())) {
                return ModWoodBlocks.STRIPPED_MAPLE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModWoodBlocks.MAPLE_WOOD.get())) {
                return ModWoodBlocks.STRIPPED_MAPLE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModWoodBlocks.OLIVE_LOG.get())) {
                return ModWoodBlocks.STRIPPED_OLIVE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModWoodBlocks.OLIVE_WOOD.get())) {
                return ModWoodBlocks.STRIPPED_OLIVE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if(state.is(ModWoodBlocks.PALM_LOG.get())) {
                return ModWoodBlocks.STRIPPED_PALM_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if(state.is(ModWoodBlocks.PALM_WOOD.get())) {
                return ModWoodBlocks.STRIPPED_PALM_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
