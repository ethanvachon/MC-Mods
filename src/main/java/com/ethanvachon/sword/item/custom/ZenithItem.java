package com.ethanvachon.sword.item.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.Vanishable;
import net.minecraft.world.level.ItemLike;

import com.ethanvachon.sword.item.ModItemTier;

public class ZenithItem extends SwordItem {

	public ZenithItem(Properties properties) {
		super(new ModItemTier(), 15, 15, properties);
		
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
		if(!player.level.isClientSide()) {
			var position = entity.blockPosition();
			var world = (ServerLevel) player.level;
			var serverPlayer = ((ServerPlayer) player);
			EntityType.LIGHTNING_BOLT.spawn(world, null, serverPlayer, position, MobSpawnType.TRIGGERED, true, true);
		}
		return super.onLeftClickEntity(stack, player, entity);
		
	}
	
}
