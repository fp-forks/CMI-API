package com.Zrips.CMI.Modules.ReplaceBlock;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import com.Zrips.CMI.CMI;

@SuppressWarnings("deprecation")
public class ReplaceBlock {
    public Pattern regionPattern = null;
    public ConcurrentHashMap<String, BRInfo> BRInfo = null;
    private CMI plugin = null;

    public ReplaceBlock(CMI plugin) {
    }

    public void start(BRInfo scan) {
    }
}
