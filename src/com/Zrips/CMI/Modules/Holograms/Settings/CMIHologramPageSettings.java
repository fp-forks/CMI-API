package com.Zrips.CMI.Modules.Holograms.Settings;

import java.util.Map;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CMIHologramPageSettings {
    private int pageChangeIntervalTicks = 0;
    private boolean autoPagination = false;

    public boolean isAutoPagination() {
        return false;
    }

    public void setAutoPagination(boolean autoPagination) {
    }

    public int getPageChangeIntervalTicks() {
        return 0;
    }

    public void setPageChangeIntervalTicks(int pageChangeIntervalTicks) {
    }

    @Nullable
    public Map<String, Object> serialize() {
        return null;
    }

    @NotNull
    public static CMIHologramPageSettings deserialize(Map<String, Object> entry) {
        return null;
    }
}
