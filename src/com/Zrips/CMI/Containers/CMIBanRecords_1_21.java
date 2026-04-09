package com.Zrips.CMI.Containers;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Nullable;

import org.bukkit.BanEntry;
import org.bukkit.BanList;

public class CMIBanRecords_1_21 {
    static Method banPaperMethod = null;
    static Method pardonPaperMethod = null;
    static Method getBanPaperMethod = null;

    @Nullable
    public static BanEntry getBanEntry(UUID uuid, String name) {
        return null;
    }

    @Nullable
    public static BanEntry addBan(UUID uuid, String name, String reason, Date date, String source) {
        return null;
    }

    @Nullable
    public static BanEntry addBanByIP(String ip, String reason, Date date, String source) {
        return null;
    }

    @Nullable
    public static void pardon(UUID uuid, String name) {
    }

    @Nullable
    public static void pardonByIP(String ip) {
    }

    @Nullable
    public static BanList<?> getBanEntriesByIP() {
        return null;
    }

    @Nullable
    public static BanList<?> getBanEntries() {
        return null;
    }
}
