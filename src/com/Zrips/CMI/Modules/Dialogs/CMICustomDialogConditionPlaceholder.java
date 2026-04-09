package com.Zrips.CMI.Modules.Dialogs;

import java.util.Map;
import java.util.Set;

import javax.annotation.Nonnull;

import org.bukkit.entity.Player;

public class CMICustomDialogConditionPlaceholder {
    private Set<CMICustomDialogPlaceholder> placeholders = null;

    public Set<CMICustomDialogPlaceholder> getPlaceholders() {
        return null;
    }

    public void setPlaceholders(Set<CMICustomDialogPlaceholder> placeholders) {
    }

    public void addPlaceholder(CMICustomDialogPlaceholder placeholder) {
    }

    public boolean isPlaceholderValid(Player player) {
        return false;
    }

    public boolean isPlaceholderValid(Player player, Map<String, String> values) {
        return false;
    }

    @Nonnull
    public static CMICustomDialogConditionPlaceholder deserialize(Map<String, Object> entry) {
        return null;
    }
}
