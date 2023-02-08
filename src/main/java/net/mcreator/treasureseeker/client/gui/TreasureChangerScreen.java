
package net.mcreator.treasureseeker.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.treasureseeker.world.inventory.TreasureChangerMenu;
import net.mcreator.treasureseeker.network.TreasureChangerButtonMessage;
import net.mcreator.treasureseeker.TreasureSeekerMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TreasureChangerScreen extends AbstractContainerScreen<TreasureChangerMenu> {
	private final static HashMap<String, Object> guistate = TreasureChangerMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public TreasureChangerScreen(TreasureChangerMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("treasure_seeker:textures/screens/treasure_changer.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("treasure_seeker:textures/screens/golden_pickaxe.png"));
		this.blit(ms, this.leftPos + 104, this.topPos + 46, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("treasure_seeker:textures/screens/plus.png"));
		this.blit(ms, this.leftPos + 51, this.topPos + 49, 0, 0, 8, 9, 8, 9);

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
		this.font.draw(poseStack, "Treasure Station", 11, 8, -39424);
		this.font.draw(poseStack, "Ore", 73, 35, -12829636);
		this.font.draw(poseStack, "Pickaxe", 16, 35, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 100, this.topPos + 10, 56, 20, new TextComponent("Mine!"), e -> {
			if (true) {
				TreasureSeekerMod.PACKET_HANDLER.sendToServer(new TreasureChangerButtonMessage(0, x, y, z));
				TreasureChangerButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
