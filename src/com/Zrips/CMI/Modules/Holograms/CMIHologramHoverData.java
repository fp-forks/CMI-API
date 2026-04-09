package com.Zrips.CMI.Modules.Holograms;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import com.Zrips.CMI.Modules.Display.CMITextAlignment;

public class CMIHologramHoverData {
    private static ConcurrentHashMap<UUID, CMIHologramHoverData> userData = null;
    private double hovering = 0.0;
    private int hoveringLine = 0;
    private CMIHologram hoveringHologram = null;
    private CMIHologramLine hoveringLineObject = null;
    private CMIHologramLinePortion hoveringLinePortion = null;
    private CMITextAlignment alignment = null;
    private FakeEntityInfo fakeInfo = null;
    private UUID uuid = null;
    private long showCornersUntil = 0;

    public CMIHologramHoverData(UUID uuid) {
    }

    public static synchronized CMIHologramHoverData getData(Player player) {
        return null;
    }

    public static synchronized CMIHologramHoverData getData(UUID uuid) {
        return null;
    }

    protected static synchronized CMIHologramHoverData removeData(UUID uuid) {
        return null;
    }

    protected static synchronized void clearData() {
    }

    public int getHoverParts() {
        return 0;
    }

    public boolean hoveringLeftSide() {
        return false;
    }

    public boolean isChangeInHoverPart(double value) {
        return false;
    }

    public boolean hoveringPart(double value) {
        return false;
    }

    public double getHoveringPart() {
        return 0.0;
    }

    public int getHoveringIntPart() {
        return 0;
    }

    public CMIHologramHoverData setHoveringPart(double hovering) {
        return null;
    }

    public int getHoveringLine() {
        return 0;
    }

    public int getHoveringLineAndReset() {
        return 0;
    }

    public CMIHologramHoverData resetHoverPosition() {
        return null;
    }

    public CMIHologramHoverData setHoveringLine(int line) {
        return null;
    }

    public CMIHologram getHoveringHologram() {
        return null;
    }

    public CMIHologramHoverData setHoveringHologram(CMIHologram hoveringHologram) {
        return null;
    }

    public FakeEntityInfo getFakeInfo() {
        return null;
    }

    public CMIHologramHoverData setFakeInfo(FakeEntityInfo fakeInfo) {
        return null;
    }

    @Nullable
    public CMIHologramLine getHoveringLineObject() {
        return null;
    }

    public boolean isHoveringOverNewLinePortion(double newPosition, CMIHologramPage page) {
        return false;
    }

    public void setHoveringLine(CMIHologramLine hoveringLine) {
    }

    public CMIHologramLinePortion getHoveringLinePortion() {
        return null;
    }

    public long getShowCornersUntil() {
        return 0;
    }

    public void setShowCornersUntil(long showCornersUntil) {
    }
}
