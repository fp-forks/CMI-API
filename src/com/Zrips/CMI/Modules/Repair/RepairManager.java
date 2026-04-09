package com.Zrips.CMI.Modules.Repair;

import java.util.List;

import com.Zrips.CMI.CMI;

public class RepairManager {
    private boolean repairCostsMoney = false;
    private double baseCost = 0.0;
    private boolean checkDurability = false;
    private double worthPercentage = 0.0;
    private double enchantWorthPercentage = 0.0;
    private boolean RSProtectNormalRepair = false;
    private boolean RSProtectCommandRepair = false;
    private boolean RSBypassWithPerm = false;
    private boolean RSAddLore = false;
    private boolean RSCancelEvent = false;
    private boolean RSInformWithMessage = false;
    private int RSDurability = 0;
    private boolean RepairConfirmation = false;
    private List<Integer> BlockedCustomDataID = null;
    private CMI plugin = null;

    public RepairManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public double getBaseRepairCost() {
        return 0.0;
    }

    public boolean isCheckDurability() {
        return false;
    }

    public double getWorthPercentage() {
        return 0.0;
    }

    public double getEnchantWorthPercentage() {
        return 0.0;
    }

    public boolean isRepairCostsMoney() {
        return false;
    }

    public boolean isRSProtectNormalRepair() {
        return false;
    }

    public boolean isRSProtectCommandRepair() {
        return false;
    }

    public boolean isRSBypassWithPerm() {
        return false;
    }

    public boolean isRSAddLore() {
        return false;
    }

    public boolean isRSCancelEvent() {
        return false;
    }

    public boolean isRSInformWithMessage() {
        return false;
    }

    public int getRSDurability() {
        return 0;
    }

    public boolean isRepairConfirmation() {
        return false;
    }

    public List<Integer> getBlockedCustomDataID() {
        return null;
    }
}
