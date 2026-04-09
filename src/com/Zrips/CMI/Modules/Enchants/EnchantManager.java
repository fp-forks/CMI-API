package com.Zrips.CMI.Modules.Enchants;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.enchantments.Enchantment;

import com.Zrips.CMI.CMI;

public class EnchantManager {
    private Map<String, Object> maxValues = null;
    private HashMap<String, Enchantment> disabled = null;
    private CMI plugin = null;
    private boolean RequireSpecificPermission = false;
    private boolean EnforceValidEnchants = false;
    private boolean PermissionLevelLimit = false;
    private boolean enchantLimitEnabled = false;
    private String fileName = null;

    public EnchantManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public Integer getMaxLevel(Enchantment enchant) {
        return null;
    }

    public void reEnableEnchantsOnDisable() {
    }

    public void disableEnchantsOnLoad() {
    }

    public HashMap<String, Enchantment> getDisabled() {
        return null;
    }

    public boolean isDisabled(Enchantment disabled) {
        return false;
    }

    public void addDisabled(Enchantment disabled) {
    }

    public void removeDisabled(Enchantment disabled) {
    }

    public void loadDisabledEnchants() {
    }

    public void updateConfig() {
    }

    public boolean isRequireSpecificPermission() {
        return false;
    }

    public boolean isPermissionLevelLimit() {
        return false;
    }

    public boolean isEnchantLimitEnabled() {
        return false;
    }

    public boolean isEnforceValidEnchants() {
        return false;
    }
}
