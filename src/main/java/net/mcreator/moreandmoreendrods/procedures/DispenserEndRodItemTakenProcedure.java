package net.mcreator.moreandmoreendrods.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.moreandmoreendrods.init.MoreandmoreendrodsModMenus;

public class DispenserEndRodItemTakenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null) {
				_blockEntity.getPersistentData().putString("slot0", (BuiltInRegistries.ITEM
						.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem()).toString()));
				_blockEntity.getPersistentData().putString("slot1", (BuiltInRegistries.ITEM
						.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu3 ? _menu3.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem()).toString()));
				_blockEntity.getPersistentData().putString("slot2", (BuiltInRegistries.ITEM
						.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem()).toString()));
				_blockEntity.getPersistentData().putString("slot3", (BuiltInRegistries.ITEM
						.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu9 ? _menu9.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem()).toString()));
				_blockEntity.getPersistentData().putString("slot4", (BuiltInRegistries.ITEM
						.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem()).toString()));
				_blockEntity.getPersistentData().putString("slot5", (BuiltInRegistries.ITEM
						.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu15 ? _menu15.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem()).toString()));
				_blockEntity.getPersistentData().putString("slot6", (BuiltInRegistries.ITEM
						.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu18 ? _menu18.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem()).toString()));
				_blockEntity.getPersistentData().putString("slot7", (BuiltInRegistries.ITEM
						.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu21 ? _menu21.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem()).toString()));
				_blockEntity.getPersistentData().putString("slot8", (BuiltInRegistries.ITEM
						.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MoreandmoreendrodsModMenus.MenuAccessor _menu24 ? _menu24.getSlots().get(8).getItem() : ItemStack.EMPTY).getItem()).toString()));
				_blockEntity.getPersistentData().putDouble("nslot0", (getAmountInGUISlot(entity, 0)));
				_blockEntity.getPersistentData().putDouble("nslot1", (getAmountInGUISlot(entity, 1)));
				_blockEntity.getPersistentData().putDouble("nslot2", (getAmountInGUISlot(entity, 2)));
				_blockEntity.getPersistentData().putDouble("nslot3", (getAmountInGUISlot(entity, 3)));
				_blockEntity.getPersistentData().putDouble("nslot4", (getAmountInGUISlot(entity, 4)));
				_blockEntity.getPersistentData().putDouble("nslot5", (getAmountInGUISlot(entity, 5)));
				_blockEntity.getPersistentData().putDouble("nslot6", (getAmountInGUISlot(entity, 6)));
				_blockEntity.getPersistentData().putDouble("nslot7", (getAmountInGUISlot(entity, 7)));
				_blockEntity.getPersistentData().putDouble("nslot8", (getAmountInGUISlot(entity, 8)));
			}
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
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