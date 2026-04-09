package com.Zrips.CMI.Modules.ConsoleFilter;

import java.time.format.DateTimeFormatter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIAsyncConsoleMessageEvent;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class ConsoleMessageListener implements Listener {
    private CMI plugin = null;
    CMITask task = null;
    DateTimeFormatter formatter = null;

    public ConsoleMessageListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onCMIAsyncConsoleMessageEvent(CMIAsyncConsoleMessageEvent event) {
    }
}
