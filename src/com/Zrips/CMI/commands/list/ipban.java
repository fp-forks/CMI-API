package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class ipban implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Ban ip", args = "[ip/playerName] (reason) (-s)", tab = { "playername" }, explanation = { "cmi.command.banip.bypass - to bypass ban" }, regVar = { -100 }, consoleVar = {
            -100 })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
