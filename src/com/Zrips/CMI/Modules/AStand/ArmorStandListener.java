package com.Zrips.CMI.Modules.AStand;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;

public class ArmorStandListener implements Listener {
    private CMI plugin = null;

    public ArmorStandListener(CMI plugin) {
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
    }

    @EventHandler
    public void onBlockInteract(PlayerInteractEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onArmorStandDeath(EntityDeathEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void armorStandSpawnEvent(org.bukkit.event.entity.CreatureSpawnEvent event) {
    }
}
