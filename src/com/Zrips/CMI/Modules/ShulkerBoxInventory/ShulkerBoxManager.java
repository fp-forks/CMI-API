package com.Zrips.CMI.Modules.ShulkerBoxInventory;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class ShulkerBoxManager {
    public static final String identifier = null;
    HashMap<UUID, ShulkerInv> map = null;
    private final static ConcurrentHashMap<UUID, Long> lastMove = null;
    private CMI plugin = null;
    private boolean RequirePermission = false;
    private boolean PreventInCombat = false;
    private double CostToOpen = 0.0;
    CMITask task = null;

    public ShulkerBoxManager(CMI plugin) {
    }

    public static void recordMove(Player player) {
    }

    public long getLastMove(UUID uuid) {
        return 0;
    }

    public static void removeMove(Player player) {
    }

    public boolean canOpenShulkerBox(Player player) {
        return false;
    }

    public boolean stillHaveItem(Player player) {
        return false;
    }

    public void closeAll() {
    }

    public boolean isEditing(Player player) {
        return false;
    }

    public ShulkerInv getShulkerInvRecord(Player player) {
        return null;
    }

    public void loadConfig() {
    }

    public void openShulkerBox(Player player, ItemStack item) {
    }

    public void updateShulkerItem(Player player) {
    }

    public void remove(Player player) {
    }

    @Deprecated
    public boolean isShulkerBox(ItemStack OneItem) {
        return false;
    }

    @Deprecated
    public List<ItemStack> getShulkerBoxContents(ItemStack OneItem) {
        return null;
    }

    public void updateEntireShulkerInv(Player player, ItemStack[] cont) {
    }

    public void setShulkerInv(ItemStack shulkerBox, ItemStack[] cont) {
    }

    public boolean isRequirePermission() {
        return false;
    }
}
