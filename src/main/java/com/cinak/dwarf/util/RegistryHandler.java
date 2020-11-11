package com.cinak.dwarf.util;


import com.cinak.dwarf.Dwarf;
import com.cinak.dwarf.blocks.BlockItemBase;
import com.cinak.dwarf.blocks.SteelBlock;
import com.cinak.dwarf.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<> (ForgeRegistries.ITEMS, Dwarf.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<> (ForgeRegistries.BLOCKS, Dwarf.MOD_ID);



    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    //items only
    public static final RegistryObject<Item> STEEL = ITEMS.register("steel", com.cinak.dwarf.items.ItemBase::new);
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", com.cinak.dwarf.items.ItemBase::new);
    public static final RegistryObject<Item> STEEL_MIX = ITEMS.register("steel_mix", com.cinak.dwarf.items.ItemBase::new);
    public static final RegistryObject<Item> DWARF_HANDLE = ITEMS.register("dwarf_handle", com.cinak.dwarf.items.ItemBase::new);
    //tools only
    public static final RegistryObject<PickaxeItem> DWARF_HAMMER = ITEMS.register("dwarf_hammer", () ->
            new PickaxeItem(ModItemTier.DWARF_METAL, 8, -3.5F, new Item.Properties().group(Dwarf.TAB)));
    public static final RegistryObject<AxeItem> DWARF_BATTLEAXE = ITEMS.register("dwarf_battleaxe", () ->
            new AxeItem(ModItemTier.DWARF_METAL, 4, -3.0F, new Item.Properties().group(Dwarf.TAB)));
    public static final RegistryObject<SwordItem> DWARF_SWORD = ITEMS.register("dwarf_sword", () ->
            new SwordItem(ModItemTier.DWARF_METAL, 2, -2.4F, new Item.Properties().group(Dwarf.TAB)));
    public static final RegistryObject<SwordItem> DWARF_SCIMITAR = ITEMS.register("dwarf_scimitar", () ->
            new SwordItem(ModItemTier.DWARF_METAL, 4, -2.4F, new Item.Properties().group(Dwarf.TAB)));
    public static final RegistryObject<SwordItem> DWARF_MACE = ITEMS.register("dwarf_mace", () ->
            new SwordItem(ModItemTier.DWARF_METAL, 6, -3.5F, new Item.Properties().group(Dwarf.TAB)));
    //armor only

    //mobs

    //blocks only
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", SteelBlock::new);

    //block items only
    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", ()-> new BlockItemBase(STEEL_BLOCK.get()));



}
