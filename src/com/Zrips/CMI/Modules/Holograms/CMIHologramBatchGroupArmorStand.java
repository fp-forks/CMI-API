package com.Zrips.CMI.Modules.Holograms;

import org.bukkit.entity.Player;

import net.Zrips.CMILib.Container.CMILocation;

public class CMIHologramBatchGroupArmorStand extends CMIHologramBatchGroup {
    private FakeEntityInfo display = null;

    public CMIHologramBatchGroupArmorStand(FakeEntityInfo display, CMIHologramLineBase line) {
        super(line);
    }

    public FakeEntityInfo getDisplay() {
        return null;
    }

    public void setDisplay(FakeEntityInfo display) {
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
