package relescent.anctb.tools;

import relescent.anctb.AddedElse;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class Tool_paraPick extends Tool_toolPickaxe{

	public Tool_paraPick(ToolMaterial material) {
		super(material);
	}
	
    public boolean onBlockStartBreak(ItemStack itemstack, int X, int Y, int Z, EntityPlayer player)
    {
    	if(!player.worldObj.isRemote){
    		AddedElse.stealLife(player, 2);
    	}
        return false;
    }

}
