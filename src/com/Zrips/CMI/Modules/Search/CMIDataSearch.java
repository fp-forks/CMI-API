package com.Zrips.CMI.Modules.Search;

import java.util.List;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.Containers.CMIFileAppender;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIDataSearch {
    protected List<SearchTypeBase> searchingFor = null;
    private CommandSender sender = null;
    boolean purge = false;
    protected CMITask task = null;
    protected long totalToCheck = 0;
    private int totalChecked = 0;
    protected double searchSpeed = 0.0;
    protected int totalFound = 0;
    protected long lastInformed = 0;
    protected CMIFileAppender appender = null;

    public CMIDataSearch(CommandSender sender) {
    }

    public CommandSender getInitiator() {
        return null;
    }

    public List<SearchTypeBase> getSearchingFor() {
        return null;
    }

    public long getTotalToCheck() {
        return 0;
    }

    protected void addChecked() {
    }

    public int getTotalChecked() {
        return 0;
    }

    public void addSearchingFor(SearchTypeBase searchingFor) {
    }

    public boolean isPurge() {
        return false;
    }

    public void setPurge(boolean state) {
    }

    public void onCycle(int cyclesDone) {
    }

    public void onFinish() {
    }

    public int getTotalFound() {
        return 0;
    }

    public boolean isRunning() {
        return false;
    }

    protected void createFileAppender(String prefix) {
    }

    public void search() {
    }

    protected void initSearch() {
    }

    public void cancel() {
    }
}
