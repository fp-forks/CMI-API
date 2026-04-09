package com.Zrips.CMI.Modules.Holograms;

import com.Zrips.CMI.Modules.Holograms.Settings.CMIHologramTextSettings;

public class CMIHologramLineDynamicText extends CMIHologramLineStaticText {
    public CMIHologramLineDynamicText(CMIHologramTextSettings settings, String text) {
        super(settings, text);
    }

    @Override
    public CMIHologramLineDynamicText clone() {
        return null;
    }
}
