package com.Zrips.CMI.commands.list;

import java.util.regex.Pattern;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class info implements Cmd {
    Pattern patern = null;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Show players information", args = "[playerName/uuid]", tab = { "playername" }, regVar = { -66 }, consoleVar = { -100 }, customAlias = { "whois" }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
