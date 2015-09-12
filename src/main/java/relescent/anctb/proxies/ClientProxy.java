package relescent.anctb.proxies;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.common.MinecraftForge;
import relescent.anctb.AddedElse.mobType;
import relescent.anctb.event.anctbEventHandler;
import relescent.anctb.gui.GuiRendering;
import relescent.anctb.lib.ConfigFile;
import relescent.anctb.lib.Reference;
import relescent.anctb.packets.Particles;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders() {
		MinecraftForge.EVENT_BUS.register(new GuiRendering(Minecraft.getMinecraft()));
	}
	
	@Override
	public void printToChatClient(String string){
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(string));
	}
	
	@Override
	public void messageParticleRenderer(mobType type, double posX, double posY, double posZ){
		Particles.spawnParticle(type, Minecraft.getMinecraft().theWorld, posX, posY, posZ);
	}

	@Override
	public void syncHealth(int lifeSteal, int healthChange){
		// set player health clientside
		Minecraft.getMinecraft().thePlayer.setHealth(Minecraft.getMinecraft().thePlayer.getHealth() + healthChange);
		// save my playerdata clientside
		NBTTagCompound tag = Minecraft.getMinecraft().thePlayer.getEntityData();
		tag.setInteger("anctbLifeSteal", lifeSteal);
	}
	
	@Override
	public float getHealthClient(){
		return Minecraft.getMinecraft().thePlayer.getHealth();
	}
}
