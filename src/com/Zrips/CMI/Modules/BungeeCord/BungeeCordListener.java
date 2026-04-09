package com.Zrips.CMI.Modules.BungeeCord;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.messaging.PluginMessageListener;

import com.Zrips.CMI.CMI;

public class BungeeCordListener implements PluginMessageListener, Listener {
    public final static String incomingChannel = null;
    public final static String outgoingChannel = null;
    CMI plugin = null;
    HashMap<UUID, BungeeTeleport> tpMap = null;
    HashMap<String, Long> m = null;
    Long lastMessageTime = null;
    Long lastStaffMessageTime = null;
    Long lastPrivateMessageTime = null;
    String lastMessage = null;
    String lastStaffMessage = null;
    String lastPrivateMessage = null;

    public BungeeCordListener(CMI plugin) {
    }

    @Override
    public void onPluginMessageReceived(String channel, Player player, byte[] bytes) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
    }

    class BungeeTeleport {
        private Location loc = null;
        private String from = null;
        private long time = 0;

        public BungeeTeleport() {
        }

        public Location getLoc() {
            return null;
        }

        public BungeeTeleport setLoc(Location loc) {
            return null;
        }

        public long getTime() {
            return 0;
        }

        public String getFrom() {
            return null;
        }

        public BungeeTeleport setFrom(String from) {
            return null;
        }
    }
}
