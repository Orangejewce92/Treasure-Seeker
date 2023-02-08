
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.treasureseeker.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.treasureseeker.block.OreReverseStationBlock;
import net.mcreator.treasureseeker.TreasureSeekerMod;

public class TreasureSeekerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TreasureSeekerMod.MODID);
	public static final RegistryObject<Block> TREASURE_STATION = REGISTRY.register("treasure_station", () -> new OreReverseStationBlock());
}
