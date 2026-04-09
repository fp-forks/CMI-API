package com.Zrips.CMI.Modules.PlayerMeta;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class PlayerMeta {
    private static ConcurrentHashMap<UUID, PlayerMeta> cacheMap = null;
    private HashMap<String, metaValues> map = null;

    public PlayerMeta() {
    }

    public static PlayerMeta getMeta(UUID uuid) {
        return null;
    }

    public static PlayerMeta getMetaRaw(UUID uuid) {
        return null;
    }

    @Deprecated
    public void add(String key, String value, String defaultV) {
    }

    public void add(String key, String value) {
    }

    public void remove(String key) {
    }

    public String getValue(String key) {
        return null;
    }

    public boolean containsValues() {
        return false;
    }

    public HashMap<String, metaValues> getMap() {
        return null;
    }

    public HashMap<String, String> getMapForSave() {
        return null;
    }

    public class metaValues {
        private String value = null;

        public metaValues() {
        }

        public metaValues(String value) {
        }

        public String getValue() {
            return null;
        }

        public void setValue(String value) {
        }
    }
}
