package com.Zrips.CMI.Modules.Signs;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;

import io.papermc.paper.event.player.PlayerOpenSignEvent;

public class PlayerSignEdit1_20_PaperListeners implements Listener {
    public PlayerSignEdit1_20_PaperListeners(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
    public void onPlayerSignOpenEvent(PlayerOpenSignEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
    public void onPlayerSignOpenEventEditor(PlayerOpenSignEvent event) {
    }
}
