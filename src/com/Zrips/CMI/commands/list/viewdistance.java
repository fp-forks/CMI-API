package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class viewdistance implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Change view distance", args = "[range] (playerName/worldName/reset) (view/simulation)", multiTab = { "[ViewRange],reset [playername],[worlds] view,simulation" }, regVar = { 0,
            1, 2, 3 }, consoleVar = { 0, 1, 2, 3 }, alias = true, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Type {
        view, simulation;

        public static Type getType(String name) {
            return null;
        }
    }
}
