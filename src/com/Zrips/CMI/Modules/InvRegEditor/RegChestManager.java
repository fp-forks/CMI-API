package com.Zrips.CMI.Modules.InvRegEditor;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.GUI.CMIGui;

public class RegChestManager {
    private HashMap<UUID, CMIInvSee> watcherList = null;
    private HashMap<UUID, CMIInvSee> slaveList = null;
    private static final int HELMET_SLOT = 0;
    private static final int LEGGINGS_SLOT = 0;
    private static final int CHESTPLATE_SLOT = 0;
    private static final int BOOTS_SLOT = 0;
    private static final int OFFHAND_SLOT = 0;
    private static final int CURSOR_SLOT = 0;
    private CMI plugin = null;

    public RegChestManager(CMI plugin) {
    }

    public boolean isWatching(Player player) {
        return false;
    }

    public CMIInvSee getInformation(Player player) {
        return null;
    }

    public void remove(Player player) {
    }

    public CMIInvSee removeWatcher(Player player) {
        return null;
    }

    public CMIInvSee removeSlave(Player player) {
        return null;
    }

    public boolean isSlave(Player player) {
        return false;
    }

    public boolean openInventory(Player watcher, Player target) {
        return false;
    }

    public void tempLockWatcher(Player target) {
    }

    public void recheckPlayerInventory(Player target) {
    }

    public CMIGui createGui(Player watcher, Player target) {
        return null;
    }

    enum sectionType {
        inventory, armor, offhand, cursor, crafting;
    }
}
