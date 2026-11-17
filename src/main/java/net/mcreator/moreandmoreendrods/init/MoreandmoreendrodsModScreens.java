/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreandmoreendrods.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.moreandmoreendrods.client.gui.DispenserEndRodArchiveItemGUIScreen;

@EventBusSubscriber(Dist.CLIENT)
public class MoreandmoreendrodsModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(MoreandmoreendrodsModMenus.DISPENSER_END_ROD_ARCHIVE_ITEM_GUI.get(), DispenserEndRodArchiveItemGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}