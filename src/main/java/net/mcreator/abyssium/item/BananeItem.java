
package net.mcreator.abyssium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.abyssium.init.Abyssium2ModTabs;

public class BananeItem extends Item {
	public BananeItem() {
		super(new Item.Properties().tab(Abyssium2ModTabs.TAB_TERRIUM).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(3).saturationMod(0f)

						.build()));
		setRegistryName("banane");
	}
}
