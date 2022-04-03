
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.abyssium.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class Abyssium2ModTabs {
	public static CreativeModeTab TAB_ABYSIUM;
	public static CreativeModeTab TAB_SOLAIRGISOR;
	public static CreativeModeTab TAB_TERRIUM;

	public static void load() {
		TAB_ABYSIUM = new CreativeModeTab("tababysium") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Abyssium2ModItems.SOUSMARIN_2);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SOLAIRGISOR = new CreativeModeTab("tabsolairgisor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Abyssium2ModBlocks.PANNEAUSOLAIRMOYEN);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TERRIUM = new CreativeModeTab("tabterrium") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.FARMLAND);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
