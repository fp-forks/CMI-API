package com.Zrips.CMI.Modules.Display;

import org.bukkit.Location;
import org.bukkit.util.Transformation;

public class CMIInteractionEntity extends CMIDisplay {
    public CMIInteractionEntity(Location loc) {
        super(CMIDisplayType.Interaction, loc);
    }

    @Override
    public void setWidth(double width) {
    }

    @Override
    public void setHeight(double height) {
    }

    @Override
    public Transformation getTransformation() {
        return null;
    }
}
