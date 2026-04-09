package com.Zrips.CMI.Modules.Holograms;

import java.util.List;
import java.util.Map;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.Zrips.CMILib.Container.CMIVector2D;
import net.Zrips.CMILib.Container.CMIVector3D;
import net.Zrips.CMILib.Effects.CMIEffect;
import net.Zrips.CMILib.Effects.CMIEffectManager.CMIParticle;

public class CMIHologramInteraction {
    private boolean interactable = false;
    private CMIVector2D interactionDimensions = null;
    private CMIVector3D interactionOffset = null;
    private CMIVector2D particleDimensions = null;
    private CMIVector3D particleOffset = null;
    private short particlePosition = 0;
    private double particleSpacing = 0.0;
    private int particleCount = 0;
    private CMIEffect effect = null;
    private boolean showClickParticle = false;
    private boolean showHoverParticle = false;
    private String basePrefix = null;
    private String hoverPrefix = null;
    private List<String> globalCommands = null;

    @NotNull
    public List<String> getCommands() {
        return null;
    }

    public void setCommands(List<String> commands) {
    }

    public boolean isInteractable() {
        return false;
    }

    public void setInteractable(boolean interactable) {
    }

    public CMIVector2D getDimensions() {
        return null;
    }

    public void setDimensions(CMIVector2D extraDimensions) {
    }

    public CMIVector2D getParticleDimensions() {
        return null;
    }

    public void setParticleDimensions(CMIVector2D particleDimensions) {
    }

    public short getParticlePosition() {
        return 0;
    }

    public void setParticlePosition(short particlePosition) {
    }

    public double getParticleSpacing() {
        return 0.0;
    }

    public void setParticleSpacing(double particleSpacing) {
    }

    public int getParticleCount() {
        return 0;
    }

    public void setParticleCount(int particleCount) {
    }

    public CMIEffect getHoverEffect() {
        return null;
    }

    public void setHoverEffect(CMIEffect effect) {
    }

    public void setHoverEffect(CMIParticle effect) {
    }

    public boolean isShowHoverParticle() {
        return false;
    }

    public void setShowHoverParticle(boolean showHoverParticle) {
    }

    public CMIVector3D getParticleOffset() {
        return null;
    }

    public CMIHologramInteraction setParticleOffset(CMIVector3D offset) {
        return null;
    }

    public boolean isShowClickParticle() {
        return false;
    }

    public CMIHologramInteraction setShowClickParticle(boolean showParticle) {
        return null;
    }

    @NotNull
    public String getBasePrefix() {
        return null;
    }

    public CMIHologramInteraction setBasePrefix(String basePrefix) {
        return null;
    }

    @NotNull
    public String getHoverPrefix() {
        return null;
    }

    public CMIHologramInteraction setHoverPrefix(String hoverPrefix) {
        return null;
    }

    @Nullable
    public Map<String, Object> serialize() {
        return null;
    }

    @NotNull
    public static CMIHologramInteraction deserialize(Map<String, Object> entry) {
        return null;
    }

    public CMIVector3D getOffset() {
        return null;
    }

    public void setOffset(CMIVector3D interactionOffset) {
    }
}
