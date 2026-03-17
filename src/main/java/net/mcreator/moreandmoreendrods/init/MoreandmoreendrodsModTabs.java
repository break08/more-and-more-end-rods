/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreandmoreendrods.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.moreandmoreendrods.MoreandmoreendrodsMod;

public class MoreandmoreendrodsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreandmoreendrodsMod.MODID);
	public static final RegistryObject<CreativeModeTab> EXTRA_END_ROD = REGISTRY.register("extra_end_rod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.moreandmoreendrods.extra_end_rod")).icon(() -> new ItemStack(MoreandmoreendrodsModBlocks.OAK_END_ROD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MoreandmoreendrodsModBlocks.OAK_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.CHERRY_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.BIRCH_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.SPRUCE_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.STONE_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.IRON_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.COPPER_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.GLOWSTONE_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.EMERALD_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.DIAMOND_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.NETHERITE_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.CRIMSON_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.WARPED_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.EXPOSED_COPPER_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.WEATHERED_COPPER_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.OXIDIZED_COPPER_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.WAXED_COPPER_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.WAXED_EXPOSED_COPPER_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.WAXED_WEATHERED_COPPER_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.JUNGLE_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.ACACIA_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.DARK_OAK_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.MANGROVE_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.PRISMARINE_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.GOLDEN_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.SHULKER_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.PINK_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.BLUE_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.LIGHT_BLUE_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.PURPLE_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.YELLOW_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.GRAY_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.LIGHT_GRAY_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.BLACK_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.ORANGE_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.RED_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.CYAN_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.GREEN_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.LIME_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.AMETHYST_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.BRICK_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.NETHER_BRICK_END_ROD.get().asItem());
				tabData.accept(MoreandmoreendrodsModBlocks.MAGENTA_END_ROD.get().asItem());
			}).withSearchBar().build());
}