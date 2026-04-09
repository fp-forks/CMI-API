package com.Zrips.CMI.Modules.Afk;

import java.util.HashMap;
import java.util.List;
import java.util.NavigableMap;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class AfkManager {
    private HashMap<CMIUser, Long> lastAction = null;
    private HashMap<UUID, AfkInfo> afkPlayersMap = null;
    private final NavigableMap<Integer, Long> afkKickTimers = null;
    private CMI plugin = null;
    private CMITask sched = null;
    private long awayTrigerTime = 0;
    private List<String> awayTrigerCommands = null;
    private List<String> manualAwayTrigerCommands = null;
    private List<String> manualLeaveCommands = null;
    private List<String> autoLeaveCommands = null;
    private long defaultKickTime = 0;
    private int AutoKickFromPlayerCount = 0;
    private long RepeatingAutoKickInterval = 0;
    private List<String> kickTrigerCommands = null;
    private List<String> disabledWorlds = null;
    private boolean AfkEnabled = false;
    private boolean PreventJumping = false;
    private boolean TitleMessage = false;
    private boolean SubTitleMessage = false;
    private boolean PreventDamage = false;
    private boolean PreventMobDamage = false;
    private boolean StopPlayTime = false;
    private int interval = 0;
    private boolean disableOnPublicChat = false;
    private boolean disableOnPrivateChat = false;
    private boolean disableOnInteract = false;
    private boolean SmartInteractCheck = false;
    private boolean AntiAfkMachines = false;
    private boolean DisableOnInventoryClick = false;
    private boolean DisableOnitemDrop = false;
    private boolean RepeatKickCommand = false;
    private boolean disableOnCommand = false;
    private boolean disableOnMove = false;
    private boolean disableOnLookAround = false;
    private boolean disableItemPickup = false;
    private boolean disableFishing = false;
    private boolean PreventMobSpawning = false;
    private boolean PreventMobSpawningNatural = false;
    private boolean PreventMobSpawningSpawners = false;
    private boolean PreventMobVillageDefence = false;
    private boolean PreventPushing = false;
    private boolean PreventHook = false;
    private boolean disableExpPickup = false;
    private boolean disableShulkerTargeting = false;
    int messageSize = 0;
    List<String> afkSubTitle = null;
    private CMITask afkSched = null;
    List<CMIUser> afkList = null;

    public AfkManager(CMI plugin) {
    }

    public long getClosestKickTime() {
        return 0;
    }

    public boolean isAfk(UUID uuid) {
        return false;
    }

    public AfkInfo getAfkInfo(UUID uuid) {
        return null;
    }

    public AfkInfo createAfkInfo(UUID uuid) {
        return null;
    }

    public void removeAfkInfo(UUID uuid) {
    }

    public void stop() {
    }

    public void loadConfig() {
    }

    public void showTitle(CMIUser user, boolean fade) {
    }

    public void hideTitle(CMIUser user) {
    }

    public void setUserToAfk(CMIUser user, List<String> cmds) {
    }

    public void removeUserFromAfk(CMIUser user, List<String> cmds) {
    }

    public void removeUser(CMIUser user) {
    }

    public void updateUser(CMIUser user) {
    }

    public void setLastAction(CMIUser user, long time) {
    }

    public Long getLastAction(CMIUser user) {
        return null;
    }

    public boolean isAfkEnabled() {
        return false;
    }

    public boolean isDisableOnMove() {
        return false;
    }

    public boolean isDisableOnFishing() {
        return false;
    }

    public boolean isDisableOnInteract() {
        return false;
    }

    public boolean isDisableOnInventoryClick() {
        return false;
    }

    public boolean isDisableOnCommand() {
        return false;
    }

    public boolean isDisableItemPickup() {
        return false;
    }

    public boolean isDisableOnPublicChat() {
        return false;
    }

    public boolean isDisableOnPrivateChat() {
        return false;
    }

    public List<String> getAwayTrigerCommands() {
        return null;
    }

    public void setAwayTrigerCommands(List<String> awayTrigerCommands) {
    }

    public boolean isPreventDamage() {
        return false;
    }

    public boolean isPreventMobDamage() {
        return false;
    }

    public boolean isPreventJumping() {
        return false;
    }

    @Deprecated
    public List<String> getLeaveTrigerCommands() {
        return null;
    }

    public List<String> getManualLeaveCommands() {
        return null;
    }

    public void setManualLeaveCommands(List<String> manualLeaveCommands) {
    }

    public List<String> getAutoLeaveCommands() {
        return null;
    }

    public void setAutoLeaveCommands(List<String> autoLeaveCommands) {
    }

    public boolean isSmartInteractCheck() {
        return false;
    }

    public boolean isAntiAfkMachines() {
        return false;
    }

    public int getCheckInterval() {
        return 0;
    }

    public boolean isStopPlayTime() {
        return false;
    }

    public void setStopPlayTime(boolean stopPlayTime) {
    }

    public void removeFromAfkTimePreventer(CMIUser user) {
    }

    public void AddToAfkTimePreventer(CMIUser user) {
    }

    public List<String> getManualAwayTrigerCommands() {
        return null;
    }

    public void setManualAwayTrigerCommands(List<String> manualAwayTrigerCommands) {
    }

    public long getAwayTrigerTime() {
        return 0;
    }

    public boolean nearActivePlayer(Location loc, SpawnReason reason) {
        return false;
    }

    public static Boolean isNear(Location loc1, Location loc2) {
        return null;
    }

    public boolean isDisableExpPickup() {
        return false;
    }

    public boolean isDisableShulkerTargeting() {
        return false;
    }

    public boolean isDisableOnItemDrop() {
        return false;
    }

    public boolean isDisabledWorld(World world) {
        return false;
    }

    public boolean isDisabledWorld(String name) {
        return false;
    }

    public boolean isPreventMobSpawning() {
        return false;
    }

    public boolean isPreventMobSpawningNatural() {
        return false;
    }

    public boolean isPreventMobSpawningSpawners() {
        return false;
    }

    public boolean isPreventMobVillageDefence() {
        return false;
    }

    public boolean isPreventPushing() {
        return false;
    }

    public Set<CMIUser> getAfkPlayers() {
        return null;
    }

    public HashMap<UUID, AfkInfo> getAfkPlayersMap() {
        return null;
    }

    public int getAfkPlayerCount() {
        return 0;
    }

    public boolean isDisableOnLookAround() {
        return false;
    }

    public boolean isPreventHook() {
        return false;
    }
}
