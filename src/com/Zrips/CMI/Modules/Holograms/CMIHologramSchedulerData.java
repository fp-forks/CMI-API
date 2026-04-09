package com.Zrips.CMI.Modules.Holograms;

import java.util.List;

public class CMIHologramSchedulerData {
    int tickInterval = 0;
    int currentTick = 0;
    List<CMIHologramUpdateType> updateTypes = null;

    public CMIHologramSchedulerData(int tickInterval) {
    }

    public CMIHologramSchedulerData(int tickInterval, CMIHologramUpdateType... type) {
    }

    public int getTickInterval() {
        return 0;
    }

    public int getCurrentTick() {
        return 0;
    }

    public void setCurrentTick(int currentTick) {
    }

    public void incrementCurrentTick() {
    }

    public void resetCurrentTick() {
    }

    public void setTickInterval(int tickInterval) {
    }

    public boolean cycleTick() {
        return false;
    }

    public List<CMIHologramUpdateType> getUpdateTypes() {
        return null;
    }

    public CMIHologramSchedulerData setUpdateTypes(List<CMIHologramUpdateType> updateTypes) {
        return null;
    }
}
