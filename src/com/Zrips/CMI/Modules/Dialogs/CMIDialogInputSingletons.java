package com.Zrips.CMI.Modules.Dialogs;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

import org.bukkit.entity.Player;

import io.papermc.paper.registry.data.dialog.input.SingleOptionDialogInput.OptionEntry;

public class CMIDialogInputSingletons extends CMIDialogInputField {
    List<CMIDialogInputSingleton> singletons = null;
    private boolean defaultSet = false;
    private CMIDialogInputSingleton first = null;
    private CMIDialogAction action = null;

    public CMIDialogInputSingletons() {
        super();
    }

    public CMIDialogInputSingletons addEntry(CMIDialogInputSingleton singleton) {
        return null;
    }

    public CMIDialogInputSingletons addEntry(String value, String text) {
        return null;
    }

    public CMIDialogInputSingletons addEntry(String value, String text, boolean isDefault) {
        return null;
    }

    public BiConsumer<Player, String> getConsumer() {
        return null;
    }

    public CMIDialogInputSingleton getEntry(String id) {
        return null;
    }

    public List<OptionEntry> getEntries(Player player, String oldValue) {
        return null;
    }

    public List<OptionEntry> getEntries(Player player, String oldValue, CMICustomDialog customDialog) {
        return null;
    }

    public List<OptionEntry> getEntries(Player player, String oldValue, Map<String, String> values) {
        return null;
    }

    public static CMIDialogInputSingletons deserialize(Map<String, Object> entry) {
        return null;
    }

    public CMIDialogAction getAction() {
        return null;
    }

    public void setAction(CMIDialogAction action) {
    }
}
