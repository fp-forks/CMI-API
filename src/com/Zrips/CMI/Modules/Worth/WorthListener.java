package com.Zrips.CMI.Modules.Worth;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.GUI.CMIGUICloseEvent;

public class WorthListener implements Listener {
    private CMI plugin = null;

    public WorthListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void InventoryClickEvent(InventoryClickEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void InventoryCloseEvent(CMIGUICloseEvent event) {
    }
}
