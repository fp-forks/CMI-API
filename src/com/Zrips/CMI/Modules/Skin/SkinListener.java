package com.Zrips.CMI.Modules.Skin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.Zrips.CMI.CMI;

public class SkinListener implements Listener {
    private CMI plugin = null;

    public SkinListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerLogin(PlayerJoinEvent event) {
    }
}
