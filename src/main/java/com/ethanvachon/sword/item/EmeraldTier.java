package com.ethanvachon.sword.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class EmeraldTier implements Tier {
    
	@Override
	public int getUses() {
		// TODO Auto-generated method stub
		return 1561;
	}
	@Override
	public float getSpeed() {
		// TODO Auto-generated method stub
		return 8;
	}
	@Override
	public float getAttackDamageBonus() {
		// TODO Auto-generated method stub
		return 3;
	}
	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return 3;
	}
	@Override
	public int getEnchantmentValue() {
		// TODO Auto-generated method stub
		return 20;
	}
	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return Ingredient.of(new ItemStack(Items.EMERALD_ORE));
	}
}
