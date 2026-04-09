package com.Zrips.CMI.Containers;

import org.bukkit.GameMode;

public class worldFlyState {
    private boolean state = false;
    private boolean temp = false;
    private GameMode mode = null;

    public worldFlyState(GameMode mode, boolean state, boolean temp) {
    }

    public boolean isFlyEnabled() {
        return false;
    }

    public void setFlyEnabled(boolean state) {
    }

    public boolean isTemp() {
        return false;
    }

    public void setTemp(boolean temp) {
    }

    public GameMode getGameMode() {
        return null;
    }

    public void setMode(GameMode mode) {
    }
}
