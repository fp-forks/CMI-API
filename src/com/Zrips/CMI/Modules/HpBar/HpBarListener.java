package com.Zrips.CMI.Modules.HpBar;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import com.Zrips.CMI.CMI;

public class HpBarListener implements Listener {
    private CMI plugin = null;

    public HpBarListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void EntityDamageEntityEvent(EntityDamageByEntityEvent event) {
    }
}
