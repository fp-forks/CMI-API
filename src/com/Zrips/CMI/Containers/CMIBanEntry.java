package com.Zrips.CMI.Containers;

import org.bukkit.BanEntry;

public class CMIBanEntry {
    long createdOn = 0;
    long banUntil = 0;
    String reason = null;
    CMIUser bannedBy = null;
    CMIUser banned = null;

    public CMIBanEntry(CMIUser baned) {
    }

    public Long getCreated() {
        return null;
    }

    public Long getExpiration() {
        return null;
    }

    public String getReason() {
        return null;
    }

    public String getSource() {
        return null;
    }

    public CMIUser getSourceUser() {
        return null;
    }

    public String getTarget() {
        return null;
    }

    public CMIUser getTargetUser() {
        return null;
    }

    public void setCreated(Long date) {
    }

    public void setExpiration(Long date) {
    }

    public void setReason(String reason) {
    }

    public void setSource(CMIUser user) {
    }

    public boolean isPermanent() {
        return false;
    }

    public Long getLeftTime() {
        return null;
    }

    public static String getBanMessage(BanEntry banEntry) {
        return null;
    }

    public static String getIpBanMessage(BanEntry banEntry) {
        return null;
    }
}
