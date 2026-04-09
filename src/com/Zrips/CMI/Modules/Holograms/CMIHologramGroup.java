package com.Zrips.CMI.Modules.Holograms;

import java.util.HashMap;
import java.util.Set;

import org.bukkit.Location;
import org.bukkit.util.Vector;

public class CMIHologramGroup {
    private static HashMap<String, Set<CMIHologram>> hologramsByGroup = null;

    public static void clear() {
    }

    public static Set<CMIHologram> get(String group) {
        return null;
    }

    public static Set<CMIHologram> remove(String group) {
        return null;
    }

    public static void add(CMIHologram holo) {
    }

    public static void add(CMIHologram holo, String group) {
    }

    public static void updateHologramGroup(CMIHologram holo, String to) {
    }

    public static Set<CMIHologram> getHologramsByGroup(String group) {
        return null;
    }

    public static Location getCenterOfGroup(String group) {
        return null;
    }

    public static void relocateHologramGroup(Location loc, String group) {
    }

    public static void shiftHologramGroup(Vector vector, String group) {
    }

    public static void rotateHologramGroup(int yawAmount, int pitchAmount, String group, Location referencePoint) {
    }

    public static void rotateHologramYawGroup(int amount, String group, Location referencePoint) {
    }
}
