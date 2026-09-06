package net.mcreator.moreandmoreendrods.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Container;

public class DispenserEndRodRedstoneOnOffProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		ItemStack item = ItemStack.EMPTY;
		int slot = 0;
		BlockPos pos = new BlockPos((int)x, (int)y, (int)z);
		BlockEntity be = world.getBlockEntity(pos);
		for (int _i1 = 0; _i1 < 9; _i1++) {
			if (be instanceof Container container && !(container.getItem(slot) == ItemStack.EMPTY)) {
			    item = container.getItem(slot);
				item.setCount(1);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + (getDirectionFromBlockState(blockstate)).getStepX() + 0.5), (y + (getDirectionFromBlockState(blockstate)).getStepY() + 0.5),
							(z + (getDirectionFromBlockState(blockstate)).getStepZ() + 0.5), item);
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

	private static Property<?> getPropertyByName(BlockState state, String name) {
		for (Property<?> property : state.getProperties()) {
			if (property.getName().equals(name)) {
				return property;
			}
		}
		return null;
	}
}