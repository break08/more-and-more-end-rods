package net.mcreator.moreandmoreendrods.mixin;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.commands.Commands;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.moreandmoreendrods.trigger.MoreandmoreendrodsModTriggers;

import com.mojang.brigadier.ParseResults;

@Mixin(Commands.class)
public class CommandManagerMixin {
	@Inject(method = "performCommand", at = @At("HEAD"))
	private void onCommand(ParseResults<CommandSourceStack> parse, String command, CallbackInfo callback) {
		MoreandmoreendrodsModTriggers.fireCommand(parse.getContext().getSource(), command, parse.getContext().build(command));
	}
}