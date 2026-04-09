package com.Zrips.CMI.Modules.Portals;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.util.Vector;

public class CMIVector3D extends CMIVector2D {
    private double z = 0.0;

    public CMIVector3D() {
        super(0, 0);
    }

    public CMIVector3D(Vector v) {
        super(v.getX(), v.getY());
    }

    public CMIVector3D(double x, double y, double z) {
        super(x, y);
    }

    public CMIVector3D plus(double x, double y, double z) {
        return null;
    }

    public CMIVector3D plus(CMIVector3D v) {
        return null;
    }

    public CMIVector3D minus(CMIVector3D v) {
        return null;
    }

    @Override
    public CMIVector3D minus(Vector v) {
        return null;
    }

    public CMIVector3D minus(double x, double y, double z) {
        return null;
    }

    public double dot(CMIVector3D v) {
        return 0.0;
    }

    public CMIVector3D cross(CMIVector3D other) {
        return null;
    }

    public CMIVector3D multiply(double scalar) {
        return null;
    }

    public CMIVector3D multiply(CMIVector3D scale) {
        return null;
    }

    public CMIVector3D multiply(double x, double y, double z) {
        return null;
    }

    public CMIVector3D normalize() {
        return null;
    }

    public double lengthSquared() {
        return 0.0;
    }

    @Override
    public String toString() {
        return null;
    }

    public static CMIVector3D fromString(String value) {
        return null;
    }

    public double getZ() {
        return 0.0;
    }

    public CMIVector3D setZ(double z) {
        return null;
    }

    public Location toLocation(World world) {
        return null;
    }

    public boolean isZero() {
        return false;
    }
}
