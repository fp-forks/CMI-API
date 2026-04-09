package com.Zrips.CMI.Modules.Holograms.Settings;

import java.util.Map;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.Zrips.CMILib.Container.CMIVector3D;
import net.Zrips.CMILib.Items.CMIMaterial;

public class CMIHologramBoardSettings {
    private boolean enabled = false;
    private CMIVector3D extraDimensions = null;
    private CMIVector3D offset = null;
    private CMIVector3D direction = null;
    private CMIMaterial material = null;

    public double getExtraDepth() {
        return 0.0;
    }

    public double getExtraWidth() {
        return 0.0;
    }

    public double getExtraHeight() {
        return 0.0;
    }

    public CMIMaterial getMaterial() {
        return null;
    }

    public CMIHologramBoardSettings setMaterial(CMIMaterial material) {
        return null;
    }

    public boolean isEnabled() {
        return false;
    }

    public CMIHologramBoardSettings setEnabled(boolean enabled) {
        return null;
    }

    public CMIVector3D getExtraDimensions() {
        return null;
    }

    public CMIHologramBoardSettings setExtraDimensions(CMIVector3D extraDimensions) {
        return null;
    }

    public CMIVector3D getOffset() {
        return null;
    }

    public CMIHologramBoardSettings setOffset(CMIVector3D offset) {
        return null;
    }

    public CMIVector3D getDirection() {
        return null;
    }

    public void setDirection(CMIVector3D direction) {
    }

    @Nullable
    public Map<String, Object> serialize() {
        return null;
    }

    @NotNull
    public static CMIHologramBoardSettings deserialize(Map<String, Object> entry) {
        return null;
    }
}
