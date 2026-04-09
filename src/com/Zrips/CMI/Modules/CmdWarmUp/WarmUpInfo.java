package com.Zrips.CMI.Modules.CmdWarmUp;

import org.bukkit.Location;

import com.Zrips.CMI.Modules.Particl.CMIVisualEffect;

import net.Zrips.CMILib.BossBar.BossBarInfo;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class WarmUpInfo {
    private String cmd = null;
    private Location loc = null;
    private CmdWarmUp warmup = null;
    private CMITask task = null;
    private CMIVisualEffect effectAnimation = null;
    private int leftCount = 0;
    private BossBarInfo bar = null;

    @Deprecated
    public WarmUpInfo(String cmd, boolean move) {
    }

    @Deprecated
    public WarmUpInfo(Location loc, boolean move) {
    }

    public WarmUpInfo(String cmd, CmdWarmUp warmup) {
    }

    public WarmUpInfo(Location loc, CmdWarmUp warmup) {
    }

    public String getCmd() {
        return null;
    }

    public void setCmd(String cmd) {
    }

    public boolean isMove() {
        return false;
    }

    @Deprecated
    public void setMove(boolean move) {
    }

    public Location getLoc() {
        return null;
    }

    public void setLoc(Location loc) {
    }

    public CMIVisualEffect getEffectAnimation() {
        return null;
    }

    public void setEffectAnimation(CMIVisualEffect effectAnimation) {
    }

    public int getLeftCount() {
        return 0;
    }

    public void setLeftCount(int leftCount) {
    }

    public BossBarInfo getBar() {
        return null;
    }

    public void setBar(BossBarInfo bar) {
    }

    public CMITask getTask() {
        return null;
    }

    public void setTask(CMITask task) {
    }

    public CmdWarmUp getWarmup() {
        return null;
    }

    public void setWarmup(CmdWarmUp warmup) {
    }
}
