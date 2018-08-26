package com.UnfamousThomas.commands;

import com.sun.xml.internal.fastinfoset.util.StringArray;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

import java.util.Arrays;

public class fun extends BukkitCommand {
    private Object StringArray;

    public ping() {
        super("fun");

        setAliases(Arrays.asList("f","happy"));

}

    public boolean execute(CommandSender sender, String s, String[] args) {
        if (args.length = 0) {
            sender.sendMessage(ChatColor.RED + "Please insert something that is fun.");
        } else {
        String player = sender.getName().toString();
        StringArray = new String[20];
            String funs =  args[1];
            Bukkit.getServer().broadcastMessage(StringArray);

            return false;
    }
}
