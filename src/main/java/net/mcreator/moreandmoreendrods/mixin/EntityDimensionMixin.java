package net.mcreator.moreandmoreendrods.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.portal.DimensionTransition;
import net.minecraft.world.entity.Entity;

import net.mcreator.moreandmoreendrods.trigger.MoreandmoreendrodsModTriggers;

@Mixin(Entity.class)
public class EntityDimensionMixin {
	@Inject(method = "changeDimension", at = @At("HEAD"), cancellable = true)
	private void onChangeDimension(DimensionTransition transition, CallbackInfoReturnable<Entity> callback) {
		if (!MoreandmoreendrodsModTriggers.fireDimensionTravel((Entity) (Object) this))
			callback.setReturnValue((Entity) (Object) this);
	}
}