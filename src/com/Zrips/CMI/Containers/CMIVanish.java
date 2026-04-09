package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.UUID;

import com.Zrips.CMI.Modules.Vanish.VanishAction;
import com.Zrips.CMI.Modules.Vanish.VanishActionState;

public class CMIVanish {
    private UUID uuid = null;
    private HashMap<VanishAction, VanishActionState> map = null;
    private boolean wasCollidable = false;
    private long vanishedFrom = 0;
    private long playtimeAtVanishStart = 0;

    public CMIVanish() {
    }

    public CMIVanish(CMIUser user) {
    }

    public void fromString(String line) {
    }

    @Override
    public String toString() {
        return null;
    }

    public CMIUser getUser() {
        return null;
    }

    public void setUser(CMIUser user) {
    }

    @Deprecated
    public boolean is(VanishAction action) {
        return false;
    }

    public VanishActionState getState(VanishAction action) {
        return null;
    }

    public void set(VanishAction action, boolean state) {
    }

    public void set(VanishAction action, int state) {
    }

    public Boolean getWasCollidable() {
        return null;
    }

    public void setWasCollidable(Boolean wasCollidable) {
    }

    public Long getVanishedFrom() {
        return null;
    }

    public void setVanishedFrom(Long vanishedFrom) {
    }

    public Long getPlaytimeAtVanishStart() {
        return null;
    }

    public void setPlaytimeAtVanishStart(Long playtimeAtAfkStart) {
    }
}
