package com.Zrips.CMI.Modules.Holograms;

import org.bukkit.entity.Player;

public class CMIHologramLineBase {
    protected String originalText = null;
    private CMIHoloLineType type = null;
    private boolean dynamic = false;

    public CMIHologramLineBase(String text) {
    }

    public CMIHologramLineBase() {
    }

    @Override
    public CMIHologramLineBase clone() {
        return null;
    }

    public CMIHoloLineType getType() {
        return null;
    }

    public CMIHologramLineBase setType(CMIHoloLineType type) {
        return null;
    }

    public String getOriginalText() {
        return null;
    }

    public String getLineOutput(Player player) {
        return null;
    }

    public boolean isDynamic() {
        return false;
    }

    public CMIHologramLineBase setDynamic(boolean dynamic) {
        return null;
    }
}
