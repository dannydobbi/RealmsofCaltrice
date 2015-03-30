package com.dannydobbi.realmsofcaltrice.blocks;

import com.dannydobbi.realmsofcaltrice.help.ModInfo;
import com.dannydobbi.realmsofcaltrice.help.ModTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockThatchedreed extends Block
{
	public BlockThatchedreed()
	{
		super(Material.grass);
		setBlockName("Thatchedreed");
		setBlockTextureName(ModInfo.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTab.tabCaltrice);
		setStepSound(soundTypeGrass);
		setHardness(0.5F);
		setResistance(1.0F);
		setHarvestLevel("hoe", 1);	
		
	}
}