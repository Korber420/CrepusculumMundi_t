package com.kbk.crepusculummundi.client.event;

import com.kbk.crepusculummundi.client.KeyInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent.ClientTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import static com.kbk.crepusculummundi.CrepusculumMundi.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Bus.FORGE, value = Dist.CLIENT)
public final class ClientForgeEvents {
    private ClientForgeEvents(){
    }
    @SubscribeEvent
    public static void clientTick(ClientTickEvent event){
        if (KeyInit.drinkKeyMapping.isDown()){

        }

    }
}
