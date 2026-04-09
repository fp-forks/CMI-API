package com.Zrips.CMI.Modules.Holograms;

public class CMIHologramLinePortion {
    private CMIHologramLineBase baseLineData = null;
    private CMIHologramLineBase hoverLineData = null;
    private CMIHologramClickAction clickActions = null;
    private short from = 0;
    private short to = 0;

    public CMIHologramLinePortion(CMIHologramLineBase baseLineData) {
    }

    public CMIHologramLineBase getBaseLineData() {
        return null;
    }

    public void setBaseLineData(CMIHologramLineBase baseLineData) {
    }

    public CMIHologramLineBase getHoverLineData() {
        return null;
    }

    public void setHoverLineData(CMIHologramLineBase hoverLineData) {
    }

    public CMIHologramClickAction getClickActions() {
        return null;
    }

    public void setClickActions(CMIHologramClickAction clickActions) {
    }

    public void setLineRanges(double from, double to) {
    }

    public boolean isInRange(double value) {
        return false;
    }

    public double calculateWidth() {
        return 0.0;
    }
}
