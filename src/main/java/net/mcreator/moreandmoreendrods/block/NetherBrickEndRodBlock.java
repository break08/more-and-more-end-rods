package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EndRodBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class NetherBrickEndRodBlock extends EndRodBlock {
	public NetherBrickEndRodBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHER_BRICKS).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOff());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}