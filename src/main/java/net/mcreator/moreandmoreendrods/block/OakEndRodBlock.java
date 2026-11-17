package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EndRodBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class OakEndRodBlock extends EndRodBlock {
	public OakEndRodBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1f, 10f).ignitedByLava().forceSolidOff());
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 15;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 160;
	}
}