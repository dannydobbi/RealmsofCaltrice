package com.dannydobbi.realmsofcaltrice.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.dannydobbi.realmsofcaltrice.blocks.CaltriceBlocks;
import com.dannydobbi.realmsofcaltrice.items.CaltriceItem;
import com.dannydobbi.realmsofcaltrice.items.CaltriceItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void add()
	{
		//Blocks
		GameRegistry.addShapedRecipe(new ItemStack(CaltriceBlocks.thatchedReed, 2), new Object[] {"RR", "RR", 'R', Items.reeds});
		GameRegistry.addSmelting(CaltriceBlocks.barliecobblestone, new ItemStack (CaltriceBlocks.barlieRock), 1);
		//Items
		
		//Tools
			//Faux
		GameRegistry.addShapedRecipe(new ItemStack(CaltriceItems.fauxSword, 1), new Object[] {"G", "G", "S", 'G', CaltriceItems.fauxGem, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(CaltriceItems.fauxPickaxe, 1), new Object[] {"GGG", " S ", " S ", 'G', CaltriceItems.fauxGem, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(CaltriceItems.fauxShovel, 1), new Object[]{"G", "S", "S", 'G', CaltriceItems.fauxGem, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(CaltriceItems.fauxAxe, 1), new Object[]{" GG", " SG", " S ", 'G', CaltriceItems.fauxGem, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(CaltriceItems.fauxHoe, 1), new Object[]{"GG ", " S ", " S ", 'G', CaltriceItems.fauxGem, 'S', Items.stick});
			//Aplite
		GameRegistry.addShapedRecipe(new ItemStack(CaltriceItems.apliteSword, 1), new Object[] {"G", "G", "S", 'G', CaltriceItems.apliteGem, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(CaltriceItems.aplitePickaxe, 1), new Object[] {"GGG", " S ", " S ", 'G', CaltriceItems.apliteGem, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(CaltriceItems.apliteShovel, 1), new Object[]{"G", "S", "S", 'G', CaltriceItems.apliteGem, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(CaltriceItems.apliteAxe, 1), new Object[]{" GG", " SG", " S ", 'G', CaltriceItems.apliteGem, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(CaltriceItems.apliteHoe, 1), new Object[]{"GG ", " S ", " S ", 'G', CaltriceItems.apliteGem, 'S', Items.stick});
			//Armour
		GameRegistry.addShapedRecipe(new ItemStack(CaltriceItems.decchainHelm, 1), new Object[]{"CCC", "C C", 'C', CaltriceItems.chainLink});
		GameRegistry.addShapedRecipe(new ItemStack(CaltriceItems.decchainPlate, 1), new Object[]{"C C", "CCC", "CCC", 'C', CaltriceItems.chainLink});
		GameRegistry.addShapedRecipe(new ItemStack(CaltriceItems.decchainPants, 1), new Object[]{"CCC", "C C", "C C", 'C', CaltriceItems.chainLink});
		GameRegistry.addShapedRecipe(new ItemStack(CaltriceItems.decchainBoots, 1), new Object[]{"   ", "C C", "C C", 'C', CaltriceItems.chainLink});
			//Misc Items
		
	}

	public static void init()
	{
		add();
	}
}
