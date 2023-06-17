package net.bigdopa.copperitems.Item;

import net.bigdopa.copperitems.CopperItems;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CopperItems.MODID);

    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
        ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () ->new Item((new Item.Properties())));


    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}
}
