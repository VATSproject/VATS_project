
package net.mcreator.abyssium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.abyssium.init.Abyssium2ModTabs;

public class CrevetteItem extends Item {
	public CrevetteItem() {
		super(new Item.Properties().tab(Abyssium2ModTabs.TAB_ABYSIUM).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(5).saturationMod(0f)

						.build()));
		setRegistryName("crevette");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 20;
	}
}
