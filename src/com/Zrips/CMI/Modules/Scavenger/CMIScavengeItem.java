package com.Zrips.CMI.Modules.Scavenger;

import java.util.List;
import java.util.Map;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

public class CMIScavengeItem {
    private ItemStack item = null;
    private Player player = null;
    private Map<Enchantment, Integer> enchants = null;
    int maxDurability = 0;
    int durability = 0;
    private int recipeResultAmount = 0;
    Recipe recipe = null;

    CMIScavengeItem(ItemStack item) {
        this(item, null);
    }

    CMIScavengeItem(ItemStack item, Player player) {
    }

    public boolean canScavenge() {
        return false;
    }

    public boolean isBlackListedItem() {
        return false;
    }

    public ItemStack getItem() {
        return null;
    }

    public Player getPlayer() {
        return null;
    }

    public void setPlayer(Player player) {
    }

    public Map<Enchantment, Integer> getEnchants() {
        return null;
    }

    public double getEnchantExtractionFailChance(Enchantment enchant) {
        return 0.0;
    }

    public double getExtractionCost() {
        return 0.0;
    }

    public double getIngredientReturnChance() {
        return 0.0;
    }

    public double getEnchantLevelLowerChance(Enchantment enchant) {
        return 0.0;
    }

    public double getItemBreakChance() {
        return 0.0;
    }

    public double getBreakChanceByItemDurability() {
        return 0.0;
    }

    public List<ItemStack> getIngredients() {
        return null;
    }

    public List<ItemStack> getIngredients(boolean checkDurability) {
        return null;
    }

    public List<ItemStack> getIngredients(boolean checkDurability, boolean considerEndResultAmount) {
        return null;
    }

    public double getLeftDurabilityPercentage() {
        return 0.0;
    }

    public List<ItemStack> enchantsToBooks() {
        return null;
    }

    public ItemStack createBook(Enchantment enchant) {
        return null;
    }

    public ItemStack createBook(Enchantment enchant, int level) {
        return null;
    }

    public int getRecipeResultAmount() {
        return 0;
    }
}
