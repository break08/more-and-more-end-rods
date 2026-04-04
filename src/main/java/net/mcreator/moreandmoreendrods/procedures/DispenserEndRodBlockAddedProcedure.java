package net.mcreator.moreandmoreendrods.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class DispenserEndRodBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null) {
				_blockEntity.getPersistentData().putString("slot0", "none");
				_blockEntity.getPersistentData().putString("slot1", "none");
				_blockEntity.getPersistentData().putString("slot2", "none");
				_blockEntity.getPersistentData().putString("slot3", "none");
				_blockEntity.getPersistentData().putString("slot4", "none");
				_blockEntity.getPersistentData().putString("slot5", "none");
				_blockEntity.getPersistentData().putString("slot6", "none");
				_blockEntity.getPersistentData().putString("slot7", "none");
				_blockEntity.getPersistentData().putString("slot8", "none");
				_blockEntity.getPersistentData().putDouble("nslot0", 0);
				_blockEntity.getPersistentData().putDouble("nslot1", 0);
				_blockEntity.getPersistentData().putDouble("nslot2", 0);
				_blockEntity.getPersistentData().putDouble("nslot3", 0);
				_blockEntity.getPersistentData().putDouble("nslot4", 0);
				_blockEntity.getPersistentData().putDouble("nslot5", 0);
				_blockEntity.getPersistentData().putDouble("nslot6", 0);
				_blockEntity.getPersistentData().putDouble("nslot7", 0);
				_blockEntity.getPersistentData().putDouble("nslot8", 0);
				_blockEntity.getPersistentData().putDouble("cooldown_chosen", 2);
				_blockEntity.getPersistentData().putDouble("cooldown", 2);
			}
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
	}
}