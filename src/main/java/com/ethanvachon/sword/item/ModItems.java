package com.ethanvachon.sword.item;

import com.ethanvachon.sword.Sword;
import com.ethanvachon.sword.item.custom.ZenithItem;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems  {
	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS, Sword.MOD_ID);
	
	
	public static final RegistryObject<Item> ZENITH = ITEMS.register("zenith", () -> new ZenithItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
