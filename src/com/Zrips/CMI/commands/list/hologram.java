package com.Zrips.CMI.commands.list;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Holograms.CMIHologram;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class hologram implements Cmd {
    private HashMap<UUID, CMIHologram> lastHolograms = null;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Manage holograms", multiTab = { "new,reload", "addline,deleteline,editline,info,update,gui [holograms]", "aimlines,aimgui,lastlines,lastgui" }, regVar = {
            -66 }, consoleVar = { -66 }, modules = "holograms", others = false, indevelopment = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public static boolean startEditingCommands(CommandSender sender, CMIHologram holo) {
        return false;
    }

    public static boolean showHologramInfo(CommandSender sender, CMIHologram holo, int page) {
        return false;
    }

    private enum Action {
        update, editline, moveup, movedown, createnew, addline, info, deleteLine, gui, list, delete, reload, editCommands, aimlines, aimgui, lastlines, lastgui;

        public static Action getByName(String name) {
            return null;
        }
    }
}
