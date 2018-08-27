package com.unfamousthomas.commands;

import com.unfamousthomas.utils.Messages;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class OpToggleCommand extends BukkitCommand {
    public OpToggleCommand() {
        super("OpToggleCommand");

        setAliases(Arrays.asList("ot","ops"));
        setDescription("Toggles your OP status");
    }

    public boolean execute(CommandSender sender, String s, String[] args) {
            if (!(sender instanceof Player)) {
                Messages.tell(sender,"&4You are not a player.");
                return false;
            }
            if (!sender.hasPermission("fails.op")) {
                Messages.tell(sender, "&4You do not have enough permissions.");
                return false;
            }
            Player player = (Player) sender;
            if (player.isOp()) {
                player.setOp(false);
                Messages.tell(sender, "&6Succesfully de-opped you!");
                return false;
            }
            if (!player.isOp()) {
                player.setOp(true);
                Messages.tell(sender, "&6Succesfully opped you!");
                return false;
            }




        return false;
    }
}
