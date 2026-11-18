package net.mcreator.moreandmoreendrods.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;

import net.mcreator.moreandmoreendrods.trigger.MoreandmoreendrodsModTriggers;

@Mixin(TamableAnimal.class)
public class TamableAnimalMixin {
	@Inject(method = "tame", at = @At("RETURN"))
	private void onTame(Player player, CallbackInfo callback) {
		MoreandmoreendrodsModTriggers.fireTamed((TamableAnimal) (Object) this, player);
	}
}