package com.dannydobbi.realmsofcaltrice.items;

import com.dannydobbi.realmsofcaltrice.help.RegisterHelper;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class CaltriceItems
{
	//Armour Materials
	static ArmorMaterial CHAIN = EnumHelper.addArmorMaterial("DECCHAIN", 20, new int[]{2, 6,5, 2}, 8);
	
	//Tool Materials
	
    //static Item.ToolMaterial MatName = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)
	static Item.ToolMaterial APLITE = EnumHelper.addToolMaterial("APLITE", 2, 1500, 3.5F, 2.0F, 3);
	static Item.ToolMaterial FAUX = EnumHelper.addToolMaterial("FAUX", 4, 2550, 4.5F, 4.0F, 4);
	static Item.ToolMaterial ANCIENT = EnumHelper.addToolMaterial("ANCIENT", 5, 5000, 6.0F, 5.5F, 5);
	
	//Armour
    public static Item decchainHelm = new ItemDecchainArmour(CHAIN, 0, "decchainHelm");
    public static Item decchainPlate = new ItemDecchainArmour(CHAIN, 1, "decchainPlate");
    public static Item decchainPants = new ItemDecchainArmour(CHAIN, 2, "decchainLegs");
    public static Item decchainBoots = new ItemDecchainArmour(CHAIN, 3, "decchainBoots");
	//Tools
	public static Item apliteSword = new ItemCaltriceSword(APLITE).setUnlocalizedName("apliteSword");
	public static Item aplitePickaxe = new ItemCaltricePickaxe(APLITE).setUnlocalizedName("aplitePickaxe");
	public static Item apliteShovel = new ItemCaltriceShovel(APLITE).setUnlocalizedName("apliteShovel");
	public static Item apliteAxe = new ItemCaltriceAxe(APLITE).setUnlocalizedName("apliteAxe");
	public static Item apliteHoe = new ItemCaltriceHoe(APLITE).setUnlocalizedName("apliteHoe");
	//Ancient Tools
	public static Item ancientArcLight = new ItemAncientSword(ANCIENT).setUnlocalizedName("ancientArcLight");
	
	public static Item fauxSword = new ItemCaltriceSword(APLITE).setUnlocalizedName("fauxSword");
	public static Item fauxPickaxe = new ItemCaltricePickaxe(APLITE).setUnlocalizedName("fauxPickaxe");
	public static Item fauxShovel = new ItemCaltriceShovel(APLITE).setUnlocalizedName("fauxShovel");
	public static Item fauxAxe = new ItemCaltriceAxe(APLITE).setUnlocalizedName("fauxAxe");
	public static Item fauxHoe = new ItemCaltriceHoe(APLITE).setUnlocalizedName("fauxHoe");
	//Items
	public static Item apliteShard = new CaltriceItem().setUnlocalizedName("apliteShard");
	public static Item fauxShard = new CaltriceItem().setUnlocalizedName("fauxShard");
	public static Item apliteGem = new CaltriceItem().setUnlocalizedName("apliteGem");
	public static Item fauxGem = new CaltriceItem().setUnlocalizedName("fauxGem");
	public static Item chainLink = new CaltriceItem().setUnlocalizedName("chainLink");
	
	public static void init()
	{
		//Armour
	RegisterHelper.registerItem(decchainHelm);
	RegisterHelper.registerItem(decchainPlate);
	RegisterHelper.registerItem(decchainPants);
	RegisterHelper.registerItem(decchainBoots);
		//Tools
	RegisterHelper.registerItem(apliteSword);
	RegisterHelper.registerItem(aplitePickaxe);
	RegisterHelper.registerItem(apliteShovel);
	RegisterHelper.registerItem(apliteAxe);	
	RegisterHelper.registerItem(apliteHoe);
	
	RegisterHelper.registerItem(fauxSword);
	RegisterHelper.registerItem(fauxPickaxe);
	RegisterHelper.registerItem(fauxShovel);
	RegisterHelper.registerItem(fauxAxe);	
	RegisterHelper.registerItem(fauxHoe);
	
		//Ancient Tools
	RegisterHelper.registerItem(ancientArcLight);
		//Items
	RegisterHelper.registerItem(apliteShard);
	RegisterHelper.registerItem(apliteGem);
	RegisterHelper.registerItem(fauxGem);
	RegisterHelper.registerItem(fauxShard);
	RegisterHelper.registerItem(chainLink);
	}
}
