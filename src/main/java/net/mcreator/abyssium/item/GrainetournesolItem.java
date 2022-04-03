
package net.mcreator.abyssium.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.abyssium.procedures.GrainetournesolLorsDunClickDroitSurUnBlocProcedure;
import net.mcreator.abyssium.init.Abyssium2ModTabs;

public class GrainetournesolItem extends Item {
	public GrainetournesolItem() {
		super(new Item.Properties().tab(Abyssium2ModTabs.TAB_TERRIUM).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("grainetournesol");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		GrainetournesolLorsDunClickDroitSurUnBlocProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}
}
