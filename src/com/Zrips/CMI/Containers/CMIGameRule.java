package com.Zrips.CMI.Containers;

import java.util.HashMap;

import org.bukkit.World;
import org.jetbrains.annotations.Nullable;

import net.Zrips.CMILib.Version.Version;

public final class CMIGameRule<T> {
    private static final HashMap<String, CMIGameRule<?>> registry = null;
    private static CMIGameRule<?>[] rules = null;
    public static final CMIGameRule<Boolean> SPAWN_MOBS = null;
    public static final CMIGameRule<Boolean> NATURAL_HEALTH_REGENERATION = null;
    public static final CMIGameRule<Boolean> MOB_GRIEFING = null;
    public static final CMIGameRule<Boolean> MOB_DROPS = null;
    public static final CMIGameRule<Boolean> KEEP_INVENTORY = null;
    public static final CMIGameRule<Boolean> COMMAND_BLOCK_OUTPUT = null;
    public static final CMIGameRule<Boolean> BLOCK_DROPS = null;
    public static final CMIGameRule<Boolean> ADVANCE_WEATHER = null;
    public static final CMIGameRule<Boolean> ADVANCE_TIME = null;
    public static final CMIGameRule<Boolean> ENTITY_DROPS = null;
    public static final CMIGameRule<Boolean> LOG_ADMIN_COMMANDS = null;
    public static final CMIGameRule<Integer> RANDOM_TICK_SPEED = null;
    public static final CMIGameRule<Boolean> REDUCED_DEBUG_INFO = null;
    public static final CMIGameRule<Boolean> SHOW_DEATH_MESSAGES = null;
    public static final CMIGameRule<Boolean> SEND_COMMAND_FEEDBACK = null;
    public static final CMIGameRule<Boolean> ELYTRA_MOVEMENT_CHECK = null;
    public static final CMIGameRule<Integer> RESPAWN_RADIUS = null;
    public static final CMIGameRule<Boolean> SPECTATORS_GENERATE_CHUNKS = null;
    public static final CMIGameRule<Integer> MAX_ENTITY_CRAMMING = null;
    public static final CMIGameRule<Boolean> LIMITED_CRAFTING = null;
    public static final CMIGameRule<Integer> MAX_COMMAND_SEQUENCE_LENGTH = null;
    public static final CMIGameRule<Boolean> SHOW_ADVANCEMENT_MESSAGES = null;
    public static final CMIGameRule<Boolean> RAIDS = null;
    public static final CMIGameRule<Boolean> DROWNING_DAMAGE = null;
    public static final CMIGameRule<Boolean> FALL_DAMAGE = null;
    public static final CMIGameRule<Boolean> FIRE_DAMAGE = null;
    public static final CMIGameRule<Boolean> IMMEDIATE_RESPAWN = null;
    public static final CMIGameRule<Boolean> SPAWN_PATROLS = null;
    public static final CMIGameRule<Boolean> SPAWN_PHANTOMS = null;
    public static final CMIGameRule<Boolean> SPAWN_WANDERING_TRADERS = null;
    public static final CMIGameRule<Boolean> FORGIVE_DEAD_PLAYERS = null;
    public static final CMIGameRule<Boolean> UNIVERSAL_ANGER = null;
    public static final CMIGameRule<Boolean> FREEZE_DAMAGE = null;
    public static final CMIGameRule<Integer> PLAYERS_SLEEPING_PERCENTAGE = null;
    public static final CMIGameRule<Boolean> SPAWN_WARDENS = null;
    public static final CMIGameRule<Boolean> GLOBAL_SOUND_EVENTS = null;
    public static final CMIGameRule<Boolean> LAVA_SOURCE_CONVERSION = null;
    public static final CMIGameRule<Integer> MAX_SNOW_ACCUMULATION_HEIGHT = null;
    public static final CMIGameRule<Boolean> MOB_EXPLOSION_DROP_DECAY = null;
    public static final CMIGameRule<Boolean> BLOCK_EXPLOSION_DROP_DECAY = null;
    public static final CMIGameRule<Integer> MAX_BLOCK_MODIFICATIONS = null;
    public static final CMIGameRule<Boolean> SPREAD_VINES = null;
    public static final CMIGameRule<Boolean> TNT_EXPLOSION_DROP_DECAY = null;
    public static final CMIGameRule<Boolean> WATER_SOURCE_CONVERSION = null;
    public static final CMIGameRule<Boolean> ENDER_PEARLS_VANISH_ON_DEATH = null;
    public static final CMIGameRule<Integer> MAX_COMMAND_FORKS = null;
    public static final CMIGameRule<Integer> PLAYERS_NETHER_PORTAL_CREATIVE_DELAY = null;
    public static final CMIGameRule<Integer> PLAYERS_NETHER_PORTAL_DEFAULT_DELAY = null;
    public static final CMIGameRule<Boolean> PROJECTILES_CAN_BREAK_BLOCKS = null;
    public static final CMIGameRule<Boolean> PLAYER_MOVEMENT_CHECK = null;
    public static final CMIGameRule<Boolean> TNT_EXPLODES = null;
    public static final CMIGameRule<Boolean> LOCATOR_BAR = null;
    public static final CMIGameRule<Boolean> PVP = null;
    public static final CMIGameRule<Boolean> SPAWNER_BLOCKS_WORK = null;
    public static final CMIGameRule<Boolean> ALLOW_ENTERING_NETHER_USING_PORTALS = null;
    public static final CMIGameRule<Boolean> COMMAND_BLOCKS_WORK = null;
    public static final CMIGameRule<Boolean> SPAWN_MONSTERS = null;
    public static final CMIGameRule<Boolean> DO_FIRE_TICK = null;
    public static final CMIGameRule<Integer> SPAWN_CHUNK_RADIUS = null;
    public static final CMIGameRule<Integer> FIRE_SPREAD_RADIUS_AROUND_PLAYER = null;
    private final String name = null;
    private final String legacyName = null;
    private final Class<T> type = null;
    private Object rule = null;

    private CMIGameRule(String name, String legacyName, Class<T> type) {
        this(name, legacyName, type, null, null);
    }

    private CMIGameRule(String name, String legacyName, Class<T> type, Version fromVersion) {
        this(name, legacyName, type, fromVersion, null);
    }

    private CMIGameRule(String name, Class<T> type, Version fromVersion) {
        this(name, name, type, fromVersion, null);
    }

    private CMIGameRule(String name, Class<T> type, Version fromVersion, Version toVersion) {
        this(name, name, type, fromVersion, toVersion);
    }

    private CMIGameRule(String name, String legacyName, Class<T> type, Version fromVersion, Version toVersion) {
    }

    public Class<T> getType() {
        return null;
    }

    @Nullable
    public static CMIGameRule<?> get(String name) {
        return null;
    }

    public String getLegacyName() {
        return null;
    }

    public void set(World fw, int bv) {
    }

    public void set(World fw, boolean bv) {
    }

    public void set(World world, T value) {
    }

    @Nullable
    public T get(World world) {
        return null;
    }

    public String getName() {
        return null;
    }

    public static CMIGameRule<?>[] getValues() {
        return null;
    }
}
