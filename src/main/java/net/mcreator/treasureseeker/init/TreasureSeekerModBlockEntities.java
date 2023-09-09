
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.treasureseeker.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.treasureseeker.block.entity.OreReverseStationBlockEntity;
import net.mcreator.treasureseeker.TreasureSeekerMod;

public class TreasureSeekerModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TreasureSeekerMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TREASURE_STATION = register("treasure_station", TreasureSeekerModBlocks.TREASURE_STATION, OreReverseStationBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
