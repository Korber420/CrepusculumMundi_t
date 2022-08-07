package com.kbk.crepusculummundi.setup;

import com.kbk.crepusculummundi.create.BlockInit;
import com.kbk.crepusculummundi.create.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class Registration {



    public static void init(){

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

    }
}
