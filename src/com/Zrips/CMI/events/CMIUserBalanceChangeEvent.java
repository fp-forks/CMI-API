package com.Zrips.CMI.events;

import com.Zrips.CMI.Containers.CMIUser;

public class CMIUserBalanceChangeEvent extends CMIUserEvent {
    private CMIUser source = null;
    private double from = 0.0;
    private double to = 0.0;
    private String actionType = null;

    @Deprecated
    public CMIUserBalanceChangeEvent(CMIUser user, double from, double to) {
        this(user, from, to, "Unknown");
    }

    public CMIUserBalanceChangeEvent(CMIUser user, double from, double to, String actionType, CMIUser source) {
        super(user, true);
    }

    @Deprecated
    public CMIUserBalanceChangeEvent(CMIUser user, double from, double to, String actionType) {
        this(user, from, to, actionType, null);
    }

    public double getFrom() {
        return 0.0;
    }

    public double getTo() {
        return 0.0;
    }

    public String getActionType() {
        return null;
    }

    public void setActionType(String actionType) {
    }

    public CMIUser getSource() {
        return null;
    }
}
