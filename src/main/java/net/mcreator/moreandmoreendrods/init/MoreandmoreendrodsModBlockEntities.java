/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreandmoreendrods.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.moreandmoreendrods.block.entity.DispenserEndRodBlockEntity;
import net.mcreator.moreandmoreendrods.MoreandmoreendrodsMod;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class MoreandmoreendrodsModBlockEntities {
	public static BlockEntityType<DispenserEndRodBlockEntity> DISPENSER_END_ROD;

	public static void load() {
		DISPENSER_END_ROD = register("dispenser_end_rod", MoreandmoreendrodsModBlocks.DISPENSER_END_ROD, DispenserEndRodBlockEntity::new);
	}

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> BlockEntityType<T> register(String registryname, Block block, FabricBlockEntityTypeBuilder.Factory<? extends T> supplier) {
		return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(MoreandmoreendrodsMod.MODID, registryname), FabricBlockEntityTypeBuilder.<T>create(supplier, block).build());
	}
}