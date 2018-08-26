package commands;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Ban extends BukkitCommand {
	public Ban() {
		super("Ban");
		
		setAliases(Arrays.asList("b", "remove"));
		setDescription("Ban people.");
		
	}

	@Override
	public boolean execute(CommandSender sender, String commandLabel, String[] args) {
		Player targetPlayer = Bukkit.getPlayer(args[0]);
		String reason ="";
		for (int i=1; i<args.length; i++)
		{
		    reason += args[i] + " ";
		} 
		if (args.length == 1) {
			sender.sendMessage(ChatColor.RED + "Ban >> Please input a reason.");
			
		} else if (targetPlayer == null ) {
			targetPlayer.setBanned
			BanList#addBan(targetPlayer, )
		}
		return false;
	}
	

}
