
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.abyssium.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.abyssium.block.entity.TablecraftpersoBlockEntity;
import net.mcreator.abyssium.block.entity.TableahuitresBlockEntity;
import net.mcreator.abyssium.block.entity.PoussedebananierBlockEntity;
import net.mcreator.abyssium.block.entity.CuisiniereBlockEntity;
import net.mcreator.abyssium.block.entity.CompteurelectriqueBlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Abyssium2ModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> TABLECRAFTPERSO = register("abyssium2:tablecraftperso", Abyssium2ModBlocks.TABLECRAFTPERSO,
			TablecraftpersoBlockEntity::new);
	public static final BlockEntityType<?> TABLEAHUITRES = register("abyssium2:tableahuitres", Abyssium2ModBlocks.TABLEAHUITRES,
			TableahuitresBlockEntity::new);
	public static final BlockEntityType<?> CUISINIERE = register("abyssium2:cuisiniere", Abyssium2ModBlocks.CUISINIERE, CuisiniereBlockEntity::new);
	public static final BlockEntityType<?> COMPTEURELECTRIQUE = register("abyssium2:compteurelectrique", Abyssium2ModBlocks.COMPTEURELECTRIQUE,
			CompteurelectriqueBlockEntity::new);
	public static final BlockEntityType<?> POUSSEDEBANANIER = register("abyssium2:poussedebananier", Abyssium2ModBlocks.POUSSEDEBANANIER,
			PoussedebananierBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
