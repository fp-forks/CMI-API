package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class lfix implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Fix light in chunks around you", args = "(range) (playerName) (stop/stopall)", tab = { "halfViewRange" }, regVar = { 1, 2 }, consoleVar = { 1, 2 })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
