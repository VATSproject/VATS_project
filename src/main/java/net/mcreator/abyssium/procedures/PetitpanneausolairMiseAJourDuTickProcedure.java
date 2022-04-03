package net.mcreator.abyssium.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.abyssium.init.Abyssium2ModBlocks;

public class PetitpanneausolairMiseAJourDuTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof Level _lvl ? _lvl.isDay() : false) == true) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), Abyssium2ModBlocks.PETITPANNEAUSOLAIR_2.defaultBlockState(), 3);
		}
	}
}
