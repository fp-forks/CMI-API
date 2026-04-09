package com.Zrips.CMI.Modules.Holograms;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.bukkit.entity.Player;

public class CMIHologramLineImage extends CMIHologramLineBase {
    protected List<String> image = null;

    public CMIHologramLineImage(String text) {
        super(text);
    }

    public CMIHologramLineImage() {
        super();
    }

    @Override
    public CMIHologramLineImage clone() {
        return null;
    }

    @Override
    public String getLineOutput(Player player) {
        return null;
    }

    public List<String> getImage() {
        return null;
    }

    public CompletableFuture<List<String>> getImage(Player player) {
        return null;
    }
}
