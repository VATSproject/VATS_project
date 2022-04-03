
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.abyssium.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.abyssium.item.TranchedethoncuitItem;
import net.mcreator.abyssium.item.TranchedethonItem;
import net.mcreator.abyssium.item.Sousmarin2Item;
import net.mcreator.abyssium.item.Outils_AbyssiumSwordItem;
import net.mcreator.abyssium.item.Outils_AbyssiumShovelItem;
import net.mcreator.abyssium.item.Outils_AbyssiumPickaxeItem;
import net.mcreator.abyssium.item.Outils_AbyssiumHoeItem;
import net.mcreator.abyssium.item.Outils_AbyssiumAxeItem;
import net.mcreator.abyssium.item.HuitreouverteItem;
import net.mcreator.abyssium.item.HuitregraineItem;
import net.mcreator.abyssium.item.HuitrefermeeItem;
import net.mcreator.abyssium.item.HuitreavecalgueItem;
import net.mcreator.abyssium.item.HuileItem;
import net.mcreator.abyssium.item.GrainetournesolItem;
import net.mcreator.abyssium.item.CrevetteItem;
import net.mcreator.abyssium.item.CouteauItem;
import net.mcreator.abyssium.item.Combi_de_plongeeArmorItem;
import net.mcreator.abyssium.item.CleamoletteenorItem;
import net.mcreator.abyssium.item.CleamoletteendiamantItem;
import net.mcreator.abyssium.item.CleamoletteItem;
import net.mcreator.abyssium.item.BouteilledO2Item;
import net.mcreator.abyssium.item.BeignetdecrevetteItem;
import net.mcreator.abyssium.item.BananeItem;
import net.mcreator.abyssium.item.AssiettedhuitresItem;
import net.mcreator.abyssium.item.Armur_en_AbyssiumArmorItem;
import net.mcreator.abyssium.item.AbyssiumrenforceItem;
import net.mcreator.abyssium.item.AbyssiumItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Abyssium2ModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item MINERAIDABYSSIUM = register(Abyssium2ModBlocks.MINERAIDABYSSIUM, Abyssium2ModTabs.TAB_ABYSIUM);
	public static final Item ABYSSIUM = register(new AbyssiumItem());
	public static final Item BLOCKDABYSSIUM = register(Abyssium2ModBlocks.BLOCKDABYSSIUM, Abyssium2ModTabs.TAB_ABYSIUM);
	public static final Item ABYSSIUMRENFORCE = register(new AbyssiumrenforceItem());
	public static final Item ARMUR_EN_ABYSSIUM_ARMOR_HELMET = register(new Armur_en_AbyssiumArmorItem.Helmet());
	public static final Item ARMUR_EN_ABYSSIUM_ARMOR_CHESTPLATE = register(new Armur_en_AbyssiumArmorItem.Chestplate());
	public static final Item ARMUR_EN_ABYSSIUM_ARMOR_LEGGINGS = register(new Armur_en_AbyssiumArmorItem.Leggings());
	public static final Item ARMUR_EN_ABYSSIUM_ARMOR_BOOTS = register(new Armur_en_AbyssiumArmorItem.Boots());
	public static final Item OUTILS_ABYSSIUM_SWORD = register(new Outils_AbyssiumSwordItem());
	public static final Item OUTILS_ABYSSIUM_PICKAXE = register(new Outils_AbyssiumPickaxeItem());
	public static final Item OUTILS_ABYSSIUM_AXE = register(new Outils_AbyssiumAxeItem());
	public static final Item OUTILS_ABYSSIUM_SHOVEL = register(new Outils_AbyssiumShovelItem());
	public static final Item OUTILS_ABYSSIUM_HOE = register(new Outils_AbyssiumHoeItem());
	public static final Item BOUTEILLED_O_2 = register(new BouteilledO2Item());
	public static final Item COMBI_DE_PLONGEE_ARMOR_HELMET = register(new Combi_de_plongeeArmorItem.Helmet());
	public static final Item COMBI_DE_PLONGEE_ARMOR_CHESTPLATE = register(new Combi_de_plongeeArmorItem.Chestplate());
	public static final Item COMBI_DE_PLONGEE_ARMOR_BOOTS = register(new Combi_de_plongeeArmorItem.Boots());
	public static final Item SOUSMARIN_2 = register(new Sousmarin2Item());
	public static final Item VERRERENFORCE = register(Abyssium2ModBlocks.VERRERENFORCE, Abyssium2ModTabs.TAB_ABYSIUM);
	public static final Item TABLECRAFTPERSO = register(Abyssium2ModBlocks.TABLECRAFTPERSO, Abyssium2ModTabs.TAB_ABYSIUM);
	public static final Item HUITREGRAINE = register(new HuitregraineItem());
	public static final Item HUITREAVECALGUE = register(new HuitreavecalgueItem());
	public static final Item HUITREFERMEE = register(new HuitrefermeeItem());
	public static final Item HUITREOUVERTE = register(new HuitreouverteItem());
	public static final Item COUTEAU = register(new CouteauItem());
	public static final Item TABLEAHUITRES = register(Abyssium2ModBlocks.TABLEAHUITRES, Abyssium2ModTabs.TAB_ABYSIUM);
	public static final Item THON = register(
			new SpawnEggItem(Abyssium2ModEntities.THON, -16777012, -6710887, new Item.Properties().tab(Abyssium2ModTabs.TAB_ABYSIUM))
					.setRegistryName("thon_spawn_egg"));
	public static final Item TRANCHEDETHON = register(new TranchedethonItem());
	public static final Item TRANCHEDETHONCUIT = register(new TranchedethoncuitItem());
	public static final Item GRAINETOURNESOL = register(new GrainetournesolItem());
	public static final Item CREVETTEENTITE = register(
			new SpawnEggItem(Abyssium2ModEntities.CREVETTEENTITE, -33950, -46315, new Item.Properties().tab(Abyssium2ModTabs.TAB_ABYSIUM))
					.setRegistryName("crevetteentite_spawn_egg"));
	public static final Item CUISINIERE = register(Abyssium2ModBlocks.CUISINIERE, Abyssium2ModTabs.TAB_ABYSIUM);
	public static final Item BEIGNETDECREVETTE = register(new BeignetdecrevetteItem());
	public static final Item CREVETTE = register(new CrevetteItem());
	public static final Item HUILE = register(new HuileItem());
	public static final Item ASSIETTEDHUITRES = register(new AssiettedhuitresItem());
	public static final Item BLOCSOLAIR = register(Abyssium2ModBlocks.BLOCSOLAIR, Abyssium2ModTabs.TAB_SOLAIRGISOR);
	public static final Item PETITPANNEAUSOLAIR = register(Abyssium2ModBlocks.PETITPANNEAUSOLAIR, Abyssium2ModTabs.TAB_SOLAIRGISOR);
	public static final Item PANNEAUSOLAIRMOYEN = register(Abyssium2ModBlocks.PANNEAUSOLAIRMOYEN, Abyssium2ModTabs.TAB_SOLAIRGISOR);
	public static final Item CLEAMOLETTE = register(new CleamoletteItem());
	public static final Item CLEAMOLETTEENOR = register(new CleamoletteenorItem());
	public static final Item CLEAMOLETTEENDIAMANT = register(new CleamoletteendiamantItem());
	public static final Item ENVOYEUR = register(Abyssium2ModBlocks.ENVOYEUR, Abyssium2ModTabs.TAB_SOLAIRGISOR);
	public static final Item RECEPTEUR = register(Abyssium2ModBlocks.RECEPTEUR, Abyssium2ModTabs.TAB_SOLAIRGISOR);
	public static final Item ADAPTATEUR = register(Abyssium2ModBlocks.ADAPTATEUR, Abyssium2ModTabs.TAB_SOLAIRGISOR);
	public static final Item COMPTEURELECTRIQUE = register(Abyssium2ModBlocks.COMPTEURELECTRIQUE, Abyssium2ModTabs.TAB_SOLAIRGISOR);
	public static final Item STG_1 = register(Abyssium2ModBlocks.STG_1, null);
	public static final Item STG_2 = register(Abyssium2ModBlocks.STG_2, null);
	public static final Item STG_3 = register(Abyssium2ModBlocks.STG_3, null);
	public static final Item TSTG_1 = register(Abyssium2ModBlocks.TSTG_1, null);
	public static final Item TSTG_2 = register(Abyssium2ModBlocks.TSTG_2, null);
	public static final Item TSTG_3 = register(Abyssium2ModBlocks.TSTG_3, null);
	public static final Item TSTG_4 = register(Abyssium2ModBlocks.TSTG_4, null);
	public static final Item PETITPANNEAUSOLAIR_2 = register(Abyssium2ModBlocks.PETITPANNEAUSOLAIR_2, null);
	public static final Item ADAPTATEUR_2 = register(Abyssium2ModBlocks.ADAPTATEUR_2, null);
	public static final Item PANNEAUSOLAIRMOYEN_2 = register(Abyssium2ModBlocks.PANNEAUSOLAIRMOYEN_2, null);
	public static final Item BOIS_DE_BANANIERS_WOOD = register(Abyssium2ModBlocks.BOIS_DE_BANANIERS_WOOD, Abyssium2ModTabs.TAB_TERRIUM);
	public static final Item BOIS_DE_BANANIERS_LOG = register(Abyssium2ModBlocks.BOIS_DE_BANANIERS_LOG, Abyssium2ModTabs.TAB_TERRIUM);
	public static final Item BOIS_DE_BANANIERS_PLANKS = register(Abyssium2ModBlocks.BOIS_DE_BANANIERS_PLANKS, Abyssium2ModTabs.TAB_TERRIUM);
	public static final Item BOIS_DE_BANANIERS_STAIRS = register(Abyssium2ModBlocks.BOIS_DE_BANANIERS_STAIRS, Abyssium2ModTabs.TAB_TERRIUM);
	public static final Item BOIS_DE_BANANIERS_SLAB = register(Abyssium2ModBlocks.BOIS_DE_BANANIERS_SLAB, Abyssium2ModTabs.TAB_TERRIUM);
	public static final Item BOIS_DE_BANANIERS_FENCE = register(Abyssium2ModBlocks.BOIS_DE_BANANIERS_FENCE, Abyssium2ModTabs.TAB_TERRIUM);
	public static final Item BOIS_DE_BANANIERS_FENCE_GATE = register(Abyssium2ModBlocks.BOIS_DE_BANANIERS_FENCE_GATE, Abyssium2ModTabs.TAB_TERRIUM);
	public static final Item BOIS_DE_BANANIERS_PRESSURE_PLATE = register(Abyssium2ModBlocks.BOIS_DE_BANANIERS_PRESSURE_PLATE,
			Abyssium2ModTabs.TAB_TERRIUM);
	public static final Item BOIS_DE_BANANIERS_BUTTON = register(Abyssium2ModBlocks.BOIS_DE_BANANIERS_BUTTON, Abyssium2ModTabs.TAB_TERRIUM);
	public static final Item FEUILLEDEBANANIER = register(Abyssium2ModBlocks.FEUILLEDEBANANIER, Abyssium2ModTabs.TAB_TERRIUM);
	public static final Item POUSSEDEBANANIER = register(Abyssium2ModBlocks.POUSSEDEBANANIER, Abyssium2ModTabs.TAB_TERRIUM);
	public static final Item REGIMEDEBANANES = register(Abyssium2ModBlocks.REGIMEDEBANANES, Abyssium2ModTabs.TAB_TERRIUM);
	public static final Item BANANE = register(new BananeItem());
	public static final Item GRANDPANNEAUSOLAIR = register(Abyssium2ModBlocks.GRANDPANNEAUSOLAIR, Abyssium2ModTabs.TAB_SOLAIRGISOR);
	public static final Item GRANDPANNEAUSOLAIR_2 = register(Abyssium2ModBlocks.GRANDPANNEAUSOLAIR_2, null);
	public static final Item CACHALOT = register(
			new SpawnEggItem(Abyssium2ModEntities.CACHALOT, -6710887, -10066330, new Item.Properties().tab(Abyssium2ModTabs.TAB_ABYSIUM))
					.setRegistryName("cachalot_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
