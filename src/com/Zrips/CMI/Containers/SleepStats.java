package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.World;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class SleepStats {
    private World world = null;
    private int speed = 0;
    private double sleeping = 0.0;
    private double total = 0.0;
    private double percent = 0.0;
    private int online = 0;
    CMITask task = null;
    public static List<String> timeSpeedUpWorlds = null;
    private static boolean SleepingPercentage = false;
    public static boolean SleepingExcludeAfk = false;
    public static boolean SleepingSpeedup = false;
    public static boolean SleepingOnlyDurringNight = false;
    public static boolean SleepingInform = false;
    private static int SleepingBaseSpeed = 0;
    private static int SleepingMinBeforeSpeeding = 0;
    private static int SleepingMinSpeed = 0;
    public static int SleepingInformDelay = 0;
    public static int SleepingNightStartsAt = 0;
    public static String SleepingSpeedupInfoType = null;
    public static HashMap<UUID, Long> informMap = null;

    public SleepStats(World world) {
    }

    public static void loadConfig() {
    }

    public World getWorld() {
        return null;
    }

    public void setWorld(World world) {
    }

    public int getSpeed() {
        return 0;
    }

    public void setSpeed(int speed) {
    }

    public double getSleeping() {
        return 0.0;
    }

    public int needToBeSleeping() {
        return 0;
    }

    public void setSleeping(double sleeping) {
    }

    public double getTotal() {
        return 0.0;
    }

    public void setTotal(double total) {
    }

    public double getPercent() {
        return 0.0;
    }

    public void setPercent(double percent) {
    }

    public int getOnline() {
        return 0;
    }

    public int getWorldOnline() {
        return 0;
    }

    public void setOnline(int online) {
    }

    public void onBedEnter(Player player) {
    }

    public void onBedLeave(Player player) {
    }
}
