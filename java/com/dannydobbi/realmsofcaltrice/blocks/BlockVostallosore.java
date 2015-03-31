package com.dannydobbi.realmsofcaltrice.blocks;

import java.util.ArrayList;

import com.dannydobbi.realmsofcaltrice.help.ModInfo;
import com.dannydobbi.realmsofcaltrice.help.ModTab;
import com.dannydobbi.realmsofcaltrice.items.CaltriceItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockVostallosore extends Block
{
	public BlockVostallosore()
	{
		super(Material.rock);
		setBlockName("Vostallosore");
		setBlockTextureName(ModInfo.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTab.tabCaltrice);
		setStepSound(soundTypeStone);
		setHardness(1.5F);
		setResistance(2.5F);
		setHarvestLevel("pickaxe", 4);	
		
	}
	public ArrayList <ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(new ItemStack(CaltriceItems.vostallosShard, world.rand.nextInt(3) + 1));
		if (world.rand.nextFloat() < 0.3F)
			drops.add(new ItemStack(CaltriceItems.vostallosGem));
		
		return drops;
	}
}