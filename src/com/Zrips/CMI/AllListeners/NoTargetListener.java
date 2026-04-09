package com.Zrips.CMI.AllListeners;

import java.util.Set;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class NoTargetListener implements Listener {
    private CMI plugin = null;
    public static Set<UUID> noTargetPlayers = null;

    public NoTargetListener(CMI plugin) {
    }

    public static boolean isInNoTargetPlayers(UUID uuid) {
        return false;
    }

    public static void toggleOn(CMIUser user) {
    }

    public static void toggleOff(CMIUser user) {
    }

    public static void addNoTargetPlayers(UUID uuid) {
    }

    public static void removeNoTargetPlayers(UUID uuid) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerJoin(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerQuit(PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void EntityTargetLivingEntityEvent(EntityTargetLivingEntityEvent event) {
    }
}
