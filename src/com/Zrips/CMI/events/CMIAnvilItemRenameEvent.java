package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CMIAnvilItemRenameEvent extends CMIPlayerCancellableEvent {
    private ItemStack itemFrom = null;
    private ItemStack itemTo = null;
    private int cost = 0;

    public CMIAnvilItemRenameEvent(Player player, ItemStack itemFrom, ItemStack itemTo, int cost) {
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

    public int getCost() {
        return 0;
    }
}
