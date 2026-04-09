package com.Zrips.CMI.Modules.CmdWarmUp;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Teleportations.TeleportManager.TpAction;

import net.Zrips.CMILib.BossBar.BossBarInfo;

public class WarmUpManager {
    public HashMap<String, CmdWarmUp> warmups = null;
    private HashMap<UUID, WarmUpInfo> counter = null;
    CMI plugin = null;
    private final static String bossBarName = null;
    boolean InformOnNoMove = false;
    boolean counterBarInfo = false;
    boolean showBossBarInfo = false;
    BossBarInfo bossBarInfo = null;

    public WarmUpManager(CMI plugin) {
    }

    public boolean isOnWarmUp(Player player) {
        return false;
    }

    public boolean isOnWarmUp(UUID uuid) {
        return false;
    }

    public void addWU(String cmd, CmdWarmUp warmup) {
    }

    public boolean canMove(Player player) {
        return false;
    }

    public boolean canMove(UUID uuid) {
        return false;
    }

    public boolean canMove(UUID uuid, Location currentPos) {
        return false;
    }

    public boolean canMoveByCmd(String cmd) {
        return false;
    }

    @Deprecated
    public boolean startTeleportUsage(Player player, Location loc) {
        return false;
    }

    public boolean startTeleportUsage(TpAction action, Player player, Location loc) {
        return false;
    }

    public boolean isWarmupCommand(CommandSender sender, String cmd) {
        return false;
    }

    public boolean startCmdUsage(CommandSender sender, String cmd) {
        return false;
    }

    public boolean startCmdUsage(CommandSender sender, String cmd, boolean cmiPermissionCheck) {
        return false;
    }

    public boolean cancel(UUID uuid) {
        return false;
    }

    public boolean cancel(UUID uuid, boolean soft) {
        return false;
    }

    public void loadConfig() {
    }
}
