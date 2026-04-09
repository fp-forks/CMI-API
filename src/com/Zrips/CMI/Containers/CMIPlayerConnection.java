package com.Zrips.CMI.Containers;

import java.lang.reflect.Method;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Nullable;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class CMIPlayerConnection implements Listener {
    private static ConcurrentHashMap<UUID, Object> playersConnections = null;
    private static Method sendPacket = null;

    public static void addConnection(Player player) {
    }

    @Nullable
    public static Object getConnection(Player player) {
        return null;
    }

    @Nullable
    public static Object getConnection(UUID uuid) {
        return null;
    }

    public static void removeConnection(Player player) {
    }

    public static void removeConnection(UUID uuid) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onJoin(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onQuit(PlayerQuitEvent event) {
    }

    public static void sendPacket(Player player, Object packet) {
    }

    public static void sendPacket(UUID uuid, Object packet) {
    }

    public static void sendPacket(Object connection, Object packet) {
    }
}
