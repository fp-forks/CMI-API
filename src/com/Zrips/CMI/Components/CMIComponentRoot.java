package com.Zrips.CMI.Components;

import java.awt.Color;
import java.util.regex.Pattern;

import javax.annotation.Nonnull;

public class CMIComponentRoot {
    private String text = null;
    private Color shadowColor = null;
    protected CMIComponentAction action = null;
    private static final Pattern SHADOW = null;

    public CMIComponentRoot(String text) {
    }

    public CMIComponentRoot() {
    }

    @Nonnull
    public String getText() {
        return null;
    }

    public static String removeShadow(String text) {
        return null;
    }

    public CMIComponentRoot setText(String text) {
        return null;
    }

    public CMIComponentAction getAction() {
        return null;
    }

    public CMIComponentRoot setClickAction(CMIComponentActionType action, String click) {
        return null;
    }

    public Color getShadowColor() {
        return null;
    }

    public CMIComponentRoot setShadowColor(Color color) {
        return null;
    }
}
