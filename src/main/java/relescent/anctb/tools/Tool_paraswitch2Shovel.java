package relescent.anctb.tools;

import relescent.anctb.AddedElse;
import relescent.anctb.AddedItems;
import relescent.anctb.lib.ConfigFile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Tool_paraswitch2Shovel extends Tool_toolShovel{

	public Tool_paraswitch2Shovel(ToolMaterial material) {
		super(material);
	}
	
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
	    ItemStack newTool = new ItemStack(AddedItems.tool_paraswitch2Pick);
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
