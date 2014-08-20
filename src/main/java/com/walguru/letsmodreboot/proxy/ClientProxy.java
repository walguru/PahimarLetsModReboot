package com.walguru.letsmodreboot.proxy;
import com.walguru.letsmodreboot.client.Settings.Keybindings;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;


/**
 * Created by Aurora on 28/06/2014.
 */
public class ClientProxy extends  CommonProxy {

    @Override
    public void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(Keybindings.charge);
        ClientRegistry.registerKeyBinding(Keybindings.release);
    }
}
