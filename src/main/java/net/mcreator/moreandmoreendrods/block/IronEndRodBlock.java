package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EndRodBlock;

public class IronEndRodBlock extends EndRodBlock {
	public IronEndRodBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(3f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOff());
	}
}