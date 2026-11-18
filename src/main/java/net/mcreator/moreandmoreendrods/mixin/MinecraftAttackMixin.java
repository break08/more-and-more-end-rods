package net.mcreator.moreandmoreendrods.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.moreandmoreendrods.trigger.MoreandmoreendrodsModTriggers;

@Mixin(Minecraft.class)
public class MinecraftAttackMixin {
	@Shadow
	public LocalPlayer player;

	@Inject(method = "startAttack", at = @At("HEAD"))
	private void onStartAttack(CallbackInfoReturnable<Boolean> callback) {
		if (this.player != null)
			MoreandmoreendrodsModTriggers.fireLeftClickAir(this.player);
	}
}