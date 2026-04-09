package com.Zrips.CMI.NBT;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.util.Vector;

import com.Zrips.CMI.Containers.CMIHitBox;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Holograms.CMIDataWatcher;
import com.Zrips.CMI.Modules.Packets.FakeInfo;

public class MojangMappings implements NMS {
    private boolean informed = false;

    @Override
    public Player getPlayer(CMIUser user) {
        return null;
    }

    @Override
    public Player createFakeOperator() {
        return null;
    }

    @Override
    public void unloadData(Player player) {
    }

    @Override
    public String getWorldName(File file) {
        return null;
    }

    @Override
    public void setMiscLocation(File file, Location location) {
    }

    @Override
    public void setMiscLocation(Player player, Location location) {
    }

    @Override
    public void clearPotionEffects(Player player) {
    }

    public void clearPotionEffects(File file) {
    }

    @Override
    public void setPotionEffects(Player player, PotionEffect potion) {
    }

    public void setPotionEffects(PotionEffect potion, File file) {
    }

    @Override
    public void relightChunk(Chunk chunk) {
    }

    @Override
    public void resendChunk(Chunk chunk, Player player) {
    }

    @Override
    public void unloadChunk(Chunk chunk, Player player) {
    }

    @Override
    public void updateCollisions(Player player, boolean collision, boolean onlyTarget) {
    }

    @Override
    public int getTickLived(UUID uuid) {
        return 0;
    }

    @Override
    public void showResurection(Player player) {
    }

    @Override
    public void setEntityTag(Entity entity, String path, Object value) {
    }

    @Override
    public ItemStack removeEnchantNbt(ItemStack item, org.bukkit.enchantments.Enchantment enchant) {
        return null;
    }

    @Override
    public ItemStack setNBTList(ItemStack item, String name, List<String> list) {
        return null;
    }

    @Override
    public boolean changeGodMode(Player player, boolean state) {
        return false;
    }

    @Override
    public boolean getGodMode(Player player) {
        return false;
    }

    @Override
    public void updateExpBar(Player player) {
    }

    @Override
    public Command getCommand(String command) {
        return null;
    }

    @Override
    public CMIDataWatcher spawnHologram(Player player, Location loc, String text, ItemStack item) {
        return null;
    }

    @Override
    public FakeInfo spawnClickable(Player player, Location loc, Object obj, boolean big) {
        return null;
    }

    @Override
    public void removeHologram(Player player, Integer id) {
    }

    @Override
    public void updateHologram(Player player, CMIDataWatcher aw, String text, ItemStack item) {
    }

    @Override
    public CMIDataWatcher makeFloatingIcon(Player player, Location location, ItemStack item) {
        return null;
    }

    @Override
    public CMIDataWatcher makeFloatingIcon(Player player, Location location, ItemStack item, boolean glow) {
        return null;
    }

    @Override
    public boolean clearSkin(Player player) {
        return false;
    }

    @Override
    public void updatePlayerViaPackets(Player player) {
    }

    @Override
    public boolean forceTeleport(Player player, Location loc) {
        return false;
    }

    @Override
    public CMIHitBox getBlockHitBox(CMIHitBox hb) {
        return null;
    }

    @Override
    public CMIHitBox getEntityHitBox(CMIHitBox hb) {
        return null;
    }

    @Override
    public Block getBlockLookingAt(Player player, int reach, boolean fluids) {
        return null;
    }

    @Override
    public Block getBlockLookingAt(World w, Vector start, Vector end, boolean fluids) {
        return null;
    }
}
