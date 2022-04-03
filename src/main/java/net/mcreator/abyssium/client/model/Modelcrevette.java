package net.mcreator.abyssium.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcrevette<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("abyssium2", "modelcrevette"), "main");
	public final ModelPart crevette_corps;
	public final ModelPart crevette_queue;

	public Modelcrevette(ModelPart root) {
		this.crevette_corps = root.getChild("crevette_corps");
		this.crevette_queue = root.getChild("crevette_queue");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition crevette_corps = partdefinition.addOrReplaceChild("crevette_corps",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -7.0F, -4.0F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(9, 3)
						.addBox(1.0F, -4.0F, -4.0F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-2.0F, -4.0F, -4.0F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-2.0F, -7.0F, -7.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 15)
						.addBox(1.0F, -5.0F, -6.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 15)
						.addBox(-2.0F, -5.0F, -6.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-2.0F, -6.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -6.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition crevette_queue = partdefinition.addOrReplaceChild("crevette_queue",
				CubeListBuilder.create().texOffs(16, 1).addBox(-1.5F, -1.625F, -0.125F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-1.5F, -1.625F, 1.875F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 12)
						.addBox(-1.5F, -1.625F, 3.875F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 0)
						.addBox(-1.5F, 0.375F, 5.875F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 18.625F, 1.125F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		crevette_corps.render(poseStack, buffer, packedLight, packedOverlay);
		crevette_queue.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.crevette_queue.yRot = netHeadYaw / (180F / (float) Math.PI);
	}
}
