package relescent.anctb.packets;

import net.minecraft.client.Minecraft;
import relescent.anctb.AddedElse;
import relescent.anctb.AddedElse.mobType;
import relescent.anctb.AncTB;
import relescent.anctb.lib.ConfigFile;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;

public class MessageHealth implements IMessage{
	int lifeSteal;
	int healthChange;


    public MessageHealth() { }

    public MessageHealth(int lifeSteal, int healthChange) {
    	this.lifeSteal = lifeSteal;
    	this.healthChange = healthChange;
    }
    
    @Override
    public void fromBytes(ByteBuf buf) {
    	try{
    		String input;
        	input = ByteBufUtils.readUTF8String(buf);
        	String[] parts = input.split("#");
        	lifeSteal = Integer.parseInt(parts[0]);
        	healthChange = Integer.parseInt(parts[1]);
    	}catch(Exception e){
    		lifeSteal = 0;
    		healthChange = (int)AncTB.proxy.getHealthClient();
    		if(ConfigFile.cfg_packetDebug)
    			AncTB.proxy.printToChatClient("AncTB.MessageHealth -Bad Packet Received-.");
    		System.out.println("AncTB.MessageHeath -Bad Packet Received-.");
    	}
    }

    @Override
    public void toBytes(ByteBuf buf) {
    	String output = lifeSteal + "#" + healthChange;
    	ByteBufUtils.writeUTF8String(buf, output);
    }
    
	
	public static class Handler implements IMessageHandler<MessageHealth, IMessage> {
		@Override
		public IMessage onMessage(MessageHealth message, MessageContext ctx) {
			AncTB.proxy.syncHealth(message.lifeSteal, message.healthChange);
			System.out.println("booh");
			return null; // no response 
		}
	}

}
