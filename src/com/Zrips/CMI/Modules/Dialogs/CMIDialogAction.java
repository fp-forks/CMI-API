package com.Zrips.CMI.Modules.Dialogs;

import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import org.bukkit.entity.Player;

public class CMIDialogAction {
    private List<String> actions = null;
    private CMIDialogButtonType type = null;

    public CMIDialogAction(Object actions, CMIDialogButtonType type) {
    }

    public static CMIDialogAction deserialize(Map<String, Object> cmds) {
        return null;
    }

    @Nullable
    public List<String> getActions() {
        return null;
    }

    @Nullable
    public List<String> getActions(String replace) {
        return null;
    }

    public CMIDialogButtonType getType() {
        return null;
    }

    public void perform(CMIDialog dialog, Player player) {
    }

    public void perform(CMIDialog dialog, Player player, String replace) {
    }
}
