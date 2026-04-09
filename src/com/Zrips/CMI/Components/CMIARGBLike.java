package com.Zrips.CMI.Components;

import java.awt.Color;

import org.jetbrains.annotations.Range;

import net.kyori.adventure.util.ARGBLike;

public class CMIARGBLike implements ARGBLike {
    int alpha = 0;
    int red = 0;
    int green = 0;
    int blue = 0;

    public CMIARGBLike(Color color) {
    }

    public static CMIARGBLike fromColor(Color color) {
        return null;
    }

    @Override
    @Range(from = 0, to = 255)
    public int blue() {
        return 0;
    }

    @Override
    @Range(from = 0, to = 255)
    public int green() {
        return 0;
    }

    @Override
    @Range(from = 0, to = 255)
    public int red() {
        return 0;
    }

    @Override
    @Range(from = 0, to = 255)
    public int alpha() {
        return 0;
    }
}
