package com.Zrips.CMI.Modules.BlueMap;

import java.util.List;

import org.bukkit.Location;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Warps.CmiWarp;

import net.Zrips.CMILib.Container.CMILocation;

public class BlueMapManager {
    private CMI plugin = null;
    private boolean warpsEnabled = false;
    private boolean hiddenByDefault = false;
    private String warpsLabel = null;
    private String warpsIcon = null;
    private int iconAnchor = 0;
    private List<String> blackList = null;

    public BlueMapManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public void addAllWarpMarkers() {
    }

    public void addWarp(CmiWarp warp) {
    }

    public void removeWarp(CmiWarp warp) {
    }

    public void removeWarp(CmiWarp warp, Location location) {
    }

    public void addWarp(CmiWarp warp, CMILocation location) {
    }
}
