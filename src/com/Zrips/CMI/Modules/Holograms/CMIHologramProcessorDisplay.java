package com.Zrips.CMI.Modules.Holograms;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class CMIHologramProcessorDisplay extends CMIHologramProcessor {
    public CMIHologramProcessorDisplay(CMIHologram impl) {
        super(impl);
    }

    public CompletableFuture<Void> updateBillboard(UUID uuid, Set<CMIHologramUpdateType> typesList) {
        return null;
    }

    public synchronized void resetBoardCache() {
    }
}
