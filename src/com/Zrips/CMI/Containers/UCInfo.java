package com.Zrips.CMI.Containers;

import java.util.List;

import org.bukkit.Chunk;
import org.bukkit.command.CommandSender;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class UCInfo {
    private CMITask scheduleId = null;
    private int currentId = 0;
    private List<Chunk> chunks = null;
    private int chunksChecked = 0;
    private int chunksCkeckedLast = 0;
    private long showedInfo = 0;
    private boolean showInfo = false;
    private boolean autoSpeed = false;
    private boolean messages = false;
    private CommandSender sender = null;
    private String sendername = null;
    private int checked = 0;
    private int found = 0;
    private long startTime = 0;
    private int speed = 0;
    private boolean running = false;

    public UCInfo() {
    }

    public void setChunks(List<Chunk> chunks) {
    }

    public List<Chunk> getChunks() {
        return null;
    }

    public int getCurrentId() {
        return 0;
    }

    public void setCurrentId(int id) {
    }

    public void setChunksCkeckedLast(int chunksCkeckedLast) {
    }

    public int getChunksCkeckedLast() {
        return 0;
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

    public void addChunkCkecked() {
    }

    public int getChunkChecked() {
        return 0;
    }

    public void setAutoSpeed(boolean autoSpeed) {
    }

    public boolean isAutoSpeed() {
        return false;
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

    public void addFound() {
    }

    public int getFound() {
        return 0;
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

    public void addRegionChecked() {
    }

    public int getRegionChecked() {
        return 0;
    }

    public String getPlayerName() {
        return null;
    }

    public CommandSender getSender() {
        return null;
    }

    public void setSender(CommandSender sender) {
    }
}
