package com.Zrips.CMI.Modules.SavedInv;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.Inventory;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class SavedInventoryManager {
    private ConcurrentHashMap<UUID, SavedInventories> map = null;
    private CMI plugin = null;
    private boolean restoreHP = false;
    private boolean restoreXP = false;
    private boolean restoreFood = false;
    private boolean restoreSaturation = false;
    private boolean restorePotions = false;
    private boolean restoreItems = false;
    private boolean SaveOnDeath = false;
    private boolean ignoreEmpty = false;
    private boolean SaveOnDeathRequiresPermission = false;
    private int SavedInventorys = 0;
    List<Material> blackListedMaterials = null;

    public SavedInventoryManager(CMI plugin) {
    }

    public SavedInventories removeCacheInventory(UUID uuid) {
        return null;
    }

    public void addInventory(CMIUser user, CMIInventory inventory) {
    }

    public void addInventory(CMIUser user, CMIInventory inventory, Integer id) {
    }

    public void addInventory(CMIUser user, CMIInventory inventory, boolean checkLimits) {
    }

    public void addInventory(CMIUser user, CMIInventory inventory, Integer id, boolean checkLimits) {
    }

    public CompletableFuture<CMIInventory> getInventoryById(CMIUser user, int id) {
        return null;
    }

    @Deprecated
    public CMIInventory getInvById(CMIUser user, int id) {
        return null;
    }

    @Deprecated
    public CMIInventory getFirstInv(CMIUser user) {
        return null;
    }

    @Deprecated
    public CMIInventory getFirstInv(SavedInventories inventories) {
        return null;
    }

    @Deprecated
    public CMIInventory getLastInv(CMIUser user) {
        return null;
    }

    public CompletableFuture<CMIInventory> getLastInventory(CMIUser user) {
        return null;
    }

    @Deprecated
    public CMIInventory getNextInv(CMIUser user, int id) {
        return null;
    }

    public CompletableFuture<CMIInventory> getNextInventory(CMIUser user, int id) {
        return null;
    }

    @Deprecated
    public CMIInventory getPrevInv(CMIUser user, int id) {
        return null;
    }

    public CompletableFuture<CMIInventory> getPrevInventory(CMIUser user, int id) {
        return null;
    }

    @Deprecated
    public SavedInventories getInventories(CMIUser user) {
        return null;
    }

    @Deprecated
    public void loadInventories(CMIUser user) {
    }

    @Deprecated
    public void loadInventories(CMIUser user, String invString) {
    }

    public CompletableFuture<SavedInventories> getUserInventories(CMIUser user) {
        return null;
    }

    public CompletableFuture<CMIInventory> loadUserInventories(CMIUser user) {
        return null;
    }

    public CompletableFuture<CMIInventory> loadUserInventories(CMIUser user, String invString) {
        return null;
    }

    @Deprecated
    public boolean saveAllInventories(UUID uuid) {
        return false;
    }

    public CompletableFuture<Boolean> saveUserInventories(UUID uuid) {
        return null;
    }

    @Deprecated
    public CMIInventory saveInv(Player player, Entity killer, DamageCause cause) {
        return null;
    }

    @Deprecated
    public CMIInventory saveInv(Player player, Entity killer, DamageCause cause, Integer id) {
        return null;
    }

    @Deprecated
    public CMIInventory saveInv(CMIInventory inv, Integer id) {
        return null;
    }

    public CompletableFuture<CMIInventory> saveInventory(CMIInventory inv, Integer id) {
        return null;
    }

    public CMIInventory generateCMIInventory(Player player, Entity killer, DamageCause cause) {
        return null;
    }

    public CMIInventory generateCMIInventory(CMIInventory cmiI, Entity killer, DamageCause cause) {
        return null;
    }

    @SuppressWarnings("unchecked")
    public CMIInventory generateInvFromMap(HashMap<String, Object> map) {
        return null;
    }

    public HashMap<String, Object> generateMapFromPlayerInv(CMIInventory inv) {
        return null;
    }

    public void updateCMIInventoryItems(Inventory top, CMIInventory inv) {
    }

    public void openSavedInv(Player player, CMIInventory inv, boolean preview) {
    }

    public void InvList(CommandSender sender, Player player) {
    }

    public void InvList(CommandSender sender, CMIUser user) {
    }

    @SuppressWarnings("deprecation")
    public boolean loadInv(CommandSender sender, CMIUser user, CMIInventory inv) {
        return false;
    }

    @Deprecated
    public boolean removeInventory(CMIUser user, int id) {
        return false;
    }

    public CompletableFuture<Boolean> removeUserInventory(CMIUser user, int id) {
        return null;
    }

    public int showTimer(Player player, int current, int found, int total, int skipped, int currentplace) {
        return 0;
    }

    public void loadConfig() {
    }

    public Boolean isSaveOnDeath() {
        return null;
    }

    public Boolean isSaveOnDeathRequiresPermission() {
        return null;
    }

    public int getMaxSavedInventorys() {
        return 0;
    }

    public ConcurrentHashMap<UUID, SavedInventories> getMap() {
        return null;
    }

    public void clearAll() {
    }
}
