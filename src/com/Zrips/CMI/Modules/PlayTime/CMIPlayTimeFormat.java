package com.Zrips.CMI.Modules.PlayTime;

public class CMIPlayTimeFormat {
    static showType forceShowDays = null;
    static showType forceShowHours = null;
    static showType forceShowMinutes = null;
    static showType forceShowSeconds = null;
    static String daysFormat = null;
    static String hoursFormat = null;
    static String minutesFormat = null;
    static String secondsFormat = null;

    public static void update() {
    }

    public static String formatPlaytimePlaceholder(long ticks) {
        return null;
    }

    enum showType {
        full, partial, normal;
    }
}
