package com.unfamousthomas.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;

import java.util.Arrays;
import com.unfamousthomas.utils.Messages;
import org.bukkit.inventory.ItemStack;

public class SpawnCommand extends BukkitCommand {
    public SpawnCommand() {
        super("SpawnCommand");

        setAliases(Arrays.asList("home","s"));
        setDescription("teleports to SpawnCommand.");
}

    public boolean execute(CommandSender sender, String s, String[] args) {
            if (!(sender instanceof Player)) {
                Messages.tell(sender, "&4NO! YOU ARE NOT A PLAYER NOOB!");
                return false;
            }
        Player player = (Player) sender;
        if (!(player.hasPermission("fails.SpawnCommand"))){
                Messages.tell(sender, "&4You do not have permissions for that.");
                return false;
        }
        Messages.tell(sender,"&6Teleported you to SpawnCommand.");
        player.teleport(new Location(Bukkit.getWorld("world"), 294, 74, 182));
        player.getInventory().addItem(new ItemStack(Material.DIAMOND, 2));
        return false;
        }
    }
