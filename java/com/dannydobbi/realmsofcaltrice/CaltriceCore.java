package com.dannydobbi.realmsofcaltrice;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import com.dannydobbi.realmsofcaltrice.blocks.CaltriceBlocks;
import com.dannydobbi.realmsofcaltrice.crafting.Recipes;
import com.dannydobbi.realmsofcaltrice.generation.CaltriceWorldGeneration;
import com.dannydobbi.realmsofcaltrice.help.*;
import com.dannydobbi.realmsofcaltrice.items.CaltriceItems;

@Mod (modid = ModInfo.MODID, name = ModInfo.NAME, version = ModInfo.VERSION)

public class CaltriceCore
{
	  CaltriceWorldGeneration eventWorldGen = new CaltriceWorldGeneration();
	  
		@Mod.EventHandler
	    public void preInit (FMLPreInitializationEvent event)
	    {
		  CaltriceItems.init();
		  CaltriceBlocks.init();
		  GameRegistry.registerWorldGenerator(this.eventWorldGen, 0);
	    }
		@Mod.EventHandler
	    public void load(FMLInitializationEvent event) 
	    {
	 
	    }
		@Mod.EventHandler
	    public static void init (FMLInitializationEvent event ) 
	    {
			  Recipes.init();
	    }
}
