package net.mcreator.moreandmoreendrods.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.moreandmoreendrods.trigger.MoreandmoreendrodsModTriggers;

@Mixin(Mob.class)
public class MobMixin {
	@Inject(method = "setTarget", at = @At("HEAD"))
	private void onSetTarget(LivingEntity target, CallbackInfo callback) {
		Mob mob = (Mob) (Object) this;
		MoreandmoreendrodsModTriggers.fireTargetChange(mob, mob.getTarget(), target);
	}
}