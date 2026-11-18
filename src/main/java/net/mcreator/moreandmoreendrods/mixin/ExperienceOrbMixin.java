package net.mcreator.moreandmoreendrods.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ExperienceOrb;

import net.mcreator.moreandmoreendrods.trigger.MoreandmoreendrodsModTriggers;

@Mixin(ExperienceOrb.class)
public class ExperienceOrbMixin {
	@Inject(method = "playerTouch", at = @At("HEAD"))
	private void onPlayerTouch(Player player, CallbackInfo callback) {
		MoreandmoreendrodsModTriggers.firePickupXp(player);
	}
}