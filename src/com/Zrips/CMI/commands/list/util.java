package com.Zrips.CMI.commands.list;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.Container.CMIVector3D;
import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class util implements Cmd {
    public static boolean imortaldebug = false;
    private static HashMap<Player, Long> targetingEnabled = null;
    private CMITask sched = null;
    private CMITask sched2 = null;
    private static HashMap<Player, Long> safeEnabled = null;
    private CMITask safeSched = null;
    public static UUID hologramTestUuid = null;
    ScheduledExecutorService executor = null;
    ScheduledFuture<?> scheduledFuture = null;
    CMITask clickEvent = null;

    @Override
    public void getExtra(ConfigReader c) {
    }

    public static List<CMIVector3D> fibonacciSphere(int count) {
        return null;
    }

    public static List<CMIVector3D> fibonacciSphere(int count, double radius, CMIVector3D center) {
        return null;
    }

    @Override
    @CAnnotation(priority = 48, info = "Administration tools", args = "(removeseats/testtarget/convertitems)", tab = {
            "removeseats%%testtarget%%testsafe%%updatecommands%%convertitems" }, explanation = {}, regVar = { 1, 2 }, consoleVar = { 1, 2 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum actions {
        convertitems,
        removeseats,
        removechairs,
        testtarget,
        testsafe,
        allmobheads,
        allcommands,
        allcommandsperm,
        allpermissions,
        alltabcompletes,
        allplaceholders,
        allplayeroptions,
        updatecommands,
        emptyspace,
        testmaterials,
        testentities,
        testbiomes,
        drivetest,
        testrandomsafe,
        placeholdertest,
        statistictest,
        colorstoweb,
        colortest,
        mobtypes,
        materials,
        test,
        test2,
        test3,
        jsontest,
        placeblock,
        placeplatform,
        placetnt,
        cleararea,
        imortaldebug,
        fakeclickevents,
        dialogs,
        gc;

        public static actions getByname(String name) {
            return null;
        }
    }
}
