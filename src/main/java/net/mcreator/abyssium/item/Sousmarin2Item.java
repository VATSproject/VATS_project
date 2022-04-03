
package net.mcreator.abyssium.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.abyssium.procedures.Sousmarin2LorsDunClickDroitSurUnBlocProcedure;
import net.mcreator.abyssium.init.Abyssium2ModTabs;

public class Sousmarin2Item extends Item {
	public Sousmarin2Item() {
		super(new Item.Properties().tab(Abyssium2ModTabs.TAB_ABYSIUM).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("sousmarin_2");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		Sousmarin2LorsDunClickDroitSurUnBlocProcedure.execute(world, x, y, z);
		return ar;
	}
}
