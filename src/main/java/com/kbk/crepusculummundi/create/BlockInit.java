package com.kbk.crepusculummundi.create;

import com.google.common.base.Supplier;
import java.util.function.Function;

import com.kbk.crepusculummundi.tabs.Tabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



import static com.kbk.crepusculummundi.CrepusculumMundi.MODID;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            MODID);
    public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;

    public static final RegistryObject<Block> SHALE_STONE = register("shale_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(2.5f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Tabs.ORE_AND_MAREIALS)));
    public static final RegistryObject<Block> BASALT_STONE = register("basalt_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(2.5f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Tabs.ORE_AND_MAREIALS)));
    public static final RegistryObject<Block> MARBLE_STONE = register("marble_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(2.5f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Tabs.ORE_AND_MAREIALS)));
    public static final RegistryObject<Block> SANDSTONE_CM = register("sandstone_cm",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(2.5f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Tabs.ORE_AND_MAREIALS)));
    public static final RegistryObject<Block> LIMESTONE = register("limestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).strength(2.5f)
                    .sound(SoundType.STONE).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Tabs.ORE_AND_MAREIALS)));

    private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
        return BLOCKS.register(name, block);}

    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block);
        ITEMS.register(name, item.apply(obj));
        return obj;
    }
}
