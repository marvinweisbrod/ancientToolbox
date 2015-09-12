package relescent.anctb.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingHealEvent;
import relescent.anctb.AncTB;
import relescent.anctb.lib.ConfigFile;
import relescent.anctb.lib.Reference;
import relescent.anctb.packets.MessageHealth;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class anctbEventHandler {
	
	public static final int maxLeechHealth = 4;
	public static final float lifeStealMax = 300;
	
	@SubscribeEvent(priority = EventPriority.HIGH)
	public void cancelHealWithLeech(LivingHealEvent event) {
		if (!event.entityLiving.worldObj.isRemote) {
			// if entityliving is a player
			if (event.entityLiving instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) event.entityLiving;

				// get my playerdata
				NBTTagCompound tag = player.getEntityData();
				int lifeSteal = tag.getInteger("anctbLifeSteal");

				// if he has some lifeSteal
				if (lifeSteal > 0) {
					// if he already has max life
					if (player.getHealth() >= player.getMaxHealth() - 
							(lifeSteal / anctbEventHandler.lifeStealMax * 20.0F)) {
						// cancel heal event and subtract exhaustion 
						// to prevent player from loosing saturation
						if (event.isCancelable())
							event.setCanceled(true);

						// if player would have his full max life back next turn, 
						// set it to 0 to give lifeStealMax/20 'free blocks'
						if (lifeSteal == lifeStealMax / 20 || lifeSteal == lifeStealMax / 20 + 1){
							tag.setInteger("anctbLifeSteal", 0);
							lifeSteal = 0;
						}
						// else decrement lifeSteal
						else{
							tag.setInteger("anctbLifeSteal", lifeSteal - 2);
							lifeSteal = lifeSteal -2;
						}
						
					}
					AncTB.network.sendTo(new MessageHealth(lifeSteal, 0), (EntityPlayerMP)player);
					// if player uses my toolset he 
					// will be regenerating all over the place
					// so, subtracting exhaustion 
					// (happens only if he has lifeSteal)
					player.addExhaustion(-3.0F);
				}
			}
		}
	}
	
	@SubscribeEvent(priority = EventPriority.HIGH)
	public void addAdditionalPlayerdata(EntityJoinWorldEvent event) {
		if (!event.world.isRemote) {
			if (event.entity instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) event.entity;

				NBTTagCompound tag = player.getEntityData();
				tag.setInteger("anctbLifeSteal", 0);
			}
		}
	}

	@SubscribeEvent(priority = EventPriority.LOW)
    public void onPlayerLogin(PlayerLoggedInEvent event) {
		if(event.player.worldObj.isRemote){
			if(ConfigFile.cfg_loginInfo){
				event.player.addChatMessage(new ChatComponentText("[Ancient Toolbox] v" +Reference.MOD_VER + "----------------"));
				event.player.addChatMessage(new ChatComponentText("Configuration:"));
				event.player.addChatMessage(new ChatComponentText("Main menu -> mods -> this mod -> config"));
				event.player.addChatMessage(new ChatComponentText("Sorry, no config UI yet :("));
				event.player.addChatMessage(new ChatComponentText("-------------------------------"));
			}
		}
    }

}
