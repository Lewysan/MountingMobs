package me.tyranzx.mountingmobs;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class StellarCore extends JavaPlugin implements Listener {

    private final PluginManager pm = Bukkit.getServer().getPluginManager();

    @Override
    public void onEnable() {
        this.registerListener();
    }
    private void registerListener(){
        pm.registerEvents(new MobListener(), this);
    }
}
