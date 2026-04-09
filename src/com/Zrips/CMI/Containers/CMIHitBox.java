package com.Zrips.CMI.Containers;

import java.lang.reflect.Method;

import org.bukkit.ChunkSnapshot;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;

public class CMIHitBox {
    private Vector max = null;
    private Vector min = null;
    private Block block = null;
    private Entity ent = null;
    private World world = null;
    private ChunkSnapshot snapshot = null;
    static Method getBlockTypeId = null;

    CMIHitBox(World world, Vector min, Vector max) {
    }

    public CMIHitBox(Block block) {
    }

    public CMIHitBox(Entity ent) {
    }

    public Vector getMax() {
        return null;
    }

    public Location getCenterLocation() {
        return null;
    }

    public Double getHeightAtLocation(Location loc) {
        return null;
    }

    public Vector getMaxGlobal() {
        return null;
    }

    public Vector getMin() {
        return null;
    }

    public double getHitBoxHeight() {
        return 0.0;
    }

    public double getHitBoxWidth() {
        return 0.0;
    }

    public double getHitBoxLength() {
        return 0.0;
    }

    public Vector getMinGlobal() {
        return null;
    }

    public void byExactXYZ(double x, double y, double z) {
    }

    public boolean byExactXYZ(double x, double y, double z, double tolerance) {
        return false;
    }

    public boolean isPassable() {
        return false;
    }

    public boolean isEmptySpace(Location loc) {
        return false;
    }

    public boolean isEmptySpace() {
        return false;
    }

    public boolean isEmptySpace(World world, Vector minimal, Vector maximum, boolean resize) {
        return false;
    }

    public Block getCollidingdBlock() {
        return null;
    }

    public Block getCollidingdBlock(World world, Vector minimal, Vector maximum) {
        return null;
    }

    public Block getCollidingdBlock(World world, Vector minimal, Vector maximum, boolean resize) {
        return null;
    }

    public boolean collides(Entity ent) {
        return false;
    }

    public boolean canPlayerStand(Location loc) {
        return false;
    }

    public boolean collides(Vector position) {
        return false;
    }

    public Block getBlock() {
        return null;
    }

    public void setMax(Vector max) {
    }

    public void setMin(Vector min) {
    }

    public Entity getEntity() {
        return null;
    }

    public void setEntity(Entity ent) {
    }

    public World getWorld() {
        return null;
    }

    public ChunkSnapshot getSnapshot() {
        return null;
    }

    public void setSnapshot(ChunkSnapshot snapshot) {
    }
}
