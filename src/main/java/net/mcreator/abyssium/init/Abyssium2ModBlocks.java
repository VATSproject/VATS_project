
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.abyssium.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.abyssium.block.VerrerenforceBlock;
import net.mcreator.abyssium.block.Tstg4Block;
import net.mcreator.abyssium.block.Tstg3Block;
import net.mcreator.abyssium.block.Tstg2Block;
import net.mcreator.abyssium.block.Tstg1Block;
import net.mcreator.abyssium.block.TablecraftpersoBlock;
import net.mcreator.abyssium.block.TableahuitresBlock;
import net.mcreator.abyssium.block.Stg3Block;
import net.mcreator.abyssium.block.Stg2Block;
import net.mcreator.abyssium.block.Stg1Block;
import net.mcreator.abyssium.block.RegimedebananesBlock;
import net.mcreator.abyssium.block.RecepteurBlock;
import net.mcreator.abyssium.block.PoussedebananierBlock;
import net.mcreator.abyssium.block.PetitpanneausolairBlock;
import net.mcreator.abyssium.block.Petitpanneausolair2Block;
import net.mcreator.abyssium.block.PanneausolairmoyenBlock;
import net.mcreator.abyssium.block.Panneausolairmoyen2Block;
import net.mcreator.abyssium.block.MineraidabyssiumBlock;
import net.mcreator.abyssium.block.GrandpanneausolairBlock;
import net.mcreator.abyssium.block.Grandpanneausolair2Block;
import net.mcreator.abyssium.block.FeuilledebananierBlock;
import net.mcreator.abyssium.block.EnvoyeurBlock;
import net.mcreator.abyssium.block.CuisiniereBlock;
import net.mcreator.abyssium.block.CompteurelectriqueBlock;
import net.mcreator.abyssium.block.Bois_de_bananiersWoodBlock;
import net.mcreator.abyssium.block.Bois_de_bananiersStairsBlock;
import net.mcreator.abyssium.block.Bois_de_bananiersSlabBlock;
import net.mcreator.abyssium.block.Bois_de_bananiersPressurePlateBlock;
import net.mcreator.abyssium.block.Bois_de_bananiersPlanksBlock;
import net.mcreator.abyssium.block.Bois_de_bananiersLogBlock;
import net.mcreator.abyssium.block.Bois_de_bananiersFenceGateBlock;
import net.mcreator.abyssium.block.Bois_de_bananiersFenceBlock;
import net.mcreator.abyssium.block.Bois_de_bananiersButtonBlock;
import net.mcreator.abyssium.block.BlocsolairBlock;
import net.mcreator.abyssium.block.BlockdabyssiumBlock;
import net.mcreator.abyssium.block.AdaptateurBlock;
import net.mcreator.abyssium.block.Adaptateur2Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Abyssium2ModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block MINERAIDABYSSIUM = register(new MineraidabyssiumBlock());
	public static final Block BLOCKDABYSSIUM = register(new BlockdabyssiumBlock());
	public static final Block VERRERENFORCE = register(new VerrerenforceBlock());
	public static final Block TABLECRAFTPERSO = register(new TablecraftpersoBlock());
	public static final Block TABLEAHUITRES = register(new TableahuitresBlock());
	public static final Block CUISINIERE = register(new CuisiniereBlock());
	public static final Block BLOCSOLAIR = register(new BlocsolairBlock());
	public static final Block PETITPANNEAUSOLAIR = register(new PetitpanneausolairBlock());
	public static final Block PANNEAUSOLAIRMOYEN = register(new PanneausolairmoyenBlock());
	public static final Block ENVOYEUR = register(new EnvoyeurBlock());
	public static final Block RECEPTEUR = register(new RecepteurBlock());
	public static final Block ADAPTATEUR = register(new AdaptateurBlock());
	public static final Block COMPTEURELECTRIQUE = register(new CompteurelectriqueBlock());
	public static final Block STG_1 = register(new Stg1Block());
	public static final Block STG_2 = register(new Stg2Block());
	public static final Block STG_3 = register(new Stg3Block());
	public static final Block TSTG_1 = register(new Tstg1Block());
	public static final Block TSTG_2 = register(new Tstg2Block());
	public static final Block TSTG_3 = register(new Tstg3Block());
	public static final Block TSTG_4 = register(new Tstg4Block());
	public static final Block PETITPANNEAUSOLAIR_2 = register(new Petitpanneausolair2Block());
	public static final Block ADAPTATEUR_2 = register(new Adaptateur2Block());
	public static final Block PANNEAUSOLAIRMOYEN_2 = register(new Panneausolairmoyen2Block());
	public static final Block BOIS_DE_BANANIERS_WOOD = register(new Bois_de_bananiersWoodBlock());
	public static final Block BOIS_DE_BANANIERS_LOG = register(new Bois_de_bananiersLogBlock());
	public static final Block BOIS_DE_BANANIERS_PLANKS = register(new Bois_de_bananiersPlanksBlock());
	public static final Block BOIS_DE_BANANIERS_STAIRS = register(new Bois_de_bananiersStairsBlock());
	public static final Block BOIS_DE_BANANIERS_SLAB = register(new Bois_de_bananiersSlabBlock());
	public static final Block BOIS_DE_BANANIERS_FENCE = register(new Bois_de_bananiersFenceBlock());
	public static final Block BOIS_DE_BANANIERS_FENCE_GATE = register(new Bois_de_bananiersFenceGateBlock());
	public static final Block BOIS_DE_BANANIERS_PRESSURE_PLATE = register(new Bois_de_bananiersPressurePlateBlock());
	public static final Block BOIS_DE_BANANIERS_BUTTON = register(new Bois_de_bananiersButtonBlock());
	public static final Block FEUILLEDEBANANIER = register(new FeuilledebananierBlock());
	public static final Block POUSSEDEBANANIER = register(new PoussedebananierBlock());
	public static final Block REGIMEDEBANANES = register(new RegimedebananesBlock());
	public static final Block GRANDPANNEAUSOLAIR = register(new GrandpanneausolairBlock());
	public static final Block GRANDPANNEAUSOLAIR_2 = register(new Grandpanneausolair2Block());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			VerrerenforceBlock.registerRenderLayer();
			TableahuitresBlock.registerRenderLayer();
			CuisiniereBlock.registerRenderLayer();
			PetitpanneausolairBlock.registerRenderLayer();
			PanneausolairmoyenBlock.registerRenderLayer();
			EnvoyeurBlock.registerRenderLayer();
			RecepteurBlock.registerRenderLayer();
			CompteurelectriqueBlock.registerRenderLayer();
			Stg1Block.registerRenderLayer();
			Stg2Block.registerRenderLayer();
			Stg3Block.registerRenderLayer();
			Tstg1Block.registerRenderLayer();
			Tstg2Block.registerRenderLayer();
			Tstg3Block.registerRenderLayer();
			Tstg4Block.registerRenderLayer();
			Petitpanneausolair2Block.registerRenderLayer();
			Panneausolairmoyen2Block.registerRenderLayer();
			FeuilledebananierBlock.registerRenderLayer();
			PoussedebananierBlock.registerRenderLayer();
			RegimedebananesBlock.registerRenderLayer();
			GrandpanneausolairBlock.registerRenderLayer();
			Grandpanneausolair2Block.registerRenderLayer();
		}
	}
}
