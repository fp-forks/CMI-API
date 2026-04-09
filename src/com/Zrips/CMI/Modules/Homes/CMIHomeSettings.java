package com.Zrips.CMI.Modules.Homes;

import org.jetbrains.annotations.Nullable;

import net.Zrips.CMILib.Items.CMIMaterial;

public class CMIHomeSettings {
    private boolean privateH = false;
    private boolean bed = false;
    private boolean fav = false;
    private int slot = 0;
    private CMIMaterial material = null;

    public boolean isPrivate() {
        return false;
    }

    public void setPrivate(boolean privateH) {
    }

    public boolean isBed() {
        return false;
    }

    public void setBed(boolean bed) {
    }

    public boolean isFav() {
        return false;
    }

    public void setFav(boolean fav) {
    }

    public int getSlot() {
        return 0;
    }

    public void setSlot(int slot) {
    }

    @Nullable
    public CMIMaterial getMaterial() {
        return null;
    }

    public void setMaterial(CMIMaterial material) {
    }
}
