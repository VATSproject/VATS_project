
package net.mcreator.abyssium.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.abyssium.world.inventory.TablehuitreguiMenu;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TablehuitreguiScreen extends AbstractContainerScreen<TablehuitreguiMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public TablehuitreguiScreen(TablehuitreguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 199;
	}

	private static final ResourceLocation texture = new ResourceLocation("abyssium2:textures/tablehuitregui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 24, this.topPos + 41, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 41, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 23, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 24, this.topPos + 59, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 42, this.topPos + 59, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 59, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 59, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 59, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 105, this.topPos + 59, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 105, this.topPos + 77, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 87, this.topPos + 77, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 77, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 42, this.topPos + 77, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 59, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 77, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 123, this.topPos + 59, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 141, this.topPos + 59, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 150, this.topPos + 59, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 123, this.topPos + 41, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 141, this.topPos + 41, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 150, this.topPos + 41, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 105, this.topPos + 41, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 87, this.topPos + 41, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 69, this.topPos + 41, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 51, this.topPos + 41, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 33, this.topPos + 41, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 42, this.topPos + 23, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 5, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 24, this.topPos + 5, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 42, this.topPos + 5, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 5, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 5, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 23, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 5, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 23, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 105, this.topPos + 23, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 105, this.topPos + 5, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 123, this.topPos + 5, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 141, this.topPos + 5, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui.png"));
		this.blit(ms, this.leftPos + 150, this.topPos + 5, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui2.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 95, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui2.png"));
		this.blit(ms, this.leftPos + 24, this.topPos + 95, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui2.png"));
		this.blit(ms, this.leftPos + 42, this.topPos + 95, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui2.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 95, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui2.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 95, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui2.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 95, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui2.png"));
		this.blit(ms, this.leftPos + 114, this.topPos + 95, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui2.png"));
		this.blit(ms, this.leftPos + 132, this.topPos + 95, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui2.png"));
		this.blit(ms, this.leftPos + 150, this.topPos + 95, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui3.png"));
		this.blit(ms, this.leftPos + -11, this.topPos + 23, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui3.png"));
		this.blit(ms, this.leftPos + -11, this.topPos + 5, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui3.png"));
		this.blit(ms, this.leftPos + -11, this.topPos + 41, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui3.png"));
		this.blit(ms, this.leftPos + -11, this.topPos + 59, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui3.png"));
		this.blit(ms, this.leftPos + -11, this.topPos + 77, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui3.png"));
		this.blit(ms, this.leftPos + -11, this.topPos + 95, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui3.png"));
		this.blit(ms, this.leftPos + -11, this.topPos + 113, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui3.png"));
		this.blit(ms, this.leftPos + -11, this.topPos + 131, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui3.png"));
		this.blit(ms, this.leftPos + -11, this.topPos + 149, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui3.png"));
		this.blit(ms, this.leftPos + -11, this.topPos + 167, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui3.png"));
		this.blit(ms, this.leftPos + -11, this.topPos + 176, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui4.png"));
		this.blit(ms, this.leftPos + 159, this.topPos + 23, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui4.png"));
		this.blit(ms, this.leftPos + 159, this.topPos + 41, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui4.png"));
		this.blit(ms, this.leftPos + 159, this.topPos + 59, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui4.png"));
		this.blit(ms, this.leftPos + 159, this.topPos + 77, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui41.png"));
		this.blit(ms, this.leftPos + 159, this.topPos + 95, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui4.png"));
		this.blit(ms, this.leftPos + 159, this.topPos + 5, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui21.png"));
		this.blit(ms, this.leftPos + 168, this.topPos + 113, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui21.png"));
		this.blit(ms, this.leftPos + 168, this.topPos + 131, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui21.png"));
		this.blit(ms, this.leftPos + 168, this.topPos + 149, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui21.png"));
		this.blit(ms, this.leftPos + 168, this.topPos + 167, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui21.png"));
		this.blit(ms, this.leftPos + 168, this.topPos + 176, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui5.png"));
		this.blit(ms, this.leftPos + 6, this.topPos + 187, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui5.png"));
		this.blit(ms, this.leftPos + 24, this.topPos + 187, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui5.png"));
		this.blit(ms, this.leftPos + 42, this.topPos + 187, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui5.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 187, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui5.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 187, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui5.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 187, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui5.png"));
		this.blit(ms, this.leftPos + 114, this.topPos + 187, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui5.png"));
		this.blit(ms, this.leftPos + 132, this.topPos + 187, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fondgui5.png"));
		this.blit(ms, this.leftPos + 150, this.topPos + 187, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fleche.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 23, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/fleche.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 77, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/alguegui.png"));
		this.blit(ms, this.leftPos + -2, this.topPos + 50, 0, 0, 64, 64, 64, 64);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/huitregui.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + -9, 0, 0, 64, 64, 64, 64);

		RenderSystem.setShaderTexture(0, new ResourceLocation("abyssium2:textures/couteaugui.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + -14, 0, 0, 64, 64, 64, 64);

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
		this.font.draw(poseStack, "Desalgueur", 24, 5, -8508928);
		this.font.draw(poseStack, "Ouvreur", 42, 59, -8508928);
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
