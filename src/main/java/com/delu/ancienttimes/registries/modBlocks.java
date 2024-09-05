package com.delu.ancienttimes.registries;

import com.delu.ancienttimes.AncientTimes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class modBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AncientTimes.MODID);

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> blockSupplier) {
        return register(name, blockSupplier, Item.Properties::new);
    }

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> blockSupplier, Supplier<Item.Properties> properties) {
        return register(name, blockSupplier, b -> new BlockItem(b, properties.get()));
    }

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> blockSupplier, Function<Block, Item> blockItemFunction) {
        RegistryObject<T> block = BLOCKS.register(name, blockSupplier);
        ModItems.ITEMS.register(name, () -> blockItemFunction.apply(block.get()));
        return block;
    }

    public static <T extends Block> RegistryObject<T> registerWithTab(String name, Supplier<T> blockSupplier, Supplier<CreativeModeTab> tab) {
        return registerWithTab(name, blockSupplier, Item.Properties::new, tab);
    }

    public static <T extends Block> RegistryObject<T> registerWithTab(String name, Supplier<T> blockSupplier, Supplier<Item.Properties> properties, Supplier<CreativeModeTab> tab) {
        return registerWithTab(name, blockSupplier, b -> new BlockItem(b, properties.get()), tab);
    }

    public static <T extends Block> RegistryObject<T> registerWithTab(String name, Supplier<T> blockSupplier, Function<Block, Item> blockItemFunction, Supplier<CreativeModeTab> tab) {
        RegistryObject<T> block = BLOCKS.register(name, blockSupplier);
        ModItems.registerWithCreativeModeTab(name, tab, () -> blockItemFunction.apply(block.get()));
        return block;
    }

    public static <T extends Block> RegistryObject<T> registerWithTab(String name, Supplier<T> blockSupplier, ResourceKey<CreativeModeTab> tab) {
        return registerWithTab(name, blockSupplier, Item.Properties::new, tab);
    }

    public static <T extends Block> RegistryObject<T> registerWithTab(String name, Supplier<T> blockSupplier, Supplier<Item.Properties> properties, ResourceKey<CreativeModeTab> tab) {
        return registerWithTab(name, blockSupplier, b -> new BlockItem(b, properties.get()), tab);
    }

    public static <T extends Block> RegistryObject<T> registerWithTab(String name, Supplier<T> blockSupplier, Function<Block, Item> blockItemFunction, ResourceKey<CreativeModeTab> tab) {
        RegistryObject<T> block = BLOCKS.register(name, blockSupplier);
        ModItems.registerWithCreativeModeTab(name, tab, () -> blockItemFunction.apply(block.get()));
        return block;
    }
}


   