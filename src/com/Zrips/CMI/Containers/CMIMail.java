package com.Zrips.CMI.Containers;

import org.bukkit.command.CommandSender;

public class CMIMail {
    private static long mailExpiresIn = 0;
    private static long mailToAllxpiresIn = 0;
    private static int maxMail = 0;
    private static String consoleMailSender = null;

    public static void loadConfig() {
    }

    public static long getMailExpiresInMS() {
        return 0;
    }

    public static long getMailToAllExpirationMS() {
        return 0;
    }

    public static int getMaxMail() {
        return 0;
    }

    public static String getConsoleMailSender() {
        return null;
    }

    public static String getSendersName(CommandSender sender) {
        return null;
    }
}
