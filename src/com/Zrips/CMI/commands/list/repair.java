package com.Zrips.CMI.commands.list;

import java.util.List;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class repair implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Repair items", args = "[hand/offhand/armor/all] (playerName)", multiTab = { "hand,offhand,armor,all [playername]" }, explanation = {
            "cmi.command.repair.hand - allows a user to repair items in their hand", "cmi.command.repair.offhand - allows a user to repair items in their offhand",
            "cmi.command.repair.armor - allows a user to repair items in armor slots", "cmi.command.repair.all - allows a user to repair their whole inventory",
            "cmi.command.repair.repairshare.bypass - allows a user to repair items without adding repair share protection" }, regVar = { 0, 1, 2, 3 }, consoleVar = { 2, 3 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public enum repairType {
        hand, offhand, armor, all;

        public static repairType get(String name) {
            return null;
        }

        public List<ItemStack> getItems(Player player) {
            return null;
        }
    }
}
