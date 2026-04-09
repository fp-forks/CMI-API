package com.Zrips.CMI.Modules.Portals;

import java.util.concurrent.CompletableFuture;

import org.bukkit.util.Vector;

public class CMIPlaneIntersection {
    private CMIVector3D globalLoc = null;
    private CMIVector2D localLoc = null;
    private final static double _HPI = 0.0;

    public static CompletableFuture<CMIPlaneIntersection> get(Vector rayVector, Vector rayPoint, Vector planeNormal, CMIPlane plane) {
        return null;
    }

    public static CMIVector3D rotateAroundCenter(CMIVector3D loc, double yaw, double pitch) {
        return null;
    }

    public static CMIVector3D rotateAroundCenter(double lx, double ly, double yaw, double pitch) {
        return null;
    }

    public static double xPosYaw(double time, double radius, double yaw) {
        return 0.0;
    }

    public static double yPosYaw(double time, double radius) {
        return 0.0;
    }

    public static double zPosYaw(double time, double radius, double yaw) {
        return 0.0;
    }

    public CMIVector3D getGlobalLoc() {
        return null;
    }

    public void setGlobalLoc(CMIVector3D globalLoc) {
    }

    public CMIVector2D getLocalLoc() {
        return null;
    }

    public void setLocalLoc(CMIVector2D localLoc) {
    }
}
