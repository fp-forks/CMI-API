package com.Zrips.CMI.Modules.Selection;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Display.CMIBlockDisplay;

import net.Zrips.CMILib.Container.CMIVector3D;
import net.Zrips.CMILib.Items.CMIMaterial;

public class CMISelectionVisualBlock {
    private List<CMIBlockDisplay> virtualBlocks = null;
    private CMIMaterial material = null;
    private double size = 0.0;
    private double width = 0.0;

    public List<CMIBlockDisplay> getVirtualBlocks() {
        return null;
    }

    public CompletableFuture<Boolean> show(Player player, CMIVector3D point) {
        return null;
    }

    public CompletableFuture<Boolean> destroy(Player player) {
        return null;
    }

    public CMIMaterial getMaterial() {
        return null;
    }

    public CMISelectionVisualBlock setMaterial(CMIMaterial material) {
        return null;
    }

    public double getSize() {
        return 0.0;
    }

    public CMISelectionVisualBlock setSize(double size) {
        return null;
    }
}
