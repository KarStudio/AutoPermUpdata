package net.kar.autopermupdata;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        new BukkitRunnable() {
            @Override
            public void run() {
            getServer().dispatchCommand(getServer().getConsoleSender(), "pex reload");
            }
        }.runTaskTimer(this, 0L, 60L);
    }

}
