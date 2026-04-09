package com.Zrips.CMI.utils;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.FixChunkInfo;

public class ChunkFix {
    public Pattern regionPattern = null;
    public ConcurrentHashMap<String, FixChunkInfo> ChunkFix = null;
    private CMI plugin = null;

    public ChunkFix(CMI plugin) {
    }

    public void loadRegionFile(FixChunkInfo scan) {
    }
}
