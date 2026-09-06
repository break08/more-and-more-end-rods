package net.mcreator.moreandmoreendrods.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.EndRodBlock;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class StoneEndRodBlock extends EndRodBlock {
	public StoneEndRodBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOff());
		FlammableBlockRegistry.getDefaultInstance().add(this, 15, 160);
	}
}