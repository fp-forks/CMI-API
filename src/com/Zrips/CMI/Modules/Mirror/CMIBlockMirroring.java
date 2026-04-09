package com.Zrips.CMI.Modules.Mirror;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import net.Zrips.CMILib.Effects.CMIEffect;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIBlockMirroring {
    private HashMap<CMIMirrorType, CMIMirrorMode> map = null;
    private Location blockPosition = null;
    private boolean paused = false;
    private Vector edge = null;
    private long lastAction = 0;
    private CMITask timer = null;
    private Player player = null;
    private CMIMIrrorFlipType flipType = null;
    CMIEffect centerEffect = null;
    int cycles = 0;

    public CMIBlockMirroring(Player player, Location loc) {
    }

    public CMIBlockMirroring reset() {
        return null;
    }

    public boolean is(CMIMirrorType action) {
        return false;
    }

    public CMIBlockMirroring set(CMIMirrorType action, CMIMirrorMode mode) {
        return null;
    }

    public CMIMirrorMode get(CMIMirrorType action) {
        return null;
    }

    public Location getCenter() {
        return null;
    }

    public CMIBlockMirroring setCenter(Location loc) {
        return null;
    }

    public boolean isPaused() {
        return false;
    }

    public CMIBlockMirroring setPaused(boolean paused) {
        return null;
    }

    @Override
    public CMIBlockMirroring clone() {
        return null;
    }

    public long getLastAction() {
        return 0;
    }

    public void setLastAction(long lastAction) {
    }

    public Vector getEdge() {
        return null;
    }

    public Vector getNextEdge() {
        return null;
    }

    public int edgeToNumber() {
        return 0;
    }

    public CMIBlockMirroring setEdge(Vector edge) {
        return null;
    }

    public boolean inRange(Location location) {
        return false;
    }

    public CompletableFuture<HashMap<Vector, CMIMirrorFlipInformation>> getPointsWithFlipAsync(Vector startingPoint) {
        return null;
    }

    public CompletableFuture<Set<Vector>> getPointsAsync(Vector startingPoint) {
        return null;
    }

    public CMIMIrrorFlipType getFlipType() {
        return null;
    }

    public void setFlipType(CMIMIrrorFlipType flipType) {
    }

    public enum Axis {
        X(1, 0, 0), Y(0, 1, 0), Z(0, 0, 1);

        Vector vector = null;

        Axis(int x, int y, int z) {
        }

        public Vector getVector() {
            return null;
        }
    }
}
