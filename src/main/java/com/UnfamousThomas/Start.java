package com.UnfamousThomas;

import com.UnfamousThomas.commands.ping;
import com.UnfamousThomas.utils.RegCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Start extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getServer().getLogger().info("WOW IT ENABLED!");
        RegCommand.RegisterCommand(new ping());
    }}
