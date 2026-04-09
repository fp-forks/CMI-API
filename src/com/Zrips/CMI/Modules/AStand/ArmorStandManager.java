package com.Zrips.CMI.Modules.AStand;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.GUI.CMIGui;

public class ArmorStandManager {
    private CMI plugin = null;
    private static ConcurrentHashMap<UUID, CMIArmorStandEdit> editByPlayer = null;
    private LinkedHashMap<String, ArmorStandSave> savedArmorStands = null;
    public static final String savedArmorStandLabel = null;
    public static boolean ArmorStandsCheckBlockPlace = false;
    public static boolean TemplatesSpecificPermission = false;
    private static double ArmorStandsMinScale = 0.0;
    private static double ArmorStandsMaxScale = 0.0;

    public ArmorStandManager(CMI plugin) {
    }

    public void loadConfig(ConfigReader cfg) {
    }

    public Entity getLast(Player player) {
        return null;
    }

    public void removeEditor(Player player) {
    }

    public CMIArmorStandEdit getEditor(Player player) {
        return null;
    }

    public CMIArmorStandEdit addEditor(Player player, Entity ent) {
        return null;
    }

    public void addEditor(CMIArmorStandEdit edit) {
    }

    public void removeEditorWithDelay(UUID uuid) {
    }

    public void disableWithDelay(UUID uuid) {
    }

    public boolean isBeingEditedBy(UUID editor, UUID uuid) {
        return false;
    }

    public boolean isBeingEdited(UUID uuid) {
        return false;
    }

    public UUID getEditorOf(UUID uuid) {
        return null;
    }

    public boolean isTooFar(Player player, Entity ent) {
        return false;
    }

    @Deprecated
    public static void duplicate(ArmorStand source, ArmorStand target, Set<armorStandActions> copy) {
    }

    @Deprecated
    public static void duplicateExtra(ArmorStand source, ArmorStand target, Set<armorStandExtraActions> copy) {
    }

    @Deprecated
    public boolean openEditor(Player player, Entity ent, boolean checkInteraction) {
        return false;
    }

    @Deprecated
    public boolean openSaveWindow(Player player, Entity ent) {
        return false;
    }

    @Deprecated
    public boolean openPositionEditor(Player player, Entity ent) {
        return false;
    }

    @Deprecated
    public boolean isOk(CMIGui gui) {
        return false;
    }

    public boolean canInteract(Player player, Entity ent, boolean checkInteraction) {
        return false;
    }

    @Deprecated
    public void changeAngle(CMIGui gui, armorStandActions apose, armorStandPoseC coord, int value) {
    }

    @Deprecated
    public void changeAngle(ArmorStand armor, Player player, armorStandActions apose, armorStandPoseC coord, int value) {
    }

    @Deprecated
    public void switchArmorStandArms(CMIGui gui) {
    }

    @Deprecated
    public void updateArmorStandItems(CMIGui gui) {
    }

    public ArmorStandSave getSavedArmorStand(String name) {
        return null;
    }

    public void save() {
    }

    public void load() {
    }

    public HashMap<String, ArmorStandSave> getSavedArmorStands() {
        return null;
    }

    public void removeSavedArmorStand(String name) {
    }

    public void addSavedArmorStand(ArmorStandSave save) {
    }

    public static double getArmorStandsMinScale() {
        return 0.0;
    }

    public static double getArmorStandsMaxScale() {
        return 0.0;
    }

    public enum armorStandPoseC {
        x, y, z;
    }

    public enum armorStandExtraActions {
        updateitems, plate, size, visible, arms, gravity, glow, invulnerable, name, interactable, scale;

        public static armorStandExtraActions getByName(String name) {
            return null;
        }
    }

    public enum armorStandActions {
        head, body, torso, leftArm, rightArm, leftLeg, rightLeg, pos;

        public static armorStandActions getByName(String name) {
            return null;
        }
    }

    public enum armorStandSaveOptions {
        helmet,
        chest,
        offhand,
        mainhand,
        leggings,
        boots,
        name,
        body,
        plate,
        size,
        visible,
        arms,
        gravity,
        glow,
        invulnerable,
        interactable,
        scale,
        head(new Vector(-30, -50, -30), new Vector(30, 50, 30)),
        torso(new Vector(-5, -20, -5), new Vector(5, 20, 5)),
        leftArm(new Vector(-160, -35, -150), new Vector(20, 40, 5), new Vector(-10.0, 0.0, -10.0)),
        rightArm(new Vector(-160, -40, -5), new Vector(20, 35, 150), new Vector(-14.99, 0.0, 10.0)),
        leftLeg(new Vector(-85, -10, -35), new Vector(25, 10, 5), new Vector(-1.0, 0.0, -1.0)),
        rightLeg(new Vector(-85, -10, -5), new Vector(25, 10, 35), new Vector(1.0, 0.0, 1.0));

        private Vector defaults = null;
        private Vector min = null;
        private Vector max = null;

        armorStandSaveOptions() {
        }

        armorStandSaveOptions(Vector min, Vector max, Vector defaults) {
        }

        armorStandSaveOptions(Vector min, Vector max) {
        }

        public static armorStandSaveOptions getByName(String name) {
            return null;
        }

        public Vector getDefault() {
            return null;
        }

        public Vector getMin() {
            return null;
        }

        public Vector getMax() {
            return null;
        }
    }

    public enum armorStandEditorSlots {
        helmet(11), chest(20), offhand(21), mainhand(19), leggings(29), boots(38);

        private int slot = 0;

        armorStandEditorSlots(int slot) {
        }

        public int getSlot() {
            return 0;
        }

        public static armorStandEditorSlots getBySlot(int slot) {
            return null;
        }
    }
}
