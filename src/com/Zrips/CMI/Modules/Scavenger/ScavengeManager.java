package com.Zrips.CMI.Modules.Scavenger;

import java.util.Set;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Items.CMIMaterial;

public class ScavengeManager {
    private CMI plugin = null;
    public static double baseBreakPercentage = 0.0;
    public static double eachBreakPercentage = 0.0;
    public static double eachBreakPercentageLevel = 0.0;
    public static double baseEnchantFailPercentage = 0.0;
    public static double levelEnchantFailPercentage = 0.0;
    public static double levelEnchantFailMaxChance = 0.0;
    public static double LowerLevelChanceBase = 0.0;
    public static double LowerLevelForEachLevel = 0.0;
    public static double LowerLevelMaxChance = 0.0;
    public static double itemBreakMaxBreakChance = 0.0;
    public static double EnchantBaseCost = 0.0;
    public static double EnchantBaseCostExtra = 0.0;
    public static double IngredientReturnBase = 0.0;
    public static boolean ItemMaterialDurabilityCheck = false;
    public static boolean InvertBlackList = false;
    public static boolean AllowItemPickups = false;
    public static boolean ResetRepairCost = false;
    public static boolean WithoutIngredients = false;
    public static double ItemBreakDurabilityChange = 0.0;
    public static Set<CMIMaterial> blackList = null;
    private static final int slotOfItem = 0;

    public ScavengeManager(CMI cmi) {
    }

    public void loadConfig() {
    }

    public void openExtractor(Player player) {
    }
}
