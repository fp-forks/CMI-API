package com.Zrips.CMI.Containers;

import java.lang.reflect.Method;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;

public class CMIPaperItemSerializator {
    static Method serializeAsBytes = null;
    static Method deserializeBytes = null;

    public static Object serializeItemStack(ItemStack item) {
        return null;
    }

    public static ItemStack deserializeItemStack(byte[] bytes) {
        return null;
    }

    public static void setTo(YamlConfiguration k, String path, ItemStack item) {
    }

    public static ItemStack getItem(Object section) {
        return null;
    }

    public static ItemStack getItemFromObject(Object itemObject) {
        return null;
    }
}
