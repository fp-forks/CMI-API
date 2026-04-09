package com.Zrips.CMI.Modules.Dialogs;

import java.util.Map;
import java.util.function.Consumer;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.entity.Player;

public class CMIDialogButton {
    private String label = null;
    private int width = 0;
    private CMIDialogAction action = null;
    private String tooltip = null;
    private Consumer<Player> onClick = null;
    private boolean save = false;
    private CMICustomDialogCondition condition = null;

    public CMIDialogButton(String label) {
    }

    @Nullable
    public String getLabel() {
        return null;
    }

    public CMIDialogButton setLabel(String label) {
        return null;
    }

    @Nullable
    public CMIDialogAction getAction() {
        return null;
    }

    public CMIDialogButton setAction(CMIDialogAction action) {
        return null;
    }

    @Nullable
    public String getCustomActionValue() {
        return null;
    }

    @Nonnull
    public CMIDialogButtonType getType() {
        return null;
    }

    public int getWidth() {
        return 0;
    }

    public CMIDialogButton setWidth(int width) {
        return null;
    }

    @Nullable
    public String getTooltip() {
        return null;
    }

    public CMIDialogButton setTooltip(String tooltip) {
        return null;
    }

    public Map<String, Object> serialize() {
        return null;
    }

    public static CMIDialogButton deserialize(Map<String, Object> entry) {
        return null;
    }

    @Nullable
    public Consumer<Player> getOnClick() {
        return null;
    }

    public CMIDialogButton setOnClick(Consumer<Player> onClick) {
        return null;
    }

    public boolean isSave() {
        return false;
    }

    public CMIDialogButton setSave(boolean save) {
        return null;
    }

    @Nonnull
    public CMICustomDialogCondition getCondition() {
        return null;
    }

    public CMIDialogButton setCondition(CMICustomDialogCondition condition) {
        return null;
    }
}
