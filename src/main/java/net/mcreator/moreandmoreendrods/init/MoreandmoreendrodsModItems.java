/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreandmoreendrods.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.moreandmoreendrods.MoreandmoreendrodsMod;

import java.util.function.Function;

public class MoreandmoreendrodsModItems {
	public static Item OAK_END_ROD;
	public static Item CHERRY_END_ROD;
	public static Item BIRCH_END_ROD;
	public static Item SPRUCE_END_ROD;
	public static Item STONE_END_ROD;
	public static Item IRON_END_ROD;
	public static Item COPPER_END_ROD;
	public static Item GLOWSTONE_END_ROD;
	public static Item EMERALD_END_ROD;
	public static Item DIAMOND_END_ROD;
	public static Item NETHERITE_END_ROD;
	public static Item CRIMSON_END_ROD;
	public static Item WARPED_END_ROD;
	public static Item EXPOSED_COPPER_END_ROD;
	public static Item WEATHERED_COPPER_END_ROD;
	public static Item OXIDIZED_COPPER_END_ROD;
	public static Item WAXED_COPPER_END_ROD;
	public static Item WAXED_EXPOSED_COPPER_END_ROD;
	public static Item WAXED_WEATHERED_COPPER_END_ROD;
	public static Item JUNGLE_END_ROD;
	public static Item ACACIA_END_ROD;
	public static Item DARK_OAK_END_ROD;
	public static Item MANGROVE_END_ROD;
	public static Item PRISMARINE_END_ROD;
	public static Item GOLDEN_END_ROD;
	public static Item SHULKER_END_ROD;
	public static Item PINK_END_ROD;
	public static Item BLUE_END_ROD;
	public static Item LIGHT_BLUE_END_ROD;
	public static Item PURPLE_END_ROD;
	public static Item YELLOW_END_ROD;
	public static Item GRAY_END_ROD;
	public static Item LIGHT_GRAY_END_ROD;
	public static Item BLACK_END_ROD;
	public static Item ORANGE_END_ROD;
	public static Item RED_END_ROD;
	public static Item CYAN_END_ROD;
	public static Item GREEN_END_ROD;
	public static Item LIME_END_ROD;
	public static Item AMETHYST_END_ROD;
	public static Item BRICK_END_ROD;
	public static Item NETHER_BRICK_END_ROD;
	public static Item MAGENTA_END_ROD;
	public static Item STONE_BRICK_END_ROD;
	public static Item LONG_END_ROD;
	public static Item CACTUS_END_ROD;
	public static Item GLASS_END_ROD;
	public static Item SLIME_END_ROD;
	public static Item DISPENSER_END_ROD;

	public static void load() {
		OAK_END_ROD = block(MoreandmoreendrodsModBlocks.OAK_END_ROD, "oak_end_rod");
		CHERRY_END_ROD = block(MoreandmoreendrodsModBlocks.CHERRY_END_ROD, "cherry_end_rod");
		BIRCH_END_ROD = block(MoreandmoreendrodsModBlocks.BIRCH_END_ROD, "birch_end_rod");
		SPRUCE_END_ROD = block(MoreandmoreendrodsModBlocks.SPRUCE_END_ROD, "spruce_end_rod");
		STONE_END_ROD = block(MoreandmoreendrodsModBlocks.STONE_END_ROD, "stone_end_rod", new Item.Properties().fireResistant());
		IRON_END_ROD = block(MoreandmoreendrodsModBlocks.IRON_END_ROD, "iron_end_rod", new Item.Properties().fireResistant());
		COPPER_END_ROD = block(MoreandmoreendrodsModBlocks.COPPER_END_ROD, "copper_end_rod", new Item.Properties().fireResistant());
		GLOWSTONE_END_ROD = block(MoreandmoreendrodsModBlocks.GLOWSTONE_END_ROD, "glowstone_end_rod");
		EMERALD_END_ROD = block(MoreandmoreendrodsModBlocks.EMERALD_END_ROD, "emerald_end_rod");
		DIAMOND_END_ROD = block(MoreandmoreendrodsModBlocks.DIAMOND_END_ROD, "diamond_end_rod");
		NETHERITE_END_ROD = block(MoreandmoreendrodsModBlocks.NETHERITE_END_ROD, "netherite_end_rod", new Item.Properties().fireResistant());
		CRIMSON_END_ROD = block(MoreandmoreendrodsModBlocks.CRIMSON_END_ROD, "crimson_end_rod", new Item.Properties().fireResistant());
		WARPED_END_ROD = block(MoreandmoreendrodsModBlocks.WARPED_END_ROD, "warped_end_rod", new Item.Properties().fireResistant());
		EXPOSED_COPPER_END_ROD = block(MoreandmoreendrodsModBlocks.EXPOSED_COPPER_END_ROD, "exposed_copper_end_rod");
		WEATHERED_COPPER_END_ROD = block(MoreandmoreendrodsModBlocks.WEATHERED_COPPER_END_ROD, "weathered_copper_end_rod");
		OXIDIZED_COPPER_END_ROD = block(MoreandmoreendrodsModBlocks.OXIDIZED_COPPER_END_ROD, "oxidized_copper_end_rod");
		WAXED_COPPER_END_ROD = block(MoreandmoreendrodsModBlocks.WAXED_COPPER_END_ROD, "waxed_copper_end_rod", new Item.Properties().fireResistant());
		WAXED_EXPOSED_COPPER_END_ROD = block(MoreandmoreendrodsModBlocks.WAXED_EXPOSED_COPPER_END_ROD, "waxed_exposed_copper_end_rod");
		WAXED_WEATHERED_COPPER_END_ROD = block(MoreandmoreendrodsModBlocks.WAXED_WEATHERED_COPPER_END_ROD, "waxed_weathered_copper_end_rod");
		JUNGLE_END_ROD = block(MoreandmoreendrodsModBlocks.JUNGLE_END_ROD, "jungle_end_rod");
		ACACIA_END_ROD = block(MoreandmoreendrodsModBlocks.ACACIA_END_ROD, "acacia_end_rod");
		DARK_OAK_END_ROD = block(MoreandmoreendrodsModBlocks.DARK_OAK_END_ROD, "dark_oak_end_rod");
		MANGROVE_END_ROD = block(MoreandmoreendrodsModBlocks.MANGROVE_END_ROD, "mangrove_end_rod");
		PRISMARINE_END_ROD = block(MoreandmoreendrodsModBlocks.PRISMARINE_END_ROD, "prismarine_end_rod");
		GOLDEN_END_ROD = block(MoreandmoreendrodsModBlocks.GOLDEN_END_ROD, "golden_end_rod");
		SHULKER_END_ROD = block(MoreandmoreendrodsModBlocks.SHULKER_END_ROD, "shulker_end_rod");
		PINK_END_ROD = block(MoreandmoreendrodsModBlocks.PINK_END_ROD, "pink_end_rod");
		BLUE_END_ROD = block(MoreandmoreendrodsModBlocks.BLUE_END_ROD, "blue_end_rod");
		LIGHT_BLUE_END_ROD = block(MoreandmoreendrodsModBlocks.LIGHT_BLUE_END_ROD, "light_blue_end_rod");
		PURPLE_END_ROD = block(MoreandmoreendrodsModBlocks.PURPLE_END_ROD, "purple_end_rod");
		YELLOW_END_ROD = block(MoreandmoreendrodsModBlocks.YELLOW_END_ROD, "yellow_end_rod");
		GRAY_END_ROD = block(MoreandmoreendrodsModBlocks.GRAY_END_ROD, "gray_end_rod");
		LIGHT_GRAY_END_ROD = block(MoreandmoreendrodsModBlocks.LIGHT_GRAY_END_ROD, "light_gray_end_rod");
		BLACK_END_ROD = block(MoreandmoreendrodsModBlocks.BLACK_END_ROD, "black_end_rod");
		ORANGE_END_ROD = block(MoreandmoreendrodsModBlocks.ORANGE_END_ROD, "orange_end_rod");
		RED_END_ROD = block(MoreandmoreendrodsModBlocks.RED_END_ROD, "red_end_rod");
		CYAN_END_ROD = block(MoreandmoreendrodsModBlocks.CYAN_END_ROD, "cyan_end_rod");
		GREEN_END_ROD = block(MoreandmoreendrodsModBlocks.GREEN_END_ROD, "green_end_rod");
		LIME_END_ROD = block(MoreandmoreendrodsModBlocks.LIME_END_ROD, "lime_end_rod");
		AMETHYST_END_ROD = block(MoreandmoreendrodsModBlocks.AMETHYST_END_ROD, "amethyst_end_rod");
		BRICK_END_ROD = block(MoreandmoreendrodsModBlocks.BRICK_END_ROD, "brick_end_rod");
		NETHER_BRICK_END_ROD = block(MoreandmoreendrodsModBlocks.NETHER_BRICK_END_ROD, "nether_brick_end_rod");
		MAGENTA_END_ROD = block(MoreandmoreendrodsModBlocks.MAGENTA_END_ROD, "magenta_end_rod");
		STONE_BRICK_END_ROD = block(MoreandmoreendrodsModBlocks.STONE_BRICK_END_ROD, "stone_brick_end_rod");
		LONG_END_ROD = block(MoreandmoreendrodsModBlocks.LONG_END_ROD, "long_end_rod");
		CACTUS_END_ROD = block(MoreandmoreendrodsModBlocks.CACTUS_END_ROD, "cactus_end_rod");
		GLASS_END_ROD = block(MoreandmoreendrodsModBlocks.GLASS_END_ROD, "glass_end_rod");
		SLIME_END_ROD = block(MoreandmoreendrodsModBlocks.SLIME_END_ROD, "slime_end_rod");
		DISPENSER_END_ROD = block(MoreandmoreendrodsModBlocks.DISPENSER_END_ROD, "dispenser_end_rod");
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MoreandmoreendrodsMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MoreandmoreendrodsMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}