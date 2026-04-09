package com.Zrips.CMI.Modules.Holograms.Events;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Holograms.CMIHologram;
import com.Zrips.CMI.Modules.Holograms.CMIPlaneIntersection;
import com.Zrips.CMI.events.CMIPlayerEvent;

public final class CMIHologramStartHoverEvent extends CMIPlayerEvent {
    private CMIHologram hologram = null;
    private CMIPlaneIntersection pos = null;

    public CMIHologramStartHoverEvent(Player player, CMIHologram holo, CMIPlaneIntersection pos) {
        super(player, true);
    }

    public CMIHologram getHologram() {
        return null;
    }

    public CMIPlaneIntersection getPos() {
        return null;
    }
}
