package net.mcreator.moreandmoreendrods.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.InteractionResult;

import net.mcreator.moreandmoreendrods.trigger.MoreandmoreendrodsModTriggers;

@Mixin(HoeItem.class)
public class HoeItemMixin {
	@Inject(method = "useOn", at = @At("HEAD"))
	private void onUseOn(UseOnContext context, CallbackInfoReturnable<InteractionResult> callback) {
		if (context.getPlayer() != null)
			MoreandmoreendrodsModTriggers.fireUseHoe(context.getPlayer(), context.getClickedPos(), context.getLevel().getBlockState(context.getClickedPos()));
	}
}