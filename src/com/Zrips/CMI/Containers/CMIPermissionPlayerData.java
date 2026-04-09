package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class CMIPermissionPlayerData {
    private String nameColor = null;
    private String prefix = null;
    private String suffix = null;
    private String group = null;
    HashMap<UserDataUpdateType, Long> lastInfoUpdate = null;
    private static ConcurrentHashMap<UUID, CMIPermissionPlayerData> data = null;

    public static void clearCache(UUID uuid) {
    }

    public String getNameColor() {
        return null;
    }

    public CMIPermissionPlayerData setNameColor(String nameColor) {
        return null;
    }

    public String getPrefix() {
        return null;
    }

    public CMIPermissionPlayerData setPrefix(String prefix) {
        return null;
    }

    public String getSuffix() {
        return null;
    }

    public CMIPermissionPlayerData setSuffix(String suffix) {
        return null;
    }

    public String getGroup() {
        return null;
    }

    public CMIPermissionPlayerData setGroup(String group) {
        return null;
    }

    public static synchronized void updatePrefix(CMIUser user) {
    }

    public static synchronized void updateSuffix(CMIUser user) {
    }

    public static void updateGroup(CMIUser user) {
    }

    public static String getGroupName(CMIUser user) {
        return null;
    }

    public static String getNameColor(CMIUser user) {
        return null;
    }

    public static String getPrefix(CMIUser user) {
        return null;
    }

    public static String getSuffix(CMIUser user) {
        return null;
    }
}
