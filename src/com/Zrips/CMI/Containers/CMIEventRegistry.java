package com.Zrips.CMI.Containers;

import java.util.function.BiConsumer;

import org.bukkit.event.Event;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class CMIEventRegistry {
    static Plugin plugin = null;
    static PluginManager pm = null;

    public static <T extends Event> void registerEvent(EventPriority priority, boolean ignoreCancelled, Class<T> eventClass, BiConsumer<Listener, T> handler) {
    }

    public static <T extends Event> void registerEvent(EventPriority priority, Class<T> eventClass, BiConsumer<Listener, T> handler) {
    }

    public static <T extends Event> void registerEvent(Class<T> eventClass, BiConsumer<Listener, T> handler) {
    }

    public static <T1 extends Event, T2 extends Event> void registerEvent(EventPriority priority, boolean condition, Class<T1> eventClass1, BiConsumer<Listener, T1> handler1, Class<T2> eventClass2,
            BiConsumer<Listener, T2> handler2) {
    }

    public static <T1 extends Event, T2 extends Event> void registerEvent(EventPriority priority, boolean ignoreCancelled, boolean condition, Class<T1> eventClass1, BiConsumer<Listener, T1> handler1,
            Class<T2> eventClass2, BiConsumer<Listener, T2> handler2) {
    }
}
