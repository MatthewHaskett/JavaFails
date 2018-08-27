package com.unfamousthomas.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

import java.util.Arrays;

public class FunCommand extends BukkitCommand {

    public FunCommand() {
        super("fun");

        setAliases(Arrays.asList("f","happy"));

}
    @Override
    public boolean execute(CommandSender sender, String s, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Please insert something that is FunCommand.");
        } else {
        String player = sender.getName();
            StringBuilder message = new StringBuilder("");
            for (String part : args) {
                if (!message.toString().equals(""))
                    message.append(" ");

                message.append(part);
            }

            Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Fun >>> " + player + ChatColor.AQUA + " thinks that " + message.toString() + " is fun!");
        }


        return true;
    }
}
