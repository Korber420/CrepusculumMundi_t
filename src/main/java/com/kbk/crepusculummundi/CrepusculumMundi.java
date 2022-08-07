package com.kbk.crepusculummundi;

import com.kbk.crepusculummundi.setup.ClientSetup;
import com.kbk.crepusculummundi.setup.ModSetup;
import com.kbk.crepusculummundi.setup.Registration;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CrepusculumMundi.MODID)
public class CrepusculumMundi {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "crepusculummundi";


    public CrepusculumMundi() {

        // Register the deferred registry
        Registration.init();


        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));


    }
}
