package relescent.anctb.lib;

import relescent.anctb.AncTB;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;

public class ConfigGui extends GuiConfig{
	
	public ConfigGui(GuiScreen screen) {
		super(screen, new ConfigElement(AncTB.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), 
				Reference.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(AncTB.config.toString()));
	}

}
