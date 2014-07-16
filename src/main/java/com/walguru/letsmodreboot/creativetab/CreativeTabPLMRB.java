package com.walguru.letsmodreboot.creativetab;

import com.walguru.letsmodreboot.init.ModItems;
import com.walguru.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabPLMRB {

    public static  final CreativeTabs PLMRBTab= new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.mapleLeaf;
        }




    };




}
