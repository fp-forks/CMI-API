package com.Zrips.CMI.Modules.Portals;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Container.CMIVectorInt3D;

public class CuboidArea {
    private Vector p1 = null;
    private Vector p2 = null;
    private Vector highPoints = null;
    private Vector lowPoints = null;
    private World world = null;
    private String worldName = null;
    private static final int MIN_HEIGHT = 0;

    public CuboidArea(World world, CMIVectorInt3D startLoc, CMIVectorInt3D endLoc) {
    }

    public CuboidArea(World world, Vector startLoc, Vector endLoc) {
    }

    public CuboidArea(CMILocation startLoc, CMILocation endLoc) {
    }

    public CuboidArea(Location startLoc, Location endLoc) {
    }

    public CuboidArea(World world) {
    }

    @Override
    public CuboidArea clone() {
        return null;
    }

    public boolean valid() {
        return false;
    }

    public boolean isAreaWithinArea(CuboidArea area) {
        return false;
    }

    public Location getOutsideFreeLoc() {
        return null;
    }

    public boolean containsLoc(Location loc) {
        return false;
    }

    public boolean containsLoc(Vector vector) {
        return false;
    }

    public boolean containsLoc(Location loc, int extraRange) {
        return false;
    }

    public boolean containsLoc(Vector vector, int extraRange) {
        return false;
    }

    public boolean checkCollision(CuboidArea area) {
        return false;
    }

    public long getSize() {
        return 0;
    }

    public int getXSize() {
        return 0;
    }

    public int getYSize() {
        return 0;
    }

    public int getZSize() {
        return 0;
    }

    public Location getHighLoc() {
        return null;
    }

    public Vector getHighPoint() {
        return null;
    }

    public Location getLowLoc() {
        return null;
    }

    public Vector getLowPoint() {
        return null;
    }

    public World getWorld() {
        return null;
    }

    public List<ChunkRef> getChunks() {
        return null;
    }

    public List<ChunkRef> getChunks(int range) {
        return null;
    }

    public void setArea(CuboidArea area) {
    }

    public void setHighLocation(Location highLocation) {
    }

    public void setHighPoint(Vector highLocation) {
    }

    public void setLowLocation(Location lowLocation) {
    }

    public void setLowPoint(Vector lowPoint) {
    }

    public void setWorld(World world) {
    }

    public void setLocation(Location location) {
    }

    public void setPoint(Vector vector) {
    }

    @Deprecated
    public Location getMiddleLocation() {
        return null;
    }

    public Vector getMiddlePoint() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public boolean shift(Player player, double amount) {
        return false;
    }

    public boolean shift(Direction d, double amount) {
        return false;
    }

    public boolean expand(Player player, double amount) {
        return false;
    }

    public boolean expand(Direction d, double amount) {
        return false;
    }

    public boolean contract(Player player, double amount) {
        return false;
    }

    public boolean contract(Direction d, double amount) {
        return false;
    }

    public String getWorldName() {
        return null;
    }

    public static final class ChunkRef {
        private final int z = 0;
        private final int x = 0;

        public ChunkRef(Location loc) {
        }

        public ChunkRef(int x, int z) {
        }

        public static int getChunkCoord(int val) {
            return 0;
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public String toString() {
            return null;
        }
    }

    public enum Direction {
        UP, DOWN, PLUSX, PLUSZ, MINUSX, MINUSZ;
    }
}
