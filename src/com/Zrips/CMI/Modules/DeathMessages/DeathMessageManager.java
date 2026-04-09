package com.Zrips.CMI.Modules.DeathMessages;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.annotation.Nonnull;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.RawMessages.RawMessage;

public class DeathMessageManager {
    private CMI plugin = null;
    HashMap<String, DeathMessages> messages = null;
    private List<String> playerHover = null;
    private List<String> killerHover = null;
    private List<String> disabledWorlds = null;
    private List<String> mutedWorlds = null;
    private List<String> ignoredPlayers = null;
    private String prefix = null;
    private long spamTimeRange = 0;
    private int spamCount = 0;
    private HashMap<UUID, List<Long>> spamProtection = null;
    private boolean enabled = false;
    private int autoHideFrom = 0;
    private int range = 0;
    private String destination = null;

    public DeathMessageManager(CMI plugin) {
    }

    public void relocateDeathMessageLocaleFiles() {
    }

    public void defaultLocaleDownloader() {
    }

    public void load() {
    }

    @Nonnull
    public String getDeathMessage(String path) {
        return null;
    }

    public boolean broadcastDeathMessage(Player player, RawMessage rm) {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }

    public int getAutoHideFrom() {
        return 0;
    }

    public List<String> getPlayerHover() {
        return null;
    }

    public List<String> getKillerHover() {
        return null;
    }

    public String getPrefix() {
        return null;
    }
}
