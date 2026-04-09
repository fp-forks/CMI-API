package com.Zrips.CMI.Modules.Particl;

import java.lang.reflect.Method;
import java.util.List;

import org.bukkit.Color;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.entity.Player;

public class CMIPEFireWork extends CMIPEAnimation {
    private static Method world_getHandle = null;
    private static Method nms_world_broadcastEntityEffect = null;
    private static Method firework_getHandle = null;
    private Color fadeFrom = null;
    private Color fadeTo = null;
    private Type type = null;
    private Boolean flicker = null;
    private Boolean trail = null;

    public CMIPEFireWork() {
        super();
    }

    @Override
    public boolean render(List<Player> players) {
        return false;
    }

    public Color getFadeFrom() {
        return null;
    }

    public void setFadeFrom(Color fadeFrom) {
    }

    public Color getFadeTo() {
        return null;
    }

    public void setFadeTo(Color fadeTo) {
    }

    public Type getType() {
        return null;
    }

    public void setType(Type type) {
    }

    public Boolean getFlicker() {
        return null;
    }

    public void setFlicker(Boolean flicker) {
    }

    public Boolean getTrail() {
        return null;
    }

    public void setTrail(Boolean trail) {
    }
}
