package com.Zrips.CMI.commands.list;

import java.util.HashMap;
import java.util.Set;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class killall implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "Kill mobs around you", args = "(-monsters/-pets/-npc/-animals/-ambient/-named/-all/-force/-lightning/-list/-m:[mobType]) (-r:range) (-s) (-w:[worldName])", multiTab = {
            "!-monsters,!-pets,!-npc,!-animals,!-ambient,!-named,!-all,!-withitems,!-force,!-lightning,!-list,[EntityType] !-monsters,!-pets,!-npc,!-animals,!-ambient,!-named,!-all,!-withitems,!-force,!-lightning,!-list,[EntityType]" }, explanation = {}, regVar = {
                    -666 }, consoleVar = { -666 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public static boolean isMonster(Entity ent) {
        return false;
    }

    private enum removalCriteria {
        monsters("Monsters"),
        pets(true, "Pets"),
        npc(true, "NPCs"),
        animals("Animals"),
        ambient("Ambient"),
        vehicles("Vehicles"),
        named(true, "With custom name"),
        withitems(true, "With items"),
        force("Force"),
        custom("By type");

        private String category = null;
        private boolean secondaryCheck = false;

        removalCriteria(boolean secondaryCheck, String category) {
        }

        removalCriteria(String category) {
        }

        public String getCategory() {
            return null;
        }

        public boolean isSecondaryCheck() {
            return false;
        }

        public static removalCriteria get(String name) {
            return null;
        }

        public boolean addForRemoval(Entity entity) {
            return false;
        }
    }

    private enum Action {
        all, lightning, list;

        public static Action get(String name) {
            return null;
        }
    }

    private class entityRemoval {
        private CommandSender sender = null;
        private HashMap<removalCriteria, Set<Entity>> fullList = null;
        private Set<Action> actions = null;
        private Set<removalCriteria> criteria = null;
        private Set<EntityType> customTypes = null;
        private int range = 0;
        private boolean silent = false;
        private World world = null;
        private Location center = null;

        public entityRemoval(CommandSender sender) {
        }

        public entityRemoval(Location center) {
        }

        public entityRemoval addAction(Action action) {
            return null;
        }

        public entityRemoval addType(EntityType type) {
            return null;
        }

        public Set<Action> getActions() {
            return null;
        }

        public Set<EntityType> getTypes() {
            return null;
        }

        public boolean hasAction(Action action) {
            return false;
        }

        public boolean hasType(EntityType type) {
            return false;
        }

        public int getRange() {
            return 0;
        }

        public entityRemoval setRange(int range) {
            return null;
        }

        public boolean isSilent() {
            return false;
        }

        public entityRemoval setSilent(boolean silent) {
            return null;
        }

        public World getWorld() {
            return null;
        }

        public entityRemoval setWorld(World world) {
            return null;
        }

        public Location getCenter() {
            return null;
        }

        public entityRemoval setCenter(Location center) {
            return null;
        }

        public HashMap<removalCriteria, Set<Entity>> getFullList() {
            return null;
        }

        public void setFullList(HashMap<removalCriteria, Set<Entity>> fullList) {
        }

        public void clean() {
        }

        public void processEntity(Entity entity) {
        }

        public CommandSender getSender() {
            return null;
        }

        public void setSender(CommandSender sender) {
        }

        public Set<removalCriteria> getRemovalCriteria() {
            return null;
        }

        public boolean hasRemovalCriteria(removalCriteria criteria) {
            return false;
        }

        public entityRemoval setRemovalCriteria(Set<removalCriteria> criteria) {
            return null;
        }

        public entityRemoval addRemovalCriteria(removalCriteria action) {
            return null;
        }
    }
}
