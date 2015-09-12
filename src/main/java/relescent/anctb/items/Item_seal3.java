package relescent.anctb.items;

import java.util.Random;

import cpw.mods.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import relescent.anctb.AddedElse;
import relescent.anctb.AddedItems;
import relescent.anctb.AncTB;
import relescent.anctb.AddedElse.mobType;
import relescent.anctb.lib.Reference;
import relescent.anctb.lib.UnlocNames;
import relescent.anctb.packets.MessageParticles;

public class Item_seal3 extends Item{
	public Item_seal3(){
		super();
		this.setCreativeTab(AddedElse.tabAncTB);
		this.setTextureName(Reference.MOD_ID + ":" + UnlocNames.item_seal3);
	}
	
    public boolean onLeftClickEntity(ItemStack itemstack, EntityPlayer player, Entity target)
    {
    	if(target instanceof EntitySpider){
    		ItemStack newItem = new ItemStack(AddedItems.item_seal3spi);
    		
    		if(!player.worldObj.isRemote){
    			AncTB.network.sendToAllAround(new MessageParticles(mobType.SPIDER, target.posX, target.posY, target.posZ), 
    					new TargetPoint(target.dimension, target.posX, target.posY, target.posZ, 30));
    		}
    		
	    	player.inventory.setInventorySlotContents(player.inventory.currentItem, newItem);
	    	
	    	target.setDead();
    	}
    	if(target instanceof EntityEnderman){
    		ItemStack newItem = new ItemStack(AddedItems.item_seal3end);
    		
    		if(!player.worldObj.isRemote){
    			AncTB.network.sendToAllAround(new MessageParticles(mobType.ENDERMAN, target.posX, target.posY, target.posZ), 
    					new TargetPoint(target.dimension, target.posX, target.posY, target.posZ, 30));
    		}
    		
	    	player.inventory.setInventorySlotContents(player.inventory.currentItem, newItem);
	    	
	    	target.setDead();
    		
    	}
    	
    	
    	
        return false;
    }
}
