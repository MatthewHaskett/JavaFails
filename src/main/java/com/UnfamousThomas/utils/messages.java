package com.UnfamousThomas.utils;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class messages {

    public static void tell (CommandSender toWhom, String message) {
        toWhom.sendMessage(colorize(message));
    }
    private static String colorize(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);

    }
}
