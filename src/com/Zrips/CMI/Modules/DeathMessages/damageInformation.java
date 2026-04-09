package com.Zrips.CMI.Modules.DeathMessages;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.UUID;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.ItemStack;

public class damageInformation {
    private static HashMap<UUID, TreeMap<Long, damageInformation>> cache = null;
    private Entity ent = null;
    private double damage = 0.0;
    private ItemStack item = null;
    private DamageCause cause = null;
    private long time = 0;
    private Block block = null;

    public static void cacheClear(UUID uuid) {
    }

    public static TreeMap<Long, damageInformation> getLastDamage(UUID uuid) {
        return null;
    }

    public static TreeMap<Long, damageInformation> addLastDamage(UUID uuid, damageInformation lastDamage) {
        return null;
    }

    public static damageInformation getLastDamage(UUID uuid, damageInformation comparison) {
        return null;
    }

    public void reset() {
    }

    public Entity getEnt() {
        return null;
    }

    public void setEnt(Entity ent) {
    }

    public double getDamage() {
        return 0.0;
    }

    public void setDamage(double damage) {
    }

    public ItemStack getItem() {
        return null;
    }

    public void setItem(ItemStack item) {
    }

    public DamageCause getCause() {
        return null;
    }

    public void setCause(DamageCause cause) {
    }

    public Long getTime() {
        return null;
    }

    public void setTime(Long time) {
    }

    public void setTime() {
    }

    public Block getBlock() {
        return null;
    }

    public void setBlock(Block block) {
    }
}
