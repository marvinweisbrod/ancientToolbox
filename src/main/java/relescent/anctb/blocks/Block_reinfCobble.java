package relescent.anctb.blocks;

import relescent.anctb.AddedElse;
import relescent.anctb.AncTB;
import relescent.anctb.lib.Reference;
import relescent.anctb.lib.UnlocNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Block_reinfCobble extends Block{
	
	public Block_reinfCobble(Material material) {
		super(material);
		this.setCreativeTab(AddedElse.tabAncTB);
		this.setBlockTextureName(Reference.MOD_ID + ":" + UnlocNames.block_reinfCobble);
		this.setHardness(4.5F);
		this.setResistance(20.0F);
	}

}
