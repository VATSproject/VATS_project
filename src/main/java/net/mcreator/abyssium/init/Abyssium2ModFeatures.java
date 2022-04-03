
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.abyssium.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.abyssium.world.features.ores.MineraidabyssiumFeature;
import net.mcreator.abyssium.world.features.TempleFeature;
import net.mcreator.abyssium.world.features.GeysersousmarinFeature;
import net.mcreator.abyssium.world.features.ChampsdetournesolFeature;
import net.mcreator.abyssium.world.features.BananierFeature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Abyssium2ModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(MineraidabyssiumFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				MineraidabyssiumFeature.GENERATE_BIOMES, MineraidabyssiumFeature.CONFIGURED_FEATURE));
		REGISTRY.put(TempleFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, TempleFeature.GENERATE_BIOMES,
				TempleFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ChampsdetournesolFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				ChampsdetournesolFeature.GENERATE_BIOMES, ChampsdetournesolFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GeysersousmarinFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				GeysersousmarinFeature.GENERATE_BIOMES, GeysersousmarinFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BananierFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BananierFeature.GENERATE_BIOMES,
				BananierFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
