/*
* MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.moreandmoreendrods.init;

import org.jetbrains.annotations.NotNull;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;

import java.util.Optional;

public class MoreandmoreendrodsModTrades {
	public static void registerTrades() {
		TradeOfferHelper.registerVillagerOffers(MoreandmoreendrodsModVillagerProfessions.END_ROD_SELLER, 1, factories -> {
			factories.add(new BasicTrade(new ItemStack(Items.EMERALD), ItemStack.EMPTY, new ItemStack(MoreandmoreendrodsModBlocks.OAK_END_ROD, 5), 20, 4, 0.05f));
			factories.add(new BasicTrade(new ItemStack(Items.EMERALD), ItemStack.EMPTY, new ItemStack(MoreandmoreendrodsModBlocks.SPRUCE_END_ROD, 5), 20, 4, 0.05f));
			factories.add(new BasicTrade(new ItemStack(Blocks.END_ROD, 15), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 10, 10, 0.05f));
			factories.add(new BasicTrade(new ItemStack(Items.EMERALD), ItemStack.EMPTY, new ItemStack(MoreandmoreendrodsModBlocks.BIRCH_END_ROD, 5), 10, 4, 0.05f));
		});
		TradeOfferHelper.registerVillagerOffers(MoreandmoreendrodsModVillagerProfessions.END_ROD_SELLER, 2, factories -> {
			factories.add(new BasicTrade(new ItemStack(MoreandmoreendrodsModBlocks.IRON_END_ROD, 2), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 6, 10, 0.05f));
			factories.add(new BasicTrade(new ItemStack(Items.EMERALD), ItemStack.EMPTY, new ItemStack(MoreandmoreendrodsModBlocks.CHERRY_END_ROD, 5), 10, 5, 0.05f));
			factories.add(new BasicTrade(new ItemStack(Items.EMERALD), ItemStack.EMPTY, new ItemStack(MoreandmoreendrodsModBlocks.GLOWSTONE_END_ROD, 3), 10, 5, 0.05f));
		});
		TradeOfferHelper.registerVillagerOffers(MoreandmoreendrodsModVillagerProfessions.END_ROD_SELLER, 3, factories -> {
			factories.add(new BasicTrade(new ItemStack(MoreandmoreendrodsModBlocks.COPPER_END_ROD, 8), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 10, 6, 0.05f));
		});
		TradeOfferHelper.registerVillagerOffers(MoreandmoreendrodsModVillagerProfessions.END_ROD_SELLER, 4, factories -> {
			factories.add(new BasicTrade(new ItemStack(MoreandmoreendrodsModBlocks.DIAMOND_END_ROD), ItemStack.EMPTY, new ItemStack(Items.EMERALD, 15), 10, 15, 0.05f));
		});
		TradeOfferHelper.registerVillagerOffers(MoreandmoreendrodsModVillagerProfessions.END_ROD_SELLER, 5, factories -> {
			factories.add(new BasicTrade(new ItemStack(MoreandmoreendrodsModBlocks.NETHERITE_END_ROD), ItemStack.EMPTY, new ItemStack(Items.EMERALD, 64), 10, 5, 0.05f));
		});
	}

	private record BasicTrade(ItemStack price, ItemStack price2, ItemStack offer, int maxTrades, int xp, float priceMult) implements VillagerTrades.ItemListing {
		@Override
		public @NotNull MerchantOffer getOffer(Entity entity, RandomSource random) {
			Optional<ItemCost> secondCost = price2.isEmpty() ? Optional.empty() : Optional.of(new ItemCost(price2.getItem(), price2.getCount()));
			return new MerchantOffer(new ItemCost(price.getItem(), price.getCount()), secondCost, offer, maxTrades, xp, priceMult);
		}
	}
}