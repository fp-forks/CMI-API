package com.Zrips.CMI.Containers;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.BossBar.BossBarInfo;

public class Speed {
    private BossBarInfo bb = null;
    private Player player = null;
    private boolean allowBoost = false;
    private boolean allowSuperBoost = false;
    private boolean speedometer = false;
    private List<Long> time = null;
    private List<Location> loc = null;
    private Long boost = null;
    private Long superBoost = null;
    private boolean free = false;
    private boolean dura = false;
    private static int amount = 0;
    private static int timeRange = 0;

    public Speed(Player player) {
    }

    public double getSpeed() {
        return 0.0;
    }

    public void setLoc(Location loc) {
    }

    public boolean isGoodTime() {
        return false;
    }

    public void setTime(Long time) {
    }

    public Long getBoost() {
        return null;
    }

    public void setBoost(Long boost) {
    }

    public boolean isBoosting() {
        return false;
    }

    public Long getSuperBoost() {
        return null;
    }

    public void setSuperBoost(Long superBoost) {
    }

    public boolean isSuperBoosting() {
        return false;
    }

    public boolean isAllowBoost() {
        return false;
    }

    public boolean isAllowSuperBoost() {
        return false;
    }

    public boolean isSpeedometer() {
        return false;
    }

    public boolean isFree() {
        return false;
    }

    public void setFree(boolean free) {
    }

    public BossBarInfo getBb() {
        return null;
    }

    public void setBb(BossBarInfo bb) {
    }

    public boolean isShowDurability() {
        return false;
    }
}
