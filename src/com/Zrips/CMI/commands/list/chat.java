package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class chat implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "Create and join chat rooms", args = "[create/join/leave/list/invite/kick/listrooms] (chatName/playerName) (-private) (-locked) (-persistent)", multiTab = {
            "create [playername] -private,-locked,-persistent -private,-locked,-persistent -private,-locked,-persistent", "join,see,unsee [chatroom]", "leave [chatroom]", "list",
            "invite [playername]", "kick [playername]", "listrooms" }, regVar = { 1, 2, 3, 4, 5 }, consoleVar = { 2 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Actions {
        create, join, leave, list, invite, kick, listrooms, force, see, unsee;

        public static Actions getByName(String name) {
            return null;
        }
    }
}
