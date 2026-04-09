package com.Zrips.CMI.Modules.Signs;

import java.util.Set;
import java.util.UUID;

import org.bukkit.block.Sign;
import org.bukkit.block.sign.Side;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSignOpenEvent;

import com.Zrips.CMI.CMI;

public class PlayerSignEdit1_20Listeners implements Listener {
    static Set<UUID> signEditCache = null;

    public PlayerSignEdit1_20Listeners(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
    public void onPlayerSignOpenEvent(PlayerSignOpenEvent event) {
    }

    public static boolean shouldCancel(Player player, Sign sign, Side side) {
        return false;
    }

    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
    public void onPlayerSignOpenEventEditor(PlayerSignOpenEvent event) {
    }

    public static void openSignDialog(Player player, Sign sign, Side side) {
    }
}
