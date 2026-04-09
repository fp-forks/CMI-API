package com.Zrips.CMI.Containers;

import java.util.regex.Matcher;

import com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule;

public class CMICustomLogInOutMessages {
    private static boolean loginNameFilterUse = false;
    private static boolean logoutNameFilterUse = false;
    private static boolean loginDisabled = false;
    private static boolean logoutDisabled = false;
    private static boolean loginCustomUse = false;
    private static boolean logoutCustomUse = false;
    private static boolean logoutServerSwitch = false;
    private static boolean loginServerSwitch = false;
    private static boolean firstJoinMessageUse = false;
    private static int logoutAutoHideFrom = 0;
    private static int loginAutoHideFrom = 0;
    private static ChatFilterRule loginLogoutNameFilter = null;

    public static void loadConfig() {
    }

    public static int getLogoutAutoHideFrom() {
        return 0;
    }

    public static int getLoginAutoHideFrom() {
        return 0;
    }

    public static boolean isLogoutDisabled() {
        return false;
    }

    public static boolean isLogoutNameFilterUse() {
        return false;
    }

    public static Matcher matchLongLogoutNameFilter(String name) {
        return null;
    }

    public static boolean isLogoutCustomUse() {
        return false;
    }

    public static boolean isLogoutServerSwitch() {
        return false;
    }

    public static boolean isLoginDisabled() {
        return false;
    }

    public static boolean isLoginNameFilterUse() {
        return false;
    }

    public static boolean isLoginCustomUse() {
        return false;
    }

    public static boolean isLoginServerSwitch() {
        return false;
    }

    public static boolean isFirstJoinMessageUse() {
        return false;
    }
}
