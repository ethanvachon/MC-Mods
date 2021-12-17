package com.ethanvachon.sword.item.custom;

import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

public class PrismItem extends BowItem {

	public PrismItem(Properties p_40660_) {
		super(p_40660_);
		this.canApplyAtEnchantingTable(getDefaultInstance(), Enchantments.INFINITY_ARROWS);
		// TODO Auto-generated constructor stub
	}
	
}