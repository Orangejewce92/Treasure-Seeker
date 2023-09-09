
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.treasureseeker.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.treasureseeker.world.inventory.TreasureChangerMenu;
import net.mcreator.treasureseeker.TreasureSeekerMod;

public class TreasureSeekerModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TreasureSeekerMod.MODID);
	public static final RegistryObject<MenuType<TreasureChangerMenu>> TREASURE_CHANGER = REGISTRY.register("treasure_changer", () -> IForgeMenuType.create(TreasureChangerMenu::new));
}
