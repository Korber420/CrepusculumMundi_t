package com.kbk.crepusculummundi.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.ClientRegistry;

import static com.kbk.crepusculummundi.CrepusculumMundi.MODID;

public final class KeyInit {
    private KeyInit(){
    }

    public static KeyMapping drinkKeyMapping;

    public static void init() {
        drinkKeyMapping = registerKey("drinking_key", KeyMapping.CATEGORY_GAMEPLAY, InputConstants.KEY_F);
    }

    private static KeyMapping registerKey(String name, String categore, int keycode){
        final var key =new KeyMapping("key." + MODID + "." + name, keycode, categore);
        ClientRegistry.registerKeyBinding(key);
        return key;
    }
}
