
package net.mcreator.abyssium.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.abyssium.world.inventory.GuicuisiniereMenu;
import net.mcreator.abyssium.procedures.Cuisiniere2Procedure;
import net.mcreator.abyssium.procedures.Cuisiniere21Procedure;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GuicuisiniereScreen extends AbstractContainerScreen<GuicuisiniereMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GuicuisiniereScreen(GuicuisiniereMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 220;
		this.imageHeight = 230;
	}

	private static final ResourceLocation texture = new ResourceLocation("abyssium2:textures/guicuisiniere.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/poele.png"));
		this.blit(ms, this.leftPos + 10, this.topPos + 57, 0, 0, 25, 25, 25, 25);

		if (Cuisiniere2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/flame.png"));
			this.blit(ms, this.leftPos + 154, this.topPos + 55, 0, 0, 20, 20, 20, 20);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fleche2.png"));
		this.blit(ms, this.leftPos + 185, this.topPos + 42, 0, 0, 10, 10, 10, 10);

		if (Cuisiniere21Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/flamme_off.png"));
			this.blit(ms, this.leftPos + 154, this.topPos + 55, 0, 0, 20, 20, 20, 20);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "po\u00EBle", 78, 4, -10066330);
		this.font.draw(poseStack, "plat", 177, 17, -3407872);
		this.font.draw(poseStack, "cuisin\u00E9", 171, 29, -6750208);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
