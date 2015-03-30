package com.dannydobbi.realmsofcaltrice.blocks;

import java.util.ArrayList;
import java.util.Random;

import com.dannydobbi.realmsofcaltrice.help.ModInfo;
import com.dannydobbi.realmsofcaltrice.help.ModTab;
import com.dannydobbi.realmsofcaltrice.items.CaltriceItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockApliteore extends Block
{	
	public BlockApliteore()
	{
		super(Material.rock);
		setBlockName("Apliteore");
		setBlockTextureName(ModInfo.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTab.tabCaltrice);
		setStepSound(soundTypeStone);
		setHardness(1.5F);
		setResistance(2.5F);
		setHarvestLevel("pickaxe", 3);
		
	}
	public ArrayList <ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(new ItemStack(CaltriceItems.apliteShard, world.rand.nextInt(3) + 1));
		if (world.rand.nextFloat() < 0.3F)
			drops.add(new ItemStack(CaltriceItems.apliteGem));
		
		return drops;
	}
}
