package com.Zrips.CMI.Modules.Holograms;

import java.util.regex.Pattern;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.Items.CMIAsyncHead;

public class CMIHologramLineIcon extends CMIHologramLineBase {
    private static final String regex = null;
    private static final Pattern pattern = null;
    private ItemStack item = null;
    protected boolean enchanted = false;
    protected boolean glowing = false;
    protected boolean itemInHand = false;
    protected int modelData = 0;

    public CMIHologramLineIcon(String text) {
        super(text);
    }

    @Override
    public CMIHologramLineIcon clone() {
        return null;
    }

    public ItemStack updateItem(Player player, CMIAsyncHead ahead) {
        return null;
    }

    public CMIHologramLineIcon setIcon(ItemStack item) {
        return null;
    }

    public ItemStack getIcon(Player player) {
        return null;
    }

    public ItemStack getIcon(Player player, CMIAsyncHead ahead) {
        return null;
    }

    public String getIconText() {
        return null;
    }
}
