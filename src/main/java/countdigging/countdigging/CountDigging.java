package countdigging.countdigging;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CountDigging extends JavaPlugin {

    public static CountDigging plugin;
    public static CountDigging instance;
    public CountDigging(){instance = this;}
    public static CountDigging getInstance(){return instance;}
    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        Bukkit.getPluginManager().registerEvents(new EventListner(),this);
        //getCommand("az").setExecutor(new command());
        //itemManager.init();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static CountDigging getPlugin(){
        return plugin;
    }
}
