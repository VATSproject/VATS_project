package net.mcreator.abyssium.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.abyssium.init.Abyssium2ModBlocks;

public class Tstg2MiseAJourDuTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) x, (int) y, (int) z), Abyssium2ModBlocks.TSTG_3.defaultBlockState(), 3);
	}
}
