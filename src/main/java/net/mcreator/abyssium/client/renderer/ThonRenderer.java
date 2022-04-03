package net.mcreator.abyssium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.abyssium.entity.ThonEntity;
import net.mcreator.abyssium.client.model.Modelthon;

public class ThonRenderer extends MobRenderer<ThonEntity, Modelthon<ThonEntity>> {
	public ThonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelthon(context.bakeLayer(Modelthon.LAYER_LOCATION)), 1.25f);
	}

	@Override
	public ResourceLocation getTextureLocation(ThonEntity entity) {
		return new ResourceLocation("abyssium2:textures/thon.png");
	}
}
