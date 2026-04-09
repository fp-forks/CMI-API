package com.Zrips.CMI.Modules.Sheduler;

import java.util.HashMap;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class SchedulerManager {
    private HashMap<String, Schedule> map = null;
    private CMI plugin = null;
    private CMITask autoTimerBukkitId = null;
    public static final String randomPlayerLabel = null;
    private String fileName = null;
    private Runnable autoTimer = null;

    public SchedulerManager(CMI plugin) {
    }

    public Schedule getSchedule(String name) {
        return null;
    }

    public Schedule getSchedule(String name, boolean includeDisabled) {
        return null;
    }

    public void stop() {
    }

    @SuppressWarnings("unchecked")
    public void load() {
    }

    public int getActualWeekDay(int day) {
        return 0;
    }

    public HashMap<String, Schedule> getMap() {
        return null;
    }
}
