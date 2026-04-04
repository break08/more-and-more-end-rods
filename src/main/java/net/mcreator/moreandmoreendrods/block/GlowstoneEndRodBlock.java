package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EndRodBlock;

public class GlowstoneEndRodBlock extends EndRodBlock {
	public GlowstoneEndRodBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.LANTERN).strength(1f, 10f).lightLevel(blockstate -> 12).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOff());
	}
}