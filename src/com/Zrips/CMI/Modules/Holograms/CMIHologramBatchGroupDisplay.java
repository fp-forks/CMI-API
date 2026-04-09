package com.Zrips.CMI.Modules.Holograms;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Display.CMIDisplay;

import net.Zrips.CMILib.Container.CMILocation;

public class CMIHologramBatchGroupDisplay extends CMIHologramBatchGroup {
    private CMIDisplay display = null;

    public CMIHologramBatchGroupDisplay(CMIDisplay display, CMIHologramLineBase line) {
        super(line);
    }

    public CMIDisplay getDisplay() {
        return null;
    }

    public void setDisplay(CMIDisplay display) {
    }

    @Override
    public void destroy(Player player) {
    }

    @Override
    public void show(Player player) {
    }

    @Override
    public void setLocation(CMILocation loc) {
    }

    @Override
    public void update(Player player) {
    }
}
