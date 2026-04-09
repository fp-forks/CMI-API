package com.Zrips.CMI.Modules.Anvil;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;

import com.Zrips.CMI.CMI;

public class AnvilColorListener implements Listener {
    private CMI plugin = null;

    public AnvilColorListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PrepareAnvilEvent(PrepareAnvilEvent event) {
    }
}
