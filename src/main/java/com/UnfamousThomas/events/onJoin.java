package com.UnfamousThomas.events;

        import com.UnfamousThomas.utils.messages;
        import org.bukkit.entity.Player;
        import org.bukkit.event.EventHandler;
        import org.bukkit.event.Listener;
        import org.bukkit.event.player.PlayerJoinEvent;

public class onJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        final Player player = e.getPlayer();
        messages.tell(player, "&6Welcome to Thomas's Testing server, " + player.getName());
        messages.tell(player, "&6Have fun and enjoy your time here.");
        messages.tell(player, "&6PS MAKE SURE NOT TO CRASH THE SERVER....");
    }
}
