package com.walguru.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {

    public static void init() {

        //shaped
        GameRegistry.addRecipe(new ItemStack(ModItems.mapleLeaf)," s ", "sss", " s ",'s', new ItemStack(Items.stick));
        //shapeless
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf), new ItemStack(ModItems.mapleLeaf));
        //shapedOre
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf)," s ", "sss", " s ",'s', "stickWood"));
        //shapelessOre
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.flag), new ItemStack(ModItems.mapleLeaf),  new ItemStack(ModItems.mapleLeaf)));
    }
}
