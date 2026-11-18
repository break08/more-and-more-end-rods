/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreandmoreendrods.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.moreandmoreendrods.MoreandmoreendrodsMod;

import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;

import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.Map;
import java.util.HashMap;

import com.google.common.collect.ImmutableSet;

public class MoreandmoreendrodsModVillagerProfessions {
	private static final Map<String, Holder<PoiType>> POI_TYPES = new HashMap<>();
	public static VillagerProfession END_ROD_SELLER;

	public static void load() {
		END_ROD_SELLER = registerProfession("end_rod_seller", () -> MoreandmoreendrodsModBlocks.EMERALD_END_ROD, () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.villager.work_toolsmith")));
	}

	private static VillagerProfession registerProfession(String name, Supplier<Block> block, Supplier<SoundEvent> soundEvent) {
		PoiType poiType = PointOfInterestHelper.register(ResourceLocation.fromNamespaceAndPath(MoreandmoreendrodsMod.MODID, name + "_poi"), 1, 1, block.get());
		Holder<PoiType> poiTypeHolder = BuiltInRegistries.POINT_OF_INTEREST_TYPE.wrapAsHolder(poiType);
		POI_TYPES.put(name, poiTypeHolder);
		Predicate<Holder<PoiType>> poiPredicate = holder -> holder.value() == poiType;
		return Registry.register(BuiltInRegistries.VILLAGER_PROFESSION, ResourceLocation.fromNamespaceAndPath(MoreandmoreendrodsMod.MODID, name),
				new VillagerProfession("moreandmoreendrods." + name, poiPredicate, poiPredicate, ImmutableSet.of(), ImmutableSet.of(), soundEvent.get()));
	}
}