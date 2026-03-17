package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.EndRodBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class EmeraldEndRodBlock extends EndRodBlock {
	public EmeraldEndRodBlock() {
		super(BlockBehaviour.Properties.of().strength(3f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOff());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}