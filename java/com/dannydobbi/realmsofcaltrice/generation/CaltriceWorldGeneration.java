package com.dannydobbi.realmsofcaltrice.generation;

import java.util.Random;

import com.dannydobbi.realmsofcaltrice.blocks.CaltriceBlocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class CaltriceWorldGeneration implements IWorldGenerator
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.dimensionId)
		{
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}
	private void generateSurface(World world, Random random, int x, int z)
	{
		addOreSpawn(CaltriceBlocks.Apliteore, world, random, x, z, 16, 16, 2 + random.nextInt(7), 9, 0, 48); // Most common
		addOreSpawn(CaltriceBlocks.Fauxore, world, random, x, z, 16, 16, 2 + random.nextInt(4), 5, 0, 12); // Rarest
	}
	private void generateNether(World world, Random random, int x, int z)
	{
		
	}
	private void generateEnd(World world, Random random, int x, int z)
	{
		
	}
	private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY)
	{
		for (int i = 0; i <chanceToSpawn; i++)
		{
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			new WorldGenMinable(block, maxVeinSize).generate(world, random, posX, posY, posZ);
		}
	}
}

/*
addOreSpawn(caltriceBlocks.Apliteore, world, random, x, z, 16, 16, 2 + random.nextInt(3), 9, 0, 48);
* 2 + random.nextInt(3) - min spawn of 2 ores with a chance of up to 3 spawning.
* , 9, - the probability the ore will spawn
* , 0, 48); - what levels the ore will spawn from.
*/