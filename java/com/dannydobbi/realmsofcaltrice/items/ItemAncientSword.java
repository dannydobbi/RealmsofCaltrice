package com.dannydobbi.realmsofcaltrice.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;

import com.dannydobbi.realmsofcaltrice.help.ModInfo;
import com.dannydobbi.realmsofcaltrice.help.ModTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAncientSword extends ItemSword
{
	public final ToolMaterial toolMaterial;

	public void onUpdate(ItemStack stack, World world, EntityPlayer player)
	{
		if (!stack.isItemEnchanted())
		{
			stack.addEnchantment(Enchantment.knockback, 1);
			stack.addEnchantment(Enchantment.flame, 1);
		}

	}
	
	
	public ItemAncientSword(ToolMaterial EnumToolMaterial)
	{
		super(EnumToolMaterial);
		toolMaterial = EnumToolMaterial;
		setCreativeTab(ModTab.tabCaltrice);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
		itemIcon = par1IconRegister.registerIcon(ModInfo.MODID + ":" + getUnlocalizedName().substring(5));
	}
	public boolean hasEffect(ItemStack par1ItemStack) {
	    boolean hasEnchant = true;
		return hasEnchant;
	    }
}
