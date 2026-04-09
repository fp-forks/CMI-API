package com.Zrips.CMI.Modules.Mirror;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;

import javax.annotation.Nullable;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class CMIMirrorManager {
    HashMap<UUID, CMIBlockMirroring> mirrorMap = null;
    private int maxRange = 0;
    private int maxBlocks = 0;
    private boolean breakDisabled = false;
    private final String CMIMirrorBlock = null;
    private CMI plugin = null;
    private static Method setDataMethod = null;
    private static Set<Block> ignorePlaced = null;
    private static Set<Block> ignoreBroken = null;

    public CMIMirrorManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public CMIBlockMirroring getMirror(CMIUser user) {
        return null;
    }

    public CMIBlockMirroring getMirror(Player player) {
        return null;
    }

    @Nullable
    public CMIBlockMirroring getMirror(UUID uuid) {
        return null;
    }

    public void setMirror(UUID uuid, CMIBlockMirroring mirror) {
    }

    public boolean isMirroring(Player player) {
        return false;
    }

    public boolean addMirroring(Player player) {
        return false;
    }

    public void removeMirroring(Player player) {
    }

    public void removeMirroring(UUID uuid) {
    }

    public void placeBlock(Player player, Block block, ItemStack i) {
    }

    public void breakBlock(Player player, Block block) {
    }

    public void openGui(Player player) {
    }

    public void openGui(CMIUser user) {
    }

    public int getMaxRange() {
        return 0;
    }

    public int getMaxBlocks() {
        return 0;
    }

    public boolean isBreakDisabled() {
        return false;
    }
}
