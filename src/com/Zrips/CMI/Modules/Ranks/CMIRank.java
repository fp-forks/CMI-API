package com.Zrips.CMI.Modules.Ranks;

import java.util.LinkedHashMap;
import java.util.List;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Ranks.RankManager.rankupFailType;
import com.Zrips.CMI.Modules.Statistics.StatsManager.CMIStatistic;

import net.Zrips.CMILib.Items.CMIItemStack;

public class CMIRank {
    private String name = null;
    private String displayName = null;
    private boolean enabled = false;
    private boolean defaultRank = false;
    private boolean AutoRankup = false;
    private boolean rankUpConfirmation = false;
    private List<CMIRank> nextRanks = null;
    private List<String> nextRanksT = null;
    private List<String> Commands = null;
    private List<String> CommandsOnRankDown = null;
    private LinkedHashMap<CMIStatistic, LinkedHashMap<Object, Long>> statRequirements = null;
    private LinkedHashMap<String, String> permRequirements = null;
    private LinkedHashMap<String, CMIRankPlaceholder> placeholderRequirements = null;
    private LinkedHashMap<String, Integer> mcmmoRequirements = null;
    private LinkedHashMap<String, Integer> aureliumRequirements = null;
    private LinkedHashMap<String, Integer> auraSkillsRequirements = null;
    private LinkedHashMap<String, Integer> JobsRequirements = null;
    private LinkedHashMap<CMIItemStack, Integer> ItemRequirements = null;
    private double moneyCost = 0.0;
    private double expCost = 0.0;
    private int votes = 0;
    private int weight = 0;

    public CMIRank(String name) {
    }

    public void reset() {
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
    }

    public boolean isEnabled() {
        return false;
    }

    public void setEnabled(boolean enabled) {
    }

    public boolean isDefaultRank() {
        return false;
    }

    public void setDefaultRank(boolean defaultRank) {
    }

    public boolean isRankUpConfirmation() {
        return false;
    }

    public void setRankUpConfirmation(boolean rankUpConfirmation) {
    }

    public List<CMIRank> getNextRanks() {
        return null;
    }

    public List<CMIRank> getNextValidRankUps(CMIUser user) {
        return null;
    }

    public boolean isOnSamePathWith(CMIRank rank2) {
        return false;
    }

    public List<CMIRank> getPreviousRanks() {
        return null;
    }

    public List<CMIRank> getValidPreviousRanks(CMIUser user) {
        return null;
    }

    public String getValidPreviousRanksAsString() {
        return null;
    }

    public rankupFailType canRankup(CMIUser user) {
        return null;
    }

    public double getMoneyCost() {
        return 0.0;
    }

    public void setMoneyCost(double moneyCost) {
    }

    public double getExpCost() {
        return 0.0;
    }

    public void setExpCost(double expCost) {
    }

    public List<String> getCommands() {
        return null;
    }

    public void setCommands(List<String> commands) {
    }

    public LinkedHashMap<CMIStatistic, LinkedHashMap<Object, Long>> getStatRequirements() {
        return null;
    }

    public LinkedHashMap<Object, Long> getStatRequirement(CMIStatistic stat) {
        return null;
    }

    public CMIRank addStatRequirement(CMIStatistic stat, String name, Long amount) {
        return null;
    }

    public void setStatRequirements(LinkedHashMap<CMIStatistic, LinkedHashMap<Object, Long>> statRequirements) {
    }

    public boolean isAutoRankup() {
        return false;
    }

    public void setAutoRankup(boolean autoRankup) {
    }

    public void setNextRanksT(List<String> nextRanksT) {
    }

    public void calculateNextRanks() {
    }

    public void finalizeRankup(CMIUser user) {
    }

    public void finalizeRankup(CMIUser user, Boolean commands, Boolean cost) {
    }

    @Deprecated
    public void takeExp(CMIUser user) {
    }

    @Deprecated
    public void takeMoney(CMIUser user) {
    }

    public void takeItems(CMIUser user) {
    }

    public void performCommands(CMIUser user) {
    }

    public void performCommandsOnRankDown(CMIUser user) {
    }

    public String getDisplayName() {
        return null;
    }

    public void setDisplayName(String displayName) {
    }

    public LinkedHashMap<String, String> getPermRequirements() {
        return null;
    }

    public void setPermRequirements(LinkedHashMap<String, String> permRequirements) {
    }

    public LinkedHashMap<String, Integer> getMcmmoRequirements() {
        return null;
    }

    public void setMcmmoRequirements(LinkedHashMap<String, Integer> mcmmoRequirements) {
    }

    public LinkedHashMap<String, Integer> getJobsRequirements() {
        return null;
    }

    public void setJobsRequirements(LinkedHashMap<String, Integer> jobsRequirements) {
    }

    public LinkedHashMap<CMIItemStack, Integer> getItemRequirements() {
        return null;
    }

    public void setItemRequirements(LinkedHashMap<CMIItemStack, Integer> itemRequirements) {
    }

    public int getVotes() {
        return 0;
    }

    public void setVotes(int votes) {
    }

    public List<String> getCommandsOnRankDown() {
        return null;
    }

    public void setCommandsOnRankDown(List<String> commandsOnRankDown) {
    }

    public int getWeight() {
        return 0;
    }

    public void setWeight(int weight) {
    }

    public LinkedHashMap<String, Integer> getAureliumRequirements() {
        return null;
    }

    public void setAureliumRequirements(LinkedHashMap<String, Integer> aureliumRequirements) {
    }

    public LinkedHashMap<String, Integer> getAuraSkillsRequirements() {
        return null;
    }

    public void setAuraSkillsRequirements(LinkedHashMap<String, Integer> aureliumRequirements) {
    }

    public LinkedHashMap<String, CMIRankPlaceholder> getPlaceholderRequirements() {
        return null;
    }

    public void setPlaceholderRequirements(LinkedHashMap<String, CMIRankPlaceholder> placeholderRequirements) {
    }
}
