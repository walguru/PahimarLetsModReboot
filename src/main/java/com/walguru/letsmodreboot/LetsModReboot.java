package com.walguru.letsmodreboot;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="LetsModReboot", name = "Lets Mod Reboot" ,version = "1.7.2-1.0")
public class LetsModReboot {


    @Mod.Instance("LetsModReboot")
    public static  LetsModReboot instance;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {}

    @Mod.EventHandler
    public  void Init(FMLInitializationEvent event)
    {}

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {}
}
