package relescent.anctb.items;

import java.util.Random;

import cpw.mods.fml.common.network.NetworkRegistry.TargetPoint;
import relescent.anctb.AddedElse;
import relescent.anctb.AddedElse.mobType;
import relescent.anctb.AddedItems;
import relescent.anctb.AncTB;
import relescent.anctb.lib.Reference;
import relescent.anctb.lib.UnlocNames;
import relescent.anctb.packets.MessageParticles;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Item_seal2 extends Item{
	public Item_seal2(){
		super();
		this.setCreativeTab(AddedElse.tabAncTB);
		this.setTextureName(Reference.MOD_ID + ":" + UnlocNames.item_seal2);
	}
	/*
    public boolean onLeftClickEntity(ItemStack itemstack, EntityPlayer player, Entity target)
    {
    	if(target instanceof EntityZombie){
    		ItemStack newItem = new ItemStack(AddedItems.item_seal2zom);
    		
    		if(player.worldObj.isRemote){
		    	Random rand = new Random();
		    	double shadeRand;
		    	for(int i=0;i<80;i++){
		    		shadeRand = rand.nextGaussian();
		    		player.worldObj.spawnParticle("mobSpell", target.posX +rand.nextFloat()-0.5F, target.posY+rand.nextFloat()*1.8F+0.3F, target.posZ+rand.nextFloat()-0.5F,
						shadeRand * 0.2D+0.1D, shadeRand * 0.2D+0.3D, shadeRand * 0.2D+0.1D);
		    	}
    		}
    		
	    	player.inventory.setInventorySlotContents(player.inventory.currentItem, newItem);
	    	
	    	target.setDead();
    	}
    	if(target instanceof EntitySkeleton){
    		ItemStack newItem = new ItemStack(AddedItems.item_seal2skel);
    		
    		if(player.worldObj.isRemote){
		    	Random rand = new Random();
		    	double shadeRand;
		    	for(int i=0;i<80;i++){
		    		shadeRand = rand.nextGaussian();
		    		player.worldObj.spawnParticle("mobSpell", target.posX +rand.nextFloat()-0.5F, target.posY+rand.nextFloat()*1.8F+0.3F, target.posZ+rand.nextFloat()-0.5F,
		    				shadeRand * 0.1D + 0.6D, shadeRand * 0.1D+0.6D, shadeRand * 0.1D + 0.6D);
		    	}
    		}
    		
	    	player.inventory.setInventorySlotContents(player.inventory.currentItem, newItem);
	    	
	    	target.setDead();
    	}
        return false;
    }
    */
	
    public boolean onLeftClickEntity(ItemStack itemstack, EntityPlayer player, Entity target)
    {
    	if(target instanceof EntityZombie){
    		ItemStack newItem = new ItemStack(AddedItems.item_seal2zom);
    		
    		if(!player.worldObj.isRemote){
    			AncTB.network.sendToAllAround(new MessageParticles(mobType.SKELETON, target.posX, target.posY, target.posZ), 
    					new TargetPoint(target.dimension, target.posX, target.posY, target.posZ, 30));
    		}
    		
	    	player.inventory.setInventorySlotContents(player.inventory.currentItem, newItem);
	    	
	    	target.setDead();
    	}
    	if(target instanceof EntitySkeleton){
    		ItemStack newItem = new ItemStack(AddedItems.item_seal2skel);
    		
    		if(!player.worldObj.isRemote){
    			AncTB.network.sendToAllAround(new MessageParticles(mobType.SKELETON, target.posX, target.posY, target.posZ), 
    					new TargetPoint(target.dimension, target.posX, target.posY, target.posZ, 30));
    		}
    		
	    	player.inventory.setInventorySlotContents(player.inventory.currentItem, newItem);
	    	
	    	target.setDead();
    	}
        return false;
    }
}
