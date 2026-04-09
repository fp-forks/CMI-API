package com.Zrips.CMI.utils;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMISunMover;
import com.Zrips.CMI.Containers.CMITimeRate;

import net.Zrips.CMILib.Time.TimeInfo;
import net.Zrips.CMILib.Time.timeState;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class TimeManager {
    double tPHour = 0.0;
    double tPMin = 0.0;
    double tPSec = 0.0;
    private HashMap<String, CMITask> daySchedID = null;
    private HashMap<String, HashMap<timeState, CMITimeRate>> dayTimeDurations = null;
    private Set<World> froozenWorlds = null;
    private CMI plugin = null;
    static int dayTime = 0;
    static int sunriseTime = 0;
    static int sunsetTime = 0;
    static int nightTime = 0;
    private List<String> worlds = null;
    private static SimpleDateFormat dateFormat = null;
    public static HashMap<World, CMISunMover> movingmap = null;
    private static long showTimer = 0;

    public TimeManager(CMI plugin) {
    }

    public List<String> getWorlds() {
        return null;
    }

    public void runTimer() {
    }

    public void loadConfig() {
    }

    public void stopDayTimer(World world) {
    }

    public void stopDayTimer(String worldName) {
    }

    public long setTime(World world, String time, boolean smooth) {
        return 0;
    }

    public long setPTime(Player player, String time, boolean smooth) {
        return 0;
    }

    public void cancelSunMove(World world) {
    }

    public void cancelSunMove(World world, boolean changeCycle) {
    }

    public void moveSun(World world, int interval, int updateInterval, int u, boolean boosBar) {
    }

    public long setTime(World world, TimeInfo tInfo, boolean smooth) {
        return 0;
    }

    public long setPTime(Player player, TimeInfo tInfo, boolean smooth) {
        return 0;
    }

    public boolean isFroozenWorld(World world) {
        return false;
    }

    public void addFroozenWorlds(World world) {
    }

    public void removeFroozenWorlds(World world) {
    }

    public static String to24hourAproximateShort(Long ticks, boolean trim) {
        return null;
    }
}
