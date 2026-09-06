package net.mcreator.moreandmoreendrods;

import net.mcreator.moreandmoreendrods.init.MoreandmoreendrodsModScreens;
import net.mcreator.moreandmoreendrods.init.MoreandmoreendrodsModMenus;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

@Environment(EnvType.CLIENT)
public class MoreandmoreendrodsModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		MoreandmoreendrodsModScreens.clientLoad();
		MoreandmoreendrodsModMenus.clientLoad();
		// Start of user code block mod init
		// End of user code block mod init
	}
	// Start of user code block mod methods
	// End of user code block mod methods
}