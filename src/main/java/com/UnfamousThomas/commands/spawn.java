package com.UnfamousThomas.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;

import java.util.Arrays;
import com.UnfamousThomas.utils.messages;
import org.bukkit.inventory.ItemStack;

public class spawn extends BukkitCommand {
    public spawn() {
        super("spawn");

        setAliases(Arrays.asList("home","s"));
        setDescription("teleports to spawn.");
}

    public boolean execute(CommandSender sender, String s, String[] args) {
            if (!(sender instanceof Player)) {
                messages.tell(sender, "&4NO! YOU ARE NOT A PLAYER NOOB!");
                return false;
            }
        Player player = (Player) sender;
        if (!(player.hasPermission("fails.spawn"))){
                messages.tell(sender, "&4You do not have permissions for that.");
                return false;
        }
        messages.tell(sender,"&6Teleported you to spawn.");
        player.teleport(new Location(Bukkit.getWorld("world"), 294, 74, 182));
        player.getInventory().addItem(new ItemStack(Material.DIAMOND, 2));
        return false;
        }
    }
