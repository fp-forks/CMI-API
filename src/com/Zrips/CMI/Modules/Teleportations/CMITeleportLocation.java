package com.Zrips.CMI.Modules.Teleportations;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.Nullable;

import net.Zrips.CMILib.Items.CMIMaterial;

public class CMITeleportLocation {
    private World world = null;
    private Vector position = null;
    private float yaw = 0.0f;
    private float pitch = 0.0f;
    private CMITeleportCondition condition = null;
    private double fallDistance = 0.0;
    private CMIMaterial floor = null;
    private CMITeleportType type = null;

    public CMITeleportLocation(World world) {
    }

    public Vector getPosition() {
        return null;
    }

    public CMITeleportLocation setPosition(Vector position) {
        return null;
    }

    public World getWorld() {
        return null;
    }

    @Nullable
    public Location getLocation() {
        return null;
    }

    public float getYaw() {
        return 0.0f;
    }

    public CMITeleportLocation setYaw(float yaw) {
        return null;
    }

    public float getPitch() {
        return 0.0f;
    }

    public CMITeleportLocation setPitch(float pitch) {
        return null;
    }

    public CMITeleportCondition getCondition() {
        return null;
    }

    public CMITeleportLocation setCondition(CMITeleportCondition condition) {
        return null;
    }

    public double getFallDistance() {
        return 0.0;
    }

    public CMITeleportLocation setFallDistance(double fallDistance) {
        return null;
    }

    public CMIMaterial getFloor() {
        return null;
    }

    public CMITeleportLocation setFloor(CMIMaterial floor) {
        return null;
    }

    public CMITeleportType getType() {
        return null;
    }

    public void setType(CMITeleportType type) {
    }
}
