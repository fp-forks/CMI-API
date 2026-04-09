package com.Zrips.CMI.events;

import java.util.UUID;

import org.bukkit.command.CommandSender;

public class CMIPlayerKickEvent extends CMICancellableEvent {
    private String reason = null;
    private CommandSender by = null;
    private UUID banned = null;

    public CMIPlayerKickEvent(CommandSender by, UUID banned, String reason) {
        super();
    }

    public String getReason() {
        return null;
    }

    public CommandSender getBannedBy() {
        return null;
    }

    public UUID getBanned() {
        return null;
    }
}
