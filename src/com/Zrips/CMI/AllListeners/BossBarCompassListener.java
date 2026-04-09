package com.Zrips.CMI.AllListeners;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import com.Zrips.CMI.CMI;

public class BossBarCompassListener implements Listener {
    private CMI plugin = null;
    ConcurrentHashMap<UUID, Long> compassCheck = null;

    public BossBarCompassListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerItemHeldEvent(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerItemHeldEvent(PlayerItemHeldEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerMoveEvent(PlayerMoveEvent event) {
    }
}
