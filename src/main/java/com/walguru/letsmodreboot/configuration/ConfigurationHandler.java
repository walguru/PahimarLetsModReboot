package com.walguru.letsmodreboot.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static  void init(File configFile)
    {
        //Create configuration object from configuration file
        Configuration configuration= new Configuration(configFile);
        boolean configvalue=false;
        try
        {
            //Load the configuration file
            configuration.load();
            //Read in properties from configuration file

             configvalue= configuration.get(Configuration.CATEGORY_GENERAL,"configValue", true,"this is an example config value").getBoolean((true));
        }catch (Exception ex)
        {
            //log the exception
        }
        finally {
            //Save the configuration file
            configuration.save();
        }
        System.out.println(configvalue);
    }

}
