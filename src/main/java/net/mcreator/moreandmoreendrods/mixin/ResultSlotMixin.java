package net.mcreator.moreandmoreendrods.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.ResultSlot;
import net.minecraft.world.entity.player.Player;

import net.mcreator.moreandmoreendrods.trigger.MoreandmoreendrodsModTriggers;

@Mixin(ResultSlot.class)
public class ResultSlotMixin {
	@Inject(method = "onTake", at = @At("RETURN"))
	private void onTake(Player player, ItemStack stack, CallbackInfo callback) {
		MoreandmoreendrodsModTriggers.fireItemCrafted(player, stack);
	}
}