package com.Zrips.CMI.events;

import org.bukkit.Chunk;
import org.bukkit.entity.Player;

public class CMIChunkChangeEvent extends CMIPlayerCancellableEvent {
    private Chunk oldChunk = null;
    private Chunk newChunk = null;

    public CMIChunkChangeEvent(Player player, Chunk oldChunk, Chunk newChunk) {
        super(player);
    }

    public Chunk getOldChunk() {
        return null;
    }

    public Chunk getNewChunk() {
        return null;
    }
}
