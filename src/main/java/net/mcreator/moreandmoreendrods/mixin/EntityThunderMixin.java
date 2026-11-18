package net.mcreator.moreandmoreendrods.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.moreandmoreendrods.trigger.MoreandmoreendrodsModTriggers;

@Mixin(Entity.class)
public class EntityThunderMixin {
	@Inject(method = "thunderHit", at = @At("HEAD"))
	private void onThunderHit(ServerLevel level, LightningBolt bolt, CallbackInfo callback) {
		MoreandmoreendrodsModTriggers.fireStruckByLightning((Entity) (Object) this, bolt);
	}
}