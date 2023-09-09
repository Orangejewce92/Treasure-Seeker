
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.treasureseeker.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TreasureSeekerModTabs {
	public static CreativeModeTab TAB_TREASURE_SEEKER;

	public static void load() {
		TAB_TREASURE_SEEKER = new CreativeModeTab("tabtreasure_seeker") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TreasureSeekerModItems.TREASURE_PICK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
