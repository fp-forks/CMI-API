package com.Zrips.CMI.Modules.Dialogs;

import java.util.Map;
import java.util.function.BiConsumer;

import org.bukkit.entity.Player;

public class CMIDialogInputSlider extends CMIDialogInputField {
    private CMIDialogAction action = null;
    private CMIDialogInputValue initialValue = null;
    private CMIDialogInputValue start = null;
    private CMIDialogInputValue end = null;
    private CMIDialogInputValue step = null;

    public CMIDialogInputSlider() {
        super();
    }

    @Override
    public BiConsumer<Player, Float> getConsumer() {
        return null;
    }

    public Map<String, Object> serialize() {
        return null;
    }

    public static CMIDialogInputSlider deserialize(Map<String, Object> entry) {
        return null;
    }

    public CMIDialogAction getAction() {
        return null;
    }

    public CMIDialogInputSlider setAction(CMIDialogAction action) {
        return null;
    }

    public CMIDialogInputValue getInitialValue() {
        return null;
    }

    public CMIDialogInputSlider setInitialValue(CMIDialogInputValue initialValue) {
        return null;
    }

    public CMIDialogInputValue getStart() {
        return null;
    }

    public CMIDialogInputSlider setStart(CMIDialogInputValue start) {
        return null;
    }

    public CMIDialogInputValue getEnd() {
        return null;
    }

    public CMIDialogInputSlider setEnd(CMIDialogInputValue end) {
        return null;
    }

    public CMIDialogInputValue getStep() {
        return null;
    }

    public CMIDialogInputSlider setStep(CMIDialogInputValue step) {
        return null;
    }
}
