package com.github.dannydobbi.realmsofcaltrice.init;

import com.github.dannydobbi.realmsofcaltrice.help.RegisterHelper;
import com.github.dannydobbi.realmsofcaltrice.items.caltriceItem;

import net.minecraft.item.Item;

public class caltriceItems
{
	public static Item apliteShard = new caltriceItem().setUnlocalizedName("apliteShard");
	
	public static void init()
	{
		
	RegisterHelper.registerItem(apliteShard);	
	}
}
