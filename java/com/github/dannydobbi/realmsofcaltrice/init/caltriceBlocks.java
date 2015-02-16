package com.github.dannydobbi.realmsofcaltrice.init;

import com.github.dannydobbi.realmsofcaltrice.blocks.*;
import com.github.dannydobbi.realmsofcaltrice.help.RegisterHelper;

import net.minecraft.block.Block;

public class caltriceBlocks
{
	public static Block thatchedReed = new BlockThatchedReed();
	
	public static void init()
	{
		RegisterHelper.registerBlock(thatchedReed);
	}
}
