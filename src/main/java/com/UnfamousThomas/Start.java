package com.unfamousthomas;

import com.unfamousthomas.commands.FunCommand;
import com.unfamousthomas.commands.OpToggleCommand;
import com.unfamousthomas.commands.PingCommand;
import com.unfamousthomas.commands.SpawnCommand;
import com.unfamousthomas.events.PlayerJoinListener;
import com.unfamousthomas.utils.RegCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Start extends JavaPlugin {

    @Override
    public void onEnable() {

        instance = this;
        Bukkit.getServer().getLogger().info("WOW IT ENABLED!");

        //Commands:
        RegCommand.registerCommand(new PingCommand());
        RegCommand.registerCommand(new FunCommand());
        RegCommand.registerCommand(new SpawnCommand());
        RegCommand.registerCommand(new OpToggleCommand());

        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);

    }
  
    @Override
    public void onDisable() {
        instance = null;
    }
    
    private static Start instance;

    public static Start getInstance() {
        return instance;
    }
  
}
