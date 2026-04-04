package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.Containers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.moreandmoreendrods.world.inventory.DispenserEndRodArchiveItemGUIMenu;
import net.mcreator.moreandmoreendrods.procedures.DispenserEndRodRedstoneOnProcedure;
import net.mcreator.moreandmoreendrods.procedures.DispenserEndRodBlockAddedProcedure;
import net.mcreator.moreandmoreendrods.block.entity.DispenserEndRodBlockEntity;

import javax.annotation.Nullable;

import java.util.function.Function;

import io.netty.buffer.Unpooled;

public class DispenserEndRodBlock extends Block implements EntityBlock {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	public static final EnumProperty<AttachFace> FACE = FaceAttachedHorizontalDirectionalBlock.FACE;
	public static final IntegerProperty WORKING_STATE = IntegerProperty.create("working_state", 0, 2);
	private final Function<BlockState, VoxelShape> shapes = this.makeShapes();

	public DispenserEndRodBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(1f, 10f).noOcclusion().pushReaction(PushReaction.PUSH_ONLY).isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL).setValue(WORKING_STATE, 0));
	}

	private Function<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			return switch (state.getValue(FACING)) {
				default -> switch (state.getValue(FACE)) {
					case FLOOR -> Shapes.or(box(9, 1, 6, 10, 16, 9), box(8, 1, 8, 9, 16, 9), box(8, 1, 6, 9, 16, 7), box(7, 1, 6, 8, 16, 9), box(6, 0, 5, 11, 1, 10));
					case WALL -> Shapes.or(box(9, 7, 1, 10, 10, 16), box(8, 7, 1, 9, 8, 16), box(8, 9, 1, 9, 10, 16), box(7, 7, 1, 8, 10, 16), box(6, 6, 0, 11, 11, 1));
					case CEILING -> Shapes.or(box(6, 0, 6, 7, 15, 9), box(7, 0, 8, 8, 15, 9), box(7, 0, 6, 8, 15, 7), box(8, 0, 6, 9, 15, 9), box(5, 15, 5, 10, 16, 10));
				};
				case NORTH -> switch (state.getValue(FACE)) {
					case FLOOR -> Shapes.or(box(6, 1, 7, 7, 16, 10), box(7, 1, 7, 8, 16, 8), box(7, 1, 9, 8, 16, 10), box(8, 1, 7, 9, 16, 10), box(5, 0, 6, 10, 1, 11));
					case WALL -> Shapes.or(box(6, 7, 0, 7, 10, 15), box(7, 7, 0, 8, 8, 15), box(7, 9, 0, 8, 10, 15), box(8, 7, 0, 9, 10, 15), box(5, 6, 15, 10, 11, 16));
					case CEILING -> Shapes.or(box(9, 0, 7, 10, 15, 10), box(8, 0, 7, 9, 15, 8), box(8, 0, 9, 9, 15, 10), box(7, 0, 7, 8, 15, 10), box(6, 15, 6, 11, 16, 11));
				};
				case EAST -> switch (state.getValue(FACE)) {
					case FLOOR -> Shapes.or(box(6, 1, 6, 9, 16, 7), box(8, 1, 7, 9, 16, 8), box(6, 1, 7, 7, 16, 8), box(6, 1, 8, 9, 16, 9), box(5, 0, 5, 10, 1, 10));
					case WALL -> Shapes.or(box(1, 7, 6, 16, 10, 7), box(1, 7, 7, 16, 8, 8), box(1, 9, 7, 16, 10, 8), box(1, 7, 8, 16, 10, 9), box(0, 6, 5, 1, 11, 10));
					case CEILING -> Shapes.or(box(6, 0, 9, 9, 15, 10), box(8, 0, 8, 9, 15, 9), box(6, 0, 8, 7, 15, 9), box(6, 0, 7, 9, 15, 8), box(5, 15, 6, 10, 16, 11));
				};
				case WEST -> switch (state.getValue(FACE)) {
					case FLOOR -> Shapes.or(box(7, 1, 9, 10, 16, 10), box(7, 1, 8, 8, 16, 9), box(9, 1, 8, 10, 16, 9), box(7, 1, 7, 10, 16, 8), box(6, 0, 6, 11, 1, 11));
					case WALL -> Shapes.or(box(0, 7, 9, 15, 10, 10), box(0, 7, 8, 15, 8, 9), box(0, 9, 8, 15, 10, 9), box(0, 7, 7, 15, 10, 8), box(15, 6, 6, 16, 11, 11));
					case CEILING -> Shapes.or(box(7, 0, 6, 10, 15, 7), box(7, 0, 7, 8, 15, 8), box(9, 0, 7, 10, 15, 8), box(7, 0, 8, 10, 15, 9), box(6, 15, 5, 11, 16, 10));
				};
			};
		}, WORKING_STATE);
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return shapes.apply(state);
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, FACE, WORKING_STATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		if (context.getClickedFace().getAxis() == Direction.Axis.Y)
			return super.getStateForPlacement(context).setValue(FACE, context.getClickedFace().getOpposite() == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR).setValue(FACING, context.getHorizontalDirection()).setValue(WORKING_STATE, 0);
		return super.getStateForPlacement(context).setValue(FACE, AttachFace.WALL).setValue(FACING, context.getClickedFace()).setValue(WORKING_STATE, 0);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, Direction side) {
		return true;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		DispenserEndRodBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, @Nullable Orientation orientation, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, orientation, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			DispenserEndRodRedstoneOnProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
		} else {
			DispenserEndRodRedstoneOnProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), blockstate);
		}
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		if (entity instanceof ServerPlayer player) {
			player.openMenu(new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal("Dispenser End Rod");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new DispenserEndRodArchiveItemGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
				}
			}, pos);
		}
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new DispenserEndRodBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity != null && blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	protected void affectNeighborsAfterRemoval(BlockState blockstate, ServerLevel world, BlockPos blockpos, boolean flag) {
		Containers.updateNeighboursAfterDestroy(blockstate, world, blockpos);
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof DispenserEndRodBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}