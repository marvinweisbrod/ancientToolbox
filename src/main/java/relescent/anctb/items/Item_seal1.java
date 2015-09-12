package relescent.anctb.items;

import relescent.anctb.AddedElse;
import relescent.anctb.AncTB;
import relescent.anctb.lib.Reference;
import relescent.anctb.lib.UnlocNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Item_seal1 extends Item{
	public Item_seal1(){
		super();
		this.setCreativeTab(AddedElse.tabAncTB);
		this.setTextureName(Reference.MOD_ID + ":" + UnlocNames.item_seal1);
	}
}
