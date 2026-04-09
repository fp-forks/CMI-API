package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class mirror implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Starts block place/break mirroring.", args = "(start/stop)", regVar = { 0, 1 }, consoleVar = { 666 }, modules = "mirror")
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
