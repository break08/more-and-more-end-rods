package net.mcreator.moreandmoreendrods.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.SpectralArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class DispenserEndRodRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if ((getPropertyByName(blockstate, "working_state") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 0) {
			if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot0") != 0) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + (getDirectionFromBlockState(blockstate)).getStepX()), (y + (getDirectionFromBlockState(blockstate)).getStepY()), (z + (getDirectionFromBlockState(blockstate)).getStepZ()),
							new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot0"))).toLowerCase(java.util.Locale.ENGLISH)))));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("nslot0", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot0") - 1));
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot1") != 0) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + (getDirectionFromBlockState(blockstate)).getStepX()), (y + (getDirectionFromBlockState(blockstate)).getStepY()), (z + (getDirectionFromBlockState(blockstate)).getStepZ()),
							new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot1"))).toLowerCase(java.util.Locale.ENGLISH)))));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("nslot1", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot1") - 1));
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot2") != 0) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + (getDirectionFromBlockState(blockstate)).getStepX()), (y + (getDirectionFromBlockState(blockstate)).getStepY()), (z + (getDirectionFromBlockState(blockstate)).getStepZ()),
							new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot2"))).toLowerCase(java.util.Locale.ENGLISH)))));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("nslot2", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot2") - 1));
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot3") != 0) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + (getDirectionFromBlockState(blockstate)).getStepX()), (y + (getDirectionFromBlockState(blockstate)).getStepY()), (z + (getDirectionFromBlockState(blockstate)).getStepZ()),
							new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot3"))).toLowerCase(java.util.Locale.ENGLISH)))));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("nslot3", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot3") - 1));
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot4") != 0) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + (getDirectionFromBlockState(blockstate)).getStepX()), (y + (getDirectionFromBlockState(blockstate)).getStepY()), (z + (getDirectionFromBlockState(blockstate)).getStepZ()),
							new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot4"))).toLowerCase(java.util.Locale.ENGLISH)))));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("nslot4", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot4") - 1));
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot5") != 0) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + (getDirectionFromBlockState(blockstate)).getStepX()), (y + (getDirectionFromBlockState(blockstate)).getStepY()), (z + (getDirectionFromBlockState(blockstate)).getStepZ()),
							new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot5"))).toLowerCase(java.util.Locale.ENGLISH)))));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("nslot5", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot5") - 1));
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot6") != 0) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + (getDirectionFromBlockState(blockstate)).getStepX()), (y + (getDirectionFromBlockState(blockstate)).getStepY()), (z + (getDirectionFromBlockState(blockstate)).getStepZ()),
							new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot6"))).toLowerCase(java.util.Locale.ENGLISH)))));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("nslot6", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot6") - 1));
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot7") != 0) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + (getDirectionFromBlockState(blockstate)).getStepX()), (y + (getDirectionFromBlockState(blockstate)).getStepY()), (z + (getDirectionFromBlockState(blockstate)).getStepZ()),
							new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot7"))).toLowerCase(java.util.Locale.ENGLISH)))));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("nslot7", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot7") - 1));
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot8") != 0) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + (getDirectionFromBlockState(blockstate)).getStepX()), (y + (getDirectionFromBlockState(blockstate)).getStepY()), (z + (getDirectionFromBlockState(blockstate)).getStepZ()),
							new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot8"))).toLowerCase(java.util.Locale.ENGLISH)))));
					entityToSpawn.setPickUpDelay(1);
					_level.addFreshEntity(entityToSpawn);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("nslot8", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot8") - 1));
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		} else if ((getPropertyByName(blockstate, "working_state") instanceof IntegerProperty _getip138 ? blockstate.getValue(_getip138) : -1) == 1) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = initArrowProjectile(
						new SpectralArrow(projectileLevel, 0, 0, 0, new SpectralArrow(EntityType.SPECTRAL_ARROW, projectileLevel).getPickupItemStackOrigin(), createArrowWeaponItemStack(projectileLevel, 1, (byte) 0)), null, 5, false, false, false,
						AbstractArrow.Pickup.DISALLOWED);
				_entityToSpawn.setPos(x, y, z);
				_entityToSpawn.shoot(1, 1, 1, 1, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}

	private static Property<?> getPropertyByName(BlockState state, String name) {
		for (Property<?> property : state.getProperties()) {
			if (property.getName().equals(name)) {
				return property;
			}
		}
		return null;
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}

	private static Direction getDirectionFromBlockState(BlockState blockState) {
		if (getPropertyByName(blockState, "facing") instanceof EnumProperty ep && ep.getValueClass() == Direction.class)
			return (Direction) blockState.getValue(ep);
		if (getPropertyByName(blockState, "axis") instanceof EnumProperty ep && ep.getValueClass() == Direction.Axis.class)
			return Direction.fromAxisAndDirection((Direction.Axis) blockState.getValue(ep), Direction.AxisDirection.POSITIVE);
		return Direction.NORTH;
	}

	private static String getBlockNBTString(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getStringOr(tag, "");
		return "";
	}

	private static AbstractArrow initArrowProjectile(AbstractArrow entityToSpawn, Entity shooter, float damage, boolean silent, boolean fire, boolean particles, AbstractArrow.Pickup pickup) {
		entityToSpawn.setOwner(shooter);
		entityToSpawn.setBaseDamage(damage);
		if (silent)
			entityToSpawn.setSilent(true);
		if (fire)
			entityToSpawn.igniteForSeconds(100);
		if (particles)
			entityToSpawn.setCritArrow(true);
		entityToSpawn.pickup = pickup;
		return entityToSpawn;
	}

	private static ItemStack createArrowWeaponItemStack(Level level, int knockback, byte piercing) {
		ItemStack weapon = new ItemStack(Items.ARROW);
		if (knockback > 0)
			weapon.enchant(level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.KNOCKBACK), knockback);
		if (piercing > 0)
			weapon.enchant(level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.PIERCING), piercing);
		return weapon;
	}
}