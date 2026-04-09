package com.Zrips.CMI.Modules.FlightCharge;

public class FlightCharge {
    private double charge = 0.0;
    private double lastChange = 0.0;
    private boolean enabled = false;
    private boolean autoRecharge = false;
    private boolean moneyRecharge = false;
    private boolean expRecharge = false;
    private boolean informedMissingExp = false;
    private boolean informedMissingMoney = false;

    public FlightCharge() {
    }

    public double getCharge() {
        return 0.0;
    }

    @Deprecated
    public double getSafeCharge() {
        return 0.0;
    }

    public void setCharge(double charge) {
    }

    public void addCharge(double charge) {
    }

    public void takeCharge(double charge) {
    }

    public int getMax() {
        return 0;
    }

    public double getLastChange() {
        return 0.0;
    }

    public boolean isEnabled() {
        return false;
    }

    public void setEnabled(boolean enabled) {
    }

    public boolean isAutoRecharge() {
        return false;
    }

    public void setAutoRecharge(boolean autoRecharge) {
    }

    public void setAutoMoneyRecharge(boolean moneyRecharge) {
    }

    public void setAutoMoneyRecharge() {
    }

    public void setAutoExpRecharge(boolean expRecharge) {
    }

    public void setAutoExpRecharge() {
    }

    public boolean isMoneyAutoRecharge() {
        return false;
    }

    public boolean isExpAutoRecharge() {
        return false;
    }

    public boolean isInformedMissingExp() {
        return false;
    }

    public void setInformedMissingExp(boolean informedMissingExp) {
    }

    public boolean isInformedMissingMoney() {
        return false;
    }

    public void setInformedMissingMoney(boolean informedMissingMoney) {
    }
}
