package com.Zrips.CMI.Modules.CmdCost;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class CMICommandCost {
    private String command = null;
    private double cost = 0.0;
    private boolean informOnCharge = false;
    private boolean requiresConfirmation = false;
    ConcurrentHashMap<UUID, String> confirmations = null;

    public CMICommandCost(String cmd, double cost) {
    }

    public String getCommand() {
        return null;
    }

    public void setCommand(String command) {
    }

    public double getCost() {
        return 0.0;
    }

    public String getSubCommand() {
        return null;
    }

    public void setCost(double cost) {
    }

    public boolean isInformOnCharge() {
        return false;
    }

    public void setInformOnCharge(boolean informOnCharge) {
    }

    public boolean isRequiresConfirmation() {
        return false;
    }

    public void setRequiresConfirmation(boolean requiresConfirmation) {
    }

    public void addConfirmation(UUID uuid, String cmd) {
    }

    public boolean isConfirmation(UUID uuid, String cmd) {
        return false;
    }

    public void removeConfirmation(UUID uuid) {
    }
}
