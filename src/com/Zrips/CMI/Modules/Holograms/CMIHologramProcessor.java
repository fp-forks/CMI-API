package com.Zrips.CMI.Modules.Holograms;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Holograms.Settings.CMIHologramAnimationSettings;
import com.Zrips.CMI.Modules.Holograms.Settings.CMIHologramBoardSettings;
import com.Zrips.CMI.Modules.Holograms.Settings.CMIHologramIconSettings;
import com.Zrips.CMI.Modules.Holograms.Settings.CMIHologramPageSettings;
import com.Zrips.CMI.Modules.Holograms.Settings.CMIHologramSettings;
import com.Zrips.CMI.Modules.Holograms.Settings.CMIHologramTextSettings;

import net.Zrips.CMILib.Container.CMILocation;

public class CMIHologramProcessor {
    protected CMIHologram baseHologram = null;

    public CMIHologramProcessor(CMIHologram impl) {
    }

    public CMIHologram getHologramBase() {
        return null;
    }

    public CompletableFuture<Void> requestFullUpdate() {
        return null;
    }

    public CompletableFuture<Void> requestUpdate(List<CMIHologramUpdateType> types) {
        return null;
    }

    public CompletableFuture<Void> requestTextUpdate() {
        return null;
    }

    public CompletableFuture<Void> requestUpdate(CMIHologramUpdateType... types) {
        return null;
    }

    public CompletableFuture<Void> requestUpdate(UUID uuid) {
        return null;
    }

    public CompletableFuture<Void> requestUpdate(UUID uuid, CMIHologramUpdateType... types) {
        return null;
    }

    public CompletableFuture<Void> hide(UUID uuid) {
        return null;
    }

    public void show(Player player) {
    }

    public CompletableFuture<Void> instantHide() {
        return null;
    }

    public CMIHologramSettings getSettings() {
        return null;
    }

    public CMIHologramIconSettings getIconSettings() {
        return null;
    }

    public CMIHologramBoardSettings getBoardSettings() {
        return null;
    }

    public CMIHologramAnimationSettings getAnimationSettings() {
        return null;
    }

    public CMIHologramPageSettings getPageSettings() {
        return null;
    }

    public CMIHologramHoverModule getHoverModule() {
        return null;
    }

    public CMIHologramTextSettings getTextSettings() {
        return null;
    }

    public CMIHologramInteraction getInteractionSettings() {
        return null;
    }

    public CMILocation getLocation() {
        return null;
    }

    public String getName() {
        return null;
    }

    public List<String> getCommands() {
        return null;
    }

    public List<String> getLines() {
        return null;
    }

    public boolean isEnabled() {
        return false;
    }

    CompletableFuture<Void> updateBillboard(UUID uuid, Set<CMIHologramUpdateType> typesList) {
        return null;
    }

    void onPageChange(UUID uuid) {
    }

    protected String processTextLine(Player player, CMIHologramLine line) {
        return null;
    }

    protected StringBuilder getTextLine(CMIHologramLinePortion hoverlingLinePortion, CMIHologramLinePortion one, Player player) {
        return null;
    }

    protected boolean isHiding(Set<CMIHologramUpdateType> typesList) {
        return false;
    }

    protected boolean isShowing(Set<CMIHologramUpdateType> typesList) {
        return false;
    }
}
