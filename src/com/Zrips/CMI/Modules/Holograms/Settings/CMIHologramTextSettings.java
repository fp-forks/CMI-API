package com.Zrips.CMI.Modules.Holograms.Settings;

import java.util.Map;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import com.Zrips.CMI.Modules.Display.CMITextAlignment;

import net.Zrips.CMILib.Colors.CMIChatColor;

public class CMIHologramTextSettings {
    private CMITextAlignment textAlignment = null;
    private CMIChatColor backgroundColor = null;
    private int backgroundAlpha = 0;
    private int textAlpha = 0;
    private boolean doubleSided = false;
    private boolean shadowed = false;
    private boolean seeThrough = false;
    private int lineWidth = 0;
    private int fillerAmount = 0;

    public CMITextAlignment getTextAlignment() {
        return null;
    }

    public CMIHologramTextSettings setTextAlignment(CMITextAlignment textAlignment) {
        return null;
    }

    public CMIChatColor getBackgroundColor() {
        return null;
    }

    public CMIHologramTextSettings setBackgroundColor(CMIChatColor backgroundColor) {
        return null;
    }

    public int getBackgroundAlpha() {
        return 0;
    }

    public CMIHologramTextSettings setBackgroundAlpha(int backgroundAlpha) {
        return null;
    }

    public int getTextAlpha() {
        return 0;
    }

    public CMIHologramTextSettings setTextAlpha(int textAlpha) {
        return null;
    }

    public boolean isDoubleSided() {
        return false;
    }

    public CMIHologramTextSettings setDoubleSided(boolean doubleSided) {
        return null;
    }

    public boolean isShadowed() {
        return false;
    }

    public CMIHologramTextSettings setShadowed(boolean shadowed) {
        return null;
    }

    public boolean isSeeThrough() {
        return false;
    }

    public CMIHologramTextSettings setSeeThrough(boolean seeThrough) {
        return null;
    }

    public int getLineWidth() {
        return 0;
    }

    public CMIHologramTextSettings setLineWidth(int lineWidth) {
        return null;
    }

    public int getFillerAmount() {
        return 0;
    }

    public CMIHologramTextSettings setFillerAmount(int fillerAmount) {
        return null;
    }

    @Nullable
    public Map<String, Object> serialize() {
        return null;
    }

    @NotNull
    public static CMIHologramTextSettings deserialize(Map<String, Object> entry) {
        return null;
    }
}
