package com.Zrips.CMI.events;

import org.bukkit.command.CommandSender;

public class CMIIpUnBanEvent extends CMICancellableEvent {
    private CommandSender by = null;
    private String ip = null;

    public CMIIpUnBanEvent(CommandSender by, String ip) {
        super();
    }

    public CommandSender getBannedBy() {
        return null;
    }

    public String getIp() {
        return null;
    }
}
