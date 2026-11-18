package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.EndRodBlock;

public class StoneEndRodBlock extends EndRodBlock {
	public StoneEndRodBlock() {
		super(BlockBehaviour.Properties.of().strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOff());
	}
}