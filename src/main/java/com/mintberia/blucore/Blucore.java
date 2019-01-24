package com.mintberia.blucore;

import org.bukkit.plugin.java.JavaPlugin;

public final class Blucore extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Mintberia Loaded");
    }

    @Override
    public void onDisable() {
        getLogger().info("Mintberia ded");
    }

}
