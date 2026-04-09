package com.Zrips.CMI.Modules.Dialogs;

public enum CMIDialogConditionActionType {
    Equal("=="), MoreEqual(">="), LessEqual("<="), More(">"), Less("<");

    private String action = null;

    CMIDialogConditionActionType(String action) {
    }

    public static CMIDialogConditionActionType get(String value) {
        return null;
    }

    public String getAction() {
        return null;
    }
}
