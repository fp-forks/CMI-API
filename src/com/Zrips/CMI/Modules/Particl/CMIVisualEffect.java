package com.Zrips.CMI.Modules.Particl;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIVisualEffect {
    private Player targetPlayerLocation = null;
    private Location loc = null;
    CMITask task = null;
    private int interval = 0;
    private Long until = null;
    private CMIPEAnimationInterface effectAnimation = null;
    List<Player> players = null;
    Long nextPlayerUpdate = null;

    public CMIVisualEffect(Player targetPlayer, CMIPresetAnimations effect) {
        this(targetPlayer, effect.getInter(targetPlayer));
    }

    public CMIVisualEffect(Player targetPlayer, CMIPEAnimationInterface effect) {
    }

    public CMIVisualEffect(Location loc, CMIPEAnimationInterface effect) {
    }

    public void show() {
    }

    public void show(Player player) {
    }

    public void stop() {
    }

    public void pause() {
    }

    public void continueAnimation() {
    }

    public CMIPEAnimationInterface getEffect() {
        return null;
    }

    public void setEffect(CMIPEAnimationInterface effect) {
    }

    public Player getTargetPlayer() {
        return null;
    }

    public void setTargetPlayer(Player targetPlayer) {
    }

    public Long getUntil() {
        return null;
    }

    public void setUntil(Long until) {
    }

    public int getInterval() {
        return 0;
    }

    public void setInterval(int interval) {
    }
}
