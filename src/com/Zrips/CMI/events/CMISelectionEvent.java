package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Portals.CuboidArea;

public class CMISelectionEvent extends CMIPlayerEvent {
    private CuboidArea area = null;

    public CMISelectionEvent(Player player, CuboidArea area) {
        super(player);
    }

    public CuboidArea getArea() {
        return null;
    }

    public void setArea(CuboidArea area) {
    }
}
