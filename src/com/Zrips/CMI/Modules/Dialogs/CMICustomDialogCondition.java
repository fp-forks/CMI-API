package com.Zrips.CMI.Modules.Dialogs;

import java.util.Map;

import org.bukkit.entity.Player;

public class CMICustomDialogCondition {
    private String permission = null;
    private CMICustomDialogConditionPlaceholder placeholder = null;

    public String getPermission() {
        return null;
    }

    public CMICustomDialogCondition setPermission(String permission) {
        return null;
    }

    public CMICustomDialogCondition setPlaceholder(CMICustomDialogConditionPlaceholder placeholder) {
        return null;
    }

    public boolean hasPermission(Player player) {
        return false;
    }

    public boolean isPlaceholderValid(Player player) {
        return false;
    }

    public boolean isPlaceholderValid(Player player, Map<String, String> values) {
        return false;
    }

    public boolean isConditionValid(Player player, CMICustomDialog one) {
        return false;
    }

    public boolean isConditionValid(Player player) {
        return false;
    }

    public boolean isConditionValid(Player player, Map<String, String> values) {
        return false;
    }

    public static CMICustomDialogCondition deserialize(Map<String, Object> entry) {
        return null;
    }
}
