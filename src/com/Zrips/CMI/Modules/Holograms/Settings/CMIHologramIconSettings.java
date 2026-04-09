package com.Zrips.CMI.Modules.Holograms.Settings;

import java.util.Map;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.Zrips.CMI.Modules.Display.CMIBillboard;

import net.Zrips.CMILib.Container.CMIVector3D;

public class CMIHologramIconSettings {
    private CMIVector3D scale = null;
    private CMIVector3D direction = null;
    private CMIVector3D offset = null;
    private CMIBillboard billboard = null;

    public CMIHologramIconSettings() {
    }

    public CMIBillboard getBillboard() {
        return null;
    }

    public CMIHologramIconSettings setBillboard(CMIBillboard iconBillboard) {
        return null;
    }

    public CMIVector3D getOffset() {
        return null;
    }

    public CMIHologramIconSettings setOffset(CMIVector3D iconOffset) {
        return null;
    }

    public CMIVector3D getScale() {
        return null;
    }

    public CMIVector3D getDirection() {
        return null;
    }

    public CMIHologramIconSettings setDirection(CMIVector3D iconDir) {
        return null;
    }

    public CMIHologramIconSettings setScale(double iconScale) {
        return null;
    }

    public CMIHologramIconSettings setScale(CMIVector3D iconScale) {
        return null;
    }

    public int getPitch() {
        return 0;
    }

    public CMIHologramIconSettings setPitch(int iconPitch) {
        return null;
    }

    public int getYaw() {
        return 0;
    }

    public CMIHologramIconSettings setYaw(int iconYaw) {
        return null;
    }

    public int getRoll() {
        return 0;
    }

    public CMIHologramIconSettings setRoll(int iconRoll) {
        return null;
    }

    @Nullable
    public Map<String, Object> serialize() {
        return null;
    }

    @NotNull
    public static CMIHologramIconSettings deserialize(Map<String, Object> entry) {
        return null;
    }
}
