package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.function.Function;

public class GlassEndRodBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	public static final EnumProperty<AttachFace> FACE = FaceAttachedHorizontalDirectionalBlock.FACE;
	private final Function<BlockState, VoxelShape> shapes = this.makeShapes();

	public GlassEndRodBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL));
	}

	private Function<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			return switch (state.getValue(FACING)) {
				default -> switch (state.getValue(FACE)) {
					case FLOOR -> Shapes.or(box(5, 0, 4, 12, 1, 11), box(6, 1, 5, 11, 16, 10));
					case WALL -> Shapes.or(box(5, 5, 0, 12, 12, 1), box(6, 6, 1, 11, 11, 16));
					case CEILING -> Shapes.or(box(4, 15, 4, 11, 16, 11), box(5, 0, 5, 10, 15, 10));
				};
				case NORTH -> switch (state.getValue(FACE)) {
					case FLOOR -> Shapes.or(box(4, 0, 5, 11, 1, 12), box(5, 1, 6, 10, 16, 11));
					case WALL -> Shapes.or(box(4, 5, 15, 11, 12, 16), box(5, 6, 0, 10, 11, 15));
					case CEILING -> Shapes.or(box(5, 15, 5, 12, 16, 12), box(6, 0, 6, 11, 15, 11));
				};
				case EAST -> switch (state.getValue(FACE)) {
					case FLOOR -> Shapes.or(box(4, 0, 4, 11, 1, 11), box(5, 1, 5, 10, 16, 10));
					case WALL -> Shapes.or(box(0, 5, 4, 1, 12, 11), box(1, 6, 5, 16, 11, 10));
					case CEILING -> Shapes.or(box(4, 15, 5, 11, 16, 12), box(5, 0, 6, 10, 15, 11));
				};
				case WEST -> switch (state.getValue(FACE)) {
					case FLOOR -> Shapes.or(box(5, 0, 5, 12, 1, 12), box(6, 1, 6, 11, 16, 11));
					case WALL -> Shapes.or(box(15, 5, 5, 16, 12, 12), box(0, 6, 6, 15, 11, 11));
					case CEILING -> Shapes.or(box(5, 15, 4, 12, 16, 11), box(6, 0, 5, 11, 15, 10));
				};
			};
		});
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return shapes.apply(state);
	}

	@Override
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, FACE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		if (context.getClickedFace().getAxis() == Direction.Axis.Y)
			return super.getStateForPlacement(context).setValue(FACE, context.getClickedFace().getOpposite() == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR).setValue(FACING, context.getHorizontalDirection());
		return super.getStateForPlacement(context).setValue(FACE, AttachFace.WALL).setValue(FACING, context.getClickedFace());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}
}