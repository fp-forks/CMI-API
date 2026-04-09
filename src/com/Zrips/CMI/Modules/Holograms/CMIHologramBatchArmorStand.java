package com.Zrips.CMI.Modules.Holograms;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

public class CMIHologramBatchArmorStand extends CMIHologramBatch {
    private ArrayList<FakeEntityInfo> displays = null;
    private ConcurrentHashMap<Integer, CMIHologramBatchGroup> icons = null;

    public ArrayList<FakeEntityInfo> getDisplays() {
        return null;
    }

    public void addDisplay(int line, FakeEntityInfo display) {
    }

    @Override
    public void clear() {
    }

    public ConcurrentHashMap<Integer, CMIHologramBatchGroup> getIcons() {
        return null;
    }

    @Override
    public CMIHologramBatchGroup getIcon(int line) {
        return null;
    }

    @Override
    public void addIcon(int line, CMIHologramBatchGroup icon) {
    }

    @Override
    public void destroyIcons(Player player) {
    }

    @Override
    public void destroy(Player player) {
    }
}
