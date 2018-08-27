package com.unfamousthomas.events;

import com.unfamousthomas.utils.Messages;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        final Player player = e.getPlayer();
        Messages.tell(player, "&6Welcome to Thomas's Testing server, " + player.getName());
        Messages.tell(player, "&6Have FunCommand and enjoy your time here.");
        Messages.tell(player, "&6PS MAKE SURE NOT TO CRASH THE SERVER....");
    }
}
