package com.github.dannydobbi.realmsofcaltrice;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import com.github.dannydobbi.realmsofcaltrice.help.*;
import com.github.dannydobbi.realmsofcaltrice.init.caltriceBlocks;
import com.github.dannydobbi.realmsofcaltrice.init.caltriceItems;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class caltriceCore {

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)//Creates Blocks / Items
	{
		caltriceItems.init();
		caltriceBlocks.init();
	}
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)//registers Recipes and others
	{
		
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)//Handles interaction with other mods
	{
		
	}

}
