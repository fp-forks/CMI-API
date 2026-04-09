package com.Zrips.CMI.Modules.ReplaceBlock;

import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.itemInfo;
import com.Zrips.CMI.Modules.Region.WorldInfo;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class BRInfo {
    private CMITask task = null;
    private long showedInfo = 0;
    private boolean showInfo = false;
    private boolean autoSpeed = false;
    private boolean messages = false;
    private Player player = null;
    private String Playername = null;
    private long startTime = 0;
    private int speed = 0;
    private boolean running = false;
    private int y = 0;
    private long replaced = 0;
    List<itemInfo> itemIds = null;
    List<itemInfo> replaceIds = null;
    private double d = 0.0;
    private WorldInfo RI = null;

    public BRInfo() {
    }

    public void setY(int y) {
    }

    public int getY() {
        return 0;
    }

    public void addReplaced() {
    }

    public long getReplaced() {
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

    public void setShowInfo(boolean state) {
    }

    public boolean isShowInfo() {
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

    public String getPlayerName() {
        return null;
    }

    public Player getPlayer() {
        return null;
    }

    public void setPlayer(Player Player) {
    }

    public void addItemInfo(itemInfo info) {
    }

    public List<itemInfo> getItemInfo() {
        return null;
    }

    public void addReplaceInfo(itemInfo info) {
    }

    public List<itemInfo> getReplaceInfo() {
        return null;
    }

    public void setTotal(double d) {
    }

    public double getTotal() {
        return 0.0;
    }

    public WorldInfo getRI() {
        return null;
    }

    public void setRI(WorldInfo rI) {
    }
}
