package com.Zrips.CMI.utils;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.OfflinePlayer;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class Purge {
    private CMITask purgeId = null;
    public boolean running = false;
    private CMI plugin = null;
    HashMap<PurgeType, Integer> map = null;
    private boolean CleanOnStart = false;
    private int OfflineDays = 0;
    private boolean PlayerDataEnabled = false;
    private String PlayerDataSourceFolder = null;
    private boolean PlayerDataDeleteFiles = false;
    private String PlayerDataDestinationFolder = null;
    private boolean PlayerStatsEnabled = false;
    private String PlayerStatsSourceFolder = null;
    private boolean PlayerStatsDeleteFiles = false;
    private String PlayerStatsDestinationFolder = null;
    private boolean PlayerAdvancementsEnabled = false;
    private String PlayerAdvancementsSourceFolder = null;
    private boolean PlayerAdvancementsDeleteFiles = false;
    private String PlayerAdvancementsDestinationFolder = null;
    private boolean EssentialsEnabled = false;
    private String EssentialsSourceFolder = null;
    private boolean EssentialsDeleteFiles = false;
    private String EssentialsDestinationFolder = null;
    private boolean LwcEnabled = false;
    private static OfflinePlayer[] offPlayers = null;
    private static int x = 0;
    private static int count = 0;

    public Purge(CMI plugin) {
    }

    public void loadConfig() {
    }

    public void initialize() {
    }

    public void StartingPurge() {
    }

    public boolean purgePlayerAdvancementsFiles(UUID uuid, boolean chekcIfEnabled) {
        return false;
    }

    public boolean purgePlayerDataFiles(UUID uuid, boolean chekcIfEnabled) {
        return false;
    }

    public boolean purgePlayerStatsFiles(UUID uuid, boolean chekcIfEnabled) {
        return false;
    }

    public void purgeEssentialsFiles(UUID uuid) {
    }

    public void purgeLWC(UUID uuid) {
    }

    public boolean isCleanOnStart() {
        return false;
    }

    public boolean isPlayerDataEnabled() {
        return false;
    }

    public boolean isPlayerStatsEnabled() {
        return false;
    }

    public enum PurgeType {
        PlayerData, PlayerStat, PlayerAdvancements, Essentials, Lwc;
    }
}
