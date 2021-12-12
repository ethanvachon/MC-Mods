package com.ethanvachon.sword.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.Vanishable;
import com.ethanvachon.sword.item.ModItemTier;

public class ZenithItem extends SwordItem {

	public ZenithItem(Properties properties) {
		super(new ModItemTier(), 15, 15, properties);
		
	}
	
}
