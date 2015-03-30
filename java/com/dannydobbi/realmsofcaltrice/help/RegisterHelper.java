package com.dannydobbi.realmsofcaltrice.help;

import net.minecraft.item.Item;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterHelper
{
	public static void registerBlock(Block block)
	{
		GameRegistry.registerBlock(block, ModInfo.MODID + block.getUnlocalizedName().substring(5));
	}
	public static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, ModInfo.MODID + item.getUnlocalizedName().substring(5));
	}
}
