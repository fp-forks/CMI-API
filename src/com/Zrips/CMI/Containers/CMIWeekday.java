package com.Zrips.CMI.Containers;

public enum CMIWeekday {
    Monday(1), Tuesday(2), Wednesday(3), Thursday(4), Friday(5), Saturday(6), Sunday(7);

    private final int day = 0;

    CMIWeekday(int day) {
    }

    public int getDayID() {
        return 0;
    }

    public static CMIWeekday get(String name) {
        return null;
    }

    public static CMIWeekday get(int day) {
        return null;
    }
}
