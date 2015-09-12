package relescent.anctb.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import relescent.anctb.AncTB;
import relescent.anctb.lib.Reference;
import relescent.anctb.lib.UnlocNames;

public class Item_handle extends Item{
	
	public Item_handle(){
		super();
		//this.setCreativeTab(Toolility.tabToolility);
		this.setTextureName(Reference.MOD_ID + ":" + UnlocNames.item_handle);
	}
}
