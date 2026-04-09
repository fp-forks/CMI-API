package com.Zrips.CMI.Modules.Selection;

import java.util.concurrent.CompletableFuture;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import net.Zrips.CMILib.Container.CMIVector3D;
import net.Zrips.CMILib.Container.CMIVectorInt3D;

public class CMISelectionPoint {
    private World selectionWorld = null;
    private CMIVector3D point = null;
    private CMISelectionVisualBlock selectionVisualBlock = null;

    public CMISelectionPoint() {
    }

    public CMISelectionPoint(World selectionWorld, CMIVectorInt3D point) {
        this(selectionWorld, new CMIVector3D(point.getX(), point.getY(), point.getZ()));
    }

    public CMISelectionPoint(World selectionWorld, CMIVector3D point) {
    }

    @Nullable
    public CMIVector3D getPoint() {
        return null;
    }

    @Nullable
    public Location toLocation() {
        return null;
    }

    public boolean isValid() {
        return false;
    }

    public World getSelectionWorld() {
        return null;
    }

    public CMISelectionPoint setSelectionWorld(World selectionWorld) {
        return null;
    }

    public CompletableFuture<Boolean> showSelectionVisualBlock(Player player) {
        return null;
    }

    public CompletableFuture<Boolean> destroySelectionVisualBlock(Player player) {
        return null;
    }

    public CMISelectionVisualBlock getSelectionVisualBlock() {
        return null;
    }
}
