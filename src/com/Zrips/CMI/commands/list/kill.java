package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class kill implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Kill player", args = "[playerName] (-forced) (damageCause) (-s) (-lightning)", multiTab = {
            "[playerName] -forced,[damageCause],-s,-lightning -forced,-s,-lightning -forced,-s,-lightning" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
