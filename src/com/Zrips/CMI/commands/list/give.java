package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class give implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Give item to player", args = "(playerName) [itemdata/hand] (playerName) (-slot:[number]) (unstack) (-s)", tab = { "playername%%itemname", "itemname%%hand",
            "1%%playerName" }, explanation = { "Example: /cmi give diamondsword;{#Gray}My_Uber_Sword;&2Goblin_Slayer!\n{#pink}With_Love!;sharpness:3,durability:3;hideenchants",
                    "<T>More information at www.zrips.net/cmi/commands/icwol/</T><URL>https://www.zrips.net/cmi/commands/icwol/</URL>" }, regVar = { -100 }, consoleVar = { -100 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
