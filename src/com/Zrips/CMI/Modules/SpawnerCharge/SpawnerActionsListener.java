package com.Zrips.CMI.Modules.SpawnerCharge;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.Zrips.CMI.CMI;

public class SpawnerActionsListener implements Listener {
    private CMI plugin = null;

    public SpawnerActionsListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreakExplodeTnT(EntityExplodeEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerInteractEvent(PlayerInteractEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreakExplodeCreeper(EntityExplodeEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onBlockPlace(BlockPlaceEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
    public void onTrialSpawnerInteract(PlayerInteractEvent event) {
    }
}
