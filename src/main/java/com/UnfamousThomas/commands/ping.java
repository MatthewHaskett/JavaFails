package com.UnfamousThomas.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ping extends BukkitCommand {
    public ping() {
        super("ping");

        setAliases(Arrays.asList("p","pi"));
    }
    @Override
    public boolean execute(CommandSender sender, String s, String[] args) {
        if (sender instanceof Player) {
            sender.sendMessage(ChatColor.GOLD + "Pong!");
        }
        return false;
    }
}
