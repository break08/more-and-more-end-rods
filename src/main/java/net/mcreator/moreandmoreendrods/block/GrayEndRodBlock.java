package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EndRodBlock;

public class GrayEndRodBlock extends EndRodBlock {
	public GrayEndRodBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f).lightLevel(blockstate -> 14).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOff());
	}
}