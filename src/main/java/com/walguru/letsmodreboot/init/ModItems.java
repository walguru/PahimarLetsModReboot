package com.walguru.letsmodreboot.init;


import com.walguru.letsmodreboot.item.ItemMapleLeaf;
import com.walguru.letsmodreboot.item.ItemPLMRB;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static  final ItemPLMRB mapleLeaf= new ItemMapleLeaf();



    public static  void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }

}
