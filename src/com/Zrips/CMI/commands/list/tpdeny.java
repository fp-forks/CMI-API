package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class tpdeny implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Deny teleport request", args = "(playerName)", tab = { "playername" }, regVar = { 0, 1 }, consoleVar = { 666 })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
