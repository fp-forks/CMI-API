package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class usermeta implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Manage players meta data", args = "[playerName] [add/remove/clear/list/increment] (key) (value) (-s)", tab = { "playername", "add%%remove%%clear%%list%%increment",
            "[usermeta]" }, explanation = { "Any set meta can be displayed with %cmi_user_meta_[key]% placeholder around plugin" }, regVar = { -100 }, consoleVar = { -100, -1 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        Remove, Add, Clear, List, Increment;
    }
}
