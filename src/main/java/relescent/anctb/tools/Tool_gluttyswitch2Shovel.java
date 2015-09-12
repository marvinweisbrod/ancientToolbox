package relescent.anctb.tools;

import relescent.anctb.AddedItems;
import relescent.anctb.lib.ConfigFile;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Tool_gluttyswitch2Shovel extends Tool_toolShovel{

	public Tool_gluttyswitch2Shovel(ToolMaterial material) {
		super(material);
	}

    /**
     * Called before a block is broken.  Return true to prevent default block harvesting.
     *
     * Note: In SMP, this is called on both client and server sides!
     *
     * @param itemstack The current ItemStack
     * @param X The X Position
     * @param Y The X Position
     * @param Z The X Position
     * @param player The Player that is wielding the item
     * @return True to prevent harvesting, false to continue as normal
     */
	@Override
    public boolean onBlockStartBreak(ItemStack itemstack, int x, int y, int z, EntityPlayer player)
    {
		Block block = player.getEntityWorld().getBlock(x, y, z);
		if(block == Blocks.dirt || block == Blocks.grass){
			if(itemstack.getItemDamage()>=2)
				itemstack.damageItem(-2, player);
			if(itemstack.getItemDamage()== 1)
				itemstack.damageItem(-1, player);
			if (!player.getEntityWorld().isRemote) {
					player.getEntityWorld().func_147480_a(x, y, z, false);//destroyBlock method
			}
			return true;
		}
        return false;
    }
	
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
    {
	    ItemStack newTool = new ItemStack(AddedItems.tool_gluttyswitch2Pick);
	    newTool.damageItem(itemstack.getItemDamage(), player);
	    //player.inventory.setInventorySlotContents(player.inventory.currentItem, newTool);
	    return newTool;
    }
}
