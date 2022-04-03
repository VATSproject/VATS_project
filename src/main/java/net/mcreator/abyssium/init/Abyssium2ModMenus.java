
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.abyssium.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.abyssium.world.inventory.TablehuitreguiMenu;
import net.mcreator.abyssium.world.inventory.GuicuisiniereMenu;
import net.mcreator.abyssium.world.inventory.CraftpersoguiMenu;
import net.mcreator.abyssium.world.inventory.CompteurguiMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Abyssium2ModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CraftpersoguiMenu> CRAFTPERSOGUI = register("craftpersogui",
			(id, inv, extraData) -> new CraftpersoguiMenu(id, inv, extraData));
	public static final MenuType<TablehuitreguiMenu> TABLEHUITREGUI = register("tablehuitregui",
			(id, inv, extraData) -> new TablehuitreguiMenu(id, inv, extraData));
	public static final MenuType<GuicuisiniereMenu> GUICUISINIERE = register("guicuisiniere",
			(id, inv, extraData) -> new GuicuisiniereMenu(id, inv, extraData));
	public static final MenuType<CompteurguiMenu> COMPTEURGUI = register("compteurgui",
			(id, inv, extraData) -> new CompteurguiMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
