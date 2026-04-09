package com.Zrips.CMI.Modules.Dialogs;

import java.util.Map;

import org.bukkit.entity.Player;

import io.papermc.paper.registry.data.dialog.input.SingleOptionDialogInput.OptionEntry;

public class CMIDialogInputSingleton {
    private CMIDialogInputValue isDefault = null;
    private CMIDialogAction action = null;
    private String label = null;
    private String id = null;
    private String value = null;

    public CMIDialogInputSingleton() {
    }

    public CMIDialogInputSingleton(String id, String text, boolean isDefault) {
    }

    public CMIDialogInputSingleton setDefault(boolean state) {
        return null;
    }

    public boolean isDefault() {
        return false;
    }

    public boolean isDefault(Player player) {
        return false;
    }

    public OptionEntry getOptionEntry(Player player, boolean previousValue) {
        return null;
    }

    public OptionEntry getOptionEntry(Player player, boolean previousValue, Map<String, String> values) {
        return null;
    }

    public OptionEntry getOptionEntry(Player player) {
        return null;
    }

    public OptionEntry getOptionEntry(Player player, Map<String, String> values) {
        return null;
    }

    public OptionEntry getOptionEntryLimited(Player player, boolean canBeDefault) {
        return null;
    }

    public OptionEntry getOptionEntryLimited(Player player, boolean canBeDefault, Map<String, String> values) {
        return null;
    }

    public static CMIDialogInputSingleton deserialize(Map<?, ?> entry) {
        return null;
    }

    public CMIDialogAction getAction() {
        return null;
    }

    public String getLabel() {
        return null;
    }

    public void setLabel(String label) {
    }

    public String getId() {
        return null;
    }

    public void setId(String id) {
    }

    public String getValue() {
        return null;
    }

    public void setValue(String value) {
    }
}
