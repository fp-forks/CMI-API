package com.Zrips.CMI.Modules.Mirror;

import org.bukkit.util.Vector;

import net.Zrips.CMILib.Items.CMIMaterial;

public enum CMIMirrorType {
    XR("{gcp}Mirrors on {gcs}X {gcp}axis", 0, new Vector(1, 0, 0), CMIMaterial.YELLOW_CARPET, CMIMaterial.GREEN_CARPET),
    YR("{gcp}Mirrors on {gcs}Y {gcp}axis", 1, new Vector(0, 1, 0), CMIMaterial.YELLOW_CARPET, CMIMaterial.GREEN_CARPET),
    ZR("{gcp}Mirrors on {gcs}Z {gcp}axis", 2, new Vector(0, 0, 1), CMIMaterial.YELLOW_CARPET, CMIMaterial.GREEN_CARPET),
    X90("{gcp}90 on {gcs}X {gcp}axis", 18, new Vector(1, 0, 0), CMIMaterial.YELLOW_BED, CMIMaterial.GREEN_BED),
    Y90("{gcp}90 on {gcs}Y {gcp}axis", 19, new Vector(0, 1, 0), CMIMaterial.YELLOW_BED, CMIMaterial.GREEN_BED),
    Z90("{gcp}90 on {gcs}Z {gcp}axis", 20, new Vector(0, 0, 1), CMIMaterial.YELLOW_BED, CMIMaterial.GREEN_BED),
    X90R("{gcp}-90 on {gcs}X {gcp}axis", 27, new Vector(-1, 0, 0), CMIMaterial.YELLOW_BANNER, CMIMaterial.GREEN_BANNER),
    Y90R("{gcp}-90 on {gcs}Y {gcp}axis", 28, new Vector(0, -1, 0), CMIMaterial.YELLOW_BANNER, CMIMaterial.GREEN_BANNER),
    Z90R("{gcp}-90 on {gcs}Z {gcp}axis", 29, new Vector(0, 0, -1), CMIMaterial.YELLOW_BANNER, CMIMaterial.GREEN_BANNER),
    XY180("{gcp}180 on {gcs}Z {gcp}axis", 45, new Vector(1, 1, 0), CMIMaterial.YELLOW_WOOL, CMIMaterial.GREEN_WOOL),
    YZ180("{gcp}180 on {gcs}X {gcp}axis", 46, new Vector(0, 1, 1), CMIMaterial.YELLOW_WOOL, CMIMaterial.GREEN_WOOL),
    ZX180("{gcp}180 on {gcs}Y {gcp}axis", 47, new Vector(1, 0, 1), CMIMaterial.YELLOW_WOOL, CMIMaterial.GREEN_WOOL),
    XYZ180("{gcp}180 on {gcs}All {gcp}axis", 48, new Vector(1, 1, 1), CMIMaterial.YELLOW_WOOL, CMIMaterial.GREEN_WOOL),
    XS("{gcp}Spreads on {gcs}X {gcp}axis", 4, new Vector(1, 0, 0), true, CMIMaterial.YELLOW_DYE, CMIMaterial.GREEN_DYE),
    YS("{gcp}Spreads on {gcs}Y {gcp}axis", 5, new Vector(0, 1, 0), true, CMIMaterial.YELLOW_DYE, CMIMaterial.GREEN_DYE),
    ZS("{gcp}Spreads on {gcs}Z {gcp}axis", 6, new Vector(0, 0, 1), true, CMIMaterial.YELLOW_DYE, CMIMaterial.GREEN_DYE),
    XYM("{gcp}Mirrors by {gcs}X {gcp}to {gcs}Y {gcp}plane", 22, new Vector(1, 1, 0), CMIMaterial.YELLOW_SHULKER_BOX, CMIMaterial.GREEN_SHULKER_BOX),
    YZM("{gcp}Mirrors by {gcs}Z {gcp}to {gcs}Y {gcp}plane", 23, new Vector(0, 1, 1), CMIMaterial.YELLOW_SHULKER_BOX, CMIMaterial.GREEN_SHULKER_BOX),
    ZXM("{gcp}Mirrors by {gcs}X {gcp}to {gcs}Z {gcp}plane", 24, new Vector(1, 0, 1), CMIMaterial.YELLOW_SHULKER_BOX, CMIMaterial.GREEN_SHULKER_BOX),
    XYMR("{gcp}Mirrors by {gcs}X {gcp}to {gcs}Y {gcp}plane reverse", 31, new Vector(1, -1, 0), CMIMaterial.YELLOW_GLAZED_TERRACOTTA, CMIMaterial.GREEN_GLAZED_TERRACOTTA),
    YZMR("{gcp}Mirrors by {gcs}Y {gcp}to {gcs}Z {gcp}plane reverse", 32, new Vector(0, 1, -1), CMIMaterial.YELLOW_GLAZED_TERRACOTTA, CMIMaterial.GREEN_GLAZED_TERRACOTTA),
    ZXMR("{gcp}Mirrors by {gcs}X {gcp}to {gcs}Z {gcp}plane reverse", 33, new Vector(1, 0, -1), CMIMaterial.YELLOW_GLAZED_TERRACOTTA, CMIMaterial.GREEN_GLAZED_TERRACOTTA);

    private int slot = 0;
    private String desc = null;
    private Vector vector = null;
    private boolean sections = false;
    private CMIMaterial iconDisabled = null;
    private CMIMaterial iconEnabled = null;

    private CMIMirrorType(String desc, int slot, Vector vector, boolean sections, CMIMaterial iconDisabled, CMIMaterial iconEnabled) {
    }

    private CMIMirrorType(String desc, int slot, Vector vector, CMIMaterial iconDisabled, CMIMaterial iconEnabled) {
        this(desc, slot, vector, false, iconDisabled, iconEnabled);
    }

    public int getSlot() {
        return 0;
    }

    public String getDesc() {
        return null;
    }

    public void setDesc(String desc) {
    }

    public String getName() {
        return null;
    }

    public Vector getVector() {
        return null;
    }

    public boolean isSections() {
        return false;
    }

    public CMIMaterial getIconDisabled() {
        return null;
    }

    public CMIMaterial getIconEnabled() {
        return null;
    }
}
