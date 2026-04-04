package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.MapColor;
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

public class SlimeEndRodBlock extends Block {
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
	public static final EnumProperty<AttachFace> FACE = FaceAttachedHorizontalDirectionalBlock.FACE;
	private final Function<BlockState, VoxelShape> shapes = this.makeShapes();

	public SlimeEndRodBlock(BlockBehaviour.Properties properties) {
		super(properties.mapColor(MapColor.GRASS).sound(SoundType.SLIME_BLOCK).strength(0.1f, 1f).friction(0.8f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL));
	}

	private Function<BlockState, VoxelShape> makeShapes() {
		return this.getShapeForEachState(state -> {
			return switch (state.getValue(FACING)) {
				default -> switch (state.getValue(FACE)) {
					case FLOOR -> box(6, 0, 6, 10, 16, 10);
					case WALL -> box(6, 6, 0, 10, 10, 16);
					case CEILING -> box(6, 0, 6, 10, 16, 10);
				};
				case NORTH -> switch (state.getValue(FACE)) {
					case FLOOR -> box(6, 0, 6, 10, 16, 10);
					case WALL -> box(6, 6, 0, 10, 10, 16);
					case CEILING -> box(6, 0, 6, 10, 16, 10);
				};
				case EAST -> switch (state.getValue(FACE)) {
					case FLOOR -> box(6, 0, 6, 10, 16, 10);
					case WALL -> box(0, 6, 6, 16, 10, 10);
					case CEILING -> box(6, 0, 6, 10, 16, 10);
				};
				case WEST -> switch (state.getValue(FACE)) {
					case FLOOR -> box(6, 0, 6, 10, 16, 10);
					case WALL -> box(0, 6, 6, 16, 10, 10);
					case CEILING -> box(6, 0, 6, 10, 16, 10);
				};
			};
		});
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