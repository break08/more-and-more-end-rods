package net.mcreator.moreandmoreendrods.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.entity.player.Player;
import net.minecraft.util.Unit;
import net.minecraft.core.BlockPos;

import net.mcreator.moreandmoreendrods.trigger.MoreandmoreendrodsModTriggers;

import com.mojang.datafixers.util.Either;

@Mixin(Player.class)
public class PlayerSleepMixin {
	@Inject(method = "startSleepInBed", at = @At("RETURN"))
	private void onSleep(BlockPos pos, CallbackInfoReturnable<Either<Player.BedSleepingProblem, Unit>> callback) {
		if (callback.getReturnValue() != null && callback.getReturnValue().left().isEmpty())
			MoreandmoreendrodsModTriggers.fireInBed((Player) (Object) this, pos);
	}
}