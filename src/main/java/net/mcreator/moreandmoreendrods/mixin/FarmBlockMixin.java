package net.mcreator.moreandmoreendrods.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.moreandmoreendrods.trigger.MoreandmoreendrodsModTriggers;

@Mixin(FarmBlock.class)
public class FarmBlockMixin {
	@Inject(method = "fallOn", at = @At("HEAD"))
	private void onFallOn(Level level, BlockState state, BlockPos pos, Entity entity, float distance, CallbackInfo callback) {
		MoreandmoreendrodsModTriggers.fireFarmlandTrampled(level, pos, state, entity, distance);
	}
}