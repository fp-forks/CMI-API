package com.Zrips.CMI.Containers;

import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class CMIRay {
    private Vector origin = null;
    private Vector direction = null;

    public CMIRay(Vector origin, Vector direction) {
    }

    public CMIRay(Player player) {
        this(player.getEyeLocation().toVector(), player.getLocation().getDirection());
    }

    public Vector getOrigin() {
        return null;
    }

    public Vector getDirection() {
        return null;
    }

    public double origin(int i) {
        return 0.0;
    }

    public double direction(int i) {
        return 0.0;
    }

    public Vector getPoint(double distance) {
        return null;
    }
}
