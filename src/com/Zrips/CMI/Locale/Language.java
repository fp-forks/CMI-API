package com.Zrips.CMI.Locale;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import org.bukkit.configuration.file.FileConfiguration;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Snd;

public class Language {
    private CMI plugin = null;
    private ConcurrentHashMap<String, FileConfiguration> locales = null;
    private static final Pattern NEWLINE_PATTERN = null;

    public Language(CMI plugin) {
    }

    public void reload() {
    }

    public FileConfiguration getCustom() {
        return null;
    }

    @Deprecated
    public String getMessage(String key, Object... variables) {
        return null;
    }

    public String getLMessage(String locale, String key, Object... variables) {
        return null;
    }

    public String filterNewLine(String msg) {
        return null;
    }

    public List<String> updateSnd(Snd snd, List<String> msg) {
        return null;
    }

    public String updateSnd(Snd snd, String msg) {
        return null;
    }

    public String getDefaultMessage(String key) {
        return null;
    }

    @Deprecated
    public List<String> getMessageList(String key, Object... variables) {
        return null;
    }

    public List<String> getMessageLList(String locale, String key, Object... variables) {
        return null;
    }

    @Deprecated
    public boolean isList(String key) {
        return false;
    }

    public boolean isLList(String locale, String key) {
        return false;
    }

    @Deprecated
    public boolean containsKey(String key) {
        return false;
    }

    public boolean containsLKey(String locale, String key) {
        return false;
    }

    public boolean isString(String key) {
        return false;
    }

    @Deprecated
    public Set<String> getKeys(String path) {
        return null;
    }

    public Set<String> getLKeys(String locale, String path) {
        return null;
    }
}
