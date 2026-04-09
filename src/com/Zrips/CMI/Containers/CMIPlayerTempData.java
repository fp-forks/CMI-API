package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import com.Zrips.CMI.Modules.CmdCooldown.CmdCooldown;

public class CMIPlayerTempData {
    private CmdCooldown commandCooldown = null;
    private String bungeeBackLocation = null;
    private long lastPatrol = 0;
    private long playTimeOptimized = 0;
    private long afkImunity = 0;
    private long lastRespawn = 0;
    private long backExpiration = 0;
    private long deathBackExpiration = 0;
    private HashMap<UserDataUpdateType, Long> lastInfoUpdate = null;
    private static ConcurrentHashMap<UUID, CMIPlayerTempData> playerTempData = null;

    public static void clearOnLogOff(UUID uuid) {
    }

    public CmdCooldown getCommandCooldown() {
        return null;
    }

    public void setCommandCooldown(CmdCooldown commandCooldown) {
    }

    public String getBungeeBackLocation() {
        return null;
    }

    public void setBungeeBackLocation(String bungeeBackLocation) {
    }

    public long getLastPatrol() {
        return 0;
    }

    public void setLastPatrol(long lastPatrol) {
    }

    public long getPlayTimeOptimized() {
        return 0;
    }

    public void setPlayTimeOptimized(long playTimeOptimized) {
    }

    public long getAfkImunity() {
        return 0;
    }

    public void setAfkImunity(long afkImunity) {
    }

    public long getLastRespawn() {
        return 0;
    }

    public void setLastRespawn(long lastRespawn) {
    }

    public HashMap<UserDataUpdateType, Long> getLastInfoUpdate() {
        return null;
    }

    public void setLastInfoUpdate(HashMap<UserDataUpdateType, Long> lastInfoUpdate) {
    }

    public static CMIPlayerTempData get(UUID uuid) {
        return null;
    }

    public static CMIPlayerTempData computeIfAbsent(UUID uuid) {
        return null;
    }

    public long getBackExpiration() {
        return 0;
    }

    public void setBackExpiration(long backExpirationAt) {
    }

    public long getDeathBackExpiration() {
        return 0;
    }

    public void setDeathBackExpiration(long deathBackExpiration) {
    }
}
