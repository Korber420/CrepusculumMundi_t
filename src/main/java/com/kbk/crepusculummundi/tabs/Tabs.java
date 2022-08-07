package com.kbk.crepusculummundi.tabs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class Tabs {

    public static final CreativeModeTab ORE_AND_MAREIALS = new CreativeModeTab( "ore&materials") {
        public ItemStack makeIcon() {return new ItemStack(Items.DIAMOND);}
    };
    public static final CreativeModeTab TEST= new CreativeModeTab( "test") {
        public ItemStack makeIcon() {return new ItemStack(Items.DIAMOND);}
    };

}
