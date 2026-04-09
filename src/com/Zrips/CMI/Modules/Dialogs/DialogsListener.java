package com.Zrips.CMI.Modules.Dialogs;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;

public class DialogsListener implements Listener {
    private CMI plugin = null;

    public DialogsListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void PlayerQuitEvent(PlayerQuitEvent event) {
    }
}
