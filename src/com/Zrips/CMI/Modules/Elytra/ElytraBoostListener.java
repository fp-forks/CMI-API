package com.Zrips.CMI.Modules.Elytra;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Speed;
import com.Zrips.CMI.events.CMIArmorChangeEvent;

public class ElytraBoostListener implements Listener {
    private CMI plugin = null;
    private Effect eff = null;
    HashMap<UUID, Speed> speedMap = null;

    public ElytraBoostListener(CMI plugin) {
    }

    @EventHandler
    public void onPlayerSpeed(PlayerMoveEvent event) {
    }

    @EventHandler
    public void onInventoryClick(CMIArmorChangeEvent event) {
    }

    public static double xPosYaw(double time, double radius, double yaw) {
        return 0.0;
    }

    public static double yPosYaw(double time, double radius) {
        return 0.0;
    }

    public static double zPosYaw(double time, double radius, double yaw) {
        return 0.0;
    }

    public double zPosPitch2(double time, double radius, double pitch) {
        return 0.0;
    }

    public void spawnCircle(Player player) {
    }

    public static void spawnCircle(Location loc) {
    }

    @EventHandler
    public void EntityToggleGlideEvent(EntityToggleGlideEvent event) {
    }

    @EventHandler
    public void onElytraFlight(PlayerInteractEvent event) {
    }
}
