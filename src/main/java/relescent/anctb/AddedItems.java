package relescent.anctb;

import relescent.anctb.items.Item_handle;
import relescent.anctb.items.Item_seal1;
import relescent.anctb.items.Item_seal2;
import relescent.anctb.items.Item_seal3;
import relescent.anctb.items.Item_seal4;
import relescent.anctb.items.Item_soul;
import relescent.anctb.items.Item_soulPure;
import relescent.anctb.items.Item_soulVessel;
import relescent.anctb.lib.Reference;
import relescent.anctb.lib.UnlocNames;
import relescent.anctb.tools.Tool_gluttony1Pick;
import relescent.anctb.tools.Tool_gluttony1Shovel;
import relescent.anctb.tools.Tool_gluttonyPick;
import relescent.anctb.tools.Tool_gluttonyShovel;
import relescent.anctb.tools.Tool_gluttyswitch1Pick;
import relescent.anctb.tools.Tool_gluttyswitch1Shovel;
import relescent.anctb.tools.Tool_gluttyswitch2Pick;
import relescent.anctb.tools.Tool_gluttyswitch2Shovel;
import relescent.anctb.tools.Tool_paraPick;
import relescent.anctb.tools.Tool_paraShovel;
import relescent.anctb.tools.Tool_paraswitch1Pick;
import relescent.anctb.tools.Tool_paraswitch1Shovel;
import relescent.anctb.tools.Tool_paraswitch2Pick;
import relescent.anctb.tools.Tool_paraswitch2Shovel;
import relescent.anctb.tools.Tool_reinfAxe;
import relescent.anctb.tools.Tool_reinfPick;
import relescent.anctb.tools.Tool_reinfShovel;
import relescent.anctb.tools.Tool_reinfSword;
import relescent.anctb.tools.Tool_switch1Axe;
import relescent.anctb.tools.Tool_switch1Pick;
import relescent.anctb.tools.Tool_switch1Shovel;
import relescent.anctb.tools.Tool_switch1Sword;
import relescent.anctb.tools.Tool_switch2Axe;
import relescent.anctb.tools.Tool_switch2Pick;
import relescent.anctb.tools.Tool_switch2Shovel;
import relescent.anctb.tools.Tool_switch2Sword;
import relescent.anctb.tools.Tool_switch3Axe;
import relescent.anctb.tools.Tool_switch3Pick;
import relescent.anctb.tools.Tool_switch3Shovel;
import relescent.anctb.tools.Tool_switch3Sword;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class AddedItems {
	//#############################
	
	public static Item item_handle;
	public static Item item_soul;
	public static Item item_soulPure;
	public static Item item_seal1;
	public static Item item_seal2;
	public static Item item_seal2zom;
	public static Item item_seal2skel;
	public static Item item_seal3;
	public static Item item_seal3end;
	public static Item item_seal3spi;
	public static Item item_seal4;
	public static Item item_seal4wit;
	public static Item item_seal4bla;
	public static Item item_seal4pig;
	public static Item item_soulVessel;
	public static Item item_switchegg;
	
	public static Item tool_reinfAxe;
	public static Item tool_reinfPick;
	public static Item tool_reinfShovel;
	public static Item tool_reinfSword;
	
	public static Item tool_gluttony1Pick;
	public static Item tool_gluttony1Shovel;
	public static Item tool_gluttony2Pick;
	public static Item tool_gluttony2Shovel;
	
	public static Item tool_para1Pick;
	public static Item tool_para1Shovel;
	public static Item tool_para2Pick;
	public static Item tool_para2Shovel;
	
	public static Item tool_switch1Sword;
	public static Item tool_switch1Axe;
	public static Item tool_switch1Pick;
	public static Item tool_switch1Shovel;
	
	public static Item tool_switch2Sword;
	public static Item tool_switch2Axe;
	public static Item tool_switch2Pick;
	public static Item tool_switch2Shovel;
	
	public static Item tool_switch3Sword;
	public static Item tool_switch3Axe;
	public static Item tool_switch3Pick;
	public static Item tool_switch3Shovel;
	
	public static Item tool_paraswitch1Pick;
	public static Item tool_paraswitch1Shovel;
	public static Item tool_paraswitch2Pick;
	public static Item tool_paraswitch2Shovel;
	
	public static Item tool_gluttyswitch1Pick;
	public static Item tool_gluttyswitch1Shovel;
	public static Item tool_gluttyswitch2Pick;
	public static Item tool_gluttyswitch2Shovel;
	
	//#############################
	public static void initItems(){
		
		/*
		item_handle = new Item_handle().setUnlocalizedName(UnlocNames.item_handle);
			GameRegistry.registerItem(item_handle, UnlocNames.item_handle);
		item_soul = new Item_soul().setUnlocalizedName(UnlocNames.item_soul);
			GameRegistry.registerItem(item_soul, UnlocNames.item_soul);
		item_soulPure = new Item_soulPure().setUnlocalizedName(UnlocNames.item_soulPure);
			GameRegistry.registerItem(item_soulPure, UnlocNames.item_soulPure);
		item_soulVessel = new Item_soulVessel().setUnlocalizedName(UnlocNames.item_soulVessel);
			GameRegistry.registerItem(item_soulVessel, UnlocNames.item_soulVessel);	
		*/
		item_switchegg = new Item().setUnlocalizedName(UnlocNames.item_switchegg).setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.item_switchegg);
			GameRegistry.registerItem(item_switchegg, UnlocNames.item_switchegg);	
			
		// ***** Seals *****
		item_seal1 = new Item_seal1().setUnlocalizedName(UnlocNames.item_seal1).setMaxStackSize(1);
			GameRegistry.registerItem(item_seal1, UnlocNames.item_seal1);
		item_seal2 = new Item_seal2().setUnlocalizedName(UnlocNames.item_seal2).setMaxStackSize(1);
			GameRegistry.registerItem(item_seal2, UnlocNames.item_seal2);
		item_seal2zom = new Item().setUnlocalizedName(UnlocNames.item_seal2zom)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.item_seal2zom).setMaxStackSize(1);
				GameRegistry.registerItem(item_seal2zom, UnlocNames.item_seal2zom);
		item_seal2skel = new Item().setUnlocalizedName(UnlocNames.item_seal2skel)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.item_seal2skel).setMaxStackSize(1);
				GameRegistry.registerItem(item_seal2skel, UnlocNames.item_seal2skel);
		item_seal3 = new Item_seal3().setUnlocalizedName(UnlocNames.item_seal3).setMaxStackSize(1);
			GameRegistry.registerItem(item_seal3, UnlocNames.item_seal3);
		item_seal3end = new Item().setUnlocalizedName(UnlocNames.item_seal3end)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.item_seal3end).setMaxStackSize(1);
				GameRegistry.registerItem(item_seal3end, UnlocNames.item_seal3end);
		item_seal3spi = new Item().setUnlocalizedName(UnlocNames.item_seal3spi)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.item_seal3spi).setMaxStackSize(1);
				GameRegistry.registerItem(item_seal3spi, UnlocNames.item_seal3spi);
		item_seal4 = new Item_seal4().setUnlocalizedName(UnlocNames.item_seal4).setMaxStackSize(1);
			GameRegistry.registerItem(item_seal4, UnlocNames.item_seal4);
		item_seal4wit = new Item().setUnlocalizedName(UnlocNames.item_seal4wit)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.item_seal4wit).setMaxStackSize(1);
				GameRegistry.registerItem(item_seal4wit, UnlocNames.item_seal4wit);
		item_seal4bla = new Item().setUnlocalizedName(UnlocNames.item_seal4bla)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.item_seal4bla).setMaxStackSize(1);
				GameRegistry.registerItem(item_seal4bla, UnlocNames.item_seal4bla);
		item_seal4pig = new Item().setUnlocalizedName(UnlocNames.item_seal4pig)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.item_seal4pig).setMaxStackSize(1);
				GameRegistry.registerItem(item_seal4pig, UnlocNames.item_seal4pig);
		// ***** Seals End *****
		
			
		// ***** Reinforced *****
		tool_reinfAxe = new Tool_reinfAxe(AddedElse.material_reinf).setUnlocalizedName(UnlocNames.tool_reinfAxe)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_reinfAxe);
				GameRegistry.registerItem(tool_reinfAxe, UnlocNames.tool_reinfAxe);
				
		tool_reinfPick = new Tool_reinfPick(AddedElse.material_reinf).setUnlocalizedName(UnlocNames.tool_reinfPick)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_reinfPick);
				GameRegistry.registerItem(tool_reinfPick, UnlocNames.tool_reinfPick);
				
		tool_reinfShovel = new Tool_reinfShovel(AddedElse.material_reinf).setUnlocalizedName(UnlocNames.tool_reinfShovel)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_reinfShovel);
				GameRegistry.registerItem(tool_reinfShovel, UnlocNames.tool_reinfShovel);
				
		tool_reinfSword = new Tool_reinfSword(AddedElse.material_reinf).setUnlocalizedName(UnlocNames.tool_reinfSword)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_reinfSword);
				GameRegistry.registerItem(tool_reinfSword, UnlocNames.tool_reinfSword);

		// ***** Gluttony *****
		tool_gluttony1Pick = new Tool_gluttonyPick(AddedElse.material_gluttony1).setUnlocalizedName(UnlocNames.tool_gluttony1Pick)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_gluttony1Pick);
				GameRegistry.registerItem(tool_gluttony1Pick, UnlocNames.tool_gluttony1Pick);
				
		tool_gluttony1Shovel = new Tool_gluttonyShovel(AddedElse.material_gluttony1).setUnlocalizedName(UnlocNames.tool_gluttony1Shovel)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_gluttony1Shovel);
				GameRegistry.registerItem(tool_gluttony1Shovel, UnlocNames.tool_gluttony1Shovel);
				
		tool_gluttony2Pick = new Tool_gluttonyPick(AddedElse.material_gluttony2).setUnlocalizedName(UnlocNames.tool_gluttony2Pick)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_gluttony2Pick);
				GameRegistry.registerItem(tool_gluttony2Pick, UnlocNames.tool_gluttony2Pick);
				
		tool_gluttony2Shovel = new Tool_gluttonyShovel(AddedElse.material_gluttony2).setUnlocalizedName(UnlocNames.tool_gluttony2Shovel)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_gluttony2Shovel);
				GameRegistry.registerItem(tool_gluttony2Shovel, UnlocNames.tool_gluttony2Shovel);
				
		// ***** Parasite *****
		tool_para1Pick = new Tool_paraPick(AddedElse.material_para1).setUnlocalizedName(UnlocNames.tool_para1Pick)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_para1Pick);
				GameRegistry.registerItem(tool_para1Pick, UnlocNames.tool_para1Pick);
						
		tool_para1Shovel = new Tool_paraShovel(AddedElse.material_para1).setUnlocalizedName(UnlocNames.tool_para1Shovel)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_para1Shovel);
				GameRegistry.registerItem(tool_para1Shovel, UnlocNames.tool_para1Shovel);
						
		tool_para2Pick = new Tool_paraPick(AddedElse.material_para2).setUnlocalizedName(UnlocNames.tool_para2Pick)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_para2Pick);
				GameRegistry.registerItem(tool_para2Pick, UnlocNames.tool_para2Pick);
						
		tool_para2Shovel = new Tool_paraShovel(AddedElse.material_para2).setUnlocalizedName(UnlocNames.tool_para2Shovel)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_para2Shovel);
				GameRegistry.registerItem(tool_para2Shovel, UnlocNames.tool_para2Shovel);
				
		// ***** Switch 1 *****
		tool_switch1Sword = new Tool_switch1Sword(AddedElse.material_switch1).setUnlocalizedName(UnlocNames.tool_switch1Sword)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_switch1Sword);
				GameRegistry.registerItem(tool_switch1Sword, UnlocNames.tool_switch1Sword);
								
		tool_switch1Axe = new Tool_switch1Axe(AddedElse.material_switch1).setUnlocalizedName(UnlocNames.tool_switch1Axe)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_switch1Axe);
				GameRegistry.registerItem(tool_switch1Axe, UnlocNames.tool_switch1Axe);
								
		tool_switch1Pick = new Tool_switch1Pick(AddedElse.material_switch1).setUnlocalizedName(UnlocNames.tool_switch1Pick)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_switch1Pick);
				GameRegistry.registerItem(tool_switch1Pick, UnlocNames.tool_switch1Pick);
								
		tool_switch1Shovel = new Tool_switch1Shovel(AddedElse.material_switch1).setUnlocalizedName(UnlocNames.tool_switch1Shovel)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_switch1Shovel);
				GameRegistry.registerItem(tool_switch1Shovel, UnlocNames.tool_switch1Shovel);
				
		// ***** Switch 2 *****
		tool_switch2Sword = new Tool_switch2Sword(AddedElse.material_switch2).setUnlocalizedName(UnlocNames.tool_switch2Sword)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_switch2Sword);
				GameRegistry.registerItem(tool_switch2Sword, UnlocNames.tool_switch2Sword);
										
		tool_switch2Axe = new Tool_switch2Axe(AddedElse.material_switch2).setUnlocalizedName(UnlocNames.tool_switch2Axe)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_switch2Axe);
				GameRegistry.registerItem(tool_switch2Axe, UnlocNames.tool_switch2Axe);
										
		tool_switch2Pick = new Tool_switch2Pick(AddedElse.material_switch2).setUnlocalizedName(UnlocNames.tool_switch2Pick)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_switch2Pick);
				GameRegistry.registerItem(tool_switch2Pick, UnlocNames.tool_switch2Pick);
										
		tool_switch2Shovel = new Tool_switch2Shovel(AddedElse.material_switch2).setUnlocalizedName(UnlocNames.tool_switch2Shovel)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_switch2Shovel);
				GameRegistry.registerItem(tool_switch2Shovel, UnlocNames.tool_switch2Shovel);
				
		// ***** Switch 2 *****
		tool_switch3Sword = new Tool_switch3Sword(AddedElse.material_switch3).setUnlocalizedName(UnlocNames.tool_switch3Sword)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_switch3Sword);
				GameRegistry.registerItem(tool_switch3Sword, UnlocNames.tool_switch3Sword);
												
		tool_switch3Axe = new Tool_switch3Axe(AddedElse.material_switch3).setUnlocalizedName(UnlocNames.tool_switch3Axe)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_switch3Axe);
				GameRegistry.registerItem(tool_switch3Axe, UnlocNames.tool_switch3Axe);
												
		tool_switch3Pick = new Tool_switch3Pick(AddedElse.material_switch3).setUnlocalizedName(UnlocNames.tool_switch3Pick)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_switch3Pick);
				GameRegistry.registerItem(tool_switch3Pick, UnlocNames.tool_switch3Pick);
												
		tool_switch3Shovel = new Tool_switch3Shovel(AddedElse.material_switch3).setUnlocalizedName(UnlocNames.tool_switch3Shovel)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_switch3Shovel);
				GameRegistry.registerItem(tool_switch3Shovel, UnlocNames.tool_switch3Shovel);
				
		// ***** Paraswitch *****
		tool_paraswitch1Pick = new Tool_paraswitch1Pick(AddedElse.material_paraswitch1).setUnlocalizedName(UnlocNames.tool_paraswitch1Pick)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_paraswitch1Pick);
				GameRegistry.registerItem(tool_paraswitch1Pick, UnlocNames.tool_paraswitch1Pick);
												
		tool_paraswitch1Shovel = new Tool_paraswitch1Shovel(AddedElse.material_paraswitch1).setUnlocalizedName(UnlocNames.tool_paraswitch1Shovel)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_paraswitch1Shovel);
				GameRegistry.registerItem(tool_paraswitch1Shovel, UnlocNames.tool_paraswitch1Shovel);
												
		tool_paraswitch2Pick = new Tool_paraswitch2Pick(AddedElse.material_paraswitch2).setUnlocalizedName(UnlocNames.tool_paraswitch2Pick)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_paraswitch2Pick);
				GameRegistry.registerItem(tool_paraswitch2Pick, UnlocNames.tool_paraswitch2Pick);
												
		tool_paraswitch2Shovel = new Tool_paraswitch2Shovel(AddedElse.material_paraswitch2).setUnlocalizedName(UnlocNames.tool_paraswitch2Shovel)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_paraswitch2Shovel);
				GameRegistry.registerItem(tool_paraswitch2Shovel, UnlocNames.tool_paraswitch2Shovel);
						
		// ***** Gluttyswitch *****
		tool_gluttyswitch1Pick = new Tool_gluttyswitch1Pick(AddedElse.material_gluttyswitch1).setUnlocalizedName(UnlocNames.tool_gluttyswitch1Pick)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_gluttyswitch1Pick);
				GameRegistry.registerItem(tool_gluttyswitch1Pick, UnlocNames.tool_gluttyswitch1Pick);
														
		tool_gluttyswitch1Shovel = new Tool_gluttyswitch1Shovel(AddedElse.material_gluttyswitch1).setUnlocalizedName(UnlocNames.tool_gluttyswitch1Shovel)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_gluttyswitch1Shovel);
				GameRegistry.registerItem(tool_gluttyswitch1Shovel, UnlocNames.tool_gluttyswitch1Shovel);
														
		tool_gluttyswitch2Pick = new Tool_gluttyswitch2Pick(AddedElse.material_gluttyswitch2).setUnlocalizedName(UnlocNames.tool_gluttyswitch2Pick)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_gluttyswitch2Pick);
				GameRegistry.registerItem(tool_gluttyswitch2Pick, UnlocNames.tool_gluttyswitch2Pick);
														
		tool_gluttyswitch2Shovel = new Tool_gluttyswitch2Shovel(AddedElse.material_gluttyswitch2).setUnlocalizedName(UnlocNames.tool_gluttyswitch2Shovel)
				.setCreativeTab(AddedElse.tabAncTB).setTextureName(Reference.MOD_ID + ":" + UnlocNames.tool_gluttyswitch2Shovel);
				GameRegistry.registerItem(tool_gluttyswitch2Shovel, UnlocNames.tool_gluttyswitch2Shovel);
			

	}
	//#############################
}
