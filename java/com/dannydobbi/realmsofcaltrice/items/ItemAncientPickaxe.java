package com.dannydobbi.realmsofcaltrice.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

import com.dannydobbi.realmsofcaltrice.help.ModInfo;
import com.dannydobbi.realmsofcaltrice.help.ModTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAncientPickaxe extends ItemPickaxe
{
	public final ToolMaterial toolMaterial;
	
	public ItemAncientPickaxe(ToolMaterial EnumToolMaterial)
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
	
	public boolean hasEffect(ItemStack par1ItemStack) {
	    boolean hasEnchant = true;
		return hasEnchant;
	    }
}