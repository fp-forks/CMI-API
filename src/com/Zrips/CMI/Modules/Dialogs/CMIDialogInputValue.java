package com.Zrips.CMI.Modules.Dialogs;

import org.bukkit.entity.Player;

public class CMIDialogInputValue {
    private Object value = null;
    private boolean placeholder = false;

    public CMIDialogInputValue(Object value) {
    }

    public Object getValue() {
        return null;
    }

    public Object getValue(Player player) {
        return null;
    }

    public boolean getBoolValue(Player player) {
        return false;
    }

    public boolean getBoolValue(Player player, Object previousValue) {
        return false;
    }

    public int getIntValue(Player player) {
        return 0;
    }

    public int getIntValue(Player player, Object previousValue) {
        return 0;
    }

    public String getStringValue(Player player) {
        return null;
    }

    public String getStringValue(Player player, Object previousValue) {
        return null;
    }

    public float getFloatValue(Player player) {
        return 0.0f;
    }

    public float getFloatValue(Player player, Object previousValue) {
        return 0.0f;
    }

    public Float getFloatValueNullable(Player player) {
        return null;
    }

    public Float getFloatValueNullable(Player player, Object previousValue) {
        return null;
    }

    public Object getValue(Player player, Object previousValue) {
        return null;
    }

    public boolean isPlaceholder() {
        return false;
    }

    public static CMIDialogInputValue getValue(Object value) {
        return null;
    }
}
