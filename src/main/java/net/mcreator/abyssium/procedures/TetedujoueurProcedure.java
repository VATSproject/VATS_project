package net.mcreator.abyssium.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.abyssium.network.Abyssium2ModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TetedujoueurProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double speed = 0;
		double Yaw = 0;
		if (entity.isPassenger()) {
			speed = 0.2;
			Yaw = entity.getYRot();
			if (entity.getXRot() < -67.5 && entity.getXRot() > -90) {
				Abyssium2ModVariables.velocite_y = 1;
			} else if (entity.getXRot() < -45 && entity.getXRot() > -67.5) {
				speed = 0.6;
			} else if (entity.getXRot() < -22.5 && entity.getXRot() > -45) {
				Abyssium2ModVariables.velocite_y = 0.25;
			} else if (entity.getXRot() > -22.5 && entity.getXRot() < 22.5) {
				Abyssium2ModVariables.velocite_y = 0;
			} else if (entity.getXRot() > 22.5 && entity.getXRot() < 45) {
				Abyssium2ModVariables.velocite_y = -0.1;
			} else if (entity.getXRot() > 45 && entity.getXRot() < 67.5) {
				Abyssium2ModVariables.velocite_y = -0.25;
			} else if (entity.getXRot() > 67.5 && entity.getXRot() < 90) {
				Abyssium2ModVariables.velocite_y = -0.5;
			}
		}
	}
}
