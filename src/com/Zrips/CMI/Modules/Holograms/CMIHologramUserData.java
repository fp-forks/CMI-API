package com.Zrips.CMI.Modules.Holograms;

import java.util.UUID;
import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;

import com.Zrips.CMI.Modules.Holograms.Animations.CMIHologramAnimationCycle;
import com.Zrips.CMI.Modules.Holograms.Animations.CMIHologramAnimationType;
import com.Zrips.CMI.Modules.Holograms.Animations.CMIHologramFadeAnimation;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMIHologramUserData {
    private int page = 0;
    private boolean skipPageChange = false;
    private CMIHologramBatch batch = null;
    private CMIHologramType displayType = null;
    private Consumer<CMIHologramAnimationCycle> consumer = null;
    private boolean hidden = false;
    private UUID uuid = null;
    private int tick = 0;
    private int steps = 0;
    private CMIHologramFadeAnimation fadeInAnimation = null;
    private CMIHologramFadeAnimation fadeOutAnimation = null;
    CMITask animationTasker = null;

    public CMIHologramUserData(UUID uuid) {
    }

    public int getPage() {
        return 0;
    }

    public CMIHologramUserData setPage(int page) {
        return null;
    }

    public boolean isSkipPageChange() {
        return false;
    }

    public CMIHologramUserData setSkipPageChange(boolean skipPageChange) {
        return null;
    }

    public boolean isFadeAnimationRunning() {
        return false;
    }

    public boolean isFadeAnimationActive() {
        return false;
    }

    public CMIHologramFadeAnimation getFadeInAnimation() {
        return null;
    }

    public void setFadeInAnimation(CMIHologramFadeAnimation fadeInAnimation) {
    }

    public void resetFadeInAnimation() {
    }

    public CMIHologramFadeAnimation getFadeOutAnimation() {
        return null;
    }

    public void setFadeOutAnimation(CMIHologramFadeAnimation fadeOutAnimation) {
    }

    public void initializeFadeInAnimation(double targetScale) {
    }

    public void initializeFadeOutAnimation(double targetScale) {
    }

    public double getAnimationCurrentValue(CMIHologramAnimationType type) {
        return 0.0;
    }

    public void stopFadeAnimation() {
    }

    public void cancelFadeAnimation() {
    }

    public CMIHologramUserData startFadeAnimation(CMIHologram holo, UUID uuid, Consumer<CMIHologramAnimationCycle> consumer) {
        return null;
    }

    @Nullable
    public CMIHologramBatch getHologramBatch() {
        return null;
    }

    public CMIHologramUserData setHologramBatch(CMIHologramBatch batch) {
        return null;
    }

    @Nullable
    public CMIHologramType getHologramType() {
        return null;
    }

    public CMIHologramUserData setHologramType(CMIHologramType displayType) {
        return null;
    }

    public boolean isHidden() {
        return false;
    }

    public CMIHologramUserData setHidden(boolean hidden) {
        return null;
    }

    public int getTick() {
        return 0;
    }

    public CMIHologramUserData setTick(int tick) {
        return null;
    }

    public int incrementTick() {
        return 0;
    }

    public double getCurrentAutoRotateExtraAngle(double rate) {
        return 0.0;
    }

    public int getSteps() {
        return 0;
    }

    public void setSteps(int steps) {
    }
}
