package com.Zrips.CMI.Modules.Holograms;

import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Display.CMIBlockDisplay;
import com.Zrips.CMI.Modules.Display.CMIDisplay;

public class CMIHologramBatchDisplay extends CMIHologramBatch {
    private ConcurrentHashMap<Integer, CMIDisplay> displays = null;
    private ConcurrentHashMap<Integer, CMIHologramBatchGroup> icons = null;
    private CMIBlockDisplay board = null;

    public ConcurrentHashMap<Integer, CMIDisplay> getDisplays() {
        return null;
    }

    public CMIDisplay getFrontDisplay() {
        return null;
    }

    public CMIDisplay getBackDisplay() {
        return null;
    }

    public CMIDisplay getDisplay(int side) {
        return null;
    }

    public void addDisplay(int side, CMIDisplay display) {
    }

    public void addFrontDisplay(CMIDisplay display) {
    }

    public void addBackDisplay(CMIDisplay display) {
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

    public void destroyBoard(Player player) {
    }

    @Override
    public void destroy(Player player) {
    }

    public CMIBlockDisplay getBoard() {
        return null;
    }

    public void setBoard(CMIBlockDisplay board) {
    }
}
