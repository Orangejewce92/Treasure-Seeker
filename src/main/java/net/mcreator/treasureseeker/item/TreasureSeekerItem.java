
package net.mcreator.treasureseeker.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.treasureseeker.init.TreasureSeekerModTabs;

public abstract class TreasureSeekerItem extends ArmorItem {
	public TreasureSeekerItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 5, 6, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_chain"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "treasure_seeker";
			}

			@Override
			public float getToughness() {
				return 1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends TreasureSeekerItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(TreasureSeekerModTabs.TAB_TREASURE_SEEKER));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "treasure_seeker:textures/models/armor/gold__layer_1.png";
		}
	}

	public static class Chestplate extends TreasureSeekerItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(TreasureSeekerModTabs.TAB_TREASURE_SEEKER));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "treasure_seeker:textures/models/armor/gold__layer_1.png";
		}
	}

	public static class Leggings extends TreasureSeekerItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(TreasureSeekerModTabs.TAB_TREASURE_SEEKER));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "treasure_seeker:textures/models/armor/gold__layer_2.png";
		}
	}

	public static class Boots extends TreasureSeekerItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(TreasureSeekerModTabs.TAB_TREASURE_SEEKER));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "treasure_seeker:textures/models/armor/gold__layer_1.png";
		}
	}
}
