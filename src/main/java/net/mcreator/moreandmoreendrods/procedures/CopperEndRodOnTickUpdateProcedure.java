package net.mcreator.moreandmoreendrods.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.moreandmoreendrods.init.MoreandmoreendrodsModBlocks;

import java.util.Map;

public class CopperEndRodOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:waxed_copper_end_rod")))) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MoreandmoreendrodsModBlocks.COPPER_END_ROD.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = MoreandmoreendrodsModBlocks.EXPOSED_COPPER_END_ROD.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MoreandmoreendrodsModBlocks.EXPOSED_COPPER_END_ROD.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = MoreandmoreendrodsModBlocks.WEATHERED_COPPER_END_ROD.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MoreandmoreendrodsModBlocks.WEATHERED_COPPER_END_ROD.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = MoreandmoreendrodsModBlocks.OXIDIZED_COPPER_END_ROD.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
	}
}