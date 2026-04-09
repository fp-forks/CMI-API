package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class jailedit implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Edit jails", regVar = { 0, 1, 2, 3 }, consoleVar = { 666 }, modules = "jail")
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        addjail, delete, jaillist, celllist, addCell, removeCell, redefineJail, outsideLoc;

        public static Action getByName(String name) {
            return null;
        }
    }
}
