package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EndRodBlock;

public class NetheriteEndRodBlock extends EndRodBlock {
	public NetheriteEndRodBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(6f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOff());
	}
}