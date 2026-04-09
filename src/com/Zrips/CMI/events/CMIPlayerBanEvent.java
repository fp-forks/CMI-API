package com.Zrips.CMI.events;

import java.util.UUID;

import org.bukkit.command.CommandSender;

public class CMIPlayerBanEvent extends CMIEvent {
    private String reason = null;
    private Long until = null;
    private CommandSender by = null;
    private UUID banned = null;

    public CMIPlayerBanEvent(CommandSender by, UUID banned, String reason, Long until) {
        super();
    }

    public String getReason() {
        return null;
    }

    public Long getUntil() {
        return null;
    }

    public CommandSender getBannedBy() {
        return null;
    }

    public UUID getBanned() {
        return null;
    }
}
