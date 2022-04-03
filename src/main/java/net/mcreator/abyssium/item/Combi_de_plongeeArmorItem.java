
package net.mcreator.abyssium.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.client.IItemRenderProperties;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.mcreator.abyssium.procedures.CombideplongeeArmorEvenementDeTickDuCasqueProcedure;
import net.mcreator.abyssium.procedures.CombideplongeeArmorEvenementDeTickDesBottesProcedure;
import net.mcreator.abyssium.init.Abyssium2ModTabs;
import net.mcreator.abyssium.init.Abyssium2ModItems;
import net.mcreator.abyssium.client.model.Modelcustom_model2;
import net.mcreator.abyssium.client.model.Modelcustom_model1;
import net.mcreator.abyssium.client.model.Modelcustom_model;

import java.util.Map;
import java.util.Collections;

public abstract class Combi_de_plongeeArmorItem extends ArmorItem {
	public Combi_de_plongeeArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 6, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Abyssium2ModItems.BOUTEILLED_O_2));
			}

			@Override
			public String getName() {
				return "combi_de_plongee_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends Combi_de_plongeeArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(Abyssium2ModTabs.TAB_ABYSIUM));
			setRegistryName("combi_de_plongee_armor_helmet");
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("head",
									new Modelcustom_model(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcustom_model.LAYER_LOCATION)).head,
									"hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "abyssium2:textures/masque.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			CombideplongeeArmorEvenementDeTickDuCasqueProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

	public static class Chestplate extends Combi_de_plongeeArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(Abyssium2ModTabs.TAB_ABYSIUM));
			setRegistryName("combi_de_plongee_armor_chestplate");
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("body",
							new Modelcustom_model1(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcustom_model1.LAYER_LOCATION)).plastron,
							"left_arm",
							new Modelcustom_model1(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcustom_model1.LAYER_LOCATION)).bb_main,
							"right_arm",
							new Modelcustom_model1(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcustom_model1.LAYER_LOCATION)).bb_main,
							"head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "abyssium2:textures/bouteille1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			CombideplongeeArmorEvenementDeTickDuCasqueProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

	public static class Boots extends Combi_de_plongeeArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(Abyssium2ModTabs.TAB_ABYSIUM));
			setRegistryName("combi_de_plongee_armor_boots");
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("left_leg",
							new Modelcustom_model2(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcustom_model2.LAYER_LOCATION)).RightBoot,
							"right_leg",
							new Modelcustom_model2(Minecraft.getInstance().getEntityModels().bakeLayer(Modelcustom_model2.LAYER_LOCATION)).RightBoot,
							"head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "abyssium2:textures/palme.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			CombideplongeeArmorEvenementDeTickDesBottesProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}
}
