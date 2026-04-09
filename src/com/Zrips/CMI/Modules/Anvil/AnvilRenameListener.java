package com.Zrips.CMI.Modules.Anvil;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIAnvilItemRenameEvent;

public class AnvilRenameListener implements Listener {
    private CMI plugin = null;

    public AnvilRenameListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void CMIItemRenameEvent(CMIAnvilItemRenameEvent event) {
    }
}
