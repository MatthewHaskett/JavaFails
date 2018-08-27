package com.unfamousthomas.utils;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class Messages {

    public static void tell(CommandSender player, String message) {
        player.sendMessage(colorize(message));
    }

    private static String colorize(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
