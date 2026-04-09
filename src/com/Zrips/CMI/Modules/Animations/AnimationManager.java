package com.Zrips.CMI.Modules.Animations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIPlayerInventory.CMIInventorySlot;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class AnimationManager {
    private CMI plugin = null;
    CMITask task = null;
    public static final String CMIArmorStandForSit = null;
    public static final String CMIRainbowArmor = null;
    public static final String CMISoulBound = null;
    public static final String CMIFakeSlime = null;
    HashMap<UUID, Long> doubleClick = null;
    HashMap<UUID, LeatherAnimation> leatherArmor = null;
    HashMap<UUID, Chair> playerSittingMap = null;
    HashMap<String, UUID> chairLoc = null;
    private HashMap<UUID, UUID> riding = null;
    private ConcurrentHashMap<UUID, Location> ridingNonSteerable = null;
    private HashMap<UUID, UUID> beingRidden = null;
    private boolean SitOnStairs = false;
    private boolean StairsAsChairs = false;
    private boolean SlabsAsChairs = false;
    private boolean CarpetsAsChairs = false;
    private boolean RemoveFromChairOnDamage = false;
    private boolean DoubleClick = false;
    private int DoubleClickDelay = 0;
    private int chairRange = 0;
    List<CMIInventorySlot> armorTypes = null;
    private CMITask autoTimerBukkitId = null;
    private Runnable autoTimer = null;
    private static Method method = null;
    private static Field field = null;
    CMITask ridingTask = null;

    public AnimationManager(CMI plugin) {
    }

    public void clearCache(UUID uuid) {
    }

    public void addLeatherArmor(Player player) {
    }

    public void stopLeatherUpdate() {
    }

    public static int getIntFromColor(int Red, int Green, int Blue) {
        return 0;
    }

    public boolean isDoubleClickWait(Player player) {
        return false;
    }

    public void loadConfig() {
    }

    public boolean isValidChairBlock(Block block) {
        return false;
    }

    public void sit(Player player) {
    }

    public void sit(Player player, boolean persistent) {
    }

    public void sit(Player player, Location location, boolean persistent) {
    }

    public boolean isSomeOneSittingHere(Block block) {
        return false;
    }

    public void sit(Player player, Block block) {
    }

    public void sit(Player player, Block block, boolean persistent) {
    }

    public boolean isSitting(Player player) {
        return false;
    }

    public Entity getChair(Player player) {
        return null;
    }

    public void sitOnPlayer(Player player, Player target) {
    }

    @Deprecated
    public void removePlayer(UUID uuid) {
    }

    @Deprecated
    public void removePlayer(Player player) {
    }

    @Deprecated
    public void removePlayer(Player player, boolean delay) {
    }

    public void removePlayerFromChair(UUID uuid) {
    }

    public void removePlayerFromChair(Player player) {
    }

    public void removePlayerFromChair(Player player, boolean delay) {
    }

    public void removePlayerFromChair(Player player, boolean delay, boolean center) {
    }

    public void removePlayerFromChair(Player player, boolean delay, boolean center, boolean teleport) {
    }

    public boolean isSitOnStairs() {
        return false;
    }

    public void setSitOnStairs(boolean sitOnStairs) {
    }

    public boolean isSlabsAsChairs() {
        return false;
    }

    public boolean isStairsAsChairs() {
        return false;
    }

    public UUID removeRiding(UUID uuid) {
        return null;
    }

    public CompletableFuture<List<Entity>> removePassengers(Player player, String playerName) {
        return null;
    }

    public boolean isRiding(UUID uuid) {
        return false;
    }

    public HashMap<UUID, UUID> getRidingList() {
        return null;
    }

    public boolean isBeingRiden(UUID uuid) {
        return false;
    }

    public boolean isRidingNonSteerable(UUID uuid) {
        return false;
    }

    public UUID getBeingRiden(UUID uuid) {
        return null;
    }

    @Deprecated
    public void addRiding(UUID riding, UUID vehicle) {
    }

    public void addRiding(Player player, Entity vehicle) {
    }

    public boolean isDoubleClick() {
        return false;
    }

    public int getChairRange() {
        return 0;
    }

    public boolean isRemoveFromChairOnDamage() {
        return false;
    }

    public enum LeatherAnimationType {
        Rainbow(1), Health(2), Biome(3), Day(4);

        private Integer id = null;

        LeatherAnimationType(Integer id) {
        }

        public Integer getId() {
            return null;
        }

        public void setId(Integer id) {
        }

        public static LeatherAnimationType getById(int id) {
            return null;
        }

        public static LeatherAnimationType getByName(String name) {
            return null;
        }
    }

    public class Chair {
        private Entity ent = null;
        private Location ChairBlockLoc = null;
        private Location armorStandLoc = null;
        private long lastCheck = 0;
        private boolean persistent = false;

        public Entity getEnt() {
            return null;
        }

        public Chair setEnt(Entity ent) {
            return null;
        }

        public Location getChairLoc() {
            return null;
        }

        public Chair setChairLoc(Location chairLoc) {
            return null;
        }

        public Location getArmorStandLoc() {
            return null;
        }

        public Chair setArmorStandLoc(Location armorStandLoc) {
            return null;
        }

        public long getLastCheck() {
            return 0;
        }

        public void setLastCheck(long lastCheck) {
        }

        public boolean isPersistent() {
            return false;
        }

        public void setPersistent(boolean persistent) {
        }
    }
}
