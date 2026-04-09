package com.Zrips.CMI.commands.list;

import java.util.HashMap;

import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.BasicRecipe;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class uncondense implements Cmd {
    private static HashMap<ItemStack, BasicRecipe> cache = null;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Uncondense items into smaller parts", args = "(itemName) (playerName) (-s)", multiTab = { "[itemname] [playerName] -s" }, regVar = { 0, 1, 2, 3 }, consoleVar = { 1, 2,
            3 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public static void clearCache() {
    }
}
