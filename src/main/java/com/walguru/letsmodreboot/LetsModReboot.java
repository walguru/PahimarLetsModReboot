package com.walguru.letsmodreboot;

import com.walguru.letsmodreboot.client.handler.KeyInputEventHandler;
import com.walguru.letsmodreboot.handler.ConfigurationHandler;
import com.walguru.letsmodreboot.init.ModBlocks;
import com.walguru.letsmodreboot.init.ModItems;
import com.walguru.letsmodreboot.init.Recipes;
import com.walguru.letsmodreboot.proxy.IProxy;
import com.walguru.letsmodreboot.reference.Reference;
import com.walguru.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name =Reference.MOD_NAME ,version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_ClASS)
public class LetsModReboot {


    @Mod.Instance("LetsModReboot")
    public static  LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS, modId = Reference.MOD_ID)
    public static IProxy proxy;


    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());


        proxy.registerKeyBindings();

        ModItems.init();

        ModBlocks.init();



        LogHelper.info("Pre Initialization complete");
    }

    @Mod.EventHandler
    public  void Init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register((new KeyInputEventHandler()));
        Recipes.init();
        LogHelper.info(" Initialization complete");

    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization complete");
    }
}
