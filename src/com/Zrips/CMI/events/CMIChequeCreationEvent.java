package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CMIChequeCreationEvent extends CMIPlayerCancellableEvent {
    private ItemStack cheque = null;
    private double price = 0.0;

    public CMIChequeCreationEvent(Player player, ItemStack cheque, double price) {
        super(player);
    }

    public double getPrice() {
        return 0.0;
    }

    public void setPrice(double price) {
    }

    public ItemStack getCheque() {
        return null;
    }

    public void setCheque(ItemStack cheque) {
    }
}
