package com.Zrips.CMI.Modules.Holograms;

import java.util.List;

import javax.annotation.Nullable;

public class CMIHologramPage {
    private List<CMIHologramLine> lines = null;
    private List<String> commands = null;
    private double height = 0.0;
    private double width = 0.0;
    private int lineCount = 0;

    public CMIHologramPage() {
    }

    public List<CMIHologramLine> getLines() {
        return null;
    }

    @Nullable
    public CMIHologramLine getLine(int place) {
        return null;
    }

    public void setLines(List<CMIHologramLine> lines) {
    }

    public void addLine(int place, CMIHologramLine line) {
    }

    public void addLine(CMIHologramLine line) {
    }

    public List<String> getCommands() {
        return null;
    }

    public void trimToLimit(int limit) {
    }

    public void setCommands(List<String> commands) {
    }

    public double getHeight() {
        return 0.0;
    }

    public void setHeight(double height) {
    }

    public double getWidth() {
        return 0.0;
    }

    public void setWidth(int width) {
    }

    public void calculateWidth() {
    }

    public int getLineCount() {
        return 0;
    }

    public CMIHologramPage setLineCount(int lineCount) {
        return null;
    }
}
