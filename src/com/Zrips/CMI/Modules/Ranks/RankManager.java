package com.Zrips.CMI.Modules.Ranks;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;

import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class RankManager {
    private LinkedHashMap<String, CMIRank> ranks = null;
    private HashMap<UUID, Long> nextCheck = null;
    private HashMap<UUID, Long> nextAutoRecalculate = null;
    private HashMap<UUID, InformTimer> nextInform = null;
    private CMI plugin = null;
    BukkitScheduler scheduler = null;
    private HashMap<UUID, CMIRank> ranksCache = null;
    CMITask sched = null;
    CMITask recSched = null;
    HashMap<UUID, rankCache> percentCache = null;
    NumberFormat formatter = null;
    private String fileName = null;
    private int Delay = 0;
    private int Recalculation = 0;
    private boolean OnlyHours = false;
    private boolean includeMinutes = false;
    private boolean async = false;
    private boolean ListSamePathOnly = false;
    private int PlayerDelay = 0;
    private boolean progressBar = false;
    private boolean permissionCheck = false;
    private boolean strictPermissionCheck = false;
    private CMIPresetAnimations RanksEffect = null;

    public RankManager(CMI plugin) {
    }

    public CMIRank getNullRank(CMIUser user) {
        return null;
    }

    public CMIRank getRank(CMIUser user) {
        return null;
    }

    public CMIRank recalculateRank(CMIUser user) {
        return null;
    }

    public void setRank(CMIUser user, CMIRank rank) {
    }

    public void removeFromCheck(UUID uuid) {
    }

    public void stop() {
    }

    public void autoRecheck() {
    }

    public void run() {
    }

    public void addRank(CMIRank rank) {
    }

    public HashMap<String, CMIRank> getRanks() {
        return null;
    }

    public CMIRank getRank(String name) {
        return null;
    }

    public CMIRank getDefaultRank(Player player) {
        return null;
    }

    public boolean canRankUpAuto(CMIUser user) {
        return false;
    }

    public rankupFailType canRankUp(CMIUser user, CMIRank rank) {
        return null;
    }

    public boolean removeContents(Player player, LinkedHashMap<CMIItemStack, Integer> map) {
        return false;
    }

    public void listStatsRequirements(CommandSender sender, CMIUser user, CMIRank rank) {
    }

    public HashMap<CMIStatistic, LinkedHashMap<Object, rankCurrentRequirement>> getStatsRequirements(CMIUser user, CMIRank rank) {
        return null;
    }

    public Double getStatsDonePercentage(CMIUser user, CMIRank rank) {
        return null;
    }

    public Double getOverallDonePercentage(CMIUser user, CMIRank rank) {
        return null;
    }

    public Double getMoneyDonePercentage(CMIUser user, CMIRank rank) {
        return null;
    }

    public void listMoneyRequirements(CommandSender sender, CMIUser user, CMIRank rank) {
    }

    public Double getExpDonePercentage(CMIUser user, CMIRank rank) {
        return null;
    }

    public void listExpRequirements(CommandSender sender, CMIUser user, CMIRank rank) {
    }

    public Double getVoteDonePercentage(CMIUser user, CMIRank rank) {
        return null;
    }

    public void listVoteRequirements(CommandSender sender, CMIUser user, CMIRank rank) {
    }

    public void listPermRequirements(CommandSender sender, CMIUser user, CMIRank rank) {
    }

    public Double getPermDonePercentage(CMIUser user, CMIRank rank) {
        return null;
    }

    public Double getPlaceholderDonePercentage(CMIUser user, CMIRank rank) {
        return null;
    }

    public void listPlaceholderRequirements(CommandSender sender, CMIUser user, CMIRank rank) {
    }

    public Double getAureliumDonePercentage(CMIUser user, CMIRank rank) {
        return null;
    }

    public void listAureliumRequirements(CommandSender sender, CMIUser user, CMIRank rank) {
    }

    public Double getAuraSkillsDonePercentage(CMIUser user, CMIRank rank) {
        return null;
    }

    public void listAuraSkillsRequirements(CommandSender sender, CMIUser user, CMIRank rank) {
    }

    public Double getMcMMODonePercentage(CMIUser user, CMIRank rank) {
        return null;
    }

    public void listMcmmoRequirements(CommandSender sender, CMIUser user, CMIRank rank) {
    }

    public Double getJobsDonePercentage(CMIUser user, CMIRank rank) {
        return null;
    }

    public void listJobsRequirements(CommandSender sender, CMIUser user, CMIRank rank) {
    }

    public Double getItemDonePercentage(CMIUser user, CMIRank rank) {
        return null;
    }

    public void listItemRequirements(CommandSender sender, CMIUser user, CMIRank rank) {
    }

    public String translateValue(CMIStatistic stat, Long value) {
        return null;
    }

    @SuppressWarnings("unchecked")
    public void load() {
    }

    public void loadConfig() {
    }

    public boolean isProgressBar() {
        return false;
    }

    public boolean isListSamePathOnly() {
        return false;
    }

    public CMIPresetAnimations getRankEffect() {
        return null;
    }

    public boolean isPermissionCheck() {
        return false;
    }

    public boolean isStrictPermissionCheck() {
        return false;
    }

    public enum rankupFailType {
        Money, Exp, Stats, McMMO, Aurelium, AuraSkills, Jobs, Placeholoder, Perm, None, NoRank, Items, Votes, SameRank;
    }

    public enum rankupType {
        Money, Exp, Stats, McMMO, Aurelium, AuraSkills, Jobs, Perm, Placeholoder, Items, Votes;
    }

    public class rankCurrentRequirement {
        private Long need = null;
        private Long have = null;

        public rankCurrentRequirement(Long need, Long have) {
        }

        public Long getNeed() {
            return null;
        }

        public void setNeed(Long need) {
        }

        public Long getHave() {
            return null;
        }

        public void setHave(Long have) {
        }
    }

    private class donePercentage {
        private double percent = 0.0;
        private int times = 0;

        public double getPercent() {
            return 0.0;
        }

        public void addPercent(double percent) {
        }

        public int getTimes() {
            return 0;
        }

        public void incrementTimes() {
        }

        public void addIncrement(int times) {
        }
    }

    public class rankCache {
        HashMap<rankupType, Double> percentage = null;
        HashMap<rankupType, Long> nextPercentageCheck = null;
        long time = 0;

        public rankCache(long time) {
        }

        public rankCache() {
        }

        public boolean timeToCheck(rankupType type) {
            return false;
        }

        public Double getCache(rankupType type) {
            return null;
        }

        public void setCache(rankupType type, Double percent) {
        }
    }
}
