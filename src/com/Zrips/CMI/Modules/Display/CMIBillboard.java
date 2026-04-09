package com.Zrips.CMI.Modules.Display;

import org.bukkit.entity.Display.Billboard;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Holograms.CMIHologram;

import net.Zrips.CMILib.Container.CMIVector3D;

public enum CMIBillboard {
    VERTICAL(false, true, false), CENTER(true, true, false), FIXED(false, false, true), HORIZONTAL(true, false, true);

    private boolean canPitch = false;
    private boolean canYaw = false;
    private boolean canHaveBackSide = false;
    private Billboard bukkitBoard = null;

    CMIBillboard(boolean canPitch, boolean canYaw, boolean canHaveBackSide) {
    }

    public Billboard getBillboard() {
        return null;
    }

    public static CMIBillboard getByName(String name) {
        return null;
    }

    public CMIBillboard next() {
        return null;
    }

    public boolean isCanPitch() {
        return false;
    }

    public boolean isCanYaw() {
        return false;
    }

    public boolean isCanHaveBackSide() {
        return false;
    }

    public double getPlanePitch(Player player, CMIHologram holo) {
        return 0.0;
    }

    public double getPlaneYaw(Player player, CMIHologram holo) {
        return 0.0;
    }

    public CMIVector3D getPlaneDirection(Player player, CMIHologram holo) {
        return null;
    }
}
