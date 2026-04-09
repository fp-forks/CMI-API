package com.Zrips.CMI.utils;

import java.lang.reflect.Method;
import java.util.UUID;

import org.bukkit.inventory.Inventory;

public class PlayerVaultManager {
    static Method vaultExistsMeth = null;
    static Method loadOtherVaultMeth = null;
    static Class<?> c = null;

    public PlayerVaultManager() {
    }

    public static boolean vaultExists(UUID uuid, int id) {
        return false;
    }

    public static Inventory loadOtherVault(UUID uuid, int i, int y) {
        return null;
    }
}
