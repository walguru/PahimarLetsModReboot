package com.walguru.letsmodreboot.handler;

import com.walguru.letsmodreboot.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static  Configuration configuration ;
    public static  Boolean testValue=false;

    public static  void init(File configFile)
    {
        //Create configuration object from configuration file
        if (configuration==null) {
            configuration = new Configuration(configFile);
            LoadConfiguration();
        }

    }

    @SubscribeEvent
    public  void OnConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {

        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            //resync Configs
            LoadConfiguration();
        }
    }


    private static  void LoadConfiguration()
    {
        testValue= configuration.getBoolean("configValue",Configuration.CATEGORY_GENERAL, false,"This is an example configuration value");

        if (configuration.hasChanged())
        {
            configuration.save();
        }

    }
}
