package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.EndRodBlock;

public class EmeraldEndRodBlock extends EndRodBlock {
	public EmeraldEndRodBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(3f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOff());
	}
}