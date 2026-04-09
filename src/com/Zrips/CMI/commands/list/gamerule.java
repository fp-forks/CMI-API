package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class gamerule implements Cmd {
    final static int perPage = 0;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Manage gamerules", args = "(world) (gamerule) (value)", regVar = { 0, 1, 2, 3 }, consoleVar = { 3 }, others = false, multiTab = { "[worlds] [gamerule] [gamerulevalue]" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
