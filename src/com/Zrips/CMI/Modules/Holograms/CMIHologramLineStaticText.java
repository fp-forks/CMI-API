package com.Zrips.CMI.Modules.Holograms;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Holograms.Settings.CMIHologramTextSettings;

public class CMIHologramLineStaticText extends CMIHologramLineBase {
    protected boolean randomU = false;
    protected Float hue = null;
    protected boolean filler = false;
    private static final String fillerBaseString = null;
    CMIHologramTextSettings settings = null;

    public CMIHologramLineStaticText(CMIHologramTextSettings settings, String text) {
        super(text);
    }

    public CMIHologramLineStaticText() {
        super();
    }

    @Override
    public CMIHologramLineStaticText clone() {
        return null;
    }

    @Override
    public String getLineOutput(Player player) {
        return null;
    }
}
