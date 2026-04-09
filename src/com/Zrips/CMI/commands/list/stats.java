package com.Zrips.CMI.commands.list;

import java.text.NumberFormat;
import java.util.HashMap;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class stats implements Cmd {
    HashMap<String, Long> most = null;
    static NumberFormat formatter = null;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Check players stats", args = "(playerName)", tab = { "playername" }, regVar = { 0, 1 }, consoleVar = { 1 }, alias = true, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public static String convertDistance(long distance) {
        return null;
    }
}
