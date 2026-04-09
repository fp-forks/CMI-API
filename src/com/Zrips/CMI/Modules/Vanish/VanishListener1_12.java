package com.Zrips.CMI.Modules.Vanish;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;

import com.Zrips.CMI.CMI;

public class VanishListener1_12 implements Listener {
    private CMI plugin = null;

    public VanishListener1_12(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onBlockReceiveGameEvent(PlayerAdvancementDoneEvent event) {
    }
}
