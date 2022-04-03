
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.abyssium.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.abyssium.client.model.Modelthon;
import net.mcreator.abyssium.client.model.Modelsous_marin;
import net.mcreator.abyssium.client.model.Modelcustom_model2;
import net.mcreator.abyssium.client.model.Modelcustom_model1;
import net.mcreator.abyssium.client.model.Modelcustom_model;
import net.mcreator.abyssium.client.model.Modelcrevette;
import net.mcreator.abyssium.client.model.Modelcachalot;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class Abyssium2ModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcustom_model1.LAYER_LOCATION, Modelcustom_model1::createBodyLayer);
		event.registerLayerDefinition(Modelsous_marin.LAYER_LOCATION, Modelsous_marin::createBodyLayer);
		event.registerLayerDefinition(Modelcrevette.LAYER_LOCATION, Modelcrevette::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model2.LAYER_LOCATION, Modelcustom_model2::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelthon.LAYER_LOCATION, Modelthon::createBodyLayer);
		event.registerLayerDefinition(Modelcachalot.LAYER_LOCATION, Modelcachalot::createBodyLayer);
	}
}
