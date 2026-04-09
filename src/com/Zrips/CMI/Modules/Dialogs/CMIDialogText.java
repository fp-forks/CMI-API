package com.Zrips.CMI.Modules.Dialogs;

import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;

public class CMIDialogText extends CMIDialogVisualField {
    private List<String> lines = null;
    private int width = 0;
    private boolean randomize = false;

    public CMIDialogText() {
        super();
    }

    public CMIDialogText(List<String> lines) {
        super();
    }

    public CMIDialogText(String line) {
        super();
    }

    @Nonnull
    public List<String> getLines() {
        return null;
    }

    @Nonnull
    public List<String> getAllLines() {
        return null;
    }

    public CMIDialogText setLines(List<String> lines) {
        return null;
    }

    public int getWidth() {
        return 0;
    }

    public CMIDialogText setWidth(int width) {
        return null;
    }

    public boolean isRandomize() {
        return false;
    }

    public CMIDialogText setRandomize(boolean randomize) {
        return null;
    }

    public CMIDialogText setLines(String description) {
        return null;
    }

    @Override
    public Map<String, Object> serialize() {
        return null;
    }

    public static CMIDialogText deserialize(Map<String, Object> entry) {
        return null;
    }
}
