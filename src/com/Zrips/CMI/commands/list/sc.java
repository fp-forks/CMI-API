package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class sc implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Starts sign copy process", args = "(playerName) (oneside)", multiTab = { "[playername],!oneside !oneside" }, regVar = { 0, 1, 2 }, consoleVar = {
            666 }, customAlias = "!scopy")
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
