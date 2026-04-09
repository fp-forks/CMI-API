package com.Zrips.CMI.Modules.Search;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.World;
import org.jetbrains.annotations.NotNull;

import net.Zrips.CMILib.Container.CMIVectorInt3D;

public class CMIDataResultLocationBase extends CMIDataResultBase {
    private CMIVectorInt3D vector = null;
    private int amount = 0;
    protected UUID uuid = null;
    private boolean checked = false;

    public CMIDataResultLocationBase(CMIVectorInt3D vector, int amount) {
        super();
    }

    @NotNull
    public UUID getUUID() {
        return null;
    }

    public int getAmount() {
        return 0;
    }

    public CMIDataResultLocationBase addAmount(int amount) {
        return null;
    }

    @NotNull
    public CMIVectorInt3D getVector() {
        return null;
    }

    @NotNull
    public Location getLocation(World world) {
        return null;
    }

    public String getValueOutput() {
        return null;
    }

    public boolean isChecked() {
        return false;
    }

    public void setChecked(boolean checked) {
    }
}
