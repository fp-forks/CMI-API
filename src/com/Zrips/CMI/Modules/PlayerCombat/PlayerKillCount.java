package com.Zrips.CMI.Modules.PlayerCombat;

import java.util.UUID;

public class PlayerKillCount {
    UUID uuid = null;
    private long lastKill = 0;
    private int kills = 0;
    private int headDropCount = 0;

    public PlayerKillCount(UUID uuid) {
    }

    public int addKill() {
        return 0;
    }

    public int getKills() {
        return 0;
    }

    public void setKills(int kills) {
    }

    public Long getLastKill() {
        return null;
    }

    public void setLastKill(Long lastKill) {
    }

    public int getHeadDropCount() {
        return 0;
    }

    public void setHeadDropCount(int headDropCount) {
    }

    public void addHeadDropCount() {
    }
}
