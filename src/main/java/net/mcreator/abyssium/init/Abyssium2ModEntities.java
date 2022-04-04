
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.abyssium.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.abyssium.entity.ThonEntity;
import net.mcreator.abyssium.entity.SousmarinEntity;
import net.mcreator.abyssium.entity.HarponEntity;
import net.mcreator.abyssium.entity.CrevetteentiteEntity;
import net.mcreator.abyssium.entity.CachalotEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Abyssium2ModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<SousmarinEntity> SOUSMARIN = register("sousmarin",
			EntityType.Builder.<SousmarinEntity>of(SousmarinEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SousmarinEntity::new).fireImmune().sized(1.375f, 1.875f));
	public static final EntityType<ThonEntity> THON = register("thon",
			EntityType.Builder.<ThonEntity>of(ThonEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ThonEntity::new).sized(0.2f, 0.4f));
	public static final EntityType<CrevetteentiteEntity> CREVETTEENTITE = register("crevetteentite",
			EntityType.Builder.<CrevetteentiteEntity>of(CrevetteentiteEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrevetteentiteEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<CachalotEntity> CACHALOT = register("cachalot",
			EntityType.Builder.<CachalotEntity>of(CachalotEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CachalotEntity::new).sized(10f, 1f));
	public static final EntityType<HarponEntity> HARPON = register("entitybulletharpon",
			EntityType.Builder.<HarponEntity>of(HarponEntity::new, MobCategory.MISC).setCustomClientFactory(HarponEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SousmarinEntity.init();
			ThonEntity.init();
			CrevetteentiteEntity.init();
			CachalotEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SOUSMARIN, SousmarinEntity.createAttributes().build());
		event.put(THON, ThonEntity.createAttributes().build());
		event.put(CREVETTEENTITE, CrevetteentiteEntity.createAttributes().build());
		event.put(CACHALOT, CachalotEntity.createAttributes().build());
	}
}
