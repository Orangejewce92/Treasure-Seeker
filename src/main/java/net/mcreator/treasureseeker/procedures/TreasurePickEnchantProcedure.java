package net.mcreator.treasureseeker.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class TreasurePickEnchantProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("TreasurePickEnchanted") == false) {
			itemstack.getOrCreateTag().putBoolean("TreasurePickEnchanted", (true));
			(itemstack).enchant(Enchantments.SILK_TOUCH, 1);
		}
	}
}
