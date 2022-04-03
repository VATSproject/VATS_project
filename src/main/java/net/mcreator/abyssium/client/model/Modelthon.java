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
public class Modelthon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("abyssium2", "modelthon"), "main");
	public final ModelPart body_front;
	public final ModelPart body_back;
	public final ModelPart dorsal_front;
	public final ModelPart dorsal_back;
	public final ModelPart tailfin;
	public final ModelPart head;
	public final ModelPart leftFin;
	public final ModelPart rightFin;

	public Modelthon(ModelPart root) {
		this.body_front = root.getChild("body_front");
		this.body_back = root.getChild("body_back");
		this.dorsal_front = root.getChild("dorsal_front");
		this.dorsal_back = root.getChild("dorsal_back");
		this.tailfin = root.getChild("tailfin");
		this.head = root.getChild("head");
		this.leftFin = root.getChild("leftFin");
		this.rightFin = root.getChild("rightFin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body_front = partdefinition.addOrReplaceChild("body_front",
				CubeListBuilder.create().texOffs(0, 14).addBox(-1.5F, -8.5F, 0.0F, 3.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -4.0F));
		PartDefinition body_back = partdefinition.addOrReplaceChild("body_back",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -8.5F, 0.0F, 3.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 4.0F));
		PartDefinition dorsal_front = partdefinition
				.addOrReplaceChild(
						"dorsal_front", CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, -5.5F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
								.texOffs(0, 2).addBox(0.0F, 2.5F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 19.0F, 2.0F));
		PartDefinition dorsal_back = partdefinition
				.addOrReplaceChild(
						"dorsal_back", CubeListBuilder.create().texOffs(4, 5).addBox(0.0F, -4.5F, -4.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
								.texOffs(4, 2).addBox(0.0F, 2.5F, -4.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 19.0F, 4.0F));
		PartDefinition dorsal_back_r1 = dorsal_back.addOrReplaceChild("dorsal_back_r1",
				CubeListBuilder.create().texOffs(4, 3).addBox(0.0F, -5.5F, 5.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -4.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition dorsal_back_r2 = dorsal_back.addOrReplaceChild("dorsal_back_r2",
				CubeListBuilder.create().texOffs(4, 4).addBox(0.0F, -7.5F, 8.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -4.0F, 0.2182F, 0.0F, 0.0F));
		PartDefinition tailfin = partdefinition.addOrReplaceChild("tailfin",
				CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -7.5F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 12.0F));
		PartDefinition tailfin_r1 = tailfin.addOrReplaceChild("tailfin_r1",
				CubeListBuilder.create().texOffs(14, 9).addBox(0.0F, -13.5F, 4.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -12.0F, -0.829F, 0.0F, 0.0F));
		PartDefinition tailfin_r2 = tailfin.addOrReplaceChild("tailfin_r2",
				CubeListBuilder.create().texOffs(14, 10).addBox(0.0F, 5.5F, 12.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -12.0F, 0.8727F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(14, 0).addBox(-1.0F, -5.5F, -3.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 21.0F, -4.0F));
		PartDefinition leftFin = partdefinition.addOrReplaceChild("leftFin", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.5F, 23.0F, -4.0F, 0.0F, 0.0F, 0.6109F));
		PartDefinition leftFin_r1 = leftFin.addOrReplaceChild("leftFin_r1",
				CubeListBuilder.create().texOffs(0, 2).addBox(1.51F, -6.87F, -2.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 1.0F, 4.0F, -0.0154F, 0.0424F, -0.6093F));
		PartDefinition rightFin = partdefinition.addOrReplaceChild("rightFin", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.5F, 23.0F, -4.0F, 0.0F, 0.0F, -0.6109F));
		PartDefinition rightFin_r1 = rightFin.addOrReplaceChild("rightFin_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.51F, -6.87F, -2.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 1.0F, 4.0F, 0.0F, 0.0F, 0.6109F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		body_front.render(poseStack, buffer, packedLight, packedOverlay);
		body_back.render(poseStack, buffer, packedLight, packedOverlay);
		dorsal_front.render(poseStack, buffer, packedLight, packedOverlay);
		dorsal_back.render(poseStack, buffer, packedLight, packedOverlay);
		tailfin.render(poseStack, buffer, packedLight, packedOverlay);
		head.render(poseStack, buffer, packedLight, packedOverlay);
		leftFin.render(poseStack, buffer, packedLight, packedOverlay);
		rightFin.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.tailfin.yRot = netHeadYaw / (180F / (float) Math.PI);
	}
}
