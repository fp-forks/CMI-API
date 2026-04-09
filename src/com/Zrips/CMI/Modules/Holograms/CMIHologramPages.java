package com.Zrips.CMI.Modules.Holograms;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import javax.annotation.Nullable;

import org.bukkit.entity.Player;

public class CMIHologramPages {
    private static Pattern pagePatern = null;
    private CMIHologram hologram = null;
    private List<String> lines = null;
    private ConcurrentHashMap<Integer, CMIHologramPage> pages = null;

    public CMIHologramPages(CMIHologram hologram) {
    }

    public void clear() {
    }

    public ConcurrentHashMap<Integer, CMIHologramPage> getPages() {
        return null;
    }

    public void setPages(ConcurrentHashMap<Integer, CMIHologramPage> pages) {
    }

    public CMIHologramPage getPage(int page) {
        return null;
    }

    @Nullable
    public CMIHologramPage getPlayerPage(Player player) {
        return null;
    }

    @Nullable
    public CMIHologramPage getPlayerPage(UUID uuid) {
        return null;
    }

    public List<CMIHologramLine> getLinesByPlayerPage(UUID uuid) {
        return null;
    }

    public void addPage(int page, CMIHologramPage pageData) {
    }

    public synchronized void setLines(List<String> l) {
    }

    public void addLine(String line) {
    }

    public void setLine(int place, String line) {
    }

    public void removeLine(int line) {
    }

    public List<String> getLines() {
        return null;
    }

    public void recheckLines() {
    }

    public double getHeight() {
        return 0.0;
    }

    public void goToNextPage(Player player) {
    }

    public void goToNextPage(UUID uuid) {
    }

    public void goToNextPageAuto(UUID uuid) {
    }

    public void goToPrevPage(Player player) {
    }

    public void goToPrevPage(UUID uuid) {
    }

    public void goToPage(UUID uuid, int page) {
    }

    public int getPageCount() {
        return 0;
    }
}
