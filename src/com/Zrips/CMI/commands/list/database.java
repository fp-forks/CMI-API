package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class database implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Manage backup data", args = "[action] (playerName) (dataType) (fileName)", multiTab = { "restoreplayer [playerName] ||usertable,inventories,playtime,playtimereward",
            "backup ||usertable,inventories,playtime,playtimereward" // "list"
    }, regVar = { 0, 1, 2, 3, 4 }, consoleVar = { 0, 1, 2, 3, 4 })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        restoreplayer, backup, list;

        public static Action get(String name) {
            return null;
        }
    }
}
