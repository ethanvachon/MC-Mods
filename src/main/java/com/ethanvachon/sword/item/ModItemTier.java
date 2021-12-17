package com.ethanvachon.sword.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

	public class ModItemTier implements Tier {
	    
		@Override
		public int getUses() {
			// TODO Auto-generated method stub
			return 1000;
		}
		@Override
		public float getSpeed() {
			// TODO Auto-generated method stub
			return 5;
		}
		@Override
		public float getAttackDamageBonus() {
			// TODO Auto-generated method stub
			return 5;
		}
		@Override
		public int getLevel() {
			// TODO Auto-generated method stub
			return 10;
		}
		@Override
		public int getEnchantmentValue() {
			// TODO Auto-generated method stub
			return 20;
		}
		@Override
		public Ingredient getRepairIngredient() {
			// TODO Auto-generated method stub
			return Ingredient.of(new ItemStack(Items.DIAMOND_ORE));
		}
	}
