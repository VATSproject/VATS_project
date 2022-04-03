package net.mcreator.abyssium.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcachalot<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("abyssium2", "modelcachalot"), "main");
	public final ModelPart corp;
	public final ModelPart aileron_droit;
	public final ModelPart queue;
	public final ModelPart aileron_gauche;
	public final ModelPart tete;

	public Modelcachalot(ModelPart root) {
		this.corp = root.getChild("corp");
		this.aileron_droit = root.getChild("aileron_droit");
		this.queue = root.getChild("queue");
		this.aileron_gauche = root.getChild("aileron_gauche");
		this.tete = root.getChild("tete");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition corp = partdefinition.addOrReplaceChild(
				"corp", CubeListBuilder.create().texOffs(0, 56).addBox(2.25F, -16.0F, -12.0F, 45.0F, 32.0F, 24.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(-51.75F, -16.0F, -12.0F, 54.0F, 32.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.25F, 8.0F, 0.0F));
		PartDefinition aileron_droit = partdefinition.addOrReplaceChild("aileron_droit",
				CubeListBuilder.create().texOffs(0, 10).addBox(6.1825F, -0.5F, -8.6666F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(156, 14)
						.addBox(-4.8175F, -0.5F, -9.6666F, 12.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.8175F, 18.5F, -12.3334F));
		PartDefinition cube_r1 = aileron_droit.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 61).addBox(-4.0F, -0.5F, -13.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(88, 123)
						.addBox(-5.0F, -0.5F, -9.0F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(138, 96).addBox(-6.0F, -0.5F, -6.0F, 12.0F,
								1.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8175F, 0.0F, -14.6666F, 0.0F, 0.3054F, 0.0F));
		PartDefinition queue = partdefinition.addOrReplaceChild("queue",
				CubeListBuilder.create().texOffs(112, 112).addBox(-29.25F, -13.75F, -9.5833F, 29.0F, 28.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-54.75F, 7.75F, -0.4167F));
		PartDefinition cube_r2 = queue.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(145, 160).addBox(-11.0F, -26.7F, -2.5F, 13.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 161)
						.addBox(-11.0F, 20.3F, -2.5F, 13.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(36, 161)
						.addBox(-6.0F, 14.3F, -2.5F, 13.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(107, 160)
						.addBox(-7.0F, -20.7F, -2.5F, 14.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(138, 63)
						.addBox(0.0F, -13.7F, -2.5F, 17.0F, 28.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-46.25F, -0.05F, -0.0833F, 1.5708F, 0.0F, 0.0F));
		PartDefinition aileron_gauche = partdefinition.addOrReplaceChild("aileron_gauche",
				CubeListBuilder.create().texOffs(0, 0).addBox(6.1825F, -0.5F, 5.3334F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(88, 112)
						.addBox(-4.8175F, -0.5F, 4.3334F, 12.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.8175F, 18.5F, 25.6666F, 3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r3 = aileron_gauche.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 56).addBox(-4.0F, -0.5F, -13.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(114, 63)
						.addBox(-5.0F, -0.5F, -9.0F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(132, 0).addBox(-6.0F, -0.5F, -6.0F, 12.0F,
								1.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8175F, 0.0F, -0.6666F, 0.0F, 0.3054F, 0.0F));
		PartDefinition tete = partdefinition.addOrReplaceChild("tete",
				CubeListBuilder.create().texOffs(0, 112).addBox(0.0F, -20.999F, -12.0F, 32.0F, 25.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offset(44.0F, 12.999F, 0.0F));
		PartDefinition cube_r4 = tete.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(132, 32).addBox(-16.0F, -3.0F, -12.0F, 32.0F, 7.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0F, 8.001F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition dents = tete.addOrReplaceChild("dents",
				CubeListBuilder.create().texOffs(3, 175).addBox(74.0F, -6.0F, 7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(74.0F, -6.0F, 9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(74.0F, -6.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(74.0F, -6.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(74.0F, -6.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(74.0F, -6.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(74.0F, -6.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(74.0F, -6.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(74.0F, -6.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(74.0F, -6.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(74.0F, -6.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-44.0F, 11.001F, 0.0F));
		PartDefinition cube_r5 = dents.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(3, 175).addBox(-0.5F, -2.0F, -22.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(-0.5F, -2.0F, -20.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(-0.5F, -2.0F, -18.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(-0.5F, -2.0F, -16.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(-0.5F, -2.0F, -14.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(-0.5F, -2.0F, -12.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(-0.5F, -2.0F, -10.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(-0.5F, -2.0F, -8.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(-0.5F, -2.0F, -6.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(-0.5F, -2.0F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175)
						.addBox(-0.5F, -2.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 175).addBox(-0.5F, -2.0F, -0.5F, 1.0F,
								2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(74.5F, -6.0F, 10.5F, 0.0F, 0.0F, -0.0436F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		corp.render(poseStack, buffer, packedLight, packedOverlay);
		aileron_droit.render(poseStack, buffer, packedLight, packedOverlay);
		queue.render(poseStack, buffer, packedLight, packedOverlay);
		aileron_gauche.render(poseStack, buffer, packedLight, packedOverlay);
		tete.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.aileron_gauche.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.tete.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.tete.xRot = headPitch / (180F / (float) Math.PI);
		this.aileron_droit.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.queue.zRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
