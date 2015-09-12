package relescent.anctb.lib;

import relescent.anctb.AncTB;
import cpw.mods.fml.common.FMLCommonHandler;

public class ConfigFile {
	
	public static boolean cfg_loginInfo;
	public static final boolean cfg_loginInfo_default = true;
	public static final String cfg_loginInfo_name = "Login message";
	
	public static boolean cfg_packetDebug;
	public static final boolean cfg_packetDebug_default = false;
	public static final String cfg_packetDebug_name = "Cient: Show bad packets in chat";
	
	public static boolean cfg_lifeStealText;
	public static final boolean cfg_lifeStealText_default = false;
	public static final String cfg_lifeStealText_name = "(text) Exact heart limit";
	
	public static boolean cfg_lifeStealVisual;
	public static final boolean cfg_lifeStealVisual_default = true;
	public static final String cfg_lifeStealVisual_name = "visual life steal (on hearts)";
	
	public static boolean cfg_lifeStealVisAlt;
	public static final boolean cfg_lifeStealVisAlt_default = false;
	public static final String cfg_lifeStealVisAlt_name = "alternative visual life steal";
	
	public static void syncConfig(){
		
		FMLCommonHandler.instance().bus().register(AncTB.instance);
		
		
		final String cfg_categoryDebug = AncTB.config.CATEGORY_GENERAL + AncTB.config.CATEGORY_SPLITTER + "debugging";
		AncTB.config.addCustomCategoryComment(cfg_categoryDebug, "Debugging stuff");
		cfg_packetDebug = AncTB.config.get(cfg_categoryDebug, cfg_packetDebug_name, cfg_packetDebug_default).getBoolean(cfg_packetDebug_default);
		cfg_lifeStealText = AncTB.config.get(cfg_categoryDebug, cfg_lifeStealText_name, cfg_lifeStealText_default).getBoolean(cfg_lifeStealText_default);
		
		final String cfg_categoryHUD = AncTB.config.CATEGORY_GENERAL + AncTB.config.CATEGORY_SPLITTER + "HUD";
		AncTB.config.addCustomCategoryComment(cfg_categoryHUD, "HUD elements, like the maximum hearts set by parasite set.");
		cfg_lifeStealVisual = AncTB.config.get(cfg_categoryHUD, cfg_lifeStealVisual_name, cfg_lifeStealVisual_default).getBoolean(cfg_lifeStealVisual_default);
		cfg_lifeStealVisAlt = AncTB.config.get(cfg_categoryHUD, cfg_lifeStealVisAlt_name, cfg_lifeStealVisAlt_default).getBoolean(cfg_lifeStealVisAlt_default);
		
		
		cfg_loginInfo = AncTB.config.get(AncTB.config.CATEGORY_GENERAL, cfg_loginInfo_name, cfg_loginInfo_default).getBoolean(cfg_loginInfo_default);
		
		if(AncTB.config.hasChanged()){
			AncTB.config.save();
		}
		
	}

}
