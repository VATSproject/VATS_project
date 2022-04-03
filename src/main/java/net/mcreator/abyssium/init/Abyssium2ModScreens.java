
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.abyssium.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.abyssium.client.gui.TablehuitreguiScreen;
import net.mcreator.abyssium.client.gui.GuicuisiniereScreen;
import net.mcreator.abyssium.client.gui.CraftpersoguiScreen;
import net.mcreator.abyssium.client.gui.CompteurguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Abyssium2ModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(Abyssium2ModMenus.CRAFTPERSOGUI, CraftpersoguiScreen::new);
			MenuScreens.register(Abyssium2ModMenus.TABLEHUITREGUI, TablehuitreguiScreen::new);
			MenuScreens.register(Abyssium2ModMenus.GUICUISINIERE, GuicuisiniereScreen::new);
			MenuScreens.register(Abyssium2ModMenus.COMPTEURGUI, CompteurguiScreen::new);
		});
	}
}
