package countdigging.countdigging;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.*;

import java.util.HashMap;

public final class CountDigging extends JavaPlugin {

    public static CountDigging plugin;
    public static CountDigging instance;
    public CountDigging(){instance = this;}
    public static CountDigging getInstance(){return instance;}

    public static Scoreboard board;
    ScoreboardManager sbManager;

    public static Objective mainObject;
    public static Score ascore;
    public static Score bscore;



    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        Bukkit.getPluginManager().registerEvents(new EventListner(),this);

        sbManager = Bukkit.getScoreboardManager();
        board = sbManager.getMainScoreboard();


        mainObject = board.registerNewObjective("mainBoard","dummy", "ランキング");
        ascore = mainObject.getScore(EventListner.map.keySet()+":");
        ascore.setScore(11);
        bscore = mainObject.getScore(ChatColor.AQUA + "あお：");
        bscore.setScore(15);
        mainObject.setDisplaySlot(DisplaySlot.SIDEBAR);

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
