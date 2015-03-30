package com.dannydobbi.realmsofcaltrice.items;

import com.dannydobbi.realmsofcaltrice.help.ModInfo;
import com.dannydobbi.realmsofcaltrice.help.ModTab;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemDecchainArmour extends ItemArmor
{
    public ItemDecchainArmour(ArmorMaterial material, int ArmorType, String name) 
	{
		super(material, 0, ArmorType);
		setUnlocalizedName(name);
		setTextureName(ModInfo.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTab.tabCaltrice);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == CaltriceItems.decchainHelm || stack.getItem() == CaltriceItems.decchainPlate || stack.getItem() == CaltriceItems.decchainBoots)
		{
			return ModInfo.MODID + ":models/armor/titanium_layer1.png";
		}
		else if (stack.getItem() == CaltriceItems.decchainPants)
		{
			return ModInfo.MODID + ":models/armor/titanium_layer2.png";
		}
		else
		{
			return null;
		}	
	}
}

