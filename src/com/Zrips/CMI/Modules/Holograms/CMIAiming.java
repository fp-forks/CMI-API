package com.Zrips.CMI.Modules.Holograms;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import net.Zrips.CMILib.Container.CMIVector2D;
import net.Zrips.CMILib.Container.CMIVector3D;

public class CMIAiming {
    private static ConcurrentHashMap<UUID, CMIAiming> aimingAt = null;
    private CMIHologram aimAt = null;
    private CMIVector3D global = null;
    private CMIVector2D local = null;
    private boolean frontSide = false;

    public CMIAiming(CMIHologram aimAt, CMIVector3D pos) {
    }

    public CMIAiming(CMIHologram aimAt, CMIVector3D global, CMIVector2D local) {
    }

    public static void addAimAt(UUID uuid, CMIHologram aimAt, CMIVector3D global) {
    }

    public static void addAimAt(UUID uuid, CMIHologram aimAt, CMIVector3D global, CMIVector2D local) {
    }

    public static CMIAiming getAimAt(Player player) {
        return null;
    }

    public static CMIAiming getAimAt(UUID uuid) {
        return null;
    }

    public static void removeAimAt(Player player) {
    }

    public static void removeAimAt(UUID uuid) {
    }

    public CMIHologram getAimAt() {
        return null;
    }

    public void setAimAt(CMIHologram aimAt) {
    }

    public CMIVector3D getGlobalPos() {
        return null;
    }

    public void setGlobalPos(CMIVector3D global) {
    }

    public CMIVector2D getLocalPos() {
        return null;
    }

    public boolean isFrontSide() {
        return false;
    }

    public void setFrontSide(boolean frontSide) {
    }

    public static CompletableFuture<CMIHologram> getLookingAt(UUID uuid) {
        return null;
    }

    public static CompletableFuture<CMIHologram> getLookingAtHologram(UUID uuid) {
        return null;
    }

    public static CompletableFuture<CMIHologram> getLookingAtHologramApproximate(UUID uuid) {
        return null;
    }
}
