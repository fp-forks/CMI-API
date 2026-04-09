package com.Zrips.CMI.utils;

import java.io.File;

import org.bukkit.command.CommandSender;

public class EssentialsConverter {
    static int totalToConvert = 0;
    static int converted = 0;
    static int lastBatch = 0;
    static boolean done = false;
    static File ff = null;

    public EssentialsConverter() {
    }

    public static void convert(CommandSender sender, importSettings is) {
    }

    public static void convertUsers(CommandSender sender, importSettings is) {
    }

    public enum importType {
        homes, warps, nickname, logoutlocation, money, mail;
    }
}
