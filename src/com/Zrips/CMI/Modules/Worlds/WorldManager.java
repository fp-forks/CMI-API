package com.Zrips.CMI.Modules.Worlds;

import java.util.regex.Pattern;

import org.bukkit.scheduler.BukkitTask;

import com.Zrips.CMI.CMI;

public class WorldManager {
    private CMI plugin = null;
    public static Pattern regionPattern = null;
    BukkitTask task = null;

    public WorldManager(CMI plugin) {
    }
}
