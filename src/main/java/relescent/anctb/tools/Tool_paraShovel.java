package relescent.anctb.tools;

import relescent.anctb.AddedElse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class Tool_paraShovel extends Tool_toolShovel{

	public Tool_paraShovel(ToolMaterial material) {
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
    public boolean onBlockStartBreak(ItemStack itemstack, int X, int Y, int Z, EntityPlayer player)
    {
    	if(!player.worldObj.isRemote){
    		AddedElse.stealLife(player, 2);
    	}
        return false;
    }
	
}
