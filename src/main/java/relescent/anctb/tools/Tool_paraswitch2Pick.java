package relescent.anctb.tools;

import relescent.anctb.AddedElse;
import relescent.anctb.AddedItems;
import relescent.anctb.lib.ConfigFile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Tool_paraswitch2Pick extends Tool_toolPickaxe{

	public Tool_paraswitch2Pick(ToolMaterial material) {
		super(material);
	}
	
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
	    ItemStack newTool = new ItemStack(AddedItems.tool_paraswitch2Shovel);
	    newTool.damageItem(itemstack.getItemDamage(), player);
	    //player.inventory.setInventorySlotContents(player.inventory.currentItem, newTool);
	    return newTool;
    }
    
    public boolean onBlockStartBreak(ItemStack itemstack, int X, int Y, int Z, EntityPlayer player)
    {
    	if(!player.worldObj.isRemote){
    		AddedElse.stealLife(player, 1);
    	}
        return false;
    }
}
