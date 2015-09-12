package relescent.anctb.tools;

import relescent.anctb.AddedItems;
import relescent.anctb.lib.ConfigFile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Tool_switch2Shovel extends Tool_toolShovel{

	public Tool_switch2Shovel(ToolMaterial material) {
		super(material);
	}
	
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
		 ItemStack newTool = new ItemStack(AddedItems.tool_switch2Pick);
		 newTool.damageItem(itemstack.getItemDamage(), player);
		 //player.inventory.setInventorySlotContents(player.inventory.currentItem, newTool);
		 return newTool;
    }
}
