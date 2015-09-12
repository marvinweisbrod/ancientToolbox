package relescent.anctb.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import relescent.anctb.event.anctbEventHandler;
import relescent.anctb.lib.ConfigFile;
import relescent.anctb.lib.Reference;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class GuiRendering extends Gui{	
	
	private Minecraft mc;
	
	private ResourceLocation icons;
	private int fullHearts;
	private NBTTagCompound tag;
	private int lifeStolen;
	private int xPos;
	private int yPos;
	private FontRenderer fontRender;
	private static final String textRender1 = "Heart limit: ";
	
	private static final int heartBarHalfX = 54;
	private static final int heartBarHalfY = 0;
	private static final int heartBarHalfSizeX = 9;
	private static final int heartBarHalfSizeY = 11;
	
	private static final int heartBarFullX = 45;
	private static final int heartBarFullY = 0;
	private static final int heartBarFullSizeX = 9;
	private static final int heartBarFullSizeY = 11;
	
	private static final int heartDarkHalfX = 36;
	private static final int heartDarkHalfY = 0;
	private static final int heartDarkHalfSizeX = 9;
	private static final int heartDarkHalfSizeY = 11;
	
	private static final int heartDarkFullX = 27;
	private static final int heartDarkFullY = 0;
	private static final int heartDarkFullSizeX = 9;
	private static final int heartDarkFullSizeY = 11;
	
	  public GuiRendering(Minecraft mc)
	  {
	    super();
	    this.mc = mc;
	    
	    icons =  new ResourceLocation(Reference.MOD_ID, "textures/gui/icons.png");
	  }
	  
	  @SubscribeEvent
	  public void eventHandler(RenderGameOverlayEvent.Text event){//This event for drawing strings on the screen.
		  if(ConfigFile.cfg_lifeStealText){
			  fontRender = mc.fontRenderer;
			  mc.entityRenderer.setupOverlayRendering();
			  tag = mc.thePlayer.getEntityData();
			  // draw
			  this.drawString(mc.fontRenderer, textRender1 + (mc.thePlayer.getMaxHealth()/2*(1-(tag.getInteger("anctbLifeSteal")/anctbEventHandler.lifeStealMax))), 5, event.resolution.getScaledHeight()-5-mc.fontRenderer.FONT_HEIGHT, 0x592828);
		  }
	  }
	  
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onRenderExperienceBar(RenderGameOverlayEvent event) {
		if (ConfigFile.cfg_lifeStealVisual) {
			if (event.isCancelable() || event.type != ElementType.EXPERIENCE) {
				return;
			}
			xPos = event.resolution.getScaledWidth() / 2 - 19;
			yPos = event.resolution.getScaledHeight() - 41;

			mc.entityRenderer.setupOverlayRendering();

			mc.renderEngine.bindTexture(icons);

			tag = mc.thePlayer.getEntityData();
			lifeStolen = (int) (20 * (float) tag.getInteger("anctbLifeSteal") / anctbEventHandler.lifeStealMax);
			fullHearts = lifeStolen / 2;
			if(!ConfigFile.cfg_lifeStealVisAlt){
				for (int i = 0; i < fullHearts; i++) {
					this.drawTexturedModalRect(xPos, yPos, heartDarkFullX,
							heartDarkFullY, heartDarkFullSizeX, heartDarkFullSizeY);
					xPos = xPos - 8;
				}
				if (lifeStolen % 2 == 1) {
					this.drawTexturedModalRect(xPos, yPos, heartDarkHalfX,
							heartDarkHalfY, heartDarkHalfSizeX, heartDarkHalfSizeY);
				}
			}else{
				for (int i = 0; i < fullHearts; i++) {
					this.drawTexturedModalRect(xPos, yPos, heartBarFullX,
							heartBarFullY, heartBarFullSizeX, heartBarFullSizeY);
					xPos = xPos - 8;
				}
				if (lifeStolen % 2 == 1) {
					this.drawTexturedModalRect(xPos, yPos, heartBarHalfX,
							heartBarHalfY, heartBarHalfSizeX, heartBarHalfSizeY);
				}
			}
		}
	}
}
