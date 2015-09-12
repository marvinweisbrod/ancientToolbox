package relescent.anctb;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import relescent.anctb.event.anctbEventHandler;
import relescent.anctb.lib.ConfigFile;
import relescent.anctb.lib.Reference;
import relescent.anctb.packets.MessageHealth;
import relescent.anctb.packets.MessageParticles;
import relescent.anctb.proxies.CommonProxy;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VER, guiFactory = "relescent.anctb.lib.ConfigGuiFactory")
public class AncTB {
	
	anctbEventHandler handler = new anctbEventHandler();
	
	public static SimpleNetworkWrapper network;
	
	@SidedProxy(clientSide="relescent.anctb.proxies.ClientProxy", serverSide="relescent.anctb.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	public static Configuration config;
	
	
	@Mod.Instance(Reference.MOD_ID)
	public static AncTB instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Item/Block init & registering
		//Config handling
		config = new Configuration(event.getSuggestedConfigurationFile());
		ConfigFile.syncConfig();
		FMLCommonHandler.instance().bus().register(handler);
		MinecraftForge.EVENT_BUS.register(handler);
		
		network = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID +"_channel");
		//registerMessage(MyMessageHandler.class, MyMessage.class, packetID, receivingSide)
		network.registerMessage(MessageParticles.Handler.class, MessageParticles.class, 0, Side.CLIENT);
		network.registerMessage(MessageHealth.Handler.class, MessageHealth.class, 1, Side.CLIENT);
		
		AddedItems.initItems();
		AddedBlocks.initBlocks();
		AddedRecipes.initRecipes();
	}
	
	@SubscribeEvent
	public void onConfigChange(ConfigChangedEvent.OnConfigChangedEvent event){
		if(event.modID.equals(Reference.MOD_ID)){
			ConfigFile.syncConfig();
		}
	}
	
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		//Proxy, TileEntity, entity, GUI & Packet Registering
		FMLCommonHandler.instance().bus().register(instance);
		proxy.registerRenders();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
	}
	

	
}
