package net.mcreator.abyssium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.abyssium.entity.SousmarinEntity;
import net.mcreator.abyssium.client.model.Modelsous_marin;

public class SousmarinRenderer extends MobRenderer<SousmarinEntity, Modelsous_marin<SousmarinEntity>> {
	public SousmarinRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsous_marin(context.bakeLayer(Modelsous_marin.LAYER_LOCATION)), 2.0625f);
	}

	@Override
	public ResourceLocation getTextureLocation(SousmarinEntity entity) {
		return new ResourceLocation("abyssium2:textures/sous_marin2.png");
	}
}
