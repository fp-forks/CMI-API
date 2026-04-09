package com.Zrips.CMI.Modules.Statistics;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.concurrent.CompletableFuture;

import org.bukkit.Statistic;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMILeaderboard;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class StatsManager {
    private CMI plugin = null;
    private static HashMap<String, CMIStatistic> cache = null;
    private CMITask autoTimerBukkitId = null;
    CMILeaderboard<Long> leaderboard = null;
    private CompletableFuture<Void> task = null;
    private boolean loaded = false;
    long lastUpdate = 0;
    private Runnable autoTimer = null;

    public StatsManager(CMI plugin) {
    }

    public void stop() {
    }

    public CMIStatistic getStatisticByName(String name) {
        return null;
    }

    public Statistic getStatistic(CMIStatistic type) {
        return null;
    }

    public synchronized boolean changeTo(Player player, CMIStatistic st, String extra, Long amount) {
        return false;
    }

    public boolean isScanning() {
        return false;
    }

    public boolean isDataLoaded() {
        return false;
    }

    public CMILeaderboard<Long> getLeaderboard() {
        return null;
    }

    @Deprecated
    public int getTotalCount() {
        return 0;
    }

    @Deprecated
    public int getPages() {
        return 0;
    }

    public void addUserData(CMIUser user) {
    }

    public Long getPlaytimeFromCache(CMIUser user) {
        return null;
    }

    @Deprecated
    public SortedMap<Long, CMIUser> getTop() {
        return null;
    }

    @Deprecated
    public synchronized SortedMap<Long, CMIUser> getTop(int count) {
        return null;
    }

    @Deprecated
    public synchronized Long getTimeByPlace(int place) {
        return null;
    }

    @Deprecated
    public synchronized CMIUser getUserByPlace(int place) {
        return null;
    }

    @Deprecated
    public int getPlace(CMIUser user) {
        return 0;
    }

    public CompletableFuture<Void> loadStats() {
        return null;
    }

    public enum svt {
        Time, Distance, Damage, Number;
    }

    public enum CMIType {
        None, Material, Block, Entity;
    }

    public enum CMIStatistic {
        LEAVE_GAME("Game quit", svt.Number),
        PLAY_ONE_TICK("Play time", svt.Time, false, false, CMIType.None, "PLAY_ONE_MINUTE"),
        TIME_SINCE_DEATH("From last death", svt.Time),
        TIME_SINCE_REST("From last rest", svt.Time),
        SNEAK_TIME(svt.Time),
        ACCOUNT_AGE(svt.Time),
        TRAVEL(svt.Distance),
        WALK_ONE_CM("Walk", svt.Distance),
        CROUCH_ONE_CM("Sneak", svt.Distance),
        SPRINT_ONE_CM("Sprint", svt.Distance),
        SWIM_ONE_CM("Swim", svt.Distance),
        FALL_ONE_CM("Fall", svt.Distance),
        CLIMB_ONE_CM("Climb", svt.Distance),
        FLY_ONE_CM("Fly", svt.Distance),
        DIVE_ONE_CM("Dive", svt.Distance),
        WALK_UNDER_WATER_ONE_CM("Walk under water", svt.Distance),
        WALK_ON_WATER_ONE_CM("Walk on water", svt.Distance),
        MINECART_ONE_CM("Minecart travel", svt.Distance),
        BOAT_ONE_CM("Boat travel", svt.Distance),
        PIG_ONE_CM("Pig travel", svt.Distance),
        HORSE_ONE_CM("Horse travel", svt.Distance),
        AVIATE_ONE_CM("Elytra travel", svt.Distance),
        HAPPY_GHAST_ONE_CM("Ghast travel", svt.Distance),
        JUMP(svt.Number),
        DAMAGE_DEALT(svt.Damage),
        DAMAGE_TAKEN(svt.Damage),
        DAMAGE_DEALT_ABSORBED(svt.Damage),
        DAMAGE_DEALT_RESISTED(svt.Damage),
        DAMAGE_BLOCKED_BY_SHIELD(svt.Damage),
        DAMAGE_ABSORBED(svt.Damage),
        DAMAGE_RESISTED(svt.Damage),
        DEATHS(svt.Number),
        ENTITY_KILLED_BY("Killed by", svt.Number, false, true, CMIType.Entity),
        MOB_KILLS(svt.Number),
        PLAYER_KILLS(svt.Number),
        ITEM_ENCHANTED(svt.Number),
        ANIMALS_BRED(svt.Number),
        FISH_CAUGHT(svt.Number),
        TALKED_TO_VILLAGER(svt.Number),
        TRADED_WITH_VILLAGER(svt.Number),
        CAKE_SLICES_EATEN(svt.Number),
        CAULDRON_FILLED(svt.Number),
        CAULDRON_USED(svt.Number),
        ARMOR_CLEANED(svt.Number),
        BANNER_CLEANED(svt.Number),
        BREWINGSTAND_INTERACTION(svt.Number),
        BEACON_INTERACTION(svt.Number),
        CRAFTING_TABLE_INTERACTION(svt.Number),
        FURNACE_INTERACTION(svt.Number),
        DISPENSER_INSPECTED(svt.Number),
        DROPPER_INSPECTED(svt.Number),
        HOPPER_INSPECTED(svt.Number),
        CHEST_OPENED(svt.Number),
        TRAPPED_CHEST_TRIGGERED(svt.Number),
        ENDERCHEST_OPENED(svt.Number),
        NOTEBLOCK_PLAYED(svt.Number),
        NOTEBLOCK_TUNED(svt.Number),
        FLOWER_POTTED(svt.Number),
        RECORD_PLAYED(svt.Number),
        SLEEP_IN_BED(svt.Number),
        SHULKER_BOX_OPENED(svt.Number),
        CLEAN_SHULKER_BOX("Shulker box cleaned", svt.Number),
        DROP("Item dropped", svt.Number, false, true, CMIType.Material),
        MINE_BLOCK("Blocks mined", svt.Number, true, true, CMIType.Block),
        PLACE_BLOCK("Blocks placed", svt.Number, true, true, CMIType.Block, Statistic.USE_ITEM),
        BREAK_ITEM("Item breaks", svt.Number, false, true, CMIType.Material),
        CRAFT_ITEM("Item crafts", svt.Number, false, true, CMIType.Material),
        USE_ITEM("Items used", svt.Number, false, true, CMIType.Material),
        PICKUP("Item pickups", svt.Number, false, true, CMIType.Material),
        KILL_ENTITY("Monster kills", svt.Number, false, true, CMIType.Entity),
        STRIDER_ONE_CM("Strider travel", svt.Distance),
        INTERACT_WITH_BLAST_FURNACE("Interaction with blast furnace", svt.Number),
        INTERACT_WITH_SMOKER("Interaction with smoker", svt.Number),
        INTERACT_WITH_LECTERN("Interaction with lectern", svt.Number),
        INTERACT_WITH_CAMPFIRE("Interaction with campfire", svt.Number),
        INTERACT_WITH_CARTOGRAPHY_TABLE("Interaction with cartography table", svt.Number),
        INTERACT_WITH_LOOM("Interaction with loom", svt.Number),
        INTERACT_WITH_STONECUTTER("Interaction with stonecutter", svt.Number),
        INTERACT_WITH_ANVIL("Interaction with anvil", svt.Number),
        INTERACT_WITH_GRINDSTONE("Interaction with grindstone", svt.Number),
        INTERACT_WITH_SMITHING_TABLE("Interaction with smithing table", svt.Number),
        BELL_RING(svt.Number),
        RAID_TRIGGER(svt.Number),
        RAID_WIN(svt.Number),
        TARGET_HIT(svt.Number),
        OPEN_BARREL(svt.Number),
        DROP_COUNT(svt.Number),
        TOTAL_WORLD_TIME("Time in world", svt.Time);

        private svt type = null;
        private boolean isBlock = false;
        private boolean isSubSatistic = false;
        private CMIType subType = null;
        private String name = null;
        private String newName = null;
        private Statistic bukkit = null;
        private boolean checked = false;

        CMIStatistic(String name, svt type, boolean isBlock, boolean isSubSatistic, CMIType subType, Statistic stat) {
            this(name, type, isBlock, isSubSatistic, subType, "");
        }

        CMIStatistic(String name, svt type, boolean isBlock, boolean isSubSatistic, CMIType subType, String newName) {
        }

        CMIStatistic(String name, svt type, boolean isBlock, boolean isSubSatistic, CMIType subType) {
            this(name, type, isBlock, isSubSatistic, subType, "");
        }

        CMIStatistic(String name, svt type) {
            this(name, type, false, false, CMIType.None, "");
        }

        CMIStatistic(svt type) {
            this(null, type, false, false, CMIType.None, "");
        }

        public svt getType() {
            return null;
        }

        public boolean isBlock() {
            return false;
        }

        public void setBlock(boolean isBlock) {
        }

        public boolean isSubSatistic() {
            return false;
        }

        public void setSubSatistic(boolean isSubSatistic) {
        }

        public CMIType getSubType() {
            return null;
        }

        public Statistic getBukkitStat() {
            return null;
        }

        public String getName() {
            return null;
        }

        public String getNewName() {
            return null;
        }

        public static CMIStatistic getByName(String name) {
            return null;
        }
    }
}
