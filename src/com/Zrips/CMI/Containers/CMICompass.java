package com.Zrips.CMI.Containers;

import java.util.List;

public class CMICompass {
    private static boolean compassBossBar = false;
    private static boolean compassRequireCompass = false;
    private static boolean recoveryRequireCompass = false;
    private static boolean recoveryAsRegularCompass = false;
    private static int compassUpdateInterval = 0;
    private static String compassShape = null;
    private static String compassColor = null;
    private static String compassHomeIcon = null;
    private static String compassSpawnIcon = null;
    private static String compassDeathIcon = null;
    private static String compassTargetIcon = null;
    private static List<String> compassColors = null;
    private static boolean compassShowHome = false;
    private static boolean compassShowSpawn = false;
    private static boolean compassShowDeath = false;
    private static boolean compassShowCompass = false;

    public static void loadConfig() {
    }

    public static boolean isBossBarCompassEnabled() {
        return false;
    }

    public static boolean isCompassRequireCompass() {
        return false;
    }

    public static int getCompassUpdateInterval() {
        return 0;
    }

    public static String getCompassShape() {
        return null;
    }

    public static String getCompassColor() {
        return null;
    }

    public static String getCompassHomeIcon() {
        return null;
    }

    public static String getCompassSpawnIcon() {
        return null;
    }

    public static String getCompassDeathIcon() {
        return null;
    }

    public static String getCompassTargetIcon() {
        return null;
    }

    public static boolean isRecoveryRequireCompass() {
        return false;
    }

    public static boolean isRecoveryAsRegularCompass() {
        return false;
    }

    public static boolean isCompassShowHome() {
        return false;
    }

    public static boolean isCompassShowSpawn() {
        return false;
    }

    public static boolean isCompassShowDeath() {
        return false;
    }

    public static boolean isCompassShowCompass() {
        return false;
    }

    public static List<String> getCompassColors() {
        return null;
    }
}
