
package net.mcreator.abyssium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.abyssium.init.Abyssium2ModTabs;

public class BouteilledO2Item extends Item {
	public BouteilledO2Item() {
		super(new Item.Properties().tab(Abyssium2ModTabs.TAB_ABYSIUM).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("bouteilled_o_2");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
