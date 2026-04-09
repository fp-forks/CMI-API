package com.Zrips.CMI.Modules.LightFix;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import com.Zrips.CMI.CMI;

public class LightFix {
    public ConcurrentHashMap<UUID, LightFixInfo> LFInfo = null;
    private CMI plugin = null;

    public LightFix(CMI plugin) {
    }

    public void start(LightFixInfo scan) {
    }
}
