package com.Zrips.CMI.Modules.InteractiveCommand;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import com.Zrips.CMI.CMI;

public class InteractiveCommandListener1_8 implements Listener {
    private CMI plugin = null;

    public InteractiveCommandListener1_8(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onEntityDamageByEntityEvent(EntityDamageByEntityEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent event) {
    }
}
