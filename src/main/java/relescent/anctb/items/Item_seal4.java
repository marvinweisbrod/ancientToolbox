package relescent.anctb.items;

import java.util.Random;

import cpw.mods.fml.common.network.NetworkRegistry.TargetPoint;
import relescent.anctb.AddedElse;
import relescent.anctb.AddedItems;
import relescent.anctb.AncTB;
import relescent.anctb.AddedElse.mobType;
import relescent.anctb.lib.Reference;
import relescent.anctb.lib.UnlocNames;
import relescent.anctb.packets.MessageParticles;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Item_seal4 extends Item {
	public Item_seal4(){
		super();
		this.setCreativeTab(AddedElse.tabAncTB);
		this.setTextureName(Reference.MOD_ID + ":" + UnlocNames.item_seal4);
	}
	
    public boolean onLeftClickEntity(ItemStack itemstack, EntityPlayer player, Entity target)
    {
    	if(target instanceof EntityBlaze){
    		ItemStack newItem = new ItemStack(AddedItems.item_seal4bla);
    		
    		if(!player.worldObj.isRemote){
    			AncTB.network.sendToAllAround(new MessageParticles(mobType.BLAZE, target.posX, target.posY, target.posZ), 
    					new TargetPoint(target.dimension, target.posX, target.posY, target.posZ, 30));
    		}
    		
	    	player.inventory.setInventorySlotContents(player.inventory.currentItem, newItem);
	    	
	    	target.setDead();
    	}
    	if(target instanceof EntitySkeleton){
    		if(((EntitySkeleton) target).getSkeletonType() == 1){
	    		ItemStack newItem = new ItemStack(AddedItems.item_seal4wit);
	    		
	    		if(!player.worldObj.isRemote){
	    			AncTB.network.sendToAllAround(new MessageParticles(mobType.WITHERSKELETON, target.posX, target.posY, target.posZ), 
	    					new TargetPoint(target.dimension, target.posX, target.posY, target.posZ, 30));
	    		}
	    		
		    	player.inventory.setInventorySlotContents(player.inventory.currentItem, newItem);
		    	
		    	target.setDead();
    		}
    	}
    	
    	if(target instanceof EntityPigZombie){
    		ItemStack newItem = new ItemStack(AddedItems.item_seal4pig);
    		
    		if(!player.worldObj.isRemote){
    			AncTB.network.sendToAllAround(new MessageParticles(mobType.PIGZOMBIE, target.posX, target.posY, target.posZ), 
    					new TargetPoint(target.dimension, target.posX, target.posY, target.posZ, 30));
    		}
    		
	    	player.inventory.setInventorySlotContents(player.inventory.currentItem, newItem);
	    	
	    	target.setDead();
    	}
    	
    	
        return false;
    }
}
