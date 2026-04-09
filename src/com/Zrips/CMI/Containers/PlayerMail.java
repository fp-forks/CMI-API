package com.Zrips.CMI.Containers;

import org.bukkit.command.CommandSender;

public class PlayerMail {
    private String sender = null;
    private long time = 0;
    private long keepFor = 0;
    private String message = null;

    public PlayerMail(String sender, Long time, String message) {
        this(sender, time, message, 0L);
    }

    public PlayerMail(String sender, Long time, String message, Long keepForSeconds) {
    }

    public PlayerMail(CommandSender sender, String message) {
        this(sender, System.currentTimeMillis(), message, 0L);
    }

    public PlayerMail(CommandSender sender, String message, Long keepForSeconds) {
        this(sender, System.currentTimeMillis(), message, keepForSeconds);
    }

    public PlayerMail(CommandSender sender, long time, String message, Long keepForSeconds) {
    }

    public String getSender() {
        return null;
    }

    public void setSender(String sender) {
    }

    public Long getTime() {
        return null;
    }

    public void setTime(Long time) {
    }

    public String getMessage() {
        return null;
    }

    public void setMessage(String message) {
    }

    public Long getKeepFor() {
        return null;
    }

    public void setKeepFor(Long keepFor) {
    }
}
