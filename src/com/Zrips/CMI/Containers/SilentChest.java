package com.Zrips.CMI.Containers;

import java.util.concurrent.CompletableFuture;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class SilentChest {
    private Player player = null;
    private Inventory inv = null;
    private Inventory sourceInventory = null;
    private Location loc = null;
    private boolean editing = false;
    private CompletableFuture<Void> task = null;

    public SilentChest(Player player, Inventory inv, Location loc) {
    }

    public Player getPlayer() {
        return null;
    }

    public Inventory getInv() {
        return null;
    }

    public Location getLocation() {
        return null;
    }

    public void setEditing(boolean state) {
    }

    public boolean isEditing() {
        return false;
    }

    public Inventory getSourceInventory() {
        return null;
    }

    public void setSourceInventory(Inventory sourceInventory) {
    }

    public CompletableFuture<Void> getTask() {
        return null;
    }

    public void setTask(CompletableFuture<Void> completableFuture) {
    }
}
