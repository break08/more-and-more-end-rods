package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EndRodBlock;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.moreandmoreendrods.procedures.CopperEndRodOnTickUpdateProcedure;

public class WaxedWeatheredCopperEndRodBlock extends EndRodBlock {
	public WaxedWeatheredCopperEndRodBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(1f, 10f).noOcclusion().randomTicks().isRedstoneConductor((bs, br, bp) -> false).forceSolidOff());
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.randomTick(blockstate, world, pos, random);
		CopperEndRodOnTickUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}