package com.github.dannydobbi.realmsofcaltrice.blocks;

import com.github.dannydobbi.realmsofcaltrice.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockThatchedReed extends Block
{
	public BlockThatchedReed()
	{
		super(Material.iron);
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
	}
}
