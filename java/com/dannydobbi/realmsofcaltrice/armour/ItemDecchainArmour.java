package com.dannydobbi.realmsofcaltrice.armour;

import com.dannydobbi.realmsofcaltrice.help.ModInfo;
import com.dannydobbi.realmsofcaltrice.help.ModTab;
import com.dannydobbi.realmsofcaltrice.items.CaltriceItems;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemDecchainArmour extends ItemArmor
{

	public ItemDecchainArmour(ArmorMaterial material, int ArmourType, String name)
	{
		super(material, 0, ArmourType);
		setUnlocalizedName(name);
		setTextureName(ModInfo.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTab.tabCaltrice);
	}
	public String getArmorYexyire(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == CaltriceItems.decchainHelm || stack.getItem() == CaltriceItems.decchainPlate || stack.getItem() == CaltriceItems.decchainBoots)
		{
			return ModInfo.MODID + ":models/armor/decchain_layer1.png";
		}
		else if (stack.getItem() == CaltriceItems.decchainPants)	
		{
			return ModInfo.MODID + ":models/armor/decchain_layer2.png";
		}
		else
		{
			return null;
		}
	}
}
