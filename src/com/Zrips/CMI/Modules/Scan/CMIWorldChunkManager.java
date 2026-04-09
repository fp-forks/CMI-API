package com.Zrips.CMI.Modules.Scan;

import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Pattern;

import org.bukkit.World;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Container.CMIVectorInt2D;

public class CMIWorldChunkManager {
    private CMI plugin = null;
    private static final Pattern regionPattern = null;
    private boolean disableWorldChunkCheckInfo = false;
    private double scanSoftCap = 0.0;
    private int scanDefaultSpeed = 0;
    private int defaultRange = 0;
    private boolean purge = false;
    private boolean logIntoFile = false;

    public CMIWorldChunkManager(CMI plugin) {
    }

    public boolean isDisableWorldChunkCheckInfo() {
        return false;
    }

    public double getScanSoftCap() {
        return 0.0;
    }

    public int getScanDefaultSpeed() {
        return 0;
    }

    public int getDefaultRange() {
        return 0;
    }

    public boolean isPurge() {
        return false;
    }

    public boolean isLogIntoFile() {
        return false;
    }

    public void loadConfig() {
    }

    public CompletableFuture<CMIWorldChunksRanged> getWorldChunkInfoInRange(World world, CMIVectorInt2D center) {
        return null;
    }

    public CompletableFuture<CMIWorldChunksRanged> getWorldChunkInfoInRangeAsync(World world, CMIVectorInt2D center, int range) {
        return null;
    }

    public CompletableFuture<CMIWorldChunks> loadWorldChunksInRangeAsync(World world, CMIVectorInt2D center, int range) {
        return null;
    }

    public static HashMap<Long, CMIVectorInt2D> getRegionFiles(CMIVectorInt2D center, int range) {
        return null;
    }
}
