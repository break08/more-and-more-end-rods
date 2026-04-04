package net.mcreator.moreandmoreendrods.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.moreandmoreendrods.init.MoreandmoreendrodsModMenus;

public class DispenserEndRodArchiveItemGUIThisGUIIsOpenedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(getBlockNBTString(world, BlockPos.containing(x, y, z), "slot0")).equals("none")) {
			if (entity instanceof Player _player && _player.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu) {
				ItemStack _setstack4 = new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot0"))).toLowerCase(java.util.Locale.ENGLISH)))).copy();
				_setstack4.setCount((int) getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot0"));
				_menu.getSlots().get(0).set(_setstack4);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (!(getBlockNBTString(world, BlockPos.containing(x, y, z), "slot1")).equals("none")) {
			if (entity instanceof Player _player && _player.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu) {
				ItemStack _setstack9 = new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot1"))).toLowerCase(java.util.Locale.ENGLISH)))).copy();
				_setstack9.setCount((int) getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot1"));
				_menu.getSlots().get(0).set(_setstack9);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (!(getBlockNBTString(world, BlockPos.containing(x, y, z), "slot2")).equals("none")) {
			if (entity instanceof Player _player && _player.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu) {
				ItemStack _setstack14 = new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot2"))).toLowerCase(java.util.Locale.ENGLISH)))).copy();
				_setstack14.setCount((int) getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot2"));
				_menu.getSlots().get(0).set(_setstack14);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (!(getBlockNBTString(world, BlockPos.containing(x, y, z), "slot3")).equals("none")) {
			if (entity instanceof Player _player && _player.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu) {
				ItemStack _setstack19 = new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot3"))).toLowerCase(java.util.Locale.ENGLISH)))).copy();
				_setstack19.setCount((int) getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot3"));
				_menu.getSlots().get(0).set(_setstack19);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (!(getBlockNBTString(world, BlockPos.containing(x, y, z), "slot4")).equals("none")) {
			if (entity instanceof Player _player && _player.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu) {
				ItemStack _setstack24 = new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot4"))).toLowerCase(java.util.Locale.ENGLISH)))).copy();
				_setstack24.setCount((int) getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot4"));
				_menu.getSlots().get(0).set(_setstack24);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (!(getBlockNBTString(world, BlockPos.containing(x, y, z), "slot5")).equals("none")) {
			if (entity instanceof Player _player && _player.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu) {
				ItemStack _setstack29 = new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot5"))).toLowerCase(java.util.Locale.ENGLISH)))).copy();
				_setstack29.setCount((int) getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot5"));
				_menu.getSlots().get(0).set(_setstack29);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (!(getBlockNBTString(world, BlockPos.containing(x, y, z), "slot6")).equals("none")) {
			if (entity instanceof Player _player && _player.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu) {
				ItemStack _setstack34 = new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot6"))).toLowerCase(java.util.Locale.ENGLISH)))).copy();
				_setstack34.setCount((int) getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot6"));
				_menu.getSlots().get(0).set(_setstack34);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (!(getBlockNBTString(world, BlockPos.containing(x, y, z), "slot7")).equals("none")) {
			if (entity instanceof Player _player && _player.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu) {
				ItemStack _setstack39 = new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot7"))).toLowerCase(java.util.Locale.ENGLISH)))).copy();
				_setstack39.setCount((int) getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot7"));
				_menu.getSlots().get(0).set(_setstack39);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (!(getBlockNBTString(world, BlockPos.containing(x, y, z), "slot8")).equals("none")) {
			if (entity instanceof Player _player && _player.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu) {
				ItemStack _setstack44 = new ItemStack(BuiltInRegistries.ITEM.getValue(ResourceLocation.parse(((getBlockNBTString(world, BlockPos.containing(x, y, z), "slot8"))).toLowerCase(java.util.Locale.ENGLISH)))).copy();
				_setstack44.setCount((int) getBlockNBTNumber(world, BlockPos.containing(x, y, z), "nslot8"));
				_menu.getSlots().get(0).set(_setstack44);
				_player.containerMenu.broadcastChanges();
			}
		}
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null) {
				_blockEntity.getPersistentData().putDouble("cooldown_chosen",
						((entity instanceof Player _entity45 && _entity45.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu45) ? _menu45.getMenuState(2, "TickCooldownSlide", 0.0) : 0.0));
			}
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (getAmountInGUISlot(entity, 9) != 0) {
			{
				int _value = 1;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("redstone_archive") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		} else {
			{
				int _value = 0;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("redstone_archive") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
	}

	private static String getBlockNBTString(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getStringOr(tag, "");
		return "";
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}

	private static int getAmountInGUISlot(Entity entity, int sltid) {
		if (entity instanceof Player player && player.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor menuAccessor) {
			ItemStack stack = menuAccessor.getSlots().get(sltid).getItem();
			if (stack != null)
				return stack.getCount();
		}
		return 0;
	}
}