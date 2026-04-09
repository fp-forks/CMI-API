package com.Zrips.CMI.utils;

import java.util.regex.Pattern;

public class GradientColor {
    private String startingColor = null;
    private String startingTextFormat = null;
    private String endingColor = null;
    private String nextChar = null;
    private String prevHexColor = null;
    private double prevDistance = 0.0;
    private double prevDelta = 0.0;
    private StringBuilder modifiedText = null;
    private StringBuilder toBeReplacedText = null;
    private String replaceWith = null;
    private static Pattern gradientDetectionPattern = null;
    private static Pattern cleanupPattern = null;

    public GradientColor(String startingColor, String startingTextFormat) {
    }

    public String getStartingColor() {
        return null;
    }

    public GradientColor setStartingColor(String startingColor) {
        return null;
    }

    public String getStartingTextFormat() {
        return null;
    }

    public GradientColor setStartingTextFormat(String startingTextFormat) {
        return null;
    }

    public String getPrevHexColor() {
        return null;
    }

    public GradientColor setPrevHexColor(String prevHexColor) {
        return null;
    }

    public double getPrevDistance() {
        return 0.0;
    }

    public GradientColor setPrevDistance(double prevDistance) {
        return null;
    }

    public String getModifiedText() {
        return null;
    }

    public GradientColor addToModifiedText(String modifiedText) {
        return null;
    }

    public StringBuilder getReplaceWhat() {
        return null;
    }

    public GradientColor addReplaceWhat(String toBeReplacedText) {
        return null;
    }

    public String getEndingColor() {
        return null;
    }

    public GradientColor setEndingColor(String endingColor) {
        return null;
    }

    public String getNextChar() {
        return null;
    }

    public GradientColor setNextChar(String nextChar) {
        return null;
    }

    public String getReplaceWith() {
        return null;
    }

    public GradientColor setReplaceWith(String replaceWith) {
        return null;
    }

    public void calculateFinalString() {
    }

    public double getPreviousDelta() {
        return 0.0;
    }

    public GradientColor setPreviousDelta(double prevDelta) {
        return null;
    }

    public static String deconvert(String text) {
        return null;
    }
}
