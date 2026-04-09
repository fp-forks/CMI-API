package com.Zrips.CMI.Modules.Afk;

import org.bukkit.Location;

public class checkInfo {
    private Long time = null;
    private Location loc = null;
    private double prevAngle = 0.0;

    checkInfo(Location loc) {
    }

    public void updateTime() {
    }

    public void updateLocation(Location loc) {
    }

    public boolean isSameDirection(Location loc) {
        return false;
    }

    public boolean isOnlyPitchChange(Location loc) {
        return false;
    }

    public boolean timeToCheck() {
        return false;
    }

    public Long getTime() {
        return null;
    }

    public Location getLocation() {
        return null;
    }

    public double getPrevAngle() {
        return 0.0;
    }

    public void setPrevAngle(double prevAngle) {
    }
}
