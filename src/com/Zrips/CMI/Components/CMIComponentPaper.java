package com.Zrips.CMI.Components;

import java.util.concurrent.CompletableFuture;

import javax.annotation.Nonnull;

import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.kyori.adventure.text.Component;

public class CMIComponentPaper extends CMIComponentBase {
    private Component provided = null;
    private static final String prefixColor = null;
    private static final String prefixShadow = null;
    private static final String prefixHover = null;
    private static final String prefixClick = null;
    private static final String suffix = null;
    private static final String prefixTextHover = null;
    private static final String prefixItemHover = null;
    private static final String suffixHover = null;
    private static final String suffixClick = null;

    public CMIComponentPaper(Component provided) {
        super(false);
    }

    public CMIComponentPaper(boolean allowMiniMessages) {
        super(allowMiniMessages);
    }

    @Override
    public void sendMessage(CommandSender sender) {
    }

    @Override
    public void sendActionBar(CommandSender sender, int keepForMili) {
    }

    @Override
    @Nonnull
    public ItemStack convertIntoBook(String title, String author) {
        return null;
    }

    @Override
    @Nonnull
    public CompletableFuture<Boolean> applyOnSign(Block block, Player player) {
        return null;
    }

    @Override
    public void showTitle(CommandSender sender, int fadeinMili, int stayMili, int fadeoutMili) {
    }

    @Override
    public void sendPlayerListHeaderAndFooter(CommandSender sender) {
    }

    public Component getCombined() {
        return null;
    }

    public Component getCombinedByPage() {
        return null;
    }
}
