package com.Zrips.CMI.Modules.AStand;

import java.util.Set;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.Modules.AStand.ArmorStandManager.armorStandSaveOptions;

public class ArmorStandSave {
    private Player player = null;
    private ArmorStand stand = null;
    private Set<armorStandSaveOptions> save = null;
    private String name = null;
    private String serialized = null;
    static String prefix = null;
    static String suffix = null;

    ArmorStandSave(Player player, ArmorStand stand, Set<armorStandSaveOptions> save) {
    }

    ArmorStandSave(String name, String serialized) {
    }

    public Player getPlayer() {
        return null;
    }

    public void setPlayer(Player player) {
    }

    public ArmorStand getStand() {
        return null;
    }

    public void setStand(ArmorStand stand) {
    }

    public Set<armorStandSaveOptions> getSaveOptions() {
        return null;
    }

    public String serialize() {
        return null;
    }

    public boolean apply(ArmorStand stand) {
        return false;
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
    }

    public String getSerialized() {
        return null;
    }

    public void setSerialized(String serialized) {
    }

    public ItemStack createItem() {
        return null;
    }
}
