/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.moreandmoreendrods.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MoreandmoreendrodsModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == MoreandmoreendrodsModVillagerProfessions.END_ROD_SELLER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(MoreandmoreendrodsModBlocks.OAK_END_ROD.get(), 5), 20, 4, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(MoreandmoreendrodsModBlocks.SPRUCE_END_ROD.get(), 5), 20, 4, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.END_ROD, 6), new ItemStack(Items.EMERALD), 10, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(MoreandmoreendrodsModBlocks.IRON_END_ROD.get()), new ItemStack(Items.EMERALD), 6, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(MoreandmoreendrodsModBlocks.CHERRY_END_ROD.get(), 5), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(MoreandmoreendrodsModBlocks.GLOWSTONE_END_ROD.get(), 3), 10, 7, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(MoreandmoreendrodsModBlocks.COPPER_END_ROD.get()), new ItemStack(Items.EMERALD), 10, 4, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(MoreandmoreendrodsModBlocks.DIAMOND_END_ROD.get()), new ItemStack(Items.EMERALD, 18), 10, 15, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(MoreandmoreendrodsModBlocks.NETHERITE_END_ROD.get()), new ItemStack(Items.EMERALD, 64), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(MoreandmoreendrodsModBlocks.BIRCH_END_ROD.get(), 5), 10, 4, 0.05f));
		}
	}
}