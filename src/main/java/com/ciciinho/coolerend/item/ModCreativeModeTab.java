package com.ciciinho.coolerend.item;

import com.ciciinho.coolerend.CoolerEnd;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CoolerEnd.MOD_ID);
    public static final RegistryObject<CreativeModeTab> COOLER_END_TAB = CREATIVE_MODE_TABS.register("cooler_end_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FOSSILIZED_SCALE.get()))
                    .title(Component.translatable("creativetab.cooler_end_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.FOSSILIZED_SCALE.get());
                        pOutput.accept(ModItems.ARMORED_ELYTRA.get());
                    }))
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
