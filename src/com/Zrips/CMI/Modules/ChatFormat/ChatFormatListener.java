package com.Zrips.CMI.Modules.ChatFormat;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule;

public class ChatFormatListener implements Listener {
    private CMI plugin = null;
    private ChatFilterRule whiteRules = null;
    public static HashMap<UUID, Long> shouts = null;

    public ChatFormatListener(CMI plugin) {
    }

    public void AsyncPlayerChatEventShadowMute(AsyncPlayerChatEvent event) {
    }

    public void AsyncPlayerChatEventPersonalMute(AsyncPlayerChatEvent event) {
    }

    public static String processGradientChat(Player player, String message) {
        return null;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void AsyncPlayerChatEventRawConverter(AsyncPlayerChatEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void AsyncPlayerChatEventBungee(AsyncPlayerChatEvent event) {
    }
}
