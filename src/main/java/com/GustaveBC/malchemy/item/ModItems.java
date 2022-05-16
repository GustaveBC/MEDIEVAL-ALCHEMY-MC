package com.GustaveBC.malchemy.item;

import com.GustaveBC.malchemy.MedievalAlchemy;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MedievalAlchemy.MOD_ID);
	
	public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot", ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TEMP = ITEMS.register("temp", ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
