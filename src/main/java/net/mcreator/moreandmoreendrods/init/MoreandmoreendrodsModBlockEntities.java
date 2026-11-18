/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreandmoreendrods.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.moreandmoreendrods.block.entity.DispenserEndRodBlockEntity;
import net.mcreator.moreandmoreendrods.MoreandmoreendrodsMod;

public class MoreandmoreendrodsModBlockEntities {
	public static final BlockEntityType<DispenserEndRodBlockEntity> DISPENSER_END_ROD = register("dispenser_end_rod", MoreandmoreendrodsModBlocks.DISPENSER_END_ROD, DispenserEndRodBlockEntity::new);

	/**
	 * Forces the initialization of this class, which performs the actual block entity type registration.
	 */
	public static void load() {
	}

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> BlockEntityType<T> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(MoreandmoreendrodsMod.MODID, registryname), BlockEntityType.Builder.of(supplier, block).build());
	}
}