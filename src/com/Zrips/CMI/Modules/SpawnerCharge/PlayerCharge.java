package com.Zrips.CMI.Modules.SpawnerCharge;

import java.util.UUID;

import com.Zrips.CMI.Containers.CMIUser;

public class PlayerCharge {
    private int charges = 0;
    private long lastGive = 0;
    private SCharges SCharge = null;
    private UUID uuid = null;
    private long lastChecked = 0;

    public PlayerCharge(CMIUser user, boolean update) {
    }

    public void reset() {
    }

    public void reset(boolean update) {
    }

    public int getCharges() {
        return 0;
    }

    public int getChargesClean() {
        return 0;
    }

    public boolean haveLeftCharge() {
        return false;
    }

    public boolean have() {
        return false;
    }

    public int getBonus() {
        return 0;
    }

    public boolean lowerCd() {
        return false;
    }

    public void setCharges(int charges) {
    }

    public String getLeftTime() {
        return null;
    }

    public boolean addCharge() {
        return false;
    }

    public boolean addCharge(int amount) {
        return false;
    }

    public boolean addCharge(int amount, boolean force) {
        return false;
    }

    public boolean takeCharge() {
        return false;
    }

    public boolean takeCharge(int amount) {
        return false;
    }

    public boolean takeCharge(int amount, boolean force) {
        return false;
    }

    public int getMaxCharges() {
        return 0;
    }

    public long getLastGive() {
        return 0;
    }

    public void setLastGive(long lastGive) {
    }

    public int getCooldown() {
        return 0;
    }
}
