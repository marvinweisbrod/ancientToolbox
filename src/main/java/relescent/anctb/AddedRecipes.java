package relescent.anctb;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class AddedRecipes {
	
	public static void initRecipes(){
		
		
		GameRegistry.addRecipe(new ItemStack(AddedBlocks.block_reinfCobble, 3), new Object[]{"CFC","CCC","CFC", 'C', Blocks.cobblestone, 'F', Items.flint});
		GameRegistry.addRecipe(new ItemStack(AddedItems.item_switchegg), new Object[]{"RER"," W ","R R", 'R', AddedBlocks.block_reinfCobble, 'E', Items.egg, 'W', Items.water_bucket});
		GameRegistry.addRecipe(new ItemStack(AddedItems.item_seal1), new Object[]{"RRR","R R","RRR", 'C', Blocks.cobblestone, 'R', AddedBlocks.block_reinfCobble});
		GameRegistry.addRecipe(new ItemStack(AddedItems.item_seal2), new Object[]{"RTB","TST","BTR", 'T', Items.string, 'S', AddedItems.item_seal1, 'R', new ItemStack(Items.dye, 1, 1), 'B', Items.bone});
		GameRegistry.addRecipe(new ItemStack(AddedItems.item_seal3), new Object[]{"RTB","TST","BTR", 'T', Items.iron_ingot, 'S', AddedItems.item_seal1, 'R', Items.redstone, 'B', Items.bone});
		GameRegistry.addRecipe(new ItemStack(AddedItems.item_seal4), new Object[]{"RTB","TST","BTR", 'T', Items.gold_ingot, 'S', AddedItems.item_seal1, 'R', Items.lava_bucket, 'B', Items.bone});
		
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_reinfPick), new Object[]{"RRR"," W "," W ", 'R', AddedBlocks.block_reinfCobble, 'W', Items.stick});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_reinfShovel), new Object[]{" R "," W "," W ", 'R', AddedBlocks.block_reinfCobble, 'W', Items.stick});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_reinfAxe), new Object[]{"RR ","RW "," W ", 'R', AddedBlocks.block_reinfCobble, 'W', Items.stick});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_reinfSword), new Object[]{" R "," R "," W ", 'R', AddedBlocks.block_reinfCobble, 'W', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_gluttony1Pick), new Object[]{" RR"," SR","T  ", 'R', AddedBlocks.block_reinfCobble, 'T', AddedItems.tool_reinfPick, 'S', AddedItems.item_seal2zom});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_gluttony1Shovel), new Object[]{"  R"," S ","T  ", 'R', AddedBlocks.block_reinfCobble, 'T', AddedItems.tool_reinfShovel, 'S', AddedItems.item_seal2zom});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_gluttony2Pick), new Object[]{" RR"," SR","T  ", 'R', Items.iron_ingot, 'T', AddedItems.tool_gluttony1Pick, 'S', AddedItems.item_seal3end});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_gluttony2Shovel), new Object[]{"  R"," S ","T  ", 'R', Items.iron_ingot, 'T', AddedItems.tool_gluttony1Shovel, 'S', AddedItems.item_seal3end});
		
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_para1Pick), new Object[]{" G "," SG","T  ", 'G', Items.gold_ingot, 'T', AddedItems.tool_reinfPick, 'S', AddedItems.item_seal2skel});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_para1Shovel), new Object[]{"  S"," G ","T  ", 'G', Items.gold_ingot, 'T', AddedItems.tool_reinfShovel, 'S', AddedItems.item_seal2skel});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_para2Pick), new Object[]{" I "," SI","T  ", 'I', Items.iron_ingot, 'T', AddedItems.tool_para1Pick, 'S', AddedItems.item_seal3spi});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_para2Shovel), new Object[]{"  I"," S ","T  ", 'I', Items.iron_ingot, 'T', AddedItems.tool_para1Shovel, 'S', AddedItems.item_seal3spi});
		
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_gluttyswitch1Pick), 
				new Object[]{"PTS", 'T', AddedItems.tool_switch2Pick, 'S', AddedItems.tool_gluttony2Shovel, 'P', AddedItems.tool_gluttony2Pick});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_gluttyswitch1Pick), 
				new Object[]{"PTS", 'T', AddedItems.tool_switch2Shovel, 'S', AddedItems.tool_gluttony2Shovel, 'P', AddedItems.tool_gluttony2Pick});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_paraswitch1Pick), 
				new Object[]{"PTS"," D ", 'T', AddedItems.tool_switch2Pick, 'S', AddedItems.tool_para2Shovel, 'P', AddedItems.tool_para2Pick, 'D', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_paraswitch1Pick), 
				new Object[]{"PTS"," D ", 'T', AddedItems.tool_switch2Shovel, 'S', AddedItems.tool_para2Shovel, 'P', AddedItems.tool_para2Pick, 'D', Items.diamond});
		
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_paraswitch2Pick), 
				new Object[]{"  S"," T ","D  ", 'T', AddedItems.tool_paraswitch1Pick, 'S', AddedItems.item_seal4bla, 'D', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_paraswitch2Pick), 
				new Object[]{"  S"," T ","D  ", 'T', AddedItems.tool_paraswitch1Shovel, 'S', AddedItems.item_seal4bla, 'D', Items.diamond});
		
		
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_gluttyswitch2Pick), 
				new Object[]{"G S"," T ","D G", 'T', AddedItems.tool_gluttyswitch1Pick, 'S', AddedItems.item_seal4wit, 'D', Items.diamond, 'G', Items.gold_ingot});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_gluttyswitch2Pick), 
				new Object[]{"G S"," T ","D G", 'T', AddedItems.tool_gluttyswitch1Shovel, 'S', AddedItems.item_seal4wit, 'D', Items.diamond, 'G', Items.gold_ingot});
		
		
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_switch1Pick), 
				new Object[]{"PES", 'P', AddedItems.tool_reinfPick, 'S', AddedItems.tool_reinfShovel, 'E', AddedItems.item_switchegg});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_switch1Sword), 
				new Object[]{"AES",  'A', AddedItems.tool_reinfAxe, 'S', AddedItems.tool_reinfSword, 'E', AddedItems.item_switchegg});
		
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_switch2Pick), 
				new Object[]{" II","YTI","IY ", 'T', AddedItems.tool_switch1Pick, 'I', Items.iron_ingot, 'Y', new ItemStack(Items.dye, 1, 11)});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_switch2Pick), 
				new Object[]{" II","YTI","IY ", 'T', AddedItems.tool_switch1Shovel, 'I', Items.iron_ingot, 'Y', new ItemStack(Items.dye, 1, 11)});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_switch2Sword), 
				new Object[]{" II","YTI","IY ",  'T', AddedItems.tool_switch1Axe, 'I', Items.iron_ingot, 'Y', new ItemStack(Items.dye, 1, 11)});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_switch2Sword), 
				new Object[]{" II","YTI","IY ",  'T', AddedItems.tool_switch1Sword, 'I', Items.iron_ingot, 'Y', new ItemStack(Items.dye, 1, 11)});
		
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_switch3Pick), 
				new Object[]{" DD","RTD","GR ", 'T', AddedItems.tool_switch2Pick, 'D', Items.diamond, 'G', Items.gold_ingot, 'R', Items.redstone});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_switch3Pick), 
				new Object[]{" DD","RTD","GR ", 'T', AddedItems.tool_switch2Shovel, 'D', Items.diamond, 'G', Items.gold_ingot, 'R', Items.redstone});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_switch3Sword), 
				new Object[]{" DD","RTD","GR ", 'T', AddedItems.tool_switch2Axe, 'D', Items.diamond, 'G', Items.gold_ingot, 'R', Items.redstone});
		GameRegistry.addRecipe(new ItemStack(AddedItems.tool_switch3Sword), 
				new Object[]{" DD","RTD","GR ", 'T', AddedItems.tool_switch2Sword, 'D', Items.diamond, 'G', Items.gold_ingot, 'R', Items.redstone});
	}

}
