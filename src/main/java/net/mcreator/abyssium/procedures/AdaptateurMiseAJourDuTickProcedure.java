package net.mcreator.abyssium.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.abyssium.init.Abyssium2ModBlocks;

public class AdaptateurMiseAJourDuTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Abyssium2ModBlocks.RECEPTEUR
				|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Abyssium2ModBlocks.RECEPTEUR
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Abyssium2ModBlocks.RECEPTEUR
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Abyssium2ModBlocks.RECEPTEUR) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), Abyssium2ModBlocks.ADAPTATEUR_2.defaultBlockState(), 3);
		}
	}
}
