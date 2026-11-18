/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreandmoreendrods.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.moreandmoreendrods.block.*;
import net.mcreator.moreandmoreendrods.MoreandmoreendrodsMod;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

import java.util.function.Supplier;

public class MoreandmoreendrodsModBlocks {
	public static final Block OAK_END_ROD = register("oak_end_rod", OakEndRodBlock::new);
	public static final Block CHERRY_END_ROD = register("cherry_end_rod", CherryEndRodBlock::new);
	public static final Block BIRCH_END_ROD = register("birch_end_rod", BirchEndRodBlock::new);
	public static final Block SPRUCE_END_ROD = register("spruce_end_rod", SpruceEndRodBlock::new);
	public static final Block STONE_END_ROD = register("stone_end_rod", StoneEndRodBlock::new);
	public static final Block IRON_END_ROD = register("iron_end_rod", IronEndRodBlock::new);
	public static final Block COPPER_END_ROD = register("copper_end_rod", CopperEndRodBlock::new);
	public static final Block GLOWSTONE_END_ROD = register("glowstone_end_rod", GlowstoneEndRodBlock::new);
	public static final Block EMERALD_END_ROD = register("emerald_end_rod", EmeraldEndRodBlock::new);
	public static final Block DIAMOND_END_ROD = register("diamond_end_rod", DiamondEndRodBlock::new);
	public static final Block NETHERITE_END_ROD = register("netherite_end_rod", NetheriteEndRodBlock::new);
	public static final Block CRIMSON_END_ROD = register("crimson_end_rod", CrimsonEndRodBlock::new);
	public static final Block WARPED_END_ROD = register("warped_end_rod", WarpedEndRodBlock::new);
	public static final Block EXPOSED_COPPER_END_ROD = register("exposed_copper_end_rod", ExposedCopperEndRodBlock::new);
	public static final Block WEATHERED_COPPER_END_ROD = register("weathered_copper_end_rod", WeatheredCopperEndRodBlock::new);
	public static final Block OXIDIZED_COPPER_END_ROD = register("oxidized_copper_end_rod", OxidizedCopperEndRodBlock::new);
	public static final Block WAXED_COPPER_END_ROD = register("waxed_copper_end_rod", WaxedCopperEndRodBlock::new);
	public static final Block WAXED_EXPOSED_COPPER_END_ROD = register("waxed_exposed_copper_end_rod", WaxedExposedCopperEndRodBlock::new);
	public static final Block WAXED_WEATHERED_COPPER_END_ROD = register("waxed_weathered_copper_end_rod", WaxedWeatheredCopperEndRodBlock::new);
	public static final Block JUNGLE_END_ROD = register("jungle_end_rod", JungleEndRodBlock::new);
	public static final Block ACACIA_END_ROD = register("acacia_end_rod", AcaciaEndRodBlock::new);
	public static final Block DARK_OAK_END_ROD = register("dark_oak_end_rod", DarkOakEndRodBlock::new);
	public static final Block MANGROVE_END_ROD = register("mangrove_end_rod", MangroveEndRodBlock::new);
	public static final Block PRISMARINE_END_ROD = register("prismarine_end_rod", PrismarineEndRodBlock::new);
	public static final Block GOLDEN_END_ROD = register("golden_end_rod", GoldenEndRodBlock::new);
	public static final Block SHULKER_END_ROD = register("shulker_end_rod", ShulkerEndRodBlock::new);
	public static final Block PINK_END_ROD = register("pink_end_rod", PinkEndRodBlock::new);
	public static final Block BLUE_END_ROD = register("blue_end_rod", BlueEndRodBlock::new);
	public static final Block LIGHT_BLUE_END_ROD = register("light_blue_end_rod", LightBlueEndRodBlock::new);
	public static final Block PURPLE_END_ROD = register("purple_end_rod", PurpleEndRodBlock::new);
	public static final Block YELLOW_END_ROD = register("yellow_end_rod", YellowEndRodBlock::new);
	public static final Block GRAY_END_ROD = register("gray_end_rod", GrayEndRodBlock::new);
	public static final Block LIGHT_GRAY_END_ROD = register("light_gray_end_rod", LightGrayEndRodBlock::new);
	public static final Block BLACK_END_ROD = register("black_end_rod", BlackEndRodBlock::new);
	public static final Block ORANGE_END_ROD = register("orange_end_rod", OrangeEndRodBlock::new);
	public static final Block RED_END_ROD = register("red_end_rod", RedEndRodBlock::new);
	public static final Block CYAN_END_ROD = register("cyan_end_rod", CyanEndRodBlock::new);
	public static final Block GREEN_END_ROD = register("green_end_rod", GreenEndRodBlock::new);
	public static final Block LIME_END_ROD = register("lime_end_rod", LimeEndRodBlock::new);
	public static final Block AMETHYST_END_ROD = register("amethyst_end_rod", AmethystEndRodBlock::new);
	public static final Block BRICK_END_ROD = register("brick_end_rod", BrickEndRodBlock::new);
	public static final Block NETHER_BRICK_END_ROD = register("nether_brick_end_rod", NetherBrickEndRodBlock::new);
	public static final Block MAGENTA_END_ROD = register("magenta_end_rod", MagentaEndRodBlock::new);
	public static final Block STONE_BRICK_END_ROD = register("stone_brick_end_rod", StoneBrickEndRodBlock::new);
	public static final Block LONG_END_ROD = register("long_end_rod", LongEndRodBlock::new);
	public static final Block CACTUS_END_ROD = register("cactus_end_rod", CactusEndRodBlock::new);
	public static final Block GLASS_END_ROD = register("glass_end_rod", GlassEndRodBlock::new);
	public static final Block SLIME_END_ROD = register("slime_end_rod", SlimeEndRodBlock::new);
	public static final Block DISPENSER_END_ROD = register("dispenser_end_rod", DispenserEndRodBlock::new);

	/**
	* Forces the initialization of this class, which performs the actual block registration, and applies
	* the block based registry entries that have to be created after the registration itself.
	*/
	public static void load() {
		FlammableBlockRegistry.getDefaultInstance().add(MoreandmoreendrodsModBlocks.OAK_END_ROD, 15, 160);
		FlammableBlockRegistry.getDefaultInstance().add(MoreandmoreendrodsModBlocks.CHERRY_END_ROD, 15, 160);
		FlammableBlockRegistry.getDefaultInstance().add(MoreandmoreendrodsModBlocks.BIRCH_END_ROD, 15, 160);
		FlammableBlockRegistry.getDefaultInstance().add(MoreandmoreendrodsModBlocks.SPRUCE_END_ROD, 15, 160);
		FlammableBlockRegistry.getDefaultInstance().add(MoreandmoreendrodsModBlocks.STONE_END_ROD, 15, 160);
		StrippableBlockRegistry.register(MoreandmoreendrodsModBlocks.EXPOSED_COPPER_END_ROD, MoreandmoreendrodsModBlocks.COPPER_END_ROD);
		StrippableBlockRegistry.register(MoreandmoreendrodsModBlocks.WEATHERED_COPPER_END_ROD, MoreandmoreendrodsModBlocks.EXPOSED_COPPER_END_ROD);
		StrippableBlockRegistry.register(MoreandmoreendrodsModBlocks.OXIDIZED_COPPER_END_ROD, MoreandmoreendrodsModBlocks.WEATHERED_COPPER_END_ROD);
		StrippableBlockRegistry.register(MoreandmoreendrodsModBlocks.WAXED_COPPER_END_ROD, MoreandmoreendrodsModBlocks.COPPER_END_ROD);
		StrippableBlockRegistry.register(MoreandmoreendrodsModBlocks.WAXED_EXPOSED_COPPER_END_ROD, MoreandmoreendrodsModBlocks.EXPOSED_COPPER_END_ROD);
		StrippableBlockRegistry.register(MoreandmoreendrodsModBlocks.WAXED_WEATHERED_COPPER_END_ROD, MoreandmoreendrodsModBlocks.WEATHERED_COPPER_END_ROD);
		FlammableBlockRegistry.getDefaultInstance().add(MoreandmoreendrodsModBlocks.JUNGLE_END_ROD, 15, 160);
		FlammableBlockRegistry.getDefaultInstance().add(MoreandmoreendrodsModBlocks.ACACIA_END_ROD, 15, 160);
		FlammableBlockRegistry.getDefaultInstance().add(MoreandmoreendrodsModBlocks.DARK_OAK_END_ROD, 15, 160);
		FlammableBlockRegistry.getDefaultInstance().add(MoreandmoreendrodsModBlocks.MANGROVE_END_ROD, 15, 160);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static Block register(String name, Supplier<Block> supplier) {
		return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MoreandmoreendrodsMod.MODID, name), supplier.get());
	}
}