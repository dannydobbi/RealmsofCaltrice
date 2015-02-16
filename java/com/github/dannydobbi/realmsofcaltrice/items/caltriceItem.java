package com.github.dannydobbi.realmsofcaltrice.items;

import com.github.dannydobbi.realmsofcaltrice.help.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class caltriceItem extends Item
{
	public caltriceItem()
	{
		super();
		setCreativeTab(CreativeTabs.tabMisc);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
		itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}
