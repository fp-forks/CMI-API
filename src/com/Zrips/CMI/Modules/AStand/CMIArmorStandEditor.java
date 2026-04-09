package com.Zrips.CMI.Modules.AStand;

import java.util.Set;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.AStand.ArmorStandManager.armorStandActions;
import com.Zrips.CMI.Modules.AStand.ArmorStandManager.armorStandExtraActions;
import com.Zrips.CMI.Modules.AStand.ArmorStandManager.armorStandPoseC;

import net.Zrips.CMILib.GUI.CMIGui;

public class CMIArmorStandEditor {
    public static boolean openCopyWindow(Player player, ArmorStand armor) {
        return false;
    }

    public static boolean openSaveWindow(Player player, Entity ent) {
        return false;
    }

    public static boolean openEditor(Player player, Entity ent, boolean checkInteraction) {
        return false;
    }

    public static boolean isOk(CMIGui gui) {
        return false;
    }

    public static void duplicate(ArmorStand source, ArmorStand target, Set<armorStandActions> copy) {
    }

    public static void duplicateExtra(ArmorStand source, ArmorStand target, Set<armorStandExtraActions> copy) {
    }

    public static boolean openPositionEditor(Player player, Entity ent) {
        return false;
    }

    public static void changeAngle(CMIGui gui, armorStandActions apose, armorStandPoseC coord, int value) {
    }

    public static void changeAngle(ArmorStand armor, Player player, armorStandActions apose, armorStandPoseC coord, int value) {
    }

    public static void switchArmorStandArms(CMIGui gui) {
    }

    public static void updateArmorStandItems(CMIGui gui) {
    }
}
