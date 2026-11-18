package net.mcreator.moreandmoreendrods.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Final;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;

import net.mcreator.moreandmoreendrods.trigger.MoreandmoreendrodsModTriggers;

@Mixin(Explosion.class)
public class ExplosionMixin {
	@Shadow
	@Final
	private Level level;

	@Inject(method = "finalizeExplosion", at = @At("HEAD"))
	private void onFinalize(boolean spawnParticles, CallbackInfo callback) {
		Explosion explosion = (Explosion) (Object) this;
		MoreandmoreendrodsModTriggers.fireExplosion(level, explosion.center().x, explosion.center().y, explosion.center().z);
	}
}