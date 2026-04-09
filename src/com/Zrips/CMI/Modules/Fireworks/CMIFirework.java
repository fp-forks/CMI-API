package com.Zrips.CMI.Modules.Fireworks;

import java.util.Set;
import java.util.regex.Pattern;

import org.bukkit.FireworkEffect;

public class CMIFirework {
    int count = 0;
    int power = 0;
    boolean shootAtAngle = false;
    private Set<FireworkEffect> explosions = null;
    private static String prefix = null;
    private static String suffix = null;
    static Pattern p = null;
    static Pattern c = null;
    static Pattern ex = null;

    public CMIFirework() {
    }

    public CMIFirework(String text) {
    }
}
