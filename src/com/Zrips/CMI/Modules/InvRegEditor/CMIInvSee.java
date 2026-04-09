package com.Zrips.CMI.Modules.InvRegEditor;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIInvSee {
    Player watcher = null;
    Player target = null;
    private ItemStack[] contents = null;
    private ItemStack[] armor = null;
    private ItemStack offHand = null;
    private ItemStack cursor = null;
    private CMITask task = null;
    private CMITask lockTask = null;
    private boolean tempLocked = false;

    public CMIInvSee(Player watcher, Player target) {
    }

    public Player getWatcher() {
        return null;
    }

    public CMIInvSee setWatcher(Player watcher) {
        return null;
    }

    public Player getTarget() {
        return null;
    }

    public CMIInvSee setTarget(Player target) {
        return null;
    }

    public void setTargetContents(ItemStack[] contents) {
    }

    public void setTargetArmorContents(ItemStack[] armor) {
    }

    public ItemStack[] getContents() {
        return null;
    }

    public ItemStack[] getArmorContents() {
        return null;
    }

    public void setOffHand(ItemStack offHand) {
    }

    public ItemStack getOffHand() {
        return null;
    }

    public ItemStack getCursor() {
        return null;
    }

    public void setCursor(ItemStack cursor) {
    }

    public void setTask(CMITask task) {
    }

    public CMITask getTask() {
        return null;
    }

    public boolean isTempLocked() {
        return false;
    }

    public void setTempLocked(boolean tempLocked) {
    }
}
