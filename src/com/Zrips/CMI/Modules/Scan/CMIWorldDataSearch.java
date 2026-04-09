package com.Zrips.CMI.Modules.Scan;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.util.Vector;

import com.Zrips.CMI.Modules.Search.CMIDataResultLocationBase;
import com.Zrips.CMI.Modules.Search.CMIDataSearch;

import net.Zrips.CMILib.Container.CMIVectorInt2D;

public class CMIWorldDataSearch extends CMIDataSearch {
    protected static CMIWorldDataSearch activeSearch = null;
    World world = null;
    CMIVectorInt2D center = null;
    int range = 0;
    int maxY = 0;
    int minY = 0;
    long skippedChunks = 0;
    private boolean startScan = false;
    boolean paused = false;
    CompletableFuture<CMIWorldChunksRanged> complete = null;
    private Map<UUID, CMIDataResultLocationBase> foundIn = null;
    private CMIWorldChunksRanged worldInformation = null;
    int chunksLoading = 0;

    public CMIWorldDataSearch(CommandSender sender, Location center, int range) {
        super(sender);
    }

    public CMIWorldDataSearch(CommandSender sender) {
        super(sender);
    }

    public void onDataLoadStart() {
    }

    public World getWorld() {
        return null;
    }

    public void setWorld(World world) {
    }

    public void setCenter(Chunk chunk) {
    }

    public long getSkippedChunks() {
        return 0;
    }

    public void setCenter(int x, int z) {
    }

    public CMIVectorInt2D getCenter() {
        return null;
    }

    public void setRange(int range) {
    }

    public int getRange() {
        return 0;
    }

    public static CMIWorldDataSearch getActiveSearch() {
        return null;
    }

    protected static void setActiveSearch(CMIWorldDataSearch newSearch) {
    }

    @Override
    public void search() {
    }

    @Override
    protected void initSearch() {
    }

    public void setPaused(boolean paused) {
    }

    public boolean isPaused() {
        return false;
    }

    public void onPauseChange() {
    }

    public static UUID locationToUUID(Vector vector) {
        return null;
    }

    public Map<UUID, CMIDataResultLocationBase> getSearchResults() {
        return null;
    }
}
