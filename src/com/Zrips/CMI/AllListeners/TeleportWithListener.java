package com.Zrips.CMI.AllListeners;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

import com.Zrips.CMI.CMI;

public class TeleportWithListener implements Listener {
    private CMI plugin = null;
    HashMap<UUID, vehicleLast> mapVehicle = null;

    public TeleportWithListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onTeleportWithEntity(PlayerTeleportEvent event) {
    }

    class vehicleLast {
        private UUID uuid = null;
        private Entity vehicle = null;
        private int tick = 0;

        public vehicleLast(UUID uuid, Entity vehicle, int tick) {
        }

        public UUID getUuid() {
            return null;
        }

        public Entity getVehicle() {
            return null;
        }

        public int getTick() {
            return 0;
        }
    }
}
