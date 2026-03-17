package net.mcreator.moreandmoreendrods.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.EndRodBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class OakEndRodBlock extends EndRodBlock {
	public OakEndRodBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.wood.break")), () -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.wood.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.wood.place")), () -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.wood.hit")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(ResourceLocation.parse("block.wood.fall"))))
				.strength(1f, 10f).ignitedByLava().forceSolidOff());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 15;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 160;
	}
}