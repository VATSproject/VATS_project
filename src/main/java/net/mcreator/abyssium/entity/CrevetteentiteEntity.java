
package net.mcreator.abyssium.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fmllegacy.network.NetworkHooks;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.abyssium.init.Abyssium2ModItems;
import net.mcreator.abyssium.init.Abyssium2ModEntities;

import java.util.Set;

@Mod.EventBusSubscriber
public class CrevetteentiteEntity extends PathfinderMob {
	private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("deep_cold_ocean"), new ResourceLocation("frozen_ocean"),
			new ResourceLocation("warm_ocean"), new ResourceLocation("deep_warm_ocean"), new ResourceLocation("lukewarm_ocean"),
			new ResourceLocation("ocean"), new ResourceLocation("deep_lukewarm_ocean"), new ResourceLocation("cold_ocean"),
			new ResourceLocation("deep_ocean"), new ResourceLocation("deep_frozen_ocean"));

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		if (SPAWN_BIOMES.contains(event.getName()))
			event.getSpawns().getSpawner(MobCategory.WATER_CREATURE)
					.add(new MobSpawnSettings.SpawnerData(Abyssium2ModEntities.CREVETTEENTITE, 30, 12, 13));
	}

	public CrevetteentiteEntity(FMLPlayMessages.SpawnEntity packet, Level world) {
		this(Abyssium2ModEntities.CREVETTEENTITE, world);
	}

	public CrevetteentiteEntity(EntityType<CrevetteentiteEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (CrevetteentiteEntity.this.isInWater())
					CrevetteentiteEntity.this.setDeltaMovement(CrevetteentiteEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !CrevetteentiteEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - CrevetteentiteEntity.this.getX();
					double dy = this.wantedY - CrevetteentiteEntity.this.getY();
					double dz = this.wantedZ - CrevetteentiteEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * CrevetteentiteEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					CrevetteentiteEntity.this.setYRot(this.rotlerp(CrevetteentiteEntity.this.getYRot(), f, 10));
					CrevetteentiteEntity.this.yBodyRot = CrevetteentiteEntity.this.getYRot();
					CrevetteentiteEntity.this.yHeadRot = CrevetteentiteEntity.this.getYRot();
					if (CrevetteentiteEntity.this.isInWater()) {
						CrevetteentiteEntity.this.setSpeed((float) CrevetteentiteEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						CrevetteentiteEntity.this.setXRot(this.rotlerp(CrevetteentiteEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(CrevetteentiteEntity.this.getXRot() * (float) (Math.PI / 180.0));
						CrevetteentiteEntity.this.setZza(f3 * f1);
						CrevetteentiteEntity.this.setYya((float) (f1 * dy));
					} else {
						CrevetteentiteEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					CrevetteentiteEntity.this.setSpeed(0);
					CrevetteentiteEntity.this.setYya(0);
					CrevetteentiteEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new RandomSwimmingGoal(this, 6, 40));
		this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.WATER;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(Abyssium2ModItems.CREVETTE));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.DROWN)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	public static void init() {
		SpawnPlacements.register(Abyssium2ModEntities.CREVETTEENTITE, SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos,
						random) -> (world.getBlockState(pos).is(Blocks.WATER) && world.getBlockState(pos.above()).is(Blocks.WATER)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 6);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 6);
		return builder;
	}
}
