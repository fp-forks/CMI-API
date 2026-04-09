package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class kiteditor implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Kit editor", tab = { "seticon%%kitnames", "kitnames" }, explanation = { "Permissions:", "cmi.kit.[kitName] - allows to use particular kit",
            "cmi.kit.bypass.money - bypass money requirement", "cmi.kit.bypass.exp - bypass exp requirement",
            "/cmi kiteditor - shows kit list" }, regVar = { -666 }, consoleVar = { 666 }, others = false, modules = { "kits" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        list, add, new_, edit;

        public static Action getByName(String name) {
            return null;
        }
    }
}
