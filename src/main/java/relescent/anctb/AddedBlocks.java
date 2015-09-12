package relescent.anctb;

import relescent.anctb.blocks.Block_reinfCobble;
import relescent.anctb.blocks.Block_testContainer;
import relescent.anctb.lib.UnlocNames;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AddedBlocks {
	//#############################
	
	public static Block block_reinfCobble;
	public static Block block_testContainer;
	
	//#############################
	public static void initBlocks(){
		
		block_reinfCobble = new Block_reinfCobble(Material.rock).setBlockName(UnlocNames.block_reinfCobble);
			GameRegistry.registerBlock(block_reinfCobble, UnlocNames.block_reinfCobble);
		
	}
	//#############################
}
