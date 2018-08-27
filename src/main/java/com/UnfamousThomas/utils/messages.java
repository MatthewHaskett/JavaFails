package com.unfamousthomas.utils;

import com.UnfamousThomas.Start;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class Messages {

    public static void tell(CommandSender player, String message) {
        player.sendMessage(colorize(message));
    }

    private static String colorize(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
    public static void log(String... messages) {
        for (final String message : messages)
            log(message);
    }

    public static void log(String messages) {
        tell(Bukkit.getConsoleSender(), "[" + Start.getInstance().getName() + "] " + messages);
    }
}
