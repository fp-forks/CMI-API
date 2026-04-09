package com.Zrips.CMI.Modules.Holograms;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class CMIHighFrequencyScheduler {
    private static final ScheduledExecutorService EXECUTOR = null;
    private static final Map<Integer, ScheduledTask> TASKS = null;
    private static final AtomicInteger TASK_ID_GEN = null;

    public static ScheduledTask runTimerAsync(Runnable task, long delayMs, long periodMs) {
        return null;
    }

    public static ScheduledTask runLaterAsync(Runnable task, long delayMs) {
        return null;
    }

    public static void cancelTask(int taskId) {
    }

    public static void shutdown() {
    }

    public static final class ScheduledTask {
        private final int id = 0;
        private final Runnable runnable = null;
        private final long periodMs = 0;
        private final AtomicBoolean cancelled = null;
        private volatile ScheduledFuture<?> future = null;

        private ScheduledTask(int id, Runnable runnable, long periodMs) {
        }

        public void cancel() {
        }

        public boolean isCancelled() {
            return false;
        }

        public int getTaskId() {
            return 0;
        }
    }
}
