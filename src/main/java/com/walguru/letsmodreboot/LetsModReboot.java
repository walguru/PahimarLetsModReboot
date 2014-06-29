package com.walguru.letsmodreboot;

import com.walguru.letsmodreboot.configuration.ConfigurationHandler;
import com.walguru.letsmodreboot.proxy.IProxy;
import com.walguru.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name =Reference.MOD_NAME ,version = Reference.VERSION)
public class LetsModReboot {


    @Mod.Instance("LetsModReboot")
    public static  LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS, modId = Reference.MOD_ID)
    public static IProxy proxy;


    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

    }

    @Mod.EventHandler
    public  void Init(FMLInitializationEvent event)
    {}

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {}
}
