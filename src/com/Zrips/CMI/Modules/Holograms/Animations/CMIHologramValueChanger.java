package com.Zrips.CMI.Modules.Holograms.Animations;

public class CMIHologramValueChanger {
    private double target = 0.0;
    private double current = 0.0;
    private double changeSpeed = 0.0;
    private int direction = 0;

    public CMIHologramValueChanger() {
        this(0, 1);
    }

    public CMIHologramValueChanger(double start, double stop) {
    }

    public CMIHologramValueChanger(double start, double stop, double changeBy) {
        this(start, stop);
    }

    public static double increment(double start, double end, int updatesPerSecond, double timeFrame) {
        return 0.0;
    }

    public CMIHologramValueChanger increment(double timeFrame) {
        return null;
    }

    public CMIHologramValueChanger increment(double timeFrame, int fps) {
        return null;
    }

    public double getTarget() {
        return 0.0;
    }

    public void setTarget(double target) {
    }

    public double getCurrent() {
        return 0.0;
    }

    public void setCurrent(double current) {
    }

    public double getChangeSpeed() {
        return 0.0;
    }

    public void setChangeSpeed(double changeSpeed) {
    }

    public double updateValue() {
        return 0.0;
    }

    public boolean finished() {
        return false;
    }
}
