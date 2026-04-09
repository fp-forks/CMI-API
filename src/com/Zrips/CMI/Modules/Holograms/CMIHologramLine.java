package com.Zrips.CMI.Modules.Holograms;

import java.util.List;
import java.util.regex.Pattern;

import com.Zrips.CMI.Modules.Display.CMITextAlignment;
import com.Zrips.CMI.Modules.Holograms.Settings.CMIHologramTextSettings;

public class CMIHologramLine {
    private String originalFulltext = null;
    private String command = null;
    private CMIHologramTextSettings settings = null;
    private List<CMIHologramLinePortion> portions = null;
    private CMIHoloLineType type = null;
    private double width = 0.0;
    static Pattern pattern = null;

    public CMIHologramLine(CMIHologramTextSettings settings, String text) {
    }

    public CMIHologramLine() {
    }

    @Override
    public CMIHologramLine clone() {
        return null;
    }

    public List<CMIHologramLinePortion> getLinePortions() {
        return null;
    }

    public String getCommand() {
        return null;
    }

    public String getText() {
        return null;
    }

    public CMIHologramLine setText(String originalFulltext) {
        return null;
    }

    public int getParts() {
        return 0;
    }

    public CMIHologramLinePortion getPortionByRange(double value, CMIHologramPage page, CMITextAlignment alignment) {
        return null;
    }

    public CMIHoloLineType getType() {
        return null;
    }

    public double getWidth() {
        return 0.0;
    }
}
