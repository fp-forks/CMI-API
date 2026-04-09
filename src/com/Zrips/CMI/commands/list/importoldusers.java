package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class importoldusers implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Imports users from playerdata folder in main world folder. Server can suffer lag spike during import", regVar = { 0 }, consoleVar = { 0 })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
