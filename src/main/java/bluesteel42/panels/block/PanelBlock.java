package bluesteel42.panels.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;
import org.jetbrains.annotations.Nullable;

public class PanelBlock extends Block implements Waterloggable {
    public static final MapCodec<PanelBlock> CODEC = createCodec(PanelBlock::new);
    public static final EnumProperty<PanelType> TYPE = ModProperties.PANEL_TYPE;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    private static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);
    private static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);
    private static final VoxelShape EAST_SHAPE = Block.createCuboidShape(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    private static final VoxelShape WEST_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);

    @Override
    public MapCodec<? extends PanelBlock> getCodec() {
        return CODEC;
    }

    public PanelBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(TYPE, PanelType.SINGLE_NORTH).with(WATERLOGGED, false));
    }

    @Override
    protected boolean hasSidedTransparency(BlockState state) {
        return (state.get(TYPE) != PanelType.DOUBLE_X) && (state.get(TYPE) != PanelType.DOUBLE_Z);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch ((PanelType)state.get(TYPE)) {
            case SINGLE_NORTH  -> NORTH_SHAPE;
            case SINGLE_SOUTH -> SOUTH_SHAPE;
            case SINGLE_EAST -> EAST_SHAPE;
            case SINGLE_WEST -> WEST_SHAPE;
            case DOUBLE_X, DOUBLE_Z -> VoxelShapes.fullCube();
        };
    }

    private boolean isDouble(BlockState state) {
        return (state.get(TYPE) == PanelType.DOUBLE_X) || (state.get(TYPE) == PanelType.DOUBLE_Z);
    }

    private BlockState getDoubledBlockState(BlockState state) {
        if (state.get(TYPE).equals(PanelType.SINGLE_EAST) || state.get(TYPE).equals(PanelType.SINGLE_WEST)) {
            return state.with(TYPE, PanelType.DOUBLE_X).with(WATERLOGGED, false);
        } else {
            return state.with(TYPE, PanelType.DOUBLE_Z).with(WATERLOGGED, false);
        }
    }

    private PanelType getPanelTypeFromHorizontalDirection(Direction direction) {
        if (direction.equals(Direction.SOUTH)) {
            return PanelType.SINGLE_SOUTH;
        } else if (direction.equals(Direction.EAST)) {
            return PanelType.SINGLE_EAST;
        } else if (direction.equals(Direction.WEST)) {
            return PanelType.SINGLE_WEST;
        } else {
            return PanelType.SINGLE_NORTH;
        }
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        BlockState blockState = ctx.getWorld().getBlockState(blockPos);
        if (blockState.isOf(this) && !isDouble(blockState)) {
            return getDoubledBlockState(blockState);
        } else {
            FluidState fluidState = ctx.getWorld().getFluidState(blockPos);
            BlockState blockState2 = this.getDefaultState().with(TYPE, PanelType.SINGLE_NORTH).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
            Direction hitDirection = ctx.getSide();
            Direction.Axis playerAxis = ctx.getHorizontalPlayerFacing().getAxis();

//            if (hitDirection.getAxis().isHorizontal()) {
//                return blockState2.with(TYPE, getPanelTypeFromHorizontalDirection(hitDirection.getOpposite()));
//            } else {
            if (playerAxis == Direction.Axis.X) {
                if (ctx.getHitPos().x - blockPos.getX() > 0.5) {
                    return blockState2.with(TYPE, PanelType.SINGLE_EAST);
                } else {
                    return blockState2.with(TYPE, PanelType.SINGLE_WEST);
                }
            } else {
                if (ctx.getHitPos().z - blockPos.getZ() > 0.5) {
                    return blockState2.with(TYPE, PanelType.SINGLE_SOUTH);
                } else {
                    return blockState2.with(TYPE, PanelType.SINGLE_NORTH);
                }
            }
//            }
        }
    }

    @Override
    protected boolean canReplace(BlockState state, ItemPlacementContext context) {
        ItemStack itemStack = context.getStack();
        PanelType panelType = state.get(TYPE);
        if (isDouble(state) || !itemStack.isOf(this.asItem())) {
            return false;
        } else if (context.canReplaceExisting()) {
            boolean hitPositionZ = context.getHitPos().z - context.getBlockPos().getZ() > 0.5;
            boolean hitPositionX = context.getHitPos().x - context.getBlockPos().getX() > 0.5;
            Direction direction = context.getSide();
            boolean hitDirectionZ = direction == Direction.UP || direction == Direction.DOWN || direction == Direction.EAST || direction == Direction.WEST;
            boolean hitDirectionX = direction == Direction.UP || direction == Direction.DOWN || direction == Direction.NORTH || direction == Direction.SOUTH;
            return switch (panelType) {
                case PanelType.SINGLE_NORTH -> direction == Direction.SOUTH || (hitPositionZ && hitDirectionZ);
                case PanelType.SINGLE_SOUTH -> direction == Direction.NORTH || (!hitPositionZ && hitDirectionZ);
                case PanelType.SINGLE_WEST -> direction == Direction.EAST || (hitPositionX && hitDirectionX);
                case PanelType.SINGLE_EAST -> direction == Direction.WEST || (!hitPositionX && hitDirectionX);
                default -> true;
            };
        } else {
            return true;
        }
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        return !isDouble(state) && Waterloggable.super.tryFillWithFluid(world, pos, state, fluidState);
    }

    @Override
    public boolean canFillWithFluid(@Nullable LivingEntity filler, BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        return !isDouble(state) && Waterloggable.super.canFillWithFluid(filler, world, pos, state, fluid);
    }

    @Override
    protected BlockState getStateForNeighborUpdate(
            BlockState state,
            WorldView world,
            ScheduledTickView tickView,
            BlockPos pos,
            Direction direction,
            BlockPos neighborPos,
            BlockState neighborState,
            Random random
    ) {
        if ((Boolean)state.get(WATERLOGGED)) {
            tickView.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    @Override
    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        switch (type) {
            case LAND:
                return false;
            case WATER:
                return state.getFluidState().isIn(FluidTags.WATER);
            case AIR:
                return false;
            default:
                return false;
        }
    }
}
