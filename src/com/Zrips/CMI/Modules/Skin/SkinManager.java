package com.Zrips.CMI.Modules.Skin;

import java.lang.reflect.Method;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Nullable;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;

public class SkinManager {
    public ConcurrentHashMap<UUID, CMISkin> skinCacheByUUID = null;
    public ConcurrentHashMap<String, CMISkin> skinCacheByName = null;
    CMI plugin = null;
    private boolean SteveOnOff = false;
    private boolean AutoApply = false;
    private boolean RequireSpecificPerm = false;
    private long SkinUpdateTimer = 0;
    private long SkinRequestFrequency = 0;
    static Method getProperties = null;
    boolean saving = false;
    private String fileName = null;

    public SkinManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public void removeSkinFromCache(String playerName) {
    }

    // Use applySkinAsync
    @Deprecated
    public boolean applySkin(Player player, String playerName) {
        return false;
    }

    public CompletableFuture<Boolean> applySkinAsync(Player player, String playerName) {
        return null;
    }

    public CompletableFuture<Boolean> applySkinAsync(Player player, UUID uuid) {
        return null;
    }

    // use applySkinAsync
    @Deprecated
    public boolean applySkin(Player player, UUID uuid) {
        return false;
    }

    public CompletableFuture<Boolean> setSkinAsync(GameProfile profile, UUID uuid) {
        return null;
    }

    // Use setSkinAsync
    @Deprecated
    public boolean setSkin(GameProfile profile, UUID uuid) {
        return false;
    }

    @Nullable
    public static PropertyMap getPropertyMap(GameProfile profile) {
        return null;
    }

    @Deprecated
    public CMISkin getSkin(String name) {
        return null;
    }

    public void save(CMISkin skin) {
    }

    public void load() {
    }

    public boolean isSteveOnOff() {
        return false;
    }

    public void setSteveOnOff(boolean steveOnOff) {
    }

    public boolean isRequireSpecificPerm() {
        return false;
    }

    public void setRequireSpecificPerm(boolean requireSpecificPerm) {
    }

    public boolean isAutoApply() {
        return false;
    }

    public long getSkinUpdateTimer() {
        return 0;
    }
}
