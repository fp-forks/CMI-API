package com.Zrips.CMI.Modules.Dialogs;

import java.util.Map;
import java.util.function.BiConsumer;

import org.bukkit.entity.Player;

public class CMIDialogInputBoolean extends CMIDialogInputField {
    private CMIDialogInputValue initial = null;
    private String valueOnTrue = null;
    private String valueOnFalse = null;
    private CMIDialogAction commandsOnTrue = null;
    private CMIDialogAction commandsOnFalse = null;

    public CMIDialogInputBoolean() {
        super();
    }

    public CMIDialogInputValue getInitialState() {
        return null;
    }

    public void setInitialState(CMIDialogInputValue initial) {
    }

    @Override
    public BiConsumer<Player, Boolean> getConsumer() {
        return null;
    }

    public Map<String, Object> serialize() {
        return null;
    }

    public static CMIDialogInputBoolean deserialize(Map<String, Object> entry) {
        return null;
    }

    public CMIDialogAction getCommandsOnTrue() {
        return null;
    }

    public void setCommandsOnTrue(CMIDialogAction commandsOnTrue) {
    }

    public CMIDialogAction getCommandsOnFalse() {
        return null;
    }

    public void setCommandsOnFalse(CMIDialogAction commandsOnFalse) {
    }

    public String getValueOnTrue() {
        return null;
    }

    public void setValueOnTrue(String valueOnTrue) {
    }

    public String getValueOnFalse() {
        return null;
    }

    public void setValueOnFalse(String valueOnFalse) {
    }
}
