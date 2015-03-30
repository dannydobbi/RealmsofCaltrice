package com.dannydobbi.realmsofcaltrice.help;

import com.dannydobbi.realmsofcaltrice.items.CaltriceItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CaltriceTab extends CreativeTabs
{
	String name;
	
	public CaltriceTab(int par1, String par2Str)
	{
		super(par1, par2Str);
		this.name = par2Str;
		
	}
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		if(this.name == "tabCaltrice")
		{
			return CaltriceItems.ancientArcLight;
		}
		return null;
	}
}


