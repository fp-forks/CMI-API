package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class invload implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Load saved inventory", args = "(sourceName) (targetName) [id/last]", regVar = { 1, 2, 3 }, consoleVar = { 2, 3 }, alias = true, others = true, multiTab = {
            "[playerName],!last,1 [playerName],!last,1 !last,1" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
