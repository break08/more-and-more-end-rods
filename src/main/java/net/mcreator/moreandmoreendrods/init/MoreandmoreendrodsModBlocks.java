/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreandmoreendrods.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.moreandmoreendrods.block.*;
import net.mcreator.moreandmoreendrods.MoreandmoreendrodsMod;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

import java.util.function.Function;

public class MoreandmoreendrodsModBlocks {
	public static Block OAK_END_ROD;
	public static Block CHERRY_END_ROD;
	public static Block BIRCH_END_ROD;
	public static Block SPRUCE_END_ROD;
	public static Block STONE_END_ROD;
	public static Block IRON_END_ROD;
	public static Block COPPER_END_ROD;
	public static Block GLOWSTONE_END_ROD;
	public static Block EMERALD_END_ROD;
	public static Block DIAMOND_END_ROD;
	public static Block NETHERITE_END_ROD;
	public static Block CRIMSON_END_ROD;
	public static Block WARPED_END_ROD;
	public static Block EXPOSED_COPPER_END_ROD;
	public static Block WEATHERED_COPPER_END_ROD;
	public static Block OXIDIZED_COPPER_END_ROD;
	public static Block WAXED_COPPER_END_ROD;
	public static Block WAXED_EXPOSED_COPPER_END_ROD;
	public static Block WAXED_WEATHERED_COPPER_END_ROD;
	public static Block JUNGLE_END_ROD;
	public static Block ACACIA_END_ROD;
	public static Block DARK_OAK_END_ROD;
	public static Block MANGROVE_END_ROD;
	public static Block PRISMARINE_END_ROD;
	public static Block GOLDEN_END_ROD;
	public static Block SHULKER_END_ROD;
	public static Block PINK_END_ROD;
	public static Block BLUE_END_ROD;
	public static Block LIGHT_BLUE_END_ROD;
	public static Block PURPLE_END_ROD;
	public static Block YELLOW_END_ROD;
	public static Block GRAY_END_ROD;
	public static Block LIGHT_GRAY_END_ROD;
	public static Block BLACK_END_ROD;
	public static Block ORANGE_END_ROD;
	public static Block RED_END_ROD;
	public static Block CYAN_END_ROD;
	public static Block GREEN_END_ROD;
	public static Block LIME_END_ROD;
	public static Block AMETHYST_END_ROD;
	public static Block BRICK_END_ROD;
	public static Block NETHER_BRICK_END_ROD;
	public static Block MAGENTA_END_ROD;
	public static Block STONE_BRICK_END_ROD;
	public static Block LONG_END_ROD;
	public static Block CACTUS_END_ROD;
	public static Block GLASS_END_ROD;
	public static Block SLIME_END_ROD;
	public static Block DISPENSER_END_ROD;

	public static void load() {
		OAK_END_ROD = register("oak_end_rod", OakEndRodBlock::new);
		CHERRY_END_ROD = register("cherry_end_rod", CherryEndRodBlock::new);
		BIRCH_END_ROD = register("birch_end_rod", BirchEndRodBlock::new);
		SPRUCE_END_ROD = register("spruce_end_rod", SpruceEndRodBlock::new);
		STONE_END_ROD = register("stone_end_rod", StoneEndRodBlock::new);
		IRON_END_ROD = register("iron_end_rod", IronEndRodBlock::new);
		COPPER_END_ROD = register("copper_end_rod", CopperEndRodBlock::new);
		GLOWSTONE_END_ROD = register("glowstone_end_rod", GlowstoneEndRodBlock::new);
		EMERALD_END_ROD = register("emerald_end_rod", EmeraldEndRodBlock::new);
		DIAMOND_END_ROD = register("diamond_end_rod", DiamondEndRodBlock::new);
		NETHERITE_END_ROD = register("netherite_end_rod", NetheriteEndRodBlock::new);
		CRIMSON_END_ROD = register("crimson_end_rod", CrimsonEndRodBlock::new);
		WARPED_END_ROD = register("warped_end_rod", WarpedEndRodBlock::new);
		EXPOSED_COPPER_END_ROD = register("exposed_copper_end_rod", ExposedCopperEndRodBlock::new);
		WEATHERED_COPPER_END_ROD = register("weathered_copper_end_rod", WeatheredCopperEndRodBlock::new);
		OXIDIZED_COPPER_END_ROD = register("oxidized_copper_end_rod", OxidizedCopperEndRodBlock::new);
		WAXED_COPPER_END_ROD = register("waxed_copper_end_rod", WaxedCopperEndRodBlock::new);
		WAXED_EXPOSED_COPPER_END_ROD = register("waxed_exposed_copper_end_rod", WaxedExposedCopperEndRodBlock::new);
		WAXED_WEATHERED_COPPER_END_ROD = register("waxed_weathered_copper_end_rod", WaxedWeatheredCopperEndRodBlock::new);
		JUNGLE_END_ROD = register("jungle_end_rod", JungleEndRodBlock::new);
		ACACIA_END_ROD = register("acacia_end_rod", AcaciaEndRodBlock::new);
		DARK_OAK_END_ROD = register("dark_oak_end_rod", DarkOakEndRodBlock::new);
		MANGROVE_END_ROD = register("mangrove_end_rod", MangroveEndRodBlock::new);
		PRISMARINE_END_ROD = register("prismarine_end_rod", PrismarineEndRodBlock::new);
		GOLDEN_END_ROD = register("golden_end_rod", GoldenEndRodBlock::new);
		SHULKER_END_ROD = register("shulker_end_rod", ShulkerEndRodBlock::new);
		PINK_END_ROD = register("pink_end_rod", PinkEndRodBlock::new);
		BLUE_END_ROD = register("blue_end_rod", BlueEndRodBlock::new);
		LIGHT_BLUE_END_ROD = register("light_blue_end_rod", LightBlueEndRodBlock::new);
		PURPLE_END_ROD = register("purple_end_rod", PurpleEndRodBlock::new);
		YELLOW_END_ROD = register("yellow_end_rod", YellowEndRodBlock::new);
		GRAY_END_ROD = register("gray_end_rod", GrayEndRodBlock::new);
		LIGHT_GRAY_END_ROD = register("light_gray_end_rod", LightGrayEndRodBlock::new);
		BLACK_END_ROD = register("black_end_rod", BlackEndRodBlock::new);
		ORANGE_END_ROD = register("orange_end_rod", OrangeEndRodBlock::new);
		RED_END_ROD = register("red_end_rod", RedEndRodBlock::new);
		CYAN_END_ROD = register("cyan_end_rod", CyanEndRodBlock::new);
		GREEN_END_ROD = register("green_end_rod", GreenEndRodBlock::new);
		LIME_END_ROD = register("lime_end_rod", LimeEndRodBlock::new);
		AMETHYST_END_ROD = register("amethyst_end_rod", AmethystEndRodBlock::new);
		BRICK_END_ROD = register("brick_end_rod", BrickEndRodBlock::new);
		NETHER_BRICK_END_ROD = register("nether_brick_end_rod", NetherBrickEndRodBlock::new);
		MAGENTA_END_ROD = register("magenta_end_rod", MagentaEndRodBlock::new);
		STONE_BRICK_END_ROD = register("stone_brick_end_rod", StoneBrickEndRodBlock::new);
		LONG_END_ROD = register("long_end_rod", LongEndRodBlock::new);
		CACTUS_END_ROD = register("cactus_end_rod", CactusEndRodBlock::new);
		GLASS_END_ROD = register("glass_end_rod", GlassEndRodBlock::new);
		SLIME_END_ROD = register("slime_end_rod", SlimeEndRodBlock::new);
		DISPENSER_END_ROD = register("dispenser_end_rod", DispenserEndRodBlock::new);
		StrippableBlockRegistry.register(MoreandmoreendrodsModBlocks.EXPOSED_COPPER_END_ROD, MoreandmoreendrodsModBlocks.COPPER_END_ROD);
		StrippableBlockRegistry.register(MoreandmoreendrodsModBlocks.WEATHERED_COPPER_END_ROD, MoreandmoreendrodsModBlocks.EXPOSED_COPPER_END_ROD);
		StrippableBlockRegistry.register(MoreandmoreendrodsModBlocks.OXIDIZED_COPPER_END_ROD, MoreandmoreendrodsModBlocks.WEATHERED_COPPER_END_ROD);
		StrippableBlockRegistry.register(MoreandmoreendrodsModBlocks.WAXED_COPPER_END_ROD, MoreandmoreendrodsModBlocks.COPPER_END_ROD);
		StrippableBlockRegistry.register(MoreandmoreendrodsModBlocks.WAXED_EXPOSED_COPPER_END_ROD, MoreandmoreendrodsModBlocks.EXPOSED_COPPER_END_ROD);
		StrippableBlockRegistry.register(MoreandmoreendrodsModBlocks.WAXED_WEATHERED_COPPER_END_ROD, MoreandmoreendrodsModBlocks.WEATHERED_COPPER_END_ROD);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoreandmoreendrodsMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}