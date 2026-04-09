package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class schedule implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Trigger schedule", args = "[scheduleName] (-updatetimer)", tab = { "scheduleName", "-updatetimer" }, regVar = { 1, 2 }, consoleVar = { 1, 2 })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
