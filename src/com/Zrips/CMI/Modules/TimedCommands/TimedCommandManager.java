package com.Zrips.CMI.Modules.TimedCommands;

import java.util.Set;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class TimedCommandManager {
    private CMI plugin = null;
    private CMITask autoTimerBukkitId = null;
    private long nextIn = 0;
    private boolean delay = false;
    public Set<CMIUser> timed = null;
    private Runnable autoTimer = null;

    public TimedCommandManager(CMI plugin) {
    }

    public void addTimed(CMIUser user) {
    }

    public void stop() {
    }

    public boolean checkTFly(CMIUser user, boolean logout) {
        return false;
    }

    public boolean checkTGod(CMIUser user, boolean logout) {
        return false;
    }
}
