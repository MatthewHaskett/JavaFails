package com.UnfamousThomas.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class spawn extends BukkitCommand {
    public spawn() {
        super("spawn");

        setAliases(Arrays.asList("home","s"));
        setDescription("teleports to spawn.");
}

    public boolean execute(CommandSender sender, String s, String[] args) {
        sender.sendMessage(ChatColor.GREEN + "Teleported you to spawn.");
        Player player = (Player) sender;
        player.teleport(new Location(Bukkit.getWorld("world"), 294, 74, 182));
        return false;
        }
    }
