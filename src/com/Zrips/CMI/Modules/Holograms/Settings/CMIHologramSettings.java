package com.Zrips.CMI.Modules.Holograms.Settings;

import java.util.Map;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.Zrips.CMI.Modules.Display.CMIBillboard;

import net.Zrips.CMILib.Container.CMIVector2D;
import net.Zrips.CMILib.Container.CMIVector3D;

public class CMIHologramSettings {
    private CMIBillboard billboard = null;
    private String group = null;
    private boolean checkLineOfSight = false;
    private boolean requestPermission = false;
    private boolean saveToFile = false;
    private CMIVector2D lightLevels = null;
    private CMIVector3D direction = null;
    private CMIVector3D centerOffset = null;
    private CMIVector2D scale = null;
    private int updateRange = 0;
    private int visibilityRange = 0;
    private int updateIntervalTicks = 0;

    public CMIBillboard getBillboard() {
        return null;
    }

    public CMIVector2D getScale() {
        return null;
    }

    public void setScale(CMIVector2D scale) {
    }

    public CMIHologramSettings setBillboard(CMIBillboard billboard) {
        return null;
    }

    public double getYaw() {
        return 0.0;
    }

    public CMIHologramSettings setYaw(double yaw) {
        return null;
    }

    public double getPitch() {
        return 0.0;
    }

    public CMIHologramSettings setPitch(double pitch) {
        return null;
    }

    public CMIVector3D getDirection() {
        return null;
    }

    public CMIHologramSettings setDirection(CMIVector3D direction) {
        return null;
    }

    public CMIVector2D getLightLevel() {
        return null;
    }

    public CMIHologramSettings setLightLevel(CMIVector2D lightLevels) {
        return null;
    }

    public int getSkyLevel() {
        return 0;
    }

    public CMIHologramSettings setSkyLevel(int skyLevel) {
        return null;
    }

    public int getBlockLevel() {
        return 0;
    }

    public CMIHologramSettings setBlockLevel(int blockLevel) {
        return null;
    }

    public CMIVector3D getOffset() {
        return null;
    }

    public CMIHologramSettings setOffset(CMIVector3D centerOffset) {
        return null;
    }

    public String getGroup() {
        return null;
    }

    public CMIHologramSettings setGroup(String group) {
        return null;
    }

    public boolean isRequiresPermission() {
        return false;
    }

    public CMIHologramSettings setPermissionRequirement(boolean requestPermission) {
        return null;
    }

    public boolean isSaveToFile() {
        return false;
    }

    public CMIHologramSettings setSaveToFile(boolean saveToFile) {
        return null;
    }

    public boolean isCheckLineOfSight() {
        return false;
    }

    public CMIHologramSettings setCheckLineOfSight(boolean checkLineOfSight) {
        return null;
    }

    public CMIHologramSettings setVisibilityRange(int showRange) {
        return null;
    }

    public int getVisibilityRange() {
        return 0;
    }

    public int getUpdateRange() {
        return 0;
    }

    public CMIHologramSettings setUpdateRange(int updateRange) {
        return null;
    }

    public int getUpdateIntervalTicks() {
        return 0;
    }

    public CMIHologramSettings setUpdateIntervalTicks(int updateIntervalTicks) {
        return null;
    }

    @Nullable
    public Map<String, Object> serialize() {
        return null;
    }

    @NotNull
    public static CMIHologramSettings deserialize(Map<String, Object> entry) {
        return null;
    }
}
