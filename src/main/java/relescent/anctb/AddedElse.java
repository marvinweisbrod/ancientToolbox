package relescent.anctb;

import cpw.mods.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.EnumHelper;
import relescent.anctb.event.anctbEventHandler;
import relescent.anctb.packets.MessageHealth;
import relescent.anctb.packets.MessageParticles;

public class AddedElse {
	
	public enum mobType {ZOMBIE, SKELETON, CREEPER, SPIDER, ENDERMAN, PIGZOMBIE, BLAZE, WITHERSKELETON, WITHER, GHAST}
	
	//Balancing
	public static final int balance_dwarf1_mult_hp = 1;
	public static final int balance_dwarf1_mult_dmg = 1;
	
	
	public static CreativeTabs tabAncTB = new CreativeTabs(CreativeTabs.getNextID(),"tabAncTB"){
		@Override
		public Item getTabIconItem(){
			return AddedItems.tool_switch2Pick;
		}
	};
	
	/********************* Tool Materials **********************
	 * Harvest level:
     *   Wood/Gold Tool: 0
     *   Stone Tool: 1
     *   Iron Tool: 2
     *   Diamond Tool: 3
     *   
     * Durability:
     *   Wood Tool: 59
     *   Stone Tool: 131
     *   Iron Tool: 250
     *   Diamond Tool: 1561
     *   Gold Tool: 32
     *   
     * Mining Speed:
     *   Wood Tool: 2.0F
     *   Stone Tool: 4.0F
     *   Iron Tool: 6.0F
     *   Diamond Tool: 8.0F
     *   Gold Tool: 12.0F
     *   
     * Damage VS Entities:
     *   Wood Tool: 0.0F (Sword adds 4.0 damage)
     *   Stone Tool: 1.0F (Sword adds 5.0 damage)
     *   Iron Tool: 2.0F (Sword adds 6.0 damage)
     *   Diamond Tool: 3.0F (Sword adds 7.0 damage)
     *   Gold Tool: 0.0F (Sword adds 4.0 damage)
     *   
     * Enchantability:
     *   Wood Tool: 15
     *   Stone Tool: 5
     *   Iron Tool: 14
     *   Diamond Tool: 10
     *   Gold Tool: 22
	 */
	public static final Item.ToolMaterial material_reinf = EnumHelper.addToolMaterial("material_reinf", 1, 250, 4.5F, 1.5F, 30);
	
	public static final Item.ToolMaterial material_gluttony1 = EnumHelper.addToolMaterial("material_gluttony1", 1, 20, 4F, 1.0F, 0);
	public static final Item.ToolMaterial material_gluttony2 = EnumHelper.addToolMaterial("material_gluttony2", 2, 30, 5F, 2.0F, 0);
	public static final Item.ToolMaterial material_gluttyswitch1 = EnumHelper.addToolMaterial("material_gluttyswitch1", 2, 40, 6F, 2.0F, 0);
	public static final Item.ToolMaterial material_gluttyswitch2 = EnumHelper.addToolMaterial("material_gluttyswitch2", 3, 50, 7F, 3.0F, 0);	
	
	public static final Item.ToolMaterial material_para1 = EnumHelper.addToolMaterial("material_para1", 1, -1, 6F, 1.0F, 0);
	public static final Item.ToolMaterial material_para2 = EnumHelper.addToolMaterial("material_para2", 2, -1, 7F, 2.0F, 0);
	public static final Item.ToolMaterial material_paraswitch1 = EnumHelper.addToolMaterial("material_paraswitch1", 2, -1, 8F, 2.0F, 0);
	public static final Item.ToolMaterial material_paraswitch2 = EnumHelper.addToolMaterial("material_paraswitch2", 3, -1, 9F, 3.0F, 0);	
	
	public static final Item.ToolMaterial material_switch1 = EnumHelper.addToolMaterial("material_switch1", 1, 400, 4F, 1.5F, 0);
	public static final Item.ToolMaterial material_switch2 = EnumHelper.addToolMaterial("material_switch2", 2, 700, 6F, 2.0F, 0);
	public static final Item.ToolMaterial material_switch3 = EnumHelper.addToolMaterial("material_switch3", 3, 2000, 8F, 3.0F, 0);


	
	/********************* Tool Materials End *******************/
	
	public static void stealLife(EntityPlayer player, int stealAmount){
		if(!player.worldObj.isRemote){
			// get my playerdata and set it with 1 added
			EntityPlayerMP playerMP = (EntityPlayerMP)player;
			NBTTagCompound tag = player.getEntityData();
			int lifeSteal = tag.getInteger("anctbLifeSteal")+stealAmount;
			tag.setInteger("anctbLifeSteal", lifeSteal);
			
			// calculate new max life
			int newMax = (int)player.getMaxHealth()-(int)(lifeSteal/anctbEventHandler.lifeStealMax*20.0F);
			// kill the player if max life reaches 0 (item gets lost otherwise)
			if(newMax == 0){
				tag.setInteger("anctbLifeSteal", 0);
				player.setDead();
			}
			// decrease his health if it is above max life
			if(player.getHealth() > newMax){
				// sending packet to the client with new lifeSteal value and health to add (negative to decrease)
				AncTB.network.sendTo(new MessageHealth(lifeSteal, newMax-(int)player.getHealth()), playerMP);
				player.setHealth(newMax);// setting health on server
			}else{
				//if(lifeSteal % (anctbEventHandler.lifeStealMax/20) == 0)
					AncTB.network.sendTo(new MessageHealth(lifeSteal, 0), playerMP);
			}
		}
	}
	
}
