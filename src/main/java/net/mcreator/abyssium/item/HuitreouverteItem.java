
package net.mcreator.abyssium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.abyssium.init.Abyssium2ModTabs;

public class HuitreouverteItem extends Item {
	public HuitreouverteItem() {
		super(new Item.Properties().tab(Abyssium2ModTabs.TAB_ABYSIUM).stacksTo(16).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.5f)

						.build()));
		setRegistryName("huitreouverte");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 30;
	}
}
