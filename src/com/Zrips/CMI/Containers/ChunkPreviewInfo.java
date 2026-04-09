package com.Zrips.CMI.Containers;

import java.io.File;
import java.util.ArrayList;

import org.bukkit.World;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class ChunkPreviewInfo {
    private CMITask scheduleTask = null;
    private int currentId = 0;
    private File[] regionFiles = null;
    private ArrayList<ChunkInfo> chunks = null;
    private int chunksChecked = 0;
    private int chunksCkeckedLast = 0;
    private long showedInfo = 0;
    private boolean showInfo = false;
    private boolean autoSpeed = false;
    private boolean messages = false;
    private Player player = null;
    private String Playername = null;
    private int checked = 0;
    private World world = null;
    private int mcaX = 0;
    private int mcaZ = 0;
    private int cX = 0;
    private int cZ = 0;
    private int loaded = 0;
    private int found = 0;
    private long startTime = 0;
    private int speed = 0;
    private int range = 0;
    private boolean running = false;

    public ChunkPreviewInfo() {
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

    public void setRange(int range) {
    }

    public int getRange() {
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

    public void addChunks(ArrayList<ChunkInfo> chunks) {
    }

    public void addChunk(ChunkInfo chunk) {
    }

    public ArrayList<ChunkInfo> getChunks() {
        return null;
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

    public void addLoaded() {
    }

    public int getloaded() {
        return 0;
    }

    public void setX(int mcaX) {
    }

    public int getX() {
        return 0;
    }

    public void setZ(int mcaZ) {
    }

    public int getZ() {
        return 0;
    }

    public void setCX(int cX) {
    }

    public void addCX() {
    }

    public int getCX() {
        return 0;
    }

    public void setCZ(int cZ) {
    }

    public void addCZ() {
    }

    public int getCZ() {
        return 0;
    }

    public void addRegionChecked() {
    }

    public int getRegionChecked() {
        return 0;
    }

    public void setWorld(World world) {
    }

    public World getWorld() {
        return null;
    }

    public void setRegionFiles(File[] regionFiles) {
    }

    public File[] getRegionFiles() {
        return null;
    }

    public String getPlayerName() {
        return null;
    }

    public Player getPlayer() {
        return null;
    }

    public void setPlayer(Player Player) {
    }
}
