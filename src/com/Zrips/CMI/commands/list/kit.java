package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class kit implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 170, info = "Gives predefined kit.", args = "[kitName] (playerName) (-s) (-open) (-preview) (-c)", tab = { "kitp", "playername", "-s%%" }, explanation = { "Permissions:",
            "cmi.kit.[kitName] - allows to use particular kit", "cmi.kit.bypass.money - bypass money requirement", "cmi.kit.bypass.exp - bypass exp requirement",
            "cmi.kit.bypass.onetimeuse - bypass one time use", "/cmi kit [kitName] [playerName] - will give kit to another player" }, regVar = { 0, 1, 2,
                    3 }, consoleVar = { 0, 2, 3 }, paccess = true, others = true, modules = { "kits" }, customAlias = { "kits", "!+-preview:kitpreview", "!+-open:kitopen" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
