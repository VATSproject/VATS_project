package net.mcreator.abyssium.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.abyssium.network.Abyssium2ModVariables;
import net.mcreator.abyssium.init.Abyssium2ModBlocks;

public class EnvoyeurQuandLeBlocVoisinChangeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Abyssium2ModBlocks.PETITPANNEAUSOLAIR_2
				|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Abyssium2ModBlocks.PETITPANNEAUSOLAIR_2
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Abyssium2ModBlocks.PETITPANNEAUSOLAIR_2
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Abyssium2ModBlocks.PETITPANNEAUSOLAIR_2) {
			Abyssium2ModVariables.WorldVariables.get(world).energie_dispo = Abyssium2ModVariables.WorldVariables.get(world).energie_dispo + 5;
			Abyssium2ModVariables.WorldVariables.get(world).syncData(world);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Abyssium2ModBlocks.PETITPANNEAUSOLAIR
				|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Abyssium2ModBlocks.PETITPANNEAUSOLAIR
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Abyssium2ModBlocks.PETITPANNEAUSOLAIR
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Abyssium2ModBlocks.PETITPANNEAUSOLAIR) {
			Abyssium2ModVariables.WorldVariables.get(world).energie_dispo = Abyssium2ModVariables.WorldVariables.get(world).energie_dispo - 5;
			Abyssium2ModVariables.WorldVariables.get(world).syncData(world);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Abyssium2ModBlocks.PANNEAUSOLAIRMOYEN_2
				|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Abyssium2ModBlocks.PANNEAUSOLAIRMOYEN_2
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Abyssium2ModBlocks.PANNEAUSOLAIRMOYEN_2
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Abyssium2ModBlocks.PANNEAUSOLAIRMOYEN_2) {
			Abyssium2ModVariables.WorldVariables.get(world).energie_dispo = Abyssium2ModVariables.WorldVariables.get(world).energie_dispo + 10;
			Abyssium2ModVariables.WorldVariables.get(world).syncData(world);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Abyssium2ModBlocks.PANNEAUSOLAIRMOYEN
				|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Abyssium2ModBlocks.PANNEAUSOLAIRMOYEN
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Abyssium2ModBlocks.PANNEAUSOLAIRMOYEN
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Abyssium2ModBlocks.PANNEAUSOLAIRMOYEN) {
			Abyssium2ModVariables.WorldVariables.get(world).energie_dispo = Abyssium2ModVariables.WorldVariables.get(world).energie_dispo - 10;
			Abyssium2ModVariables.WorldVariables.get(world).syncData(world);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Abyssium2ModBlocks.GRANDPANNEAUSOLAIR_2
				|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Abyssium2ModBlocks.GRANDPANNEAUSOLAIR_2
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Abyssium2ModBlocks.GRANDPANNEAUSOLAIR_2
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Abyssium2ModBlocks.GRANDPANNEAUSOLAIR_2) {
			Abyssium2ModVariables.WorldVariables.get(world).energie_dispo = Abyssium2ModVariables.WorldVariables.get(world).energie_dispo + 15;
			Abyssium2ModVariables.WorldVariables.get(world).syncData(world);
		}
		if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Abyssium2ModBlocks.GRANDPANNEAUSOLAIR
				|| (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Abyssium2ModBlocks.GRANDPANNEAUSOLAIR
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Abyssium2ModBlocks.GRANDPANNEAUSOLAIR
				|| (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Abyssium2ModBlocks.GRANDPANNEAUSOLAIR) {
			Abyssium2ModVariables.WorldVariables.get(world).energie_dispo = Abyssium2ModVariables.WorldVariables.get(world).energie_dispo - 15;
			Abyssium2ModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
