package relescent.anctb.tools;

import relescent.anctb.AddedItems;
import relescent.anctb.lib.ConfigFile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Tool_switch2Pick extends Tool_toolPickaxe{

	public Tool_switch2Pick(ToolMaterial material) {
		super(material);
	}
	
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
	    ItemStack newTool = new ItemStack(AddedItems.tool_switch2Shovel);
	    newTool.damageItem(itemstack.getItemDamage(), player);
	    //player.inventory.setInventorySlotContents(player.inventory.currentItem, newTool);
	    return newTool;
    }
}
