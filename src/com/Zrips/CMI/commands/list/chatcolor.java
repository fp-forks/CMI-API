package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class chatcolor implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Pick chat color", args = "(playerName)", tab = { "playername" }, others = true, consoleVar = { 666 })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
