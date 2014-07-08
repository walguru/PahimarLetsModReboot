package com.walguru.letsmodreboot.init;


import com.walguru.letsmodreboot.item.ItemMapleLeaf;
import com.walguru.letsmodreboot.item.ItemPLMRB;
import com.walguru.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static  final ItemPLMRB mapleLeaf= new ItemMapleLeaf();



    public static  void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }

}
