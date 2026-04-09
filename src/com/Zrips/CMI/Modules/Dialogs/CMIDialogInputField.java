package com.Zrips.CMI.Modules.Dialogs;

import java.util.Map;
import java.util.function.BiConsumer;

import javax.annotation.Nonnull;

import org.bukkit.entity.Player;

public class CMIDialogInputField {
    private String label = null;
    private String id = null;
    private int width = 0;
    private CMICustomDialogCondition condition = null;
    protected BiConsumer<Player, ?> consumer = null;

    public Map<String, Object> serialize() {
        return null;
    }

    public String getId() {
        return null;
    }

    public CMIDialogInputField setId(String id) {
        return null;
    }

    public BiConsumer<Player, ?> getConsumer() {
        return null;
    }

    public CMIDialogInputField setConsumer(BiConsumer<Player, ?> consumer) {
        return null;
    }

    public String getLabel(Player player) {
        return null;
    }

    public CMIDialogInputField setLabel(String label) {
        return null;
    }

    public static CMIDialogInputField deserialize(Map<String, Object> entry) {
        return null;
    }

    public int getWidth() {
        return 0;
    }

    public CMIDialogInputField setWidth(int width) {
        return null;
    }

    @Nonnull
    public CMICustomDialogCondition getCondition() {
        return null;
    }

    public CMIDialogInputField setCondition(CMICustomDialogCondition condition) {
        return null;
    }
}
