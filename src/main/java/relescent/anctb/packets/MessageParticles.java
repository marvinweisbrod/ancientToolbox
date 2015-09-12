package relescent.anctb.packets;

import net.minecraft.client.Minecraft;
import relescent.anctb.AddedElse;
import relescent.anctb.AddedElse.mobType;
import relescent.anctb.lib.ConfigFile;
import relescent.anctb.AncTB;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;

public class MessageParticles implements IMessage{
	
    private AddedElse.mobType type;
    private double posX;
    private double posY;
    private double posZ;

    public MessageParticles() { }

    public MessageParticles(AddedElse.mobType type, double posX, double posY, double posZ) {
        this.type = type;
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
    }
    
    @Override
    public void fromBytes(ByteBuf buf) {
    	try{
    	String input;
    	input = ByteBufUtils.readUTF8String(buf); // this class is very useful in general for writing more complex objects
    	String[] parts = input.split("#");
    	type = mobType.valueOf(parts[0]);
    	posX = Double.parseDouble(parts[1]);
    	posY = Double.parseDouble(parts[2]);
    	posZ = Double.parseDouble(parts[3]);
    	}catch(Exception e){
    		type = mobType.WITHERSKELETON;
    		posX = 0.0;
    		posY = 0.0;
    		posZ = 0.0;
    		if(ConfigFile.cfg_packetDebug)
    			AncTB.proxy.printToChatClient("AncTB.MessageParticles -Bad Packet Received-.");
    		System.out.println("AncTB.MessageParticles -Bad Packet Received-.");
    	}
    }

    @Override
    public void toBytes(ByteBuf buf) {
    	String output = type.name() + "#" + posX + "#" + posY + "#" + posZ;
        ByteBufUtils.writeUTF8String(buf, output);
    }
	
	public static class Handler implements IMessageHandler<MessageParticles, IMessage> {
		@Override
		public IMessage onMessage(MessageParticles message, MessageContext ctx) {
			AncTB.proxy.messageParticleRenderer(message.type, message.posX, message.posY, message.posZ);
			return null; // no response 
		}

	}

}
