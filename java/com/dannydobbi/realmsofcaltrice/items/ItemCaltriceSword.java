package com.dannydobbi.realmsofcaltrice.items;

import java.util.ArrayList;

import com.dannydobbi.realmsofcaltrice.help.ModInfo;
import com.dannydobbi.realmsofcaltrice.help.ModTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;

public class ItemCaltriceSword extends ItemSword
{
	public final ToolMaterial toolMaterial;
	
	public ItemCaltriceSword(ToolMaterial EnumToolMaterial)
	{
		super(EnumToolMaterial);
		toolMaterial = EnumToolMaterial;
		setCreativeTab(ModTab.tabCaltrice);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
		itemIcon = par1IconRegister.registerIcon(ModInfo.MODID + ":" + getUnlocalizedName().substring(5));
	}
}
