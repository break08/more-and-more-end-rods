package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EndRodBlock;

public class CherryEndRodBlock extends EndRodBlock {
	public CherryEndRodBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(1f, 10f).ignitedByLava().forceSolidOff());
	}
}