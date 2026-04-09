package com.Zrips.CMI;

import java.util.List;

import org.bukkit.GameMode;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Reflections {
    private Class<?> MinecraftServerClass = null;
    private Object MinecraftServer = null;
    private Class<?> PlayerList = null;
    private Class<?> EntityHuman = null;
    private Class<?> EntityPlayer = null;
    private Class<?> EnumGameMode = null;
    private Class<?> CraftPlayer = null;
    private Class<?> CEntity = null;
    private Class<?> nbtTagCompound = null;
    private Class<?> nbtTagList = null;
    private Class<?> EnumHand = null;
    private Class<?> CraftBeehive = null;
    private Class<?> TileEntityBeehive = null;
    private Class<?> CraftItemStack = null;
    private Class<?> IStack = null;
    private Class<?> dimensionManager = null;
    private Class<?> PacketPlayOutAnimation = null;
    private CMI plugin = null;

    public Reflections(CMI plugin) {
    }

    @Deprecated
    public void sendPacket(Object connection, Object packet) {
    }

    public Class<?> getMinecraftClass(String nmsClassString) {
        return null;
    }

    public void exitBed(Player p) {
    }

    public void setOnGround(Player p, boolean state) {
    }

    public void changePlayerLimit(int amount) {
    }

    public void changeViewDistance(int amount) {
    }

    public void setGameMode(Player player, GameMode mode) {
    }

    public void manageEnchantment(Enchantment enchant, boolean disable) {
    }

    public void setMotd(String motd) {
    }

    public int getPing(Player player) {
        return 0;
    }

    public int getHoneyLevel(Block block) {
        return 0;
    }

    public int getBeesInside(Block block) {
        return 0;
    }

    public boolean openCartographyTable(Player player) {
        return false;
    }

    public boolean openGrindstone(Player player) {
        return false;
    }

    public boolean openLoom(Player player) {
        return false;
    }

    public boolean openSmithingTable(Player player) {
        return false;
    }

    public boolean openStonecutter(Player player) {
        return false;
    }

    public boolean openAnvil(Player player) {
        return false;
    }

    public boolean openSignUI(Player player, Sign sign) {
        return false;
    }

    public void respawn(Player player) {
    }

    public void openBook(ItemStack i, Player p) {
    }

    public void printItemNBT(ItemStack item, CommandSender sender) {
    }

    public void printEntityNBT(Entity entity, CommandSender sender) {
    }

    public void printNBT(Object t, int level, CommandSender sender, List<String> path) {
    }

    public ItemStack tryToMakeShulkerBox(ItemStack item) {
        return null;
    }
}
