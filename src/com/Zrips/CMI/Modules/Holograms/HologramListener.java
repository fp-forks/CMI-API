package com.Zrips.CMI.Modules.Holograms;

import java.util.Map;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Holograms.Events.CMIHologramClickEvent;
import com.Zrips.CMI.Modules.Holograms.Events.CMIHologramStartHoverEvent;
import com.Zrips.CMI.Modules.Holograms.Events.CMIHologramStopHoverEvent;
import com.Zrips.CMI.events.CMIPlayerFakeEntityInteractEvent;

public class HologramListener implements Listener {
    private CMI plugin = null;
    protected Map<UUID, Long> lastUpdateRange = null;

    public HologramListener(CMI plugin) {
    }

    public static double zPosYaw(double time, double radius, double yaw) {
        return 0.0;
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMoveExtendedRnage(PlayerMoveEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMoveExtendedRnage(PlayerTeleportEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onInteract(PlayerInteractEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onInteract(CMIHologramClickEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIPlayerFakeEntityInteractEvent(CMIPlayerFakeEntityInteractEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerRespawnEvent(PlayerRespawnEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIHologramStartHoverEvent(CMIHologramStartHoverEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIHologramStopHoverEvent(CMIHologramStopHoverEvent event) {
    }
}
