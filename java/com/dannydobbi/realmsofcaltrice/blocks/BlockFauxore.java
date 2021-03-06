package com.dannydobbi.realmsofcaltrice.blocks;

import java.util.ArrayList;
import java.util.Random;

import com.dannydobbi.realmsofcaltrice.help.ModInfo;
import com.dannydobbi.realmsofcaltrice.help.ModTab;
import com.dannydobbi.realmsofcaltrice.items.CaltriceItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockFauxore extends Block
{
	public BlockFauxore()
	{
		super(Material.rock);
		setBlockName("Fauxore");
		setBlockTextureName(ModInfo.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTab.tabCaltrice);
		setStepSound(soundTypeStone);
		setHardness(1.5F);
		setResistance(2.5F);
		setHarvestLevel("pickaxe", 3);	
		
	}
	public ArrayList <ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(new ItemStack(CaltriceItems.fauxShard, world.rand.nextInt(3) + 1));
		if (world.rand.nextFloat() < 0.3F)
			drops.add(new ItemStack(CaltriceItems.fauxGem));
		
		return drops;
	}
}