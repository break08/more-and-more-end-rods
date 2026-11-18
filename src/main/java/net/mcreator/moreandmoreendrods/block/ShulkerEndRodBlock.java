package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EndRodBlock;

public class ShulkerEndRodBlock extends EndRodBlock {
	public ShulkerEndRodBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.BAMBOO_SAPLING).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOff());
	}
}