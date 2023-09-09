
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.treasureseeker.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.treasureseeker.item.TreasureSeekerItem;
import net.mcreator.treasureseeker.item.TreasurePickItem;
import net.mcreator.treasureseeker.TreasureSeekerMod;

public class TreasureSeekerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TreasureSeekerMod.MODID);
	public static final RegistryObject<Item> TREASURE_PICK = REGISTRY.register("treasure_pick", () -> new TreasurePickItem());
	public static final RegistryObject<Item> TREASURE_STATION = block(TreasureSeekerModBlocks.TREASURE_STATION);
	public static final RegistryObject<Item> TREASURE_SEEKER_HELMET = REGISTRY.register("treasure_seeker_helmet", () -> new TreasureSeekerItem.Helmet());
	public static final RegistryObject<Item> TREASURE_SEEKER_CHESTPLATE = REGISTRY.register("treasure_seeker_chestplate", () -> new TreasureSeekerItem.Chestplate());
	public static final RegistryObject<Item> TREASURE_SEEKER_LEGGINGS = REGISTRY.register("treasure_seeker_leggings", () -> new TreasureSeekerItem.Leggings());
	public static final RegistryObject<Item> TREASURE_SEEKER_BOOTS = REGISTRY.register("treasure_seeker_boots", () -> new TreasureSeekerItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
