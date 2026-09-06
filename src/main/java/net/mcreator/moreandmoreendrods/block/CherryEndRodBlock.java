package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EndRodBlock;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class CherryEndRodBlock extends EndRodBlock {
	public CherryEndRodBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(1f, 10f).ignitedByLava().forceSolidOff());
		FlammableBlockRegistry.getDefaultInstance().add(this, 15, 160);
	}
}