package com.Zrips.CMI.Modules.Selection;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.Container.CMICuboidArea;
import net.Zrips.CMILib.Container.CMIVector3D;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class Visualizer {
    private Player player = null;
    private long start = 0;
    private VisualizerPortion mainArea = null;
    private VisualizerPortion errorArea = null;
    private boolean once = false;
    private int starting = 0;
    private Location loc = null;

    public Visualizer(Player player) {
    }

    public void cancelAll() {
    }

    public boolean isSameLoc() {
        return false;
    }

    public long getStart() {
        return 0;
    }

    public void setStart(long start) {
    }

    public Player getPlayer() {
        return null;
    }

    public void setPlayer(Player player) {
    }

    public List<CMICuboidArea> getAreas() {
        return null;
    }

    public void setAreas(CMICuboidArea[] areas) {
    }

    public void setAreas(ArrayList<CMICuboidArea> areas) {
    }

    public void setAreas(CMICuboidArea area) {
    }

    public List<CMICuboidArea> getErrorAreas() {
        return null;
    }

    public void setErrorAreas(CMICuboidArea[] errorAreas) {
    }

    public void setErrorAreas(ArrayList<CMICuboidArea> errorAreas) {
    }

    public void setErrorAreas(CMICuboidArea errorArea) {
    }

    public CMITask getTask() {
        return null;
    }

    public void setTask(CMITask id) {
    }

    public CMITask getErrorTask() {
        return null;
    }

    public void setErrorTask(CMITask errorId) {
    }

    public boolean isOnce() {
        return false;
    }

    public void setOnce(boolean once) {
    }

    public List<CMIVector3D> getLocations() {
        return null;
    }

    public void setLocations(List<CMIVector3D> locations) {
    }

    public List<CMIVector3D> getLocations2() {
        return null;
    }

    public void setLocations2(List<CMIVector3D> locations) {
    }

    public List<CMIVector3D> getErrorLocations() {
        return null;
    }

    public void setErrorLocations(List<CMIVector3D> errorLocations) {
    }

    public List<CMIVector3D> getErrorLocations2() {
        return null;
    }

    public void setErrorLocations2(List<CMIVector3D> errorLocations) {
    }

    public Location getLoc() {
        return null;
    }

    public void setLoc(Location loc) {
    }

    public int getStarting() {
        return 0;
    }

    public void setStarting(int starting) {
    }

    public VisualizerPortion getMainArea() {
        return null;
    }

    public VisualizerPortion getErrorArea() {
        return null;
    }
}
