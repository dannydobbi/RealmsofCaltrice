package com.dannydobbi.realmsofcaltrice.blocks;

import com.dannydobbi.realmsofcaltrice.help.ModInfo;
import com.dannydobbi.realmsofcaltrice.help.ModTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBarlierock extends Block
{
	public BlockBarlierock()
	{
		super(Material.rock);
		setBlockName("Barlierock");
		setBlockTextureName(ModInfo.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTab.tabCaltrice);
		setStepSound(soundTypeStone);
		setHardness(1.0F);
		setResistance(2.5F);
		setHarvestLevel("pickaxe", 0);	
		
	}
}