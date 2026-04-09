package com.Zrips.CMI.Modules.Holograms;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIHologramUpdator {
    private static final ConcurrentHashMap<UUID, Worker> WORKERS = null;
    private static CMITask task = null;

    public static void start() {
    }

    public static CompletableFuture<Void> requestUpdate(UUID playerUUID, CMIHologram holo, CMIHologramUpdateType... types) {
        return null;
    }

    public static void shutdown() {
    }

    public static void remove(UUID uuid) {
    }

    private static class Request {
        private final Set<CMIHologramUpdateType> types = null;
        private final CompletableFuture<Void> future = null;

        synchronized void addAll(Set<CMIHologramUpdateType> types) {
        }

        synchronized Set<CMIHologramUpdateType> snapshot() {
            return null;
        }

        CompletableFuture<Void> getFuture() {
            return null;
        }

        void complete() {
        }
    }

    private static class Worker {
        private final UUID playerUUID = null;
        private final ConcurrentHashMap<CMIHologram, Request> pending = null;

        public Worker(UUID playerUUID) {
        }

        public CompletableFuture<Void> enqueue(CMIHologram holo, Set<CMIHologramUpdateType> updates) {
            return null;
        }

        public boolean run() {
            return false;
        }

        public void failAll(Throwable t) {
        }

        public boolean isEmpty() {
            return false;
        }
    }
}
