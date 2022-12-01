package plsdate.me.orbitalapp;

import org.bukkit.plugin.java.JavaPlugin;
import plsdate.me.orbitalapp.Commands.*;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("OrbitalApp plugin has enabled.");

        getCommand("fire").setExecutor(new FireCommand(this));
        getCommand("lightning").setExecutor(new LightningCommand(this));
        getCommand("explode").setExecutor(new ExplodeCommand(this));
    }

    @Override
    public void onDisable() {
        getLogger().info("OrbitalApp plugin has disabled.");
    }
}
