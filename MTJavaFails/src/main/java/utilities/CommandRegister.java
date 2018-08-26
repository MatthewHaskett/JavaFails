package utilities;

import java.lang.reflect.Field;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandMap;
import org.bukkit.command.defaults.BukkitCommand;

public class CommandRegister {
	private static void CommandRegister(BukkitCommand command) {
		try {
			final Field commandMapField = Bukkit.getServer().getClass().getDeclaredField("commandMap");
			commandMapField.setAccessible(true);
			final CommandMap commandMap = (CommandMap) commandMapField.get(Bukkit.getServer());
			commandMap.register(command.getLabel(), command);
			
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
