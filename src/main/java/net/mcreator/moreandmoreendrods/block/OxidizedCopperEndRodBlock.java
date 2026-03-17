package net.mcreator.moreandmoreendrods.block;

import net.minecraftforge.common.ToolActions;
import net.minecraftforge.common.ToolAction;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EndRodBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.moreandmoreendrods.procedures.CopperEndRodOnTickUpdateProcedure;
import net.mcreator.moreandmoreendrods.init.MoreandmoreendrodsModBlocks;

public class OxidizedCopperEndRodBlock extends EndRodBlock {
	public OxidizedCopperEndRodBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOff());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public BlockState getToolModifiedState(BlockState blockstate, UseOnContext context, ToolAction itemAbility, boolean simulate) {
		if (ToolActions.AXE_STRIP == itemAbility && context.getItemInHand().canPerformAction(itemAbility)) {
			return MoreandmoreendrodsModBlocks.WEATHERED_COPPER_END_ROD.get().withPropertiesOf(blockstate);
		}
		return super.getToolModifiedState(blockstate, context, itemAbility, simulate);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		CopperEndRodOnTickUpdateProcedure.execute(world, x, y, z);
	}
}