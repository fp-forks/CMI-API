package com.Zrips.CMI.Modules.Selection;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import net.Zrips.CMILib.Container.CMICuboidArea;
import net.Zrips.CMILib.Container.CMIVector3D;
import net.Zrips.CMILib.Container.CMIVectorInt3D;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class CMISelectionVisualizer {
    private Player player = null;
    private UUID uuid = null;
    private CMISelectionPoint point1 = null;
    private CMISelectionPoint point2 = null;
    private CMICuboidArea selectedCuboid = null;
    private Visualizer visualizer = null;
    private static long visualizerShowFor = 0;
    int place = 0;
    private CMITask task = null;
    private static final int RANGE = 0;

    public CMISelectionVisualizer(UUID uuid) {
    }

    public void cancelAll() {
    }

    public CMISelectionPoint getPoint1() {
        return null;
    }

    public CMISelectionVisualizer setPoint1(Location point1) {
        return null;
    }

    public CMISelectionVisualizer setPoint1(World world, CMIVector3D point1) {
        return null;
    }

    public CMISelectionVisualizer setPoint1(World world, CMIVectorInt3D point1) {
        return null;
    }

    public CMISelectionVisualizer setPoint1(CMISelectionPoint point1) {
        return null;
    }

    public boolean placedBothPoints() {
        return false;
    }

    public CMISelectionPoint getPoint2() {
        return null;
    }

    public CMISelectionVisualizer setPoint2(Location point2) {
        return null;
    }

    public CMISelectionVisualizer setPoint2(World world, CMIVector3D point2) {
        return null;
    }

    public CMISelectionVisualizer setPoint2(World world, CMIVectorInt3D point2) {
        return null;
    }

    public CMISelectionVisualizer setPoint2(CMISelectionPoint point2) {
        return null;
    }

    public CMICuboidArea getSelectedCuboid() {
        return null;
    }

    public CMISelectionVisualizer setSelectedCuboid(CMICuboidArea selected) {
        return null;
    }

    public Visualizer getVisualizer() {
        return null;
    }

    public void updateParticles(boolean force) {
    }

    public void showFull() {
    }

    public void showSelectionPoints() {
    }

    public void showParticleBounds() {
    }

    public boolean makeBorders() {
        return false;
    }

    public static List<CMIVector3D> getLocations(Location lowLoc, Location loc, Vector vector, boolean StartFromZero) {
        return null;
    }

    public static List<CMIVector3D> getLocations(CMIVector3D lowLoc, CMIVector3D loc, CMIVector3D vector, boolean StartFromZero) {
        return null;
    }

    public void contract(int amount) {
    }

    public void expand(int amount) {
    }

    public void shift(int amount) {
    }

    public boolean localExpand(double amount) {
        return false;
    }

    public boolean localContract(double amount) {
        return false;
    }

    enum Axis {
        X, Y, Z;
    }

    private enum Direction {
        UP, DOWN, PLUSX, PLUSZ, MINUSX, MINUSZ;
    }
}
