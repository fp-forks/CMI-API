package com.Zrips.CMI.Modules.Holograms;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.bukkit.entity.Player;

import net.Zrips.CMILib.Container.CMIPlane;
import net.Zrips.CMILib.Container.CMIVector3D;

public class CMIHologramHoverModule {
    private final CMIHologram hologramBase = null;

    public CMIHologramHoverModule(CMIHologram hologram) {
    }

    public CompletableFuture<Void> checkHoverPosition(UUID uuid) {
        return null;
    }

    public CompletableFuture<Void> checkHoverPosition(UUID uuid, boolean ignoreRange) {
        return null;
    }

    protected List<CMIVector3D> getLocation(Player player, int parts, CMIPlane plane) {
        return null;
    }
}
