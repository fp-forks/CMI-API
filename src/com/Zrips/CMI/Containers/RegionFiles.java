package com.Zrips.CMI.Containers;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RegionFiles {
    private static final int SECTOR_BYTES = 0;
    private static final int SECTOR_INTS = 0;
    private RandomAccessFile file = null;
    private final int[] offsets = null;

    public RegionFiles(File path) {
    }

    public boolean hasChunk(int x, int z) {
        return false;
    }

    public void close() throws IOException {
    }
}
