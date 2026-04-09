package com.Zrips.CMI.Modules.GeoIP;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.concurrent.ConcurrentHashMap;

public class LookupService {
    private RandomAccessFile file = null;
    private final File databaseFile = null;
    private static final Charset charset = null;
    private final CharsetDecoder charsetDecoder = null;
    ConcurrentHashMap<String, IPLocation> cache = null;
    private byte databaseType = 0;
    private int[] databaseSegments = null;
    private int recordLength = 0;
    private int dboptions = 0;
    private byte[] dbbuffer = null;
    private byte[] index_cache = null;
    private long mtime = 0;
    private static final int COUNTRY_BEGIN = 0;
    private static final int STATE_BEGIN_REV0 = 0;
    private static final int STATE_BEGIN_REV1 = 0;
    private static final int STRUCTURE_INFO_MAX_SIZE = 0;
    public static final int GEOIP_STANDARD = 0;
    public static final int GEOIP_MEMORY_CACHE = 0;
    public static final int GEOIP_CHECK_CACHE = 0;
    public static final int GEOIP_INDEX_CACHE = 0;
    public static final int GEOIP_UNKNOWN_SPEED = 0;
    public static final int GEOIP_DIALUP_SPEED = 0;
    public static final int GEOIP_CABLEDSL_SPEED = 0;
    public static final int GEOIP_CORPORATE_SPEED = 0;
    private static final int SEGMENT_RECORD_LENGTH = 0;
    private static final int STANDARD_RECORD_LENGTH = 0;
    private static final int ORG_RECORD_LENGTH = 0;
    private static final int MAX_RECORD_LENGTH = 0;
    private static final int FULL_RECORD_LENGTH = 0;
    private static final String[] countryCode = null;
    private static final String[] countryName = null;

    public LookupService(File databaseFile, int options) throws IOException {
    }

    public synchronized void close() {
    }

    synchronized void _check_mtime() {
    }

    public IPLocation getLocation(InetAddress addr) {
        return null;
    }

    public IPLocation getLocation(String str) {
        return null;
    }
}
