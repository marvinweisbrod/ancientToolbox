package relescent.anctb.tools;

import relescent.anctb.AddedItems;
import relescent.anctb.lib.ConfigFile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Tool_switch3Pick extends Tool_toolPickaxe{

	public Tool_switch3Pick(ToolMaterial material) {
		super(material);
	}
	
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
	    ItemStack newTool = new ItemStack(AddedItems.tool_switch3Shovel);
	    newTool.damageItem(itemstack.getItemDamage(), player);
	    //player.inventory.setInventorySlotContents(player.inventory.currentItem, newTool);
	    return newTool;
    }
}
