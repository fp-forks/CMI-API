package com.Zrips.CMI.Modules.Teleportations;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class TeleportManager {
    private CMI plugin = null;
    private TreeMap<UUID, Set<TpInfo>> tpRequests = null;
    private TreeMap<UUID, Set<TpInfo>> blockedRequests = null;
    private boolean SafeLocationDownThenUp = false;
    private int defaultTeleportInvulnerability = 0;
    private HashMap<String, Integer> TeleportInvulnerability = null;
    private boolean DisableInvOnBlockBreakPlace = false;
    private boolean DisableInvOnInteraction = false;
    private boolean TeleportSwitchPlaces = false;
    private boolean TpaCurrentLoc = false;
    private boolean TpahereCurrentLoc = false;
    private int TeleportJumpDefault = 0;
    private int TeleportTpaTime = 0;
    private int TeleportTpaWarmup = 0;
    private boolean TeleportTpaMove = false;
    private int TeleportTpaBlock = 0;
    private boolean TeleportDenyConfirm = false;
    private int TeleportTpaMaxDistance = 0;
    private int TeleportTpaHereMaxDistance = 0;
    private int TeleportTpBypass = 0;
    private int BackMinDistance = 0;
    private boolean BackWithWE = false;
    private List<String> BackBlackList = null;
    private List<String> DBackBlackList = null;
    private int BackExpiration = 0;
    private int DeathBackExpiration = 0;
    private HashMap<TpAction, Boolean> BlackListedItemsEnabledFor = null;
    private HashMap<Material, Integer> blockedItems = null;

    public TeleportManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public void clearRequests(Player player) {
    }

    public void addTpBlock(Player whoAccepts, TpInfo ti) {
    }

    public boolean isBlockedRequest(Player whoOffers, Player whoAccepts, TpAction action) {
        return false;
    }

    public long getBlockTime(Player whoOffers, Player whoAccepts, TpAction action) {
        return 0;
    }

    public boolean addTpRequest(Player whoOffers, Player whoAccepts, TpAction action) {
        return false;
    }

    public boolean addTpRequest(Player whoOffers, Player whoAccepts, TpAction action, boolean currentLoc) {
        return false;
    }

    public boolean removeTpRequest(Player whoOffers, Player whoAccepts) {
        return false;
    }

    public boolean isAlreadyInRequest(Player whoOffers, Player whoAccepts, TpAction action) {
        return false;
    }

    @Deprecated
    public TpInfo getTeleportInfo(Player whoAccepts, Player whoOffers) {
        return null;
    }

    public TpInfo getTeleportInfo(Player whoAccepts, Player whoOffers, TpAction action) {
        return null;
    }

    public TreeMap<UUID, Set<TpInfo>> getTeleportRequests() {
        return null;
    }

    public Set<TpInfo> getTeleportRequests(UUID uuid) {
        return null;
    }

    public TreeMap<UUID, Set<TpInfo>> getBlockedRequests() {
        return null;
    }

    public Set<TpInfo> getBlockedRequests(UUID uuid) {
        return null;
    }

    public HashMap<Material, Integer> getBlockedItems() {
        return null;
    }

    public Boolean isBlackListedItemsEnabledFor(TpAction action) {
        return null;
    }

    public boolean isSwitchTeleportPlaces() {
        return false;
    }

    public int getTpaWarmupTime() {
        return 0;
    }

    public boolean isTpaMove() {
        return false;
    }

    public boolean isTpaCurrentLoc() {
        return false;
    }

    public boolean isTpahereCurrentLoc() {
        return false;
    }

    public int getJumpDefaultDistance() {
        return 0;
    }

    public int getBackMinDistance() {
        return 0;
    }

    public boolean isSafeLocationDownThenUp() {
        return false;
    }

    public void setSafeLocationDownThenUp(boolean safeLocationDownThenUp) {
    }

    public List<String> getBackBlackList() {
        return null;
    }

    public List<String> getDBackBlackList() {
        return null;
    }

    public int getTpaMaxDistance() {
        return 0;
    }

    public int getTpaHereMaxDistance() {
        return 0;
    }

    public int getInvulnerabilityTime() {
        return 0;
    }

    public int getInvulnerabilityTime(World world) {
        return 0;
    }

    public int getInvulnerabilityTime(String world) {
        return 0;
    }

    public boolean isDisbleInvulnerabilityOnBlockBreakPlace() {
        return false;
    }

    public boolean isDisbleInvulnerabilityOnInteract() {
        return false;
    }

    public boolean isDenyConfirm() {
        return false;
    }

    public int getTpBypassTime() {
        return 0;
    }

    public boolean isBackWithWE() {
        return false;
    }

    public int getTpaTime() {
        return 0;
    }

    public int getBackExpiration() {
        return 0;
    }

    public int getDeathBackExpiration() {
        return 0;
    }

    public enum TpAction {
        tpa, tpahere, tpaall, tp, warp, home, spawn;

        public static TpAction get(String name) {
            return null;
        }
    }
}
