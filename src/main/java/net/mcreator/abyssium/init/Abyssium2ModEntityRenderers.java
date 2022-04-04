
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.abyssium.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.abyssium.client.renderer.ThonRenderer;
import net.mcreator.abyssium.client.renderer.SousmarinRenderer;
import net.mcreator.abyssium.client.renderer.CrevetteentiteRenderer;
import net.mcreator.abyssium.client.renderer.CachalotRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Abyssium2ModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(Abyssium2ModEntities.SOUSMARIN, SousmarinRenderer::new);
		event.registerEntityRenderer(Abyssium2ModEntities.THON, ThonRenderer::new);
		event.registerEntityRenderer(Abyssium2ModEntities.CREVETTEENTITE, CrevetteentiteRenderer::new);
		event.registerEntityRenderer(Abyssium2ModEntities.CACHALOT, CachalotRenderer::new);
		event.registerEntityRenderer(Abyssium2ModEntities.HARPON, ThrownItemRenderer::new);
	}
}
