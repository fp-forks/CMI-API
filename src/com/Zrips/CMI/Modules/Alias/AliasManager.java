package com.Zrips.CMI.Modules.Alias;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CommandAlias;
import com.Zrips.CMI.Containers.CommandAliasType;

public class AliasManager {
    private CMI plugin = null;
    public LinkedHashMap<String, CommandAlias> defaultAliases = null;
    public LinkedHashMap<String, CommandAlias> customAliases = null;
    private Map<String, CommandAlias> allCached = null;
    public HashMap<String, CommandAlias> fromAliases = null;
    private volatile boolean dirtyCache = false;
    public static String nonExactAliasSuffix = null;
    private static final int MAX_CACHE_SIZE = 0;
    private static Map<String, CommandAlias> cache = null;
    private static Map<String, List<CommandAlias>> cacheListed = null;
    public static Pattern patern = null;
    List<String> CommentList = null;
    List<String> temp = null;
    private String fileName = null;

    public AliasManager(CMI plugin) {
    }

    public void clearCache() {
    }

    public CommandAlias getAliasForCommand(String msg) {
        return null;
    }

    public List<CommandAlias> getAliasStartingWith(String msg) {
        return null;
    }

    public List<CommandAlias> getAliasStartingWith(String msg, CommandAliasType type) {
        return null;
    }

    public void addDefault(CommandAlias ca) {
    }

    public void addCustom(CommandAlias ca) {
    }

    public void removeCustom(String command) {
    }

    public void removeCustom(CommandAlias ca) {
    }

    public LinkedHashMap<String, CommandAlias> getCustom() {
        return null;
    }

    public LinkedHashMap<String, CommandAlias> getDefaultAlias() {
        return null;
    }

    public Map<String, CommandAlias> getAll() {
        return null;
    }

    public HashMap<String, CommandAlias> getFrom() {
        return null;
    }

    public void save() {
    }

    public List<String> updateCommands(CommandAlias alias, List<String> args, List<String> commands) {
        return null;
    }

    public void fullLoad() {
    }

    public void load() {
    }

    public void loadRegularAlias() {
    }

    public void saveNew() {
    }

    public void saveNew(String fileName) {
    }
}
