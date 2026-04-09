package com.Zrips.CMI.Modules.Holograms;

import java.util.UUID;

import org.bukkit.Location;

public class FakeEntityInfo {
    private int id = 0;
    private UUID playerUUID = null;
    private Object entity = null;
    private Object object1 = null;
    private Object object2 = null;
    private Location location = null;

    public FakeEntityInfo() {
        this(0, null, null);
    }

    public FakeEntityInfo(int id, UUID playerUUID, Location location) {
    }

    public int getId() {
        return 0;
    }

    public FakeEntityInfo setId(int id) {
        return null;
    }

    public UUID getPlayerUUID() {
        return null;
    }

    public Object getEntity() {
        return null;
    }

    public FakeEntityInfo setEntity(Object entity) {
        return null;
    }

    public Object getObject() {
        return null;
    }

    public FakeEntityInfo setObject(Object object) {
        return null;
    }

    public Object getObjectSecond() {
        return null;
    }

    public FakeEntityInfo setObjectSecond(Object object) {
        return null;
    }

    public Location getLocation() {
        return null;
    }

    public FakeEntityInfo setLocation(Location location) {
        return null;
    }
}
