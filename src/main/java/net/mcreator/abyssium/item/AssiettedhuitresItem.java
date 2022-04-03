
package net.mcreator.abyssium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.abyssium.init.Abyssium2ModTabs;

public class AssiettedhuitresItem extends Item {
	public AssiettedhuitresItem() {
		super(new Item.Properties().tab(Abyssium2ModTabs.TAB_ABYSIUM).stacksTo(1).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(14).saturationMod(0f)

						.build()));
		setRegistryName("assiettedhuitres");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 100;
	}
}
