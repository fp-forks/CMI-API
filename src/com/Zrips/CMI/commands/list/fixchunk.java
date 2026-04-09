package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class fixchunk implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Scans for damaged chunks", args = "w [worldName] r [range in chunks] c [x:z]", explanation = { "SubCommands:", "- stats - show current scanning stats",
            "- pause - pause scanning", "- continue - continue scanning", "- stop - stop scanning", "- stopall - stop all scanning", "- speed [amount] - set current scan speed",
            "- autospeed [true/false] - set autospeed turned off or on", "- messages [true/false] - set message output to off or on", "Example:", "/fixchunk w LT_Craft",
            "/fixchunk w LT_Craft r 50 c 1024:-2048", "/fixchunk w LT_Craft r g", "/fixchunk fix" }, regVar = { -100 }, consoleVar = { -100 }, alias = true, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
