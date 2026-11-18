package net.mcreator.moreandmoreendrods.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.moreandmoreendrods.trigger.MoreandmoreendrodsModTriggers;

@Mixin(CropBlock.class)
public class CropGrowthMixin {
	@Inject(method = "growCrops", at = @At("HEAD"), cancellable = true)
	private void onGrowCrops(Level level, BlockPos pos, BlockState state, CallbackInfo callback) {
		if (!MoreandmoreendrodsModTriggers.fireCropGrowth(level, pos, state))
			callback.cancel();
	}
}