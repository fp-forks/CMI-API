package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class ifoffline implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Perform command only when player is offline", args = "[playerName] (command)", tab = { "playername" }, regVar = { -100, -1 }, consoleVar = { -100, -1 })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
