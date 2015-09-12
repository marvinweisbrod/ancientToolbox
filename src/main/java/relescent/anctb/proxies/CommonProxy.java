package relescent.anctb.proxies;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import relescent.anctb.AddedElse.mobType;

public class CommonProxy {
	
	public void registerRenders(){}
	
	public void messageParticleRenderer(mobType type, double posX, double posY, double posZ){}
	
	public void syncHealth(int lifeSteal, int healthChange){}
	
	public float getHealthClient(){
		return 1;
	}

	public void printToChatClient(String string) {
	}


}
