package com.Zrips.CMI.events;

import org.bukkit.command.CommandSender;

public class CMIIpBanEvent extends CMICancellableEvent {
    private CommandSender by = null;
    private String ip = null;
    private Long until = null;
    private String reason = null;

    public CMIIpBanEvent(CommandSender by, String ip, String reason, Long until) {
        super();
    }

    public CommandSender getBannedBy() {
        return null;
    }

    public String getIp() {
        return null;
    }

    public Long getUntil() {
        return null;
    }

    public String getReason() {
        return null;
    }
}
