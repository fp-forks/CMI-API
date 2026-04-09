package com.Zrips.CMI.Modules.SpawnerCharge;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;

import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.CMIUser;

public class SpawnerChargeManager {
    private LinkedHashMap<String, SCharges> map = null;
    private Integer total = null;
    private HashMap<UUID, PlayerCharge> spawnerCharges = null;
    private boolean SpawnersSupportDisabled = false;
    private double SpawnersBreakBaseDropChance = 0.0;
    private long SpawnersStopDroppingAfter = 0;
    private boolean SpawnersStopDroppingEnabled = false;
    private boolean SpawnersStopDroppingLinear = false;
    private boolean SpawnersXpDrop = false;
    private boolean SpawnersBreakEnabled = false;
    private boolean SpawnersCustomName = false;
    private boolean SpawnersIntoInventory = false;
    private boolean SpawnersPlaceEnabled = false;
    private boolean SpawnersPlaceRequiresPermission = false;
    private boolean SpawnersBreakRequiresExactPermission = false;
    private boolean SpawnersPlaceRequiresExactPermission = false;
    private boolean SpawnerEggInteractRequiresPermission = false;
    private boolean TrialSpawnerEggInteractRequiresPermission = false;
    private int SpawnersBreakSilkTouchLevel = 0;
    private boolean SpawnerDropFromTnt = false;
    private int SpawnerDropChanceTnt = 0;
    private boolean SpawnerDropFromCreeper = false;
    private int SpawnerDropChanceCreeper = 0;
    private boolean ChargesUse = false;
    private boolean ChargesBreakWithoutCharge = false;
    private boolean SpawnersProximityUse = false;
    private int SpawnersProximityRange = 0;

    public void loadConfig() {
    }

    public PlayerCharge getPCharge(CMIUser user, boolean update) {
        return null;
    }

    public void addCharge(SCharges charge) {
    }

    public SCharges getCharge(String name) {
        return null;
    }

    public SCharges getCharge(Player player) {
        return null;
    }

    public boolean changeSpawnerType(Block block, EntityType type) {
        return false;
    }

    @Deprecated
    public void openSpawnerPickerUI(Player player) {
    }

    public void openSpawnerPickerUI(Player player, int page) {
    }

    @Deprecated
    public int getSpawnerDropChance(Player player, Block block) {
        return 0;
    }

    public double getDropChance(Player player, Block block) {
        return 0.0;
    }

    public int getSpawnersStopDroppingAfter(Player player) {
        return 0;
    }

    public boolean isSpawnersSupportDisabled() {
        return false;
    }

    public boolean isSpawnersXpDrop() {
        return false;
    }

    public boolean isSpawnersEggInteractRequiresPermission() {
        return false;
    }

    public boolean isTrialSpawnersEggInteractRequiresPermission() {
        return false;
    }

    public boolean isSpawnersPlaceRequiresExactPermission() {
        return false;
    }

    public boolean isSpawnersPlaceRequiresPermission() {
        return false;
    }

    public boolean isSpawnersPlaceEnabled() {
        return false;
    }

    public boolean isSpawnerDropFromCreeper() {
        return false;
    }

    public int getSpawnerDropChanceCreeper() {
        return 0;
    }

    public boolean isSpawnersBreakEnabled() {
        return false;
    }

    public boolean isSpawnersIntoInventory() {
        return false;
    }

    public int getSpawnerDropChanceTnt() {
        return 0;
    }

    public boolean isSpawnerDropFromTnt() {
        return false;
    }

    public boolean isChargesUse() {
        return false;
    }

    public boolean isChargesBreakWithoutCharge() {
        return false;
    }

    public boolean isSpawnersProximityUse() {
        return false;
    }

    public int getSpawnersProximityRange() {
        return 0;
    }

    public boolean isSpawnersCustomName() {
        return false;
    }
}
