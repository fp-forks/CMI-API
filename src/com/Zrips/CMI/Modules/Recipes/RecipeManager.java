package com.Zrips.CMI.Modules.Recipes;

import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Recipes.CMIRecipe;
import net.Zrips.CMILib.Recipes.CMIRecipeCraftData;
import net.Zrips.CMILib.Recipes.CMIRecipeIngredient;
import net.Zrips.CMILib.Recipes.CMIRecipeType;

public class RecipeManager {
    private CMI plugin = null;
    private boolean RecipesRequireBackwards = false;
    private boolean Recipes4Sized = false;
    private HashMap<String, Recipe> disabledRecipes = null;
    private Integer GUIRecipeResultSlot = null;
    private HashMap<String, CMIRecipe> recipes = null;
    private HashMap<Recipe, CMIRecipe> recipesMap = null;
    public String fileName = null;

    public RecipeManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public boolean isCustom(Recipe recipe) {
        return false;
    }

    public CMIRecipe getByKey(String identificator) {
        return null;
    }

    public boolean removeRecipe(CMIRecipe recipe) {
        return false;
    }

    public Recipe addRecipe(CMIRecipeType type, ItemStack result, HashMap<Integer, CMIRecipeIngredient> Recipe) {
        return null;
    }

    public Recipe addRecipe(CMIRecipeType type, ItemStack result, HashMap<Integer, CMIRecipeIngredient> Recipe, CMIRecipeCraftData temp) {
        return null;
    }

    public Recipe addRecipe(CMIRecipeType type, ItemStack result, HashMap<Integer, CMIRecipeIngredient> Recipe, CMIRecipeCraftData temp, String customKey) {
        return null;
    }

    @Deprecated
    public Recipe addRecipe(CMIRecipeType type, Recipe recipe) {
        return null;
    }

    public Recipe addRecipe(CMIRecipeType type, Recipe recipe, CMIRecipeCraftData data) {
        return null;
    }

    public Recipe addRecipe(CMIRecipeType type, Recipe recipe, CMIRecipeCraftData data, String customKey) {
        return null;
    }

    public Recipe exist(Recipe recipe) {
        return null;
    }

    public Recipe getRecipe(HashMap<Integer, ItemStack> ingredients) {
        return null;
    }

    public void save() {
    }

    public void load() {
    }

    public Integer getGUIRecipeResultSlot() {
        return null;
    }

    public HashMap<String, CMIRecipe> getCustomRecipes() {
        return null;
    }

    @Deprecated
    public List<CMIRecipe> getRecipes() {
        return null;
    }

    @Deprecated
    public void setRecipes(List<CMIRecipe> recipes) {
    }

    public Boolean openRecipeUI(Player player, CMIItemStack cm, int page) {
        return null;
    }

    public Boolean openOnlyCustomRecipeUI(Player player, int page) {
        return null;
    }

    public Boolean openRecipeUI(Player player, CMIItemStack cm, int page, boolean onlyCustom) {
        return null;
    }

    @Deprecated
    public Boolean openRecipeUI(Player player, CMIItemStack cm, int page, List<Recipe> recipes) {
        return null;
    }

    public Boolean openRecipeUI(Player player, int page, List<Recipe> recipes) {
        return null;
    }

    public boolean isDisabled(Recipe r) {
        return false;
    }

    public boolean isRecipesRequireBackwards() {
        return false;
    }

    public boolean isRecipes4Sized() {
        return false;
    }
}
