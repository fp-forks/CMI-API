package com.Zrips.CMI.Modules.Elytra;

import javax.annotation.Nullable;

import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Items.CMIMaterial;

public class ElytraManager {
    private boolean BoostUseItems = false;
    private double BoostMultyplier = 0.0;
    private double BoostSuperMultyplier = 0.0;
    private ItemStack BoostItem = null;
    private ItemStack BoostItemConsume = null;
    private ItemStack LaunchItem = null;
    private int BoostAmount = 0;
    private int BoostSuperAmount = 0;
    private int BoostSpeedLimit = 0;
    private boolean BoostSpeedLimitStop = false;
    private boolean BoostRequiresItem = false;
    private boolean BoostShowParticles = false;
    private boolean PreventSelfDamage = false;
    private boolean PreventRocketUsage = false;
    private boolean BoostSpeedDecimals = false;
    private double LaunchTime = 0.0;
    private boolean disableRiptide = false;
    private CMI plugin = null;

    public ElytraManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public boolean isBoostUseItems() {
        return false;
    }

    public double getBoostMultyplier() {
        return 0.0;
    }

    public double getBoostSuperMultyplier() {
        return 0.0;
    }

    @Deprecated
    public CMIMaterial getBoostItem() {
        return null;
    }

    @Deprecated
    public CMIMaterial getBoostItemConsume() {
        return null;
    }

    @Deprecated
    public CMIMaterial getLaunchItem() {
        return null;
    }

    public boolean isBoostItemStack(ItemStack stack) {
        return false;
    }

    @Nullable
    public ItemStack getBoostItemStack() {
        return null;
    }

    public boolean isBoostItemStackConsume(ItemStack stack) {
        return false;
    }

    @Nullable
    public ItemStack getBoostItemStackConsume() {
        return null;
    }

    public boolean isLaunchItemStack(ItemStack stack) {
        return false;
    }

    @Nullable
    public ItemStack getLaunchItemStack() {
        return null;
    }

    public int getBoostAmount() {
        return 0;
    }

    public int getBoostSuperAmount() {
        return 0;
    }

    public int getBoostSpeedLimit() {
        return 0;
    }

    public boolean isBoostSpeedLimitStop() {
        return false;
    }

    public boolean isBoostRequiresItem() {
        return false;
    }

    public boolean isBoostShowParticles() {
        return false;
    }

    public boolean isPreventSelfDamage() {
        return false;
    }

    public boolean isPreventRocketUsage() {
        return false;
    }

    public boolean isBoostSpeedDecimals() {
        return false;
    }

    public double getLaunchTime() {
        return 0.0;
    }

    public boolean isDisableRiptide() {
        return false;
    }
}
