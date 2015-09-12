package relescent.anctb.tools;

import relescent.anctb.AddedItems;
import relescent.anctb.lib.ConfigFile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Tool_switch3Axe extends Tool_toolAxe{

	public Tool_switch3Axe(ToolMaterial material) {
		super(material);
	}
	
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
	    ItemStack newTool = new ItemStack(AddedItems.tool_switch3Sword);
	    newTool.damageItem(itemstack.getItemDamage(), player);
	    //player.inventory.setInventorySlotContents(player.inventory.currentItem, newTool);
	    return newTool;
    }

    /**
     * Called when a player drops the item into the world,
     * returning false from this will prevent the item from
     * being removed from the players inventory and spawning
     * in the world
     *
     * @param player The player that dropped the item
     * @param item The item stack, before the item is removed.
     */
    /*
	@Override
    public boolean onDroppedByPlayer(ItemStack itemstack, EntityPlayer player)
    {
		if(ConfigFile.cfg_switchAlt){
			ItemStack newTool = new ItemStack(AddedItems.tool_switch3Sword);
			newTool.damageItem(itemstack.getItemDamage(), player);
			player.entityDropItem(newTool, 1.0F);
			player.destroyCurrentEquippedItem();
	        return false;
		}
		return true;
    }
	*/
}
