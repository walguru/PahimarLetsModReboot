package com.walguru.letsmodreboot.init;

import com.walguru.letsmodreboot.block.BlockFlag;
import com.walguru.letsmodreboot.block.BlockPLMRB;
import com.walguru.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {


    public static final BlockPLMRB flag= new BlockFlag();


    public static  void init   ()
    {
        GameRegistry.registerBlock( flag,"flag");
    }
}
