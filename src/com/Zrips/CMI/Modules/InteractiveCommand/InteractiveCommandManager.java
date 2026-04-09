package com.Zrips.CMI.Modules.InteractiveCommand;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Entity;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Portals.CuboidArea.ChunkRef;

import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class InteractiveCommandManager {
    CMI plugin = null;
    private boolean checkCitizens = false;
    HashMap<String, Map<ChunkRef, Set<CMIInteractiveCommand>>> map = null;
    HashMap<UUID, CMIInteractiveCommand> entMap = null;
    HashMap<Integer, CMIInteractiveCommand> citiznesMap = null;
    LinkedHashMap<String, CMIInteractiveCommand> nameMap = null;
    private CMITask saveTask = null;
    boolean saving = false;
    private String fileName = null;

    public InteractiveCommandManager(CMI plugin) {
    }

    public Entity getEntityByUUID(UUID uuid) {
        return null;
    }

    public void deleteIC(CMIInteractiveCommand cmib) {
    }

    public void clearLocationsFromIC(CMIInteractiveCommand cmib) {
    }

    public void addEntity(UUID uuid, CMIInteractiveCommand cmib) {
    }

    public CMIInteractiveCommand addInteractiveCommand(CMIInteractiveCommand cmib) {
        return null;
    }

    @Deprecated
    public CMIInteractiveCommand addInteractiveCommand(CMIInteractiveCommand cmib, boolean save) {
        return null;
    }

    public CMIInteractiveCommand addInteractiveCommand(CMIInteractiveCommand cmib, boolean save, Location addedLocation) {
        return null;
    }

    public Set<CMIInteractiveCommand> getFullList() {
        return null;
    }

    public Set<CMIInteractiveCommand> getSortedByDistance(Location loc) {
        return null;
    }

    public CMIInteractiveCommand getByUUID(UUID uuid) {
        return null;
    }

    public CMIInteractiveCommand getByCitizensId(Integer id) {
        return null;
    }

    public CMIInteractiveCommand getByName(String name) {
        return null;
    }

    public CMIInteractiveCommand removeLoc(CMILocation loc) {
        return null;
    }

    public CMIInteractiveCommand removeEntity(UUID uuid) {
        return null;
    }

    public CMIInteractiveCommand getByLoc(Location loc) {
        return null;
    }

    public void save() {
    }

    public void forceSave() {
    }

    public void load() {
    }

    public CMITask getSaveTask() {
        return null;
    }
}
