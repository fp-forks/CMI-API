package com.Zrips.CMI.Containers;

import com.Zrips.CMI.Modules.Kits.Kit;

public class CMIKitUsage {
    private String kitName = null;
    private long lastUsage = 0;
    private int usedTimes = 0;

    public CMIKitUsage(Kit kit) {
        this(kit, System.currentTimeMillis(), 0);
    }

    public CMIKitUsage(String kitConfigName, Long lastUsage) {
        this(kitConfigName, lastUsage, 0);
    }

    public CMIKitUsage(Kit kit, Long lastUsage) {
        this(kit, lastUsage, 0);
    }

    public CMIKitUsage(Kit kit, Long lastUsage, int usedTimes) {
        this(kit.getConfigName(), lastUsage, usedTimes);
    }

    public CMIKitUsage(String kitConfigName, Long lastUsage, int usedTimes) {
    }

    public Long getLastUsage() {
        return null;
    }

    public void setLastUsage(Long lastUsage) {
    }

    public void addUsedTimes() {
    }

    public int getUsedTimes() {
        return 0;
    }

    public void setUsedTimes(int usedTimes) {
    }

    public String getKitName() {
        return null;
    }

    public Kit getKit() {
        return null;
    }
}
