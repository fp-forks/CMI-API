package com.Zrips.CMI.Modules.Dialogs;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class DialogManager {
    private CMI plugin = null;
    private Map<String, CMICustomDialog> map = null;

    public DialogManager(CMI plugin) {
    }

    public void clearCache(UUID uuid) {
    }

    public void load() {
    }

    public CMICustomDialog getDialog(String name, Player player) {
        return null;
    }

    public CMICustomDialog getDialog(String name, boolean includeDisabled) {
        return null;
    }

    public List<String> getDialogNames(CommandSender sender) {
        return null;
    }

    public List<String> getDialogNames(boolean includeDisabled) {
        return null;
    }
}
