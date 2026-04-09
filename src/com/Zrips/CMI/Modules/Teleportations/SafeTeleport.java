package com.Zrips.CMI.Modules.Teleportations;

import org.bukkit.Location;

public class SafeTeleport {
    private Location old = null;
    private Location safeLoc = null;
    private Location lastCheckedLoc = null;
    private CMITeleportCondition TpCond = null;
    private boolean enableFly = false;
    private boolean forceDisableFly = false;

    public SafeTeleport(Location old, Location safeLoc, Location lastCheckedLoc, CMITeleportCondition TpCondition) {
        this(old, safeLoc, lastCheckedLoc, TpCondition, false);
    }

    public SafeTeleport(Location old, Location safeLoc, CMITeleportCondition TpCondition) {
        this(old, safeLoc, TpCondition, false);
    }

    public SafeTeleport(Location old, Location safeLoc, CMITeleportCondition TpCondition, boolean enableFly) {
        this(old, safeLoc, null, TpCondition, enableFly);
    }

    public SafeTeleport(Location old, Location safeLoc, Location lastCheckedLoc, CMITeleportCondition TpCondition, boolean enableFly) {
    }

    public Location getOld() {
        return null;
    }

    public Location getSafeLoc() {
        return null;
    }

    public CMITeleportCondition getTpCondition() {
        return null;
    }

    public boolean isEnableFly() {
        return false;
    }

    public SafeTeleport setEnableFly(boolean enableFly) {
        return null;
    }

    public boolean isForceDisableFly() {
        return false;
    }

    public void setForceDisableFly(boolean forceDisableFly) {
    }

    public Location getLastCheckedLoc() {
        return null;
    }

    public void setLastCheckedLoc(Location lastCheckedLoc) {
    }
}
