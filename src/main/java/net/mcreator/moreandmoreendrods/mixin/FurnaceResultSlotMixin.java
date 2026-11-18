package net.mcreator.moreandmoreendrods.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.FurnaceResultSlot;
import net.minecraft.world.entity.player.Player;

import net.mcreator.moreandmoreendrods.trigger.MoreandmoreendrodsModTriggers;

@Mixin(FurnaceResultSlot.class)
public class FurnaceResultSlotMixin {
	@Inject(method = "onTake", at = @At("RETURN"))
	private void onTake(Player player, ItemStack stack, CallbackInfo callback) {
		MoreandmoreendrodsModTriggers.fireItemSmelted(player, stack);
	}
}