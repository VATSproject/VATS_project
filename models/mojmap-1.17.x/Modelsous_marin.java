// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsous_marin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "sous_marin"), "main");
	private final ModelPart sous_marin;
	private final ModelPart helice;

	public Modelsous_marin(ModelPart root) {
		this.sous_marin = root.getChild("sous_marin");
		this.helice = root.getChild("helice");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition sous_marin = partdefinition.addOrReplaceChild("sous_marin",
				CubeListBuilder.create().texOffs(0, 34)
						.addBox(-22.0F, -1.0F, 0.0F, 22.0F, 1.0F, 33.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-22.0F, -30.0F, 0.0F, 22.0F, 1.0F, 33.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-16.0F, -8.0F, 13.0F, 9.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(68, 68)
						.addBox(-1.0F, -29.0F, 0.0F, 1.0F, 28.0F, 33.0F, new CubeDeformation(0.0F)).texOffs(0, 68)
						.addBox(-22.0F, -29.0F, 0.0F, 1.0F, 28.0F, 33.0F, new CubeDeformation(0.0F)).texOffs(103, 94)
						.addBox(-21.0F, -6.0F, -1.0F, 20.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 29)
						.addBox(-20.0F, -29.0F, -1.0F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 34)
						.addBox(-21.0F, -29.0F, -1.0F, 1.0F, 23.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 34)
						.addBox(-2.0F, -29.0F, -1.0F, 1.0F, 23.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(103, 68)
						.addBox(-20.0F, -28.0F, -5.0F, 18.0F, 22.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(77, 34)
						.addBox(-21.0F, -29.0F, 32.0F, 20.0F, 28.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 68)
						.addBox(-19.0F, -27.0F, 33.0F, 16.0F, 24.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(77, 0)
						.addBox(-17.0F, -25.0F, 40.0F, 12.0F, 20.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-15.0F, -7.0F, 49.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(13, 28)
						.addBox(-14.0F, -7.0F, 52.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(13, 13)
						.addBox(-15.0F, -24.0F, 49.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-14.0F, -24.0F, 52.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-12.0F, -24.0F, 55.0F, 1.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 17)
						.addBox(-13.0F, -38.0F, 11.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-13.0F, -41.0F, 7.0F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(26, 35)
						.addBox(-10.0F, -42.0F, 6.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-14.0F, -42.0F, 6.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 34)
						.addBox(-13.0F, -38.0F, 6.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 17)
						.addBox(-13.0F, -42.0F, 6.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 129)
						.addBox(0.0F, -23.0F, 19.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 129)
						.addBox(0.0F, -23.0F, 10.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 129)
						.addBox(0.0F, -14.0F, 11.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 129)
						.addBox(0.0F, -23.0F, 11.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 129)
						.addBox(-23.0F, -23.0F, 19.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 129)
						.addBox(-23.0F, -14.0F, 11.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 129)
						.addBox(-23.0F, -23.0F, 10.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 129)
						.addBox(-23.0F, -23.0F, 11.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 132)
						.addBox(-22.0F, -30.0F, 0.0F, 22.0F, 30.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offset(11.0F, 24.0F, -11.0F));

		PartDefinition cube_r1 = sous_marin.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(129, 22).addBox(-3.5F, -2.0F, -1.0F, 7.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5F, -12.0F, 8.0F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r2 = sous_marin.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(135, 2).addBox(-0.5F, -13.0F, -1.0F, 1.0F, 13.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5F, -1.0F, 0.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition helice = partdefinition.addOrReplaceChild("helice",
				CubeListBuilder.create().texOffs(24, 0)
						.addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(17, 57)
						.addBox(-3.5F, -0.5F, 3.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 37)
						.addBox(-0.5F, -3.5F, 3.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 9.5F, 38.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		sous_marin.render(poseStack, buffer, packedLight, packedOverlay);
		helice.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.helice.zRot = ageInTicks;
	}
}