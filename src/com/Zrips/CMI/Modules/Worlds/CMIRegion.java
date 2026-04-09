package com.Zrips.CMI.Modules.Worlds;

import java.util.TreeMap;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;

public class CMIRegion {
    private int z = 0;
    private int x = 0;
    private World world = null;
    private TreeMap<Integer, CMIChunk> chunks = null;

    public CMIRegion(Location loc) {
        this(loc.getWorld(), loc.getChunk().getX() >> 5, loc.getChunk().getZ() >> 5);
    }

    public CMIRegion(Chunk chunk) {
        this(chunk.getWorld(), chunk.getX() >> 5, chunk.getZ() >> 5);
    }

    public CMIRegion(World world, int x, int z) {
    }

    public int getX() {
        return 0;
    }

    public CMIRegion setX(int x) {
        return null;
    }

    public int getZ() {
        return 0;
    }

    public CMIRegion setZ(int z) {
        return null;
    }

    public CMIChunk getChunk(Chunk chunk) {
        return null;
    }

    public Integer getPlace() {
        return null;
    }

    public CMIChunk getRelativeChunk(int x, int z) {
        return null;
    }

    public boolean exists(int place) {
        return false;
    }

    public boolean exists(int x, int z) {
        return false;
    }

    public CMIChunk getChunk(int x, int z) {
        return null;
    }

    public TreeMap<Integer, CMIChunk> getChunks() {
        return null;
    }

    public void setChunks(TreeMap<Integer, CMIChunk> chunks) {
    }

    public CMIChunk addChunk(World world, int x, int z) {
        return null;
    }

    public CMIChunk addChunk(Chunk chunk) {
        return null;
    }

    public World getWorld() {
        return null;
    }

    public void setWorld(World world) {
    }
}
