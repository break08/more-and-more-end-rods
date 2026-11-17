package net.mcreator.moreandmoreendrods.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Container;
import net.minecraft.world.phys.Vec3;

public class DispenserEndRodRedstoneOnOffProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		ItemStack item = ItemStack.EMPTY;
		int slot = 0;
		BlockPos pos = new BlockPos((int)x, (int)y, (int)z);
		BlockEntity be = world.getBlockEntity(pos);
		for (int _i1 = 0; _i1 < 9; _i1++) {
			if (be instanceof Container container && !(container.getItem(slot).isEmpty())) {
			    item = container.getItem(slot).copy();
				item.setCount(1);
				Direction dir = getBlockDirection(world, BlockPos.containing(x, y, z));
				if (world instanceof ServerLevel _level) {
				    double px = x + 0.5 + dir.getStepX() * 0.7;
				    double py = y + 0.5 + dir.getStepY() * 0.7 - 0.125; // ItemEntity cao 0.25, toạ độ là đáy
				    double pz = z + 0.5 + dir.getStepZ() * 0.7;
				    ItemEntity entityToSpawn = new ItemEntity(_level, px, py, pz, item);
				    entityToSpawn.setDeltaMovement(Vec3.ZERO);
				    entityToSpawn.setPickUpDelay(1);
				    _level.addFreshEntity(entityToSpawn);
				}
				container.removeItem(slot, 1);
				break;
			}
			slot = slot + 1;
		}
	}

	private static Direction getDirectionFromBlockState(BlockState blockState) {
		if (getPropertyByName(blockState, "facing") instanceof EnumProperty ep && ep.getValueClass() == Direction.class)
			return (Direction) blockState.getValue(ep);
		if (getPropertyByName(blockState, "axis") instanceof EnumProperty ep && ep.getValueClass() == Direction.Axis.class)
			return Direction.fromAxisAndDirection((Direction.Axis) blockState.getValue(ep), Direction.AxisDirection.POSITIVE);
		return Direction.NORTH;
	}

	private static Direction getBlockDirection(LevelAccessor world, BlockPos pos) {
		BlockState blockState = world.getBlockState(pos);
		Property<?> property = blockState.getBlock().getStateDefinition().getProperty("facing");
		if (property != null && blockState.getValue(property) instanceof Direction direction)
			return direction;
		else if (blockState.hasProperty(BlockStateProperties.AXIS))
			return Direction.fromAxisAndDirection(blockState.getValue(BlockStateProperties.AXIS), Direction.AxisDirection.POSITIVE);
		else if (blockState.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
			return Direction.fromAxisAndDirection(blockState.getValue(BlockStateProperties.HORIZONTAL_AXIS), Direction.AxisDirection.POSITIVE);
		return Direction.NORTH;
	}


	private static Property<?> getPropertyByName(BlockState state, String name) {
		for (Property<?> property : state.getProperties()) {
			if (property.getName().equals(name)) {
				return property;
			}
		}
		return null;
	}
}