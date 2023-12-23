package com.ciciinho.coolerend.item;

import com.ciciinho.coolerend.CoolerEnd;
import com.ciciinho.coolerend.item.custom.ArmoredElytraItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CoolerEnd.MOD_ID);

    public static final RegistryObject<Item> FOSSILIZED_SCALE = ITEMS.register("fossilized_scale",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARMORED_ELYTRA = ITEMS.register("armored_elytra",
            () -> new ArmoredElytraItem(new Item.Properties().durability(416),FOSSILIZED_SCALE.get()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
