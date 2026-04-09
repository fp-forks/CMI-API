package com.Zrips.CMI.CombiListeners;

import java.lang.reflect.Method;
import java.util.UUID;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CMIPlayerServerFullCheckEvent extends Event {
    private static final HandlerList handlers = null;
    private final String playerName = null;
    private final UUID uuid = null;
    private boolean allowed = false;
    private String kickMessage = null;
    private static Class<?> fullCheckClass = null;
    private static Method getProfileMethod = null;
    private static Method getProfileUUIDMethod = null;
    private static Method getProfileNameMethod = null;
    private static Method denyMethod = null;

    public CMIPlayerServerFullCheckEvent(UUID uuid, String playerName) {
        super();
    }

    public String getPlayerName() {
        return null;
    }

    public UUID getUUID() {
        return null;
    }

    public boolean isAllowed() {
        return false;
    }

    public void disallow(String message) {
    }

    public String getKickMessage() {
        return null;
    }

    @Override
    public HandlerList getHandlers() {
        return null;
    }

    public static void register() {
    }
}
