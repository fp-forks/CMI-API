package com.Zrips.CMI.Components;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Pattern;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIComponentBase {
    private final Map<Integer, List<CMIComponentRoot>> componentMap = null;
    private boolean miniMessage = false;
    private static final Pattern VALID_MINIMESSAGE_TAGS = null;
    private static final Pattern MINIMESSAGE_PATTERN = null;
    private final static Map<UUID, ActionBarTask> runningActionBarTasks = null;

    public CMIComponentBase() {
    }

    public CMIComponentBase(boolean miniMessage) {
    }

    public static boolean isValidVersion() {
        return false;
    }

    public static String stripMiniMessageTags(String input) {
        return null;
    }

    public static boolean containsMiniMessage(String input) {
        return false;
    }

    @Nonnull
    public static CMIComponentBase builder() {
        return null;
    }

    @Nonnull
    public static CMIComponentBase builder(boolean allowMiniMessages) {
        return null;
    }

    @Nonnull
    public static CMIComponentBase quickAdd(String text) {
        return null;
    }

    @Nonnull
    public static CMIComponentBase quickAdd(String text, ItemStack item) {
        return null;
    }

    @Nonnull
    public static CMIComponentText quickCreate(String text) {
        return null;
    }

    @Nullable
    public static CMIComponentItem quickCreate(String text, ItemStack item) {
        return null;
    }

    public CMIComponentBase add(CMIComponentRoot component) {
        return null;
    }

    public CMIComponentBase add(int page, CMIComponentRoot component) {
        return null;
    }

    public Map<Integer, List<CMIComponentRoot>> getComponents() {
        return null;
    }

    public boolean allowMiniMessage() {
        return false;
    }

    public CMIComponentBase setAllowMiniMessage(boolean miniMessage) {
        return null;
    }

    public void showTitle(CommandSender sender) {
    }

    public void showTitle(CommandSender sender, int fadeInMili, int stayMili, int fadeOutMili) {
    }

    public void sendPlayerListHeaderAndFooter(CommandSender sender) {
    }

    public void showBossBar(CommandSender sender) {
    }

    public void sendActionBar(CommandSender sender) {
    }

    public void sendActionBar(CommandSender sender, int keepForMili) {
    }

    public String getTextOnly() {
        return null;
    }

    public void sendMessage(CommandSender sender) {
    }

    @Nonnull
    public ItemStack convertIntoBook(String title, String author) {
        return null;
    }

    public CompletableFuture<Boolean> applyOnSign(Block block) {
        return null;
    }

    public CompletableFuture<Boolean> applyOnSign(Block block, Player player) {
        return null;
    }

    class ActionBarTask {
        private CMITask task = null;
        private long time = 0;

        public ActionBarTask(long time) {
        }

        public ActionBarTask(CMITask task, long time) {
        }

        public CMITask getTask() {
            return null;
        }

        public long getTime() {
            return 0;
        }

        public void setTask(CMITask task) {
        }
    }
}
