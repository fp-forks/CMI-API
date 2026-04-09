package com.Zrips.CMI.Modules.Display;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;

import org.bukkit.Location;
import org.bukkit.entity.Display.Billboard;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.Transformation;

import net.Zrips.CMILib.Container.CMIVector3D;

public class CMIDisplay {
    CMIDisplayTransform transform = null;
    private static Constructor<?> TextDisplay = null;
    private static Constructor<?> ItemDisplay = null;
    private static Constructor<?> BlockDisplay = null;
    private static Constructor<?> InteractDisplay = null;
    private static Object textDisplayEntityType = null;
    private static Object itemDisplayEntityType = null;
    private static Object blockDisplayEntityType = null;
    private static Object interactionEntityType = null;
    private static Class<?> worldClass = null;
    private static Constructor<?> PacketPlayOutSpawnEntity = null;
    private static Constructor<?> PacketPlayOutEntityMetadata = null;
    private static Constructor<?> PacketPlayOutEntityDestroy = null;
    private static Method method1 = null;
    private static Method method2 = null;
    private static Method setLocationMethod = null;
    protected Location loc = null;
    protected boolean positionModified = false;
    protected org.bukkit.entity.Entity display = null;
    protected Object d = null;
    private int id = 0;
    private CMIDisplayType type = null;
    private static Constructor<?> packetConstructor = null;
    private static Field vehicleField = null;
    private static Field passengersField = null;
    private static boolean fail = false;

    public CMIDisplay(CMIDisplayType type, Location loc) {
    }

    public Entity getDisplayEntity() {
        return null;
    }

    public Transformation getTransformation() {
        return null;
    }

    @Deprecated
    public void getTransformation(Transformation transformation) {
    }

    public void setTransformation(Transformation transformation) {
    }

    public void setWidth(double width) {
    }

    public void setHeight(double height) {
    }

    public void setInterpolationDuration(int duration) {
    }

    public int getInterpolationDuration() {
        return 0;
    }

    public void setInterpolationDelay(int delay) {
    }

    public int getInterpolationDelay() {
        return 0;
    }

    public void setLocation(Location loc) {
    }

    public float getRange() {
        return 0.0f;
    }

    public void setRange(int range) {
    }

    public void setBrightness(int skyValue, int blockValue) {
    }

    public void setBillboard(Billboard billboard) {
    }

    public void setOffset(CMIVector3D offset) {
    }

    public Billboard getBillboard() {
        return null;
    }

    public Location getLocation() {
        return null;
    }

    public Object getDisplay() {
        return null;
    }

    public void addAsPassenger(Player receiver, Entity vehicle) {
    }

    public void addAsPassenger(Set<Player> receivers, Entity vehicle) {
    }

    public void show(Player player) {
    }

    public void update(Player player) {
    }

    public void update(Player player, boolean updatePosition) {
    }

    public void destroy(Player player) {
    }

    public int getId() {
        return 0;
    }
}
