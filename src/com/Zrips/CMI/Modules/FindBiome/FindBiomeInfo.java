package com.Zrips.CMI.Modules.FindBiome;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Region.WorldInfo;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class FindBiomeInfo {
    private CMITask task = null;
    private long showedInfo = 0;
    private boolean showInfo = false;
    private boolean messages = false;
    private Player player = null;
    private long startTime = 0;
    private int speed = 0;
    private boolean running = false;
    private WorldInfo RI = null;
    private int currentId = 0;
    private String biome = null;
    private int skipped = 0;

    public FindBiomeInfo(Player player, String biome) {
    }

    public int getCurrentId() {
        return 0;
    }

    public void setCurrentId(int id) {
    }

    public void setScheduleTask(CMITask task) {
    }

    public CMITask getScheduleTask() {
        return null;
    }

    public void setShowInfo(long time) {
    }

    public long getShowInfo() {
        return 0;
    }

    public void setMessages(boolean messages) {
    }

    public boolean isMessages() {
        return false;
    }

    public void setShowRegionInfo(boolean state) {
    }

    public boolean isShowRegionInfo() {
        return false;
    }

    public void setSpeed(int speed) {
    }

    public int getSpeed() {
        return 0;
    }

    public void setRunning(boolean state) {
    }

    public boolean isRunning() {
        return false;
    }

    public void setStartTime() {
    }

    public long getStartTime() {
        return 0;
    }

    public Player getPlayer() {
        return null;
    }

    public void setPlayer(Player Player) {
    }

    public WorldInfo getRI() {
        return null;
    }

    public void setRI(WorldInfo RI) {
    }

    public String getBiome() {
        return null;
    }

    public void setBiome(String biome) {
    }

    public int getSkipped() {
        return 0;
    }

    public void addSkipped() {
    }

    public void setSkipped(int skipped) {
    }
}
