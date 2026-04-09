package com.Zrips.CMI.Containers;

import net.Zrips.CMILib.Time.timeState;

public class CMITimeRate {
    private int everyTicks = 0;
    private int addAmount = 0;
    private timeState state = null;
    private boolean turnCycleOff = false;

    public CMITimeRate(timeState state, int everyTicks, int addAmount) {
    }

    public int getAddAmount() {
        return 0;
    }

    public void setAddAmount(int addAmount) {
    }

    public int getEveryTicks() {
        return 0;
    }

    public void setEveryTicks(int everyTicks) {
    }

    public timeState getState() {
        return null;
    }

    public void setState(timeState state) {
    }

    public boolean isTurnCycleOff() {
        return false;
    }

    public void setTurnCycleOff(boolean turnCycleOff) {
    }
}
