package com.Zrips.CMI.Modules.Holograms.Events;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.CMIInteractType;
import com.Zrips.CMI.Modules.Holograms.CMIHologram;
import com.Zrips.CMI.Modules.Holograms.CMIHologramLine;
import com.Zrips.CMI.Modules.Holograms.CMIHologramLinePortion;
import com.Zrips.CMI.events.CMIPlayerCancellableEvent;

import net.Zrips.CMILib.Container.CMIVector3D;

public final class CMIHologramClickEvent extends CMIPlayerCancellableEvent {
    private CMIHologram hologram = null;
    private int line = 0;
    private CMIVector3D pos = null;
    private CMIInteractType actionType = null;
    private CMIHologramLine hoveringLineObject = null;
    private CMIHologramLinePortion hoveringLinePortion = null;

    public CMIHologramClickEvent(Player player, CMIHologram holo, CMIHologramLine hoveringLineObject, CMIHologramLinePortion hoveringLinePortion, int line, CMIVector3D pos,
            CMIInteractType actionType) {
        super(player);
    }

    public CMIHologram getHologram() {
        return null;
    }

    public int getLineNumber() {
        return 0;
    }

    public CMIVector3D getPos() {
        return null;
    }

    public CMIInteractType getActionType() {
        return null;
    }

    public CMIHologramLine getHoveringLineObject() {
        return null;
    }

    public CMIHologramLinePortion getHoveringLinePortion() {
        return null;
    }
}
