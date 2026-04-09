package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMILeaderboard;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class lastonline implements Cmd {
    private static CMILeaderboard<Long> leaderboard = null;
    private static boolean init = false;

    @Override
    public void getExtra(ConfigReader c) {
    }

    public static void addLogOff(CMIUser user) {
    }

    @Override
    @CAnnotation(info = "Show played players from last x minutes", args = "(-p:[page])", regVar = { 0, 1 }, consoleVar = { 0, 1 }, alias = true, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
