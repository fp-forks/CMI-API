package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class alert implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 70, info = "Alerts administration on players login", args = "[add/list/remove] [playerName] (reason) (-s)", tab = { "add%%list%%remove", "playerName" }, explanation = {
            "{gcp}Permissions:", "{gcs}command.alert.info.inform {gcp}- to see alerts on player login" }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        add, list, remove;

        public static Action getByName(String name) {
            return null;
        }
    }
}
