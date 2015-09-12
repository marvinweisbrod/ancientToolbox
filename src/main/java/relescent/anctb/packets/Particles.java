package relescent.anctb.packets;

import net.minecraft.world.World;

import java.util.Random;

import relescent.anctb.AddedElse.mobType;

public class Particles {
	
	public static void spawnParticle(mobType type, World world, double posX, double posY, double posZ){
		if(type == mobType.ZOMBIE) spawnParticleZombie(world, posX, posY, posZ);
		else if(type == mobType.SKELETON) spawnParticleSkeleton(world, posX, posY, posZ);
		else if(type == mobType.CREEPER) spawnParticleCreeper(world, posX, posY, posZ);
		else if(type == mobType.ENDERMAN) spawnParticleEnderman(world, posX, posY, posZ);
		else if(type == mobType.SPIDER) spawnParticleSpider(world, posX, posY, posZ);
		else if(type == mobType.PIGZOMBIE) spawnParticlePigzombie(world, posX, posY, posZ);
		else if(type == mobType.BLAZE) spawnParticleBlaze(world, posX, posY, posZ);
		else if(type == mobType.WITHERSKELETON) spawnParticleWitherskelly(world, posX, posY, posZ);
		else if(type == mobType.WITHER) spawnParticleWither(world, posX, posY, posZ);
		else if(type == mobType.GHAST) spawnParticleGhast(world, posX, posY, posZ);
	}
	
	public static void spawnParticleZombie(World world, double posX, double posY, double posZ){
		if(world.isRemote){
	    	Random rand = new Random();
	    	double shadeRand;
	    	for(int i=0;i<80;i++){
	    		shadeRand = rand.nextGaussian();
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
					shadeRand * 0.2D+0.1D, shadeRand * 0.2D+0.3D, shadeRand * 0.2D+0.1D);
	    	}
		}
	}
	
	public static void spawnParticleCreeper(World world, double posX, double posY, double posZ){
		if(world.isRemote){
	    	Random rand = new Random();
	    	double shadeRand;
	    	for(int i=0;i<40;i++){
	    		shadeRand = rand.nextGaussian();
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
					shadeRand * 0.2D+0.1D, shadeRand * 0.2D+0.3D, shadeRand * 0.2D+0.1D);
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
						shadeRand * 0.1D+0.2D, shadeRand * 0.1D+0.02D, shadeRand * 0.1D+0.02D);
	    	}
		}
	}
	
	public static void spawnParticleSkeleton(World world, double posX, double posY, double posZ){
		if(world.isRemote){
	    	Random rand = new Random();
	    	double shadeRand;
	    	for(int i=0;i<80;i++){
	    		shadeRand = rand.nextGaussian();
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.1D + 0.6D, shadeRand * 0.1D+0.6D, shadeRand * 0.1D + 0.6D);
	    	}
		}
	}
	
	public static void spawnParticleSpider(World world, double posX, double posY, double posZ){
		if(world.isRemote){
	    	Random rand = new Random();
	    	double shadeRand;
	    	for(int i=0;i<20;i++){
	    		shadeRand = rand.nextGaussian();
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.1D + 0.2D, shadeRand * 0.1D+0.2D, shadeRand * 0.1D + 0.1D);
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.1D + 0.2D, shadeRand * 0.1D+0.2D, shadeRand * 0.1D + 0.1D);
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.1D + 0.2D, shadeRand * 0.1D+0.2D, shadeRand * 0.1D + 0.1D);
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.2D + 0.8D, 0, 0);
	    	}
		}
	}

	public static void spawnParticleEnderman(World world, double posX, double posY, double posZ){
		if(world.isRemote){
	    	Random rand = new Random();
	    	double shadeRand;
	    	for(int i=0;i<20;i++){
	    		shadeRand = rand.nextGaussian();
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.1D + 0.1D, shadeRand * 0.1D+0.1D, shadeRand * 0.1D + 0.1D);
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.1D + 0.1D, shadeRand * 0.1D+0.1D, shadeRand * 0.1D + 0.1D);
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.1D + 0.1D, shadeRand * 0.1D+0.1D, shadeRand * 0.1D + 0.1D);
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.1D + 0.15D, 0, shadeRand * 0.1D + 0.15D);
	    	}
		}
	}
	
	public static void spawnParticlePigzombie(World world, double posX, double posY, double posZ){
		if(world.isRemote){
	    	Random rand = new Random();
	    	double shadeRand;
	    	for(int i=0;i<27;i++){
	    		shadeRand = rand.nextGaussian();
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.1D + 0.9D, shadeRand * 0.1D+0.5D, shadeRand * 0.1D + 0.4D);
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.1D + 0.9D, shadeRand * 0.1D+0.5D, shadeRand * 0.1D + 0.4D);
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.1D + 0.15D, shadeRand * 0.1D+0.5D, shadeRand * 0.1D+0.35D);

	    	}
		}
	}
	
	public static void spawnParticleBlaze(World world, double posX, double posY, double posZ){
		if(world.isRemote){
	    	Random rand = new Random();
	    	double shadeRand;
	    	for(int i=0;i<20;i++){
	    		shadeRand = rand.nextGaussian();
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.1D + 0.1D, shadeRand * 0.1D+0.1D, shadeRand * 0.1D + 0.1D);
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.1D + 0.1D, shadeRand * 0.1D+0.1D, shadeRand * 0.1D + 0.1D);
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.2D + 0.8D, shadeRand * 0.2D+0.7D, 0);
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.2D + 0.8D,shadeRand * 0.2D + 0.5D,0);
	    	}
		}
	}
	
	public static void spawnParticleWitherskelly(World world, double posX, double posY, double posZ){
		if(world.isRemote){
	    	Random rand = new Random();
	    	double shadeRand;
	    	for(int i=0;i<80;i++){
	    		shadeRand = rand.nextGaussian();
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.1D, shadeRand * 0.1D, shadeRand * 0.1D);
	    	}
		}
	}
	
	public static void spawnParticleWither(World world, double posX, double posY, double posZ){
		if(world.isRemote){
	    	Random rand = new Random();
	    	double shadeRand;
	    	for(int i=0;i<80;i++){
	    		shadeRand = rand.nextGaussian();
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.1D, shadeRand * 0.1D, shadeRand * 0.1D);
	    	}
		}
	}
	
	public static void spawnParticleGhast(World world, double posX, double posY, double posZ){
		if(world.isRemote){
	    	Random rand = new Random();
	    	double shadeRand;
	    	for(int i=0;i<80;i++){
	    		shadeRand = rand.nextGaussian();
	    		world.spawnParticle("mobSpell", posX +rand.nextFloat()-0.5F, posY+rand.nextFloat()*1.8F+0.3F, posZ+rand.nextFloat()-0.5F,
	    				shadeRand * 0.1D + 0.6D, shadeRand * 0.1D+0.6D, shadeRand * 0.1D + 0.6D);
	    	}
		}
	}
	
	
}
