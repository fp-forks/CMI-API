package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CMIAnvilItemRepairEvent extends CMIPlayerCancellableEvent {
    private ItemStack itemFrom = null;
    private ItemStack itemTo = null;
    private int repairCost = 0;

    public CMIAnvilItemRepairEvent(Player player, ItemStack itemFrom, ItemStack itemTo, int repairCost) {
        super(player);
    }

    public ItemStack getItemFrom() {
        return null;
    }

    public ItemStack getItemTo() {
        return null;
    }

    public void setItemTo(ItemStack itemTo) {
    }

    public int getRepairCost() {
        return 0;
    }
}
