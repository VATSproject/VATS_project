package net.mcreator.abyssium.procedures;

import net.minecraft.world.entity.Entity;

public class SousmarinQuandLeJoueurFaitUnClicDroitSurLentiteProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		entity.startRiding(sourceentity);
	}
}
