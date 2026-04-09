package com.Zrips.CMI.Modules.Dialogs;

import javax.annotation.Nullable;

public enum CMIDialogButtonType {
    CUSTOM(null), COMMANDS, URL, OPENDIALOG("OpenDialog"), SUGGESTION;

    String configEntry = null;

    CMIDialogButtonType() {
    }

    CMIDialogButtonType(String configEntry) {
    }

    @Nullable
    public String getConfigEntry() {
        return null;
    }
}
