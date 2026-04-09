package com.Zrips.CMI.Modules.Worlds;

import java.awt.Color;
import java.util.List;

import org.bukkit.Chunk;
import org.bukkit.ChunkSnapshot;
import org.bukkit.World;

import net.Zrips.CMILib.Container.CMIBiome;

public class CMIChunk {
    private Integer x = null;
    private Integer z = null;
    private World world = null;
    private boolean generated = false;
    private Color color = null;
    private Color mostCommonColor = null;
    private List<CMIBiome> biomes = null;

    public CMIChunk(Chunk chunk) {
        this(chunk.getWorld(), chunk.getX(), chunk.getZ());
    }

    public CMIChunk(World world, int x, int z) {
    }

    public int getRelativeX() {
        return 0;
    }

    public int getRelativeZ() {
        return 0;
    }

    public Integer getPlace() {
        return null;
    }

    public Integer getX() {
        return null;
    }

    public Integer getZ() {
        return null;
    }

    public CMIChunk recheckBiomes(Chunk chunk) {
        return null;
    }

    public CMIChunk recheckBiomes() {
        return null;
    }

    public World getWorld() {
        return null;
    }

    public ChunkSnapshot getEmptyChunkSnapshot() {
        return null;
    }

    public boolean isGenerated() {
        return false;
    }

    public CMIChunk setGenerated(boolean generated) {
        return null;
    }

    public Chunk getChunk() {
        return null;
    }

    public List<CMIBiome> getBiomes() {
        return null;
    }

    public String getBiomeColorCodes() {
        return null;
    }

    public Color getUnbluredColor() {
        return null;
    }

    public void setBiomes(List<CMIBiome> biomes) {
    }
}
