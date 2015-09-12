package relescent.anctb.blocks;

import relescent.anctb.AddedElse;
import relescent.anctb.lib.Reference;
import relescent.anctb.lib.UnlocNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Block_testContainer extends Block{

	public Block_testContainer(Material material) {
		super(material);
		this.setCreativeTab(AddedElse.tabAncTB);
		this.setBlockTextureName(Reference.MOD_ID + ":" + UnlocNames.block_testContainer);
		this.setHardness(4.5F);
		this.setResistance(20.0F);
	}

}
