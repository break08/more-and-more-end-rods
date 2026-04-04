/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreandmoreendrods.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.moreandmoreendrods.MoreandmoreendrodsMod;

import java.util.function.Function;

public class MoreandmoreendrodsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MoreandmoreendrodsMod.MODID);
	public static final DeferredItem<Item> OAK_END_ROD;
	public static final DeferredItem<Item> CHERRY_END_ROD;
	public static final DeferredItem<Item> BIRCH_END_ROD;
	public static final DeferredItem<Item> SPRUCE_END_ROD;
	public static final DeferredItem<Item> STONE_END_ROD;
	public static final DeferredItem<Item> IRON_END_ROD;
	public static final DeferredItem<Item> COPPER_END_ROD;
	public static final DeferredItem<Item> GLOWSTONE_END_ROD;
	public static final DeferredItem<Item> EMERALD_END_ROD;
	public static final DeferredItem<Item> DIAMOND_END_ROD;
	public static final DeferredItem<Item> NETHERITE_END_ROD;
	public static final DeferredItem<Item> CRIMSON_END_ROD;
	public static final DeferredItem<Item> WARPED_END_ROD;
	public static final DeferredItem<Item> EXPOSED_COPPER_END_ROD;
	public static final DeferredItem<Item> WEATHERED_COPPER_END_ROD;
	public static final DeferredItem<Item> OXIDIZED_COPPER_END_ROD;
	public static final DeferredItem<Item> WAXED_COPPER_END_ROD;
	public static final DeferredItem<Item> WAXED_EXPOSED_COPPER_END_ROD;
	public static final DeferredItem<Item> WAXED_WEATHERED_COPPER_END_ROD;
	public static final DeferredItem<Item> JUNGLE_END_ROD;
	public static final DeferredItem<Item> ACACIA_END_ROD;
	public static final DeferredItem<Item> DARK_OAK_END_ROD;
	public static final DeferredItem<Item> MANGROVE_END_ROD;
	public static final DeferredItem<Item> PRISMARINE_END_ROD;
	public static final DeferredItem<Item> GOLDEN_END_ROD;
	public static final DeferredItem<Item> SHULKER_END_ROD;
	public static final DeferredItem<Item> PINK_END_ROD;
	public static final DeferredItem<Item> BLUE_END_ROD;
	public static final DeferredItem<Item> LIGHT_BLUE_END_ROD;
	public static final DeferredItem<Item> PURPLE_END_ROD;
	public static final DeferredItem<Item> YELLOW_END_ROD;
	public static final DeferredItem<Item> GRAY_END_ROD;
	public static final DeferredItem<Item> LIGHT_GRAY_END_ROD;
	public static final DeferredItem<Item> BLACK_END_ROD;
	public static final DeferredItem<Item> ORANGE_END_ROD;
	public static final DeferredItem<Item> RED_END_ROD;
	public static final DeferredItem<Item> CYAN_END_ROD;
	public static final DeferredItem<Item> GREEN_END_ROD;
	public static final DeferredItem<Item> LIME_END_ROD;
	public static final DeferredItem<Item> AMETHYST_END_ROD;
	public static final DeferredItem<Item> BRICK_END_ROD;
	public static final DeferredItem<Item> NETHER_BRICK_END_ROD;
	public static final DeferredItem<Item> MAGENTA_END_ROD;
	public static final DeferredItem<Item> STONE_BRICK_END_ROD;
	public static final DeferredItem<Item> LONG_END_ROD;
	public static final DeferredItem<Item> CACTUS_END_ROD;
	public static final DeferredItem<Item> GLASS_END_ROD;
	public static final DeferredItem<Item> SLIME_END_ROD;
	public static final DeferredItem<Item> DISPENSER_END_ROD;
	static {
		OAK_END_ROD = block(MoreandmoreendrodsModBlocks.OAK_END_ROD);
		CHERRY_END_ROD = block(MoreandmoreendrodsModBlocks.CHERRY_END_ROD);
		BIRCH_END_ROD = block(MoreandmoreendrodsModBlocks.BIRCH_END_ROD);
		SPRUCE_END_ROD = block(MoreandmoreendrodsModBlocks.SPRUCE_END_ROD);
		STONE_END_ROD = block(MoreandmoreendrodsModBlocks.STONE_END_ROD, new Item.Properties().fireResistant());
		IRON_END_ROD = block(MoreandmoreendrodsModBlocks.IRON_END_ROD, new Item.Properties().fireResistant());
		COPPER_END_ROD = block(MoreandmoreendrodsModBlocks.COPPER_END_ROD, new Item.Properties().fireResistant());
		GLOWSTONE_END_ROD = block(MoreandmoreendrodsModBlocks.GLOWSTONE_END_ROD);
		EMERALD_END_ROD = block(MoreandmoreendrodsModBlocks.EMERALD_END_ROD);
		DIAMOND_END_ROD = block(MoreandmoreendrodsModBlocks.DIAMOND_END_ROD);
		NETHERITE_END_ROD = block(MoreandmoreendrodsModBlocks.NETHERITE_END_ROD, new Item.Properties().fireResistant());
		CRIMSON_END_ROD = block(MoreandmoreendrodsModBlocks.CRIMSON_END_ROD, new Item.Properties().fireResistant());
		WARPED_END_ROD = block(MoreandmoreendrodsModBlocks.WARPED_END_ROD, new Item.Properties().fireResistant());
		EXPOSED_COPPER_END_ROD = block(MoreandmoreendrodsModBlocks.EXPOSED_COPPER_END_ROD);
		WEATHERED_COPPER_END_ROD = block(MoreandmoreendrodsModBlocks.WEATHERED_COPPER_END_ROD);
		OXIDIZED_COPPER_END_ROD = block(MoreandmoreendrodsModBlocks.OXIDIZED_COPPER_END_ROD);
		WAXED_COPPER_END_ROD = block(MoreandmoreendrodsModBlocks.WAXED_COPPER_END_ROD, new Item.Properties().fireResistant());
		WAXED_EXPOSED_COPPER_END_ROD = block(MoreandmoreendrodsModBlocks.WAXED_EXPOSED_COPPER_END_ROD);
		WAXED_WEATHERED_COPPER_END_ROD = block(MoreandmoreendrodsModBlocks.WAXED_WEATHERED_COPPER_END_ROD);
		JUNGLE_END_ROD = block(MoreandmoreendrodsModBlocks.JUNGLE_END_ROD);
		ACACIA_END_ROD = block(MoreandmoreendrodsModBlocks.ACACIA_END_ROD);
		DARK_OAK_END_ROD = block(MoreandmoreendrodsModBlocks.DARK_OAK_END_ROD);
		MANGROVE_END_ROD = block(MoreandmoreendrodsModBlocks.MANGROVE_END_ROD);
		PRISMARINE_END_ROD = block(MoreandmoreendrodsModBlocks.PRISMARINE_END_ROD);
		GOLDEN_END_ROD = block(MoreandmoreendrodsModBlocks.GOLDEN_END_ROD);
		SHULKER_END_ROD = block(MoreandmoreendrodsModBlocks.SHULKER_END_ROD);
		PINK_END_ROD = block(MoreandmoreendrodsModBlocks.PINK_END_ROD);
		BLUE_END_ROD = block(MoreandmoreendrodsModBlocks.BLUE_END_ROD);
		LIGHT_BLUE_END_ROD = block(MoreandmoreendrodsModBlocks.LIGHT_BLUE_END_ROD);
		PURPLE_END_ROD = block(MoreandmoreendrodsModBlocks.PURPLE_END_ROD);
		YELLOW_END_ROD = block(MoreandmoreendrodsModBlocks.YELLOW_END_ROD);
		GRAY_END_ROD = block(MoreandmoreendrodsModBlocks.GRAY_END_ROD);
		LIGHT_GRAY_END_ROD = block(MoreandmoreendrodsModBlocks.LIGHT_GRAY_END_ROD);
		BLACK_END_ROD = block(MoreandmoreendrodsModBlocks.BLACK_END_ROD);
		ORANGE_END_ROD = block(MoreandmoreendrodsModBlocks.ORANGE_END_ROD);
		RED_END_ROD = block(MoreandmoreendrodsModBlocks.RED_END_ROD);
		CYAN_END_ROD = block(MoreandmoreendrodsModBlocks.CYAN_END_ROD);
		GREEN_END_ROD = block(MoreandmoreendrodsModBlocks.GREEN_END_ROD);
		LIME_END_ROD = block(MoreandmoreendrodsModBlocks.LIME_END_ROD);
		AMETHYST_END_ROD = block(MoreandmoreendrodsModBlocks.AMETHYST_END_ROD);
		BRICK_END_ROD = block(MoreandmoreendrodsModBlocks.BRICK_END_ROD);
		NETHER_BRICK_END_ROD = block(MoreandmoreendrodsModBlocks.NETHER_BRICK_END_ROD);
		MAGENTA_END_ROD = block(MoreandmoreendrodsModBlocks.MAGENTA_END_ROD);
		STONE_BRICK_END_ROD = block(MoreandmoreendrodsModBlocks.STONE_BRICK_END_ROD);
		LONG_END_ROD = block(MoreandmoreendrodsModBlocks.LONG_END_ROD);
		CACTUS_END_ROD = block(MoreandmoreendrodsModBlocks.CACTUS_END_ROD);
		GLASS_END_ROD = block(MoreandmoreendrodsModBlocks.GLASS_END_ROD);
		SLIME_END_ROD = block(MoreandmoreendrodsModBlocks.SLIME_END_ROD);
		DISPENSER_END_ROD = block(MoreandmoreendrodsModBlocks.DISPENSER_END_ROD);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}