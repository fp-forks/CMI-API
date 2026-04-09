package com.Zrips.CMI.Modules.Holograms;

import java.util.function.Consumer;

import org.bukkit.entity.Player;

import net.Zrips.CMILib.Container.CMIVector2D;
import net.Zrips.CMILib.Container.CMIVector3D;

public class HologramGUIEditor {
    public static void openGui(Player player, CMIHologram holo) {
    }

    public static String formatName(String basePath, String secondary, String valuePath, Object... args) {
        return null;
    }

    public static void editAnimations(Player player, CMIHologram holo) {
    }

    public static void editInteractions(Player player, CMIHologram holo) {
    }

    public static void editLocation(Player player, CMIHologram holo) {
    }

    public static boolean openVectorEditor(Player player, CMIVector2D vector, double baseAmount, double resetTo, Consumer<CMIVector2D> consumer, Consumer<CMIVector2D> onModified) {
        return false;
    }

    public static boolean openVectorEditor(Player player, CMIVector3D vector, boolean includeZ, double baseAmount, double resetTo, Consumer<CMIVector3D> consumer, Consumer<CMIVector3D> onModified) {
        return false;
    }
}
