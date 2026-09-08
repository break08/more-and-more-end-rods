package net.mcreator.moreandmoreendrods.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.moreandmoreendrods.init.MoreandmoreendrodsModBlocks;
import net.mcreator.moreandmoreendrods.MoreandmoreendrodsMod;

public class CopperEndRodOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(world.getBlockState(BlockPos.containing(x, y, z))).is(TagKey.create(Registries.BLOCK, Identifier.parse("minecraft:waxed_copper_end_rod"))) && Math.random() < 0.3) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MoreandmoreendrodsModBlocks.COPPER_END_ROD) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = MoreandmoreendrodsModBlocks.EXPOSED_COPPER_END_ROD.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Property<?> _propertyOld : _bso.getProperties()) {
						Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
						if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
							try {
								_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MoreandmoreendrodsModBlocks.EXPOSED_COPPER_END_ROD) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = MoreandmoreendrodsModBlocks.WEATHERED_COPPER_END_ROD.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Property<?> _propertyOld : _bso.getProperties()) {
						Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
						if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
							try {
								_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MoreandmoreendrodsModBlocks.WEATHERED_COPPER_END_ROD) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = MoreandmoreendrodsModBlocks.OXIDIZED_COPPER_END_ROD.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Property<?> _propertyOld : _bso.getProperties()) {
						Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
						if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
							try {
								_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
		if (world instanceof Level _lvl11 && _lvl11.isThundering() && Math.random() < 0.5) {
			for (int _i1 = 0; _i1 < 3; _i1++) {
				MoreandmoreendrodsMod.queueServerWork(12, () -> {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.LIGHTNING_BOLT.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				});
			}
		}
	}
}