package com.Zrips.CMI.Modules.ConsoleFilter;

import java.util.List;
import java.util.regex.Pattern;

import com.Zrips.CMI.CMI;

public class ConsoleFilterManager {
    private CMI plugin = null;
    private final List<CMIConsoleRecord> cache = null;
    private final int maxCapacity = 0;
    private boolean failed = false;
    static String regex = null;
    static Pattern pattern = null;

    public ConsoleFilterManager(CMI plugin) {
    }

    public synchronized void add(CMIConsoleRecord element) {
    }

    public synchronized CMIConsoleRecord get(int index) {
        return null;
    }

    public synchronized int size() {
        return 0;
    }

    public synchronized List<CMIConsoleRecord> getCachedMessages() {
        return null;
    }

    public void load() {
    }
}
