package net.mcreator.abyssium.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.abyssium.entity.CachalotEntity;
import net.mcreator.abyssium.client.model.Modelcachalot;

public class CachalotRenderer extends MobRenderer<CachalotEntity, Modelcachalot<CachalotEntity>> {
	public CachalotRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcachalot(context.bakeLayer(Modelcachalot.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CachalotEntity entity) {
		return new ResourceLocation("abyssium2:textures/baleine.png");
	}
}
