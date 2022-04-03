
package net.mcreator.abyssium.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.abyssium.init.Abyssium2ModTabs;
import net.mcreator.abyssium.init.Abyssium2ModItems;

public class Outils_AbyssiumSwordItem extends SwordItem {
	public Outils_AbyssiumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2380;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 28f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 70;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Abyssium2ModItems.ABYSSIUM));
			}
		}, 3, -2f, new Item.Properties().tab(Abyssium2ModTabs.TAB_ABYSIUM));
		setRegistryName("outils_abyssium_sword");
	}
}
