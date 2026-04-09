package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class flightcharge implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "Manage and check flight charges", args = "(add/take/set/show/expcharge/moneycharge/recharge) (playerName) (amount) (-s)", tab = {
            "add%%take%%set%%show%%expcharge%%moneycharge%%recharge",
            "playername" }, regVar = { 0, 1, 2, 3, 4 }, consoleVar = { 2, 3, 4 }, customAlias = { "!+recharge:recharge", "!fcharge" }, alias = true, modules = "flightcharge", others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public static boolean expRecharge(CommandSender sender, CMIUser user, int rechargeAmount) {
        return false;
    }

    public static boolean expRecharge(CommandSender sender, CMIUser user, int rechargeAmount, boolean silent) {
        return false;
    }

    public static boolean moneyRecharge(CommandSender sender, CMIUser user, int rechargeAmount, boolean silent) {
        return false;
    }

    private enum Action {
        add, take, set, show, expcharge, moneycharge, recharge;

        public static Action getByName(String name) {
            return null;
        }
    }
}
