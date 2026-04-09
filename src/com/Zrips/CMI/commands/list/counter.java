package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class counter implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 230, info = "Starts counter for surrounding players", args = "[join/leave/start] (t:time) (r:[range/-1]) (c:[world:x:y:z]) (msg:custom_message) (-f)", tab = {
            "join%%leave%%start", "%%-f" }, explanation = { "Permissions:", "cmi.command.counter.force - to force counter for everyone in range ",
                    "cmi.command.counter.time - define custom time range ", "cmi.command.counter.range - to define custom range", "cmi.command.counter.msg - to define custom message",
                    "cmi.command.counter.autojoin - joins counter automatically", "-f will force counter to all players in range",
                    "Example: /cmi counter start r:30 t:7 msg:&eCustom_message -f" }, regVar = { -100 }, consoleVar = { -100 }, alias = true, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
