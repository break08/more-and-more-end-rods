package net.mcreator.moreandmoreendrods.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.moreandmoreendrods.trigger.MoreandmoreendrodsModTriggers;

@Mixin(Player.class)
public class PlayerCriticalMixin {
	@Inject(method = "attack", at = @At("HEAD"), cancellable = true)
	private void onAttack(Entity target, CallbackInfo callback) {
		Player player = (Player) (Object) this;
		if (!MoreandmoreendrodsModTriggers.fireCriticalHit(player, target))
			callback.cancel();
	}
}