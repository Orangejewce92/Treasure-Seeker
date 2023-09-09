
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.treasureseeker.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.treasureseeker.TreasureSeekerMod;

public class TreasureSeekerModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TreasureSeekerMod.MODID);
	public static final RegistryObject<CreativeModeTab> TREASURE_SEEKER = REGISTRY.register("treasure_seeker",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.treasure_seeker.treasure_seeker")).icon(() -> new ItemStack(TreasureSeekerModItems.TREASURE_PICK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TreasureSeekerModItems.TREASURE_PICK.get());
				tabData.accept(TreasureSeekerModBlocks.TREASURE_STATION.get().asItem());
				tabData.accept(TreasureSeekerModItems.TREASURE_SEEKER_HELMET.get());
				tabData.accept(TreasureSeekerModItems.TREASURE_SEEKER_CHESTPLATE.get());
				tabData.accept(TreasureSeekerModItems.TREASURE_SEEKER_LEGGINGS.get());
				tabData.accept(TreasureSeekerModItems.TREASURE_SEEKER_BOOTS.get());
			})

					.build());
}
