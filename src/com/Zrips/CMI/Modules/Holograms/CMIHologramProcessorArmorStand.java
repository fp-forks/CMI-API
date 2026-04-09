package com.Zrips.CMI.Modules.Holograms;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class CMIHologramProcessorArmorStand extends CMIHologramProcessor {
    public CMIHologramProcessorArmorStand(CMIHologram impl) {
        super(impl);
    }

    @Override
    void onPageChange(UUID uuid) {
    }

    @Override
    public CompletableFuture<Void> updateBillboard(UUID uuid, Set<CMIHologramUpdateType> typesList) {
        return null;
    }
}
