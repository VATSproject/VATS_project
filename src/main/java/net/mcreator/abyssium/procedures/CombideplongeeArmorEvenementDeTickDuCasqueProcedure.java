package net.mcreator.abyssium.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

public class CombideplongeeArmorEvenementDeTickDuCasqueProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getFluidState(new BlockPos((int) x, (int) y, (int) z)).createLegacyBlock()).getBlock() == Blocks.WATER
				|| (world.getFluidState(new BlockPos((int) x, (int) y, (int) z)).createLegacyBlock()).getBlock() == Blocks.WATER
				|| (world.getFluidState(new BlockPos((int) x, (int) y, (int) z)).createLegacyBlock()).getBlock() == Blocks.BUBBLE_COLUMN) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 60, 2));
		}
		if ((world.getFluidState(new BlockPos((int) x, (int) y, (int) z)).createLegacyBlock()).getBlock() == Blocks.WATER
				|| (world.getFluidState(new BlockPos((int) x, (int) y, (int) z)).createLegacyBlock()).getBlock() == Blocks.WATER
				|| (world.getFluidState(new BlockPos((int) x, (int) y, (int) z)).createLegacyBlock()).getBlock() == Blocks.BUBBLE_COLUMN) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 60, 2));
		}
	}
}
