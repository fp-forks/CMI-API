package com.Zrips.CMI.Containers;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMILeaderboard<T extends Number & Comparable<T>> {
    private final Map<UUID, T> balances = null;
    private volatile List<Map.Entry<UUID, T>> sorted = null;
    private volatile Map<UUID, Integer> rankMap = null;
    private final AtomicBoolean dirty = null;
    private final AtomicBoolean running = null;
    private CMITask task = null;
    private boolean calculateTotal = false;
    private volatile T total = null;

    public CMILeaderboard(long ticksPeriod) {
        this(ticksPeriod, false);
    }

    public CMILeaderboard(long ticksPeriod, boolean calculateTotal) {
    }

    public void setValue(UUID id, T amount) {
    }

    public Map.Entry<UUID, T> getByPlace(int place) {
        return null;
    }

    public UUID getUUIDByPlace(int place) {
        return null;
    }

    public T getValueByPlace(int place) {
        return null;
    }

    public T getValue(UUID id) {
        return null;
    }

    public Map<UUID, T> getValues() {
        return null;
    }

    public List<Map.Entry<UUID, T>> getTop(int n) {
        return null;
    }

    public List<Map.Entry<UUID, T>> getRange(int from, int to) {
        return null;
    }

    public int countSince(long cutoff) {
        return 0;
    }

    public int getRank(UUID id) {
        return 0;
    }

    public int getRecordCount() {
        return 0;
    }

    public CompletableFuture<T> rebuild() {
        return null;
    }

    protected void onRebuildComplete(T total) {
    }

    public void shutdown() {
    }

    public boolean isCalculateTotal() {
        return false;
    }

    public void setCalculateTotal(boolean calculateTotal) {
    }
}
