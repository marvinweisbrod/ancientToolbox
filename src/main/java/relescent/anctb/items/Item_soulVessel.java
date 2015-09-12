package relescent.anctb.items;

import relescent.anctb.lib.Reference;
import relescent.anctb.lib.UnlocNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Item_soulVessel extends Item{
	public Item_soulVessel(){
		super();
		this.setTextureName(Reference.MOD_ID + ":" + UnlocNames.item_soulVessel);
	}
}
