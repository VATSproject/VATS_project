package net.mcreator.abyssium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.abyssium.entity.CrevetteentiteEntity;
import net.mcreator.abyssium.client.model.Modelcrevette;

public class CrevetteentiteRenderer extends MobRenderer<CrevetteentiteEntity, Modelcrevette<CrevetteentiteEntity>> {
	public CrevetteentiteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrevette(context.bakeLayer(Modelcrevette.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrevetteentiteEntity entity) {
		return new ResourceLocation("abyssium2:textures/crevette.png");
	}
}
