package com.kbk.crepusculummundi.setup;

import com.kbk.crepusculummundi.client.KeyInit;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientSetup {

    public static void init(FMLClientSetupEvent event) {
        KeyInit.init();
    }
}
