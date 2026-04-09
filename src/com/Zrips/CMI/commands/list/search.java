package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class search implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Search from all players of specific items or stats", explanation = {
            "<T>More information at https://www.zrips.net/cmi/extra/search/</T><URL>https://www.zrips.net/cmi/extra/search/</URL>" }, regVar = {
                    -100 }, consoleVar = { -100 }, alias = true, multiTab = { "cancel", "results", "survival,creative,adventure,spectator,fly,maxhp:21,god", "hand,stoneaxe oversize" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    enum actions {
        cancel, results, search;

        public static actions getByName(String name) {
            return null;
        }
    }
}
