package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EndRodBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class ShulkerEndRodBlock extends EndRodBlock {
	public ShulkerEndRodBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.BAMBOO_SAPLING).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOff());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}