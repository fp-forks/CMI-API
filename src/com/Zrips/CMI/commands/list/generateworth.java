package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class generateworth implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Auto generate possible item worth values", regVar = { 666 }, consoleVar = { 0 })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
