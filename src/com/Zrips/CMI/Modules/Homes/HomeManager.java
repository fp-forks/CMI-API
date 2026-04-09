package com.Zrips.CMI.Modules.Homes;

import java.util.HashMap;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Items.CMIItemStack;

public class HomeManager {
    private CMI plugin = null;
    HashMap<String, Integer> homeGroups = null;
    private HashMap<String, HomeWorldLimit> homeLimits = null;
    private boolean checkBlockbreak = false;
    private boolean pickRealBlock = false;
    private boolean homesWorldLimits = false;
    private boolean confirmation = false;
    private String defaultHomeName = null;
    private String defaultBedHomeName = null;
    private String homeNameRegex = null;
    private int respawnImmortality = 0;
    private int HomesMaxGuiSlots = 0;
    private boolean HomesGui = false;
    private boolean HomesGuiComplex = false;
    private boolean guiExpanded = false;
    private CMIItemStack guiBorder = null;
    private CMIItemStack guiInfill = null;
    private boolean guiInfoButton = false;
    private int guiInfoButtonSlot = 0;
    private CMIItemStack guiInfoButtonItem = null;
    private List<String> guiInfoButtonCommands = null;
    private boolean guiCloseButton = false;
    private int guiCloseButtonSlot = 0;
    private CMIItemStack guiCloseButtonItem = null;
    private List<String> guiCloseButtonCommands = null;
    private boolean guiBedButton = false;
    private int guiBedButtonSlot = 0;
    private CMIItemStack guiBedButtonItem = null;
    private boolean guiHomeButton = false;
    private int guiHomeButtonSlot = 0;
    private CMIItemStack guiHomeButtonItem = null;
    private boolean guiDeathButton = false;
    private boolean guiBackButton = false;
    private int guiDeathButtonSlot = 0;
    private CMIItemStack guiDeathButtonItem = null;
    private int guiBackButtonSlot = 0;
    private CMIItemStack guiBackButtonItem = null;
    private int guiPrevButtonSlot = 0;
    private int guiMiddleButtonSlot = 0;
    private int guiNextButtonSlot = 0;
    private boolean homesBedInteraction = false;
    private boolean onlyShiftBed = false;
    private boolean removeBedLocationOnBedBreak = false;
    private HashMap<String, List<String>> ReSpawnPriorityOrder = null;
    private HashMap<String, HashMap<CMIUser, CmiHome>> bedHomes = null;
    private boolean limitsBlockExtra = false;
    private boolean limitsNotifyOnLogin = false;

    public HomeManager(CMI plugin) {
    }

    public void addHomeGroup(String group, int amount) {
    }

    public boolean canUseHomes(CommandSender sender) {
        return false;
    }

    public int getMaxHomes(CommandSender sender) {
        return 0;
    }

    public int getMaxHomes(Player player) {
        return 0;
    }

    public void loadConfig() {
    }

    public boolean isHomesBedInteraction() {
        return false;
    }

    public Location getReSpawnLocation(Player player) {
        return null;
    }

    public Location getReSpawnLocation(Player player, Location respawnLoc) {
        return null;
    }

    public boolean isCheckBlockbreak() {
        return false;
    }

    public String getDefaultHomeName() {
        return null;
    }

    public String getDefaultBedHomeName() {
        return null;
    }

    public HashMap<String, HashMap<CMIUser, CmiHome>> getBedHomes() {
        return null;
    }

    public void addBedHome(CMIUser user, CmiHome bedHome) {
    }

    public boolean removeBedHome(Location loc) {
        return false;
    }

    public boolean isRemoveBedLocationOnBedBreak() {
        return false;
    }

    public boolean openHomeGui(Player player, CMIUser user, int page) {
        return false;
    }

    public boolean openComplexHomeGui(Player player, CMIUser user, int page) {
        return false;
    }

    public boolean openSimpleHomeGui(Player player, CMIUser user, int page) {
        return false;
    }

    public boolean isHomesGui() {
        return false;
    }

    public int getRespawnImmortality() {
        return 0;
    }

    public String getHomeNameRegex() {
        return null;
    }

    public void setHomeNameRegex(String homeNameRegex) {
    }

    public boolean isPickRealBlock() {
        return false;
    }

    public boolean isOnlyShiftBed() {
        return false;
    }

    public boolean isConfirmation() {
        return false;
    }

    public boolean isHomesWorldLimits() {
        return false;
    }

    public void setHomesWorldLimits(boolean homesWorldLimits) {
    }

    public int getWorldLimit(String worldName) {
        return 0;
    }

    public HomeWorldLimit getWorldLimitObject(String worldName) {
        return null;
    }

    public boolean isHomesGuiComplex() {
        return false;
    }

    public int getGuiCloseButtonSlot() {
        return 0;
    }

    public CMIItemStack getGuiCloseButtonItem() {
        return null;
    }

    public int getHomesMaxGuiSlots() {
        return 0;
    }

    public boolean isLimitsBlockExtra() {
        return false;
    }

    public boolean isLimitsNotifyOnLogin() {
        return false;
    }

    public enum RespawnPriority {
        anchor, bedLocation, spawn, homeLocation, worldSpawn;

        public static RespawnPriority getByName(String name) {
            return null;
        }

        public static List<String> getAsStringList() {
            return null;
        }

        public static String getAsString() {
            return null;
        }
    }
}
