package com.Zrips.CMI.Modules.Votifier;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListMap;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class VotifierManager {
    private CMI plugin = null;
    private List<String> CommandsOnVote = null;
    private List<String> ExcludeList = null;
    private boolean CountVotes = false;
    private boolean PerformCommands = false;
    private int cooldown = 0;
    private int MaxVotesInADay = 0;
    private HashMap<Integer, List<String>> rewards = null;
    private HashMap<UUID, HashMap<String, Long>> cooldowns = null;
    private HashMap<UUID, voteReminder> voteReminder = null;
    private ConcurrentSkipListMap<Double, CMIUser> Top = null;
    private Set<CMIUser> withVotes = null;
    Long lastUpdate = null;
    CMITask sched = null;
    int updateDelay = 0;
    boolean calculating = false;

    public VotifierManager(CMI plugin) {
    }

    public void removeVoteReminder(UUID uuid) {
    }

    public void addToVoteReminder(UUID uuid) {
    }

    public void loadConfig() {
    }

    @Deprecated
    public void processVote(CMIUser user, String service) {
    }

    public void processVote(CMIUser user, String service, String ip) {
    }

    public void updateVoteCountList(CMIUser user) {
    }

    public void updateTopList() {
    }

    public ConcurrentSkipListMap<Double, CMIUser> getTop() {
        return null;
    }

    public int getMaxVotesInADay() {
        return 0;
    }

    private class voteReminder {
        private int times = 0;
        private long last = 0;

        public voteReminder() {
        }

        public void recordNotified() {
        }

        public int getTimes() {
            return 0;
        }

        public long getLast() {
            return 0;
        }
    }
}
