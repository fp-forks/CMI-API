package com.Zrips.CMI.Modules.Teleportations;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.RandomTeleport;

public class RandomTeleportationManager {
    private CMI plugin = null;
    Set<String> cacheFilling = null;
    private HashMap<String, RandomTeleport> randomTeleports = null;
    private int randomTeleportCooldown = 0;
    private int randomTeleportMaxTries = 0;
    private List<String> randomTeleportExcludedBiomes = null;
    static Random random = null;
    private static final String fileName = null;
    ConcurrentHashMap<UUID, CMIRunningRandomTeleports> playerRandomTeleports = null;
    String[] substrings = null;

    public RandomTeleportationManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public RandomTeleport getRandomTeleport(World w) {
        return null;
    }

    public RandomTeleport getRandomTeleport(String worldName) {
        return null;
    }

    public RandomTeleport getRandomTeleport(World w, boolean includeDisabled) {
        return null;
    }

    public RandomTeleport getRandomTeleport(String worldName, boolean includeDisabled) {
        return null;
    }

    public HashMap<String, RandomTeleport> getRandomTeleports() {
        return null;
    }

    public int getRandomTeleportMaxTries() {
        return 0;
    }

    public int getRandomTeleportCooldown() {
        return 0;
    }

    public List<String> getRandomTeleportExcludedBiomes() {
        return null;
    }

    public CompletableFuture<CMITeleportLocation> getRandomTeleportationLocation(RandomTeleport rtloc, Location loc, CompletableFuture<CMIChunkSnapShot> nestedChunkSnapshot) {
        return null;
    }

    public CompletableFuture<Boolean> randomTeleport(Player player, World world) {
        return null;
    }
}
