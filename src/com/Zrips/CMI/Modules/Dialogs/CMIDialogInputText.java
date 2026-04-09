package com.Zrips.CMI.Modules.Dialogs;

import java.util.Map;
import java.util.function.BiConsumer;

import org.bukkit.entity.Player;

public class CMIDialogInputText extends CMIDialogInputField {
    private CMIDialogInputValue initial = null;
    private CMIDialogInputValue maxLength = null;
    private CMIDialogInputValue maxLines = null;
    private CMIDialogInputValue height = null;
    private CMIDialogAction action = null;

    public CMIDialogInputText() {
        super();
    }

    @Override
    public BiConsumer<Player, String> getConsumer() {
        return null;
    }

    public Map<String, Object> serialize() {
        return null;
    }

    public static CMIDialogInputText deserialize(Map<String, Object> entry) {
        return null;
    }

    public CMIDialogInputValue getInitialText() {
        return null;
    }

    public CMIDialogInputText setInitialText(CMIDialogInputValue initial) {
        return null;
    }

    public CMIDialogInputValue getMaxLength() {
        return null;
    }

    public CMIDialogInputText setMaxLength(CMIDialogInputValue maxLength) {
        return null;
    }

    public CMIDialogInputValue getMaxLines() {
        return null;
    }

    public CMIDialogInputText setMaxLines(CMIDialogInputValue maxLines) {
        return null;
    }

    public CMIDialogInputValue getHeight() {
        return null;
    }

    public CMIDialogInputText setHeight(CMIDialogInputValue height) {
        return null;
    }

    public CMIDialogAction getAction() {
        return null;
    }

    public CMIDialogInputText setAction(CMIDialogAction action) {
        return null;
    }
}
