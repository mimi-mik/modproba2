package com.mimi.modnr1.item;

import com.mimi.modnr1.Mojpierwszymod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mojpierwszymod.MOD_ID);

    public static final RegistryObject<Item> MILOSZANDRYT = ITEMS.register("miloszandryt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUROWY_MILOSZANDRYT = ITEMS.register("surowy_miloszandryt",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
