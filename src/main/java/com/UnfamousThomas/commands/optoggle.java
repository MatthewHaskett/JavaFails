package com.UnfamousThomas.commands;

import com.UnfamousThomas.utils.messages;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class optoggle extends BukkitCommand {
    public optoggle() {
        super("optoggle");

        setAliases(Arrays.asList("ot","ops"));
        setDescription("Toggles your OP status");
    }

    public boolean execute(CommandSender sender, String s, String[] args) {
            if (!(sender instanceof Player)) {
                messages.tell(sender,"&4You are not a player.");
                return false;
            }
            if (!sender.hasPermission("fails.op")) {
                messages.tell(sender, "&4You do not have enough permissions.");
                return false;
            }
            Player player = (Player) sender;
            if (player.isOp()) {
                player.setOp(false);
                messages.tell(sender, "&6Succesfully de-opped you!");
                return false;
            }
            if (!player.isOp()) {
                player.setOp(true);
                messages.tell(sender, "&6Succesfully opped you!");
                return false;
            }




        return false;
    }
}
