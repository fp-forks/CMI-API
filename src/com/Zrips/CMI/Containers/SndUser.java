package com.Zrips.CMI.Containers;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SndUser {
    private String name = null;
    private CMIUser user = null;
    private CommandSender commandSender = null;
    private List<String> types = null;

    public SndUser(String... type1) {
    }

    public SndUser(String type1, String type2) {
    }

    public Player getPlayer() {
        return null;
    }

    public CommandSender getCommandSender() {
        return null;
    }

    public void reset(CMIUser sender) {
    }

    public void reset(CommandSender sender) {
    }

    public void reset(String sender) {
    }

    public void reset() {
    }

    public SndUser set(Player sender) {
        return null;
    }

    public SndUser set(CMIUser user) {
        return null;
    }

    public SndUser set(CommandSender sender) {
        return null;
    }

    public CMIUser getUser() {
        return null;
    }

    public void setUser(CMIUser senderUser) {
    }

    public String getName() {
        return null;
    }

    public SndUser setName(String senderName) {
        return null;
    }

    public String updateLocale(String msg) {
        return null;
    }

    public String updateLocale(String msg, CommandSender receiver) {
        return null;
    }

    public static String replaceLocation(String type, Location loc, String msg) {
        return null;
    }
}
