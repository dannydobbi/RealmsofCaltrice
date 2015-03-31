package com.dannydobbi.realmsofcaltrice.blocks;

import java.util.Random;

import com.dannydobbi.realmsofcaltrice.help.ModInfo;
import com.dannydobbi.realmsofcaltrice.help.ModTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBarliecobblestone extends Block
{
	public BlockBarliecobblestone()
	{
		super(Material.rock);
		setBlockName("Barliecobblestone");
		setBlockTextureName(ModInfo.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTab.tabCaltrice);
		setStepSound(soundTypeStone);
		setHardness(1.0F);
		setResistance(2.5F);
		setHarvestLevel("pickaxe", 0);	
		
	}
}