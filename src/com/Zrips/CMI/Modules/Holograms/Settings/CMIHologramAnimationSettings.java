package com.Zrips.CMI.Modules.Holograms.Settings;

import java.util.Map;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CMIHologramAnimationSettings {
    private int fadeInAnimation = 0;
    private int fadeOutAnimation = 0;
    private int autoRotate = 0;

    public boolean isFadeInAnimation() {
        return false;
    }

    public int getFadeInAnimationSpeed() {
        return 0;
    }

    public CMIHologramAnimationSettings setFadeInAnimation(int fadeInAnimation) {
        return null;
    }

    public boolean isFadeOutAnimation() {
        return false;
    }

    public int getFadeOutAnimationSpeed() {
        return 0;
    }

    public CMIHologramAnimationSettings setFadeOutAnimation(int fadeOutAnimation) {
        return null;
    }

    public int getAutoRotate() {
        return 0;
    }

    public CMIHologramAnimationSettings setAutoRotate(int autoRotate) {
        return null;
    }

    @Nullable
    public Map<String, Object> serialize() {
        return null;
    }

    @NotNull
    public static CMIHologramAnimationSettings deserialize(Map<String, Object> entry) {
        return null;
    }
}
