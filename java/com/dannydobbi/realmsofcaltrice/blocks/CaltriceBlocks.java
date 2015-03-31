package com.dannydobbi.realmsofcaltrice.blocks;

import net.minecraft.block.Block;

import com.dannydobbi.realmsofcaltrice.help.RegisterHelper;

public class CaltriceBlocks
{
	public static Block thatchedReed = new BlockThatchedreed();
	public static Block barlieRock = new BlockBarlierock();
	public static Block barliecobblestone = new BlockBarliecobblestone();
	public static Block Apliteore = new BlockApliteore();
	public static Block Fauxore = new BlockFauxore();
	public static Block Vostallosore = new BlockVostallosore();

	public static void init()
	{
	RegisterHelper.registerBlock(thatchedReed);	
	RegisterHelper.registerBlock(barlieRock);
	RegisterHelper.registerBlock(barliecobblestone);
	RegisterHelper.registerBlock(Apliteore);
	RegisterHelper.registerBlock(Fauxore);
	RegisterHelper.registerBlock(Vostallosore);
	}
}
