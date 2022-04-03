
package net.mcreator.abyssium.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.abyssium.init.Abyssium2ModTabs;

public class CleamoletteenorItem extends Item {
	public CleamoletteenorItem() {
		super(new Item.Properties().tab(Abyssium2ModTabs.TAB_SOLAIRGISOR).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("cleamoletteenor");
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
