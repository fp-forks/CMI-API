package com.Zrips.CMI.Modules.Sheduler;

import java.util.List;
import java.util.regex.Pattern;

import org.bukkit.entity.Player;

public class Schedule {
    private boolean enabled = false;
    private String name = null;
    private long performOn = 0;
    private boolean performed = false;
    private List<String> commands = null;
    private List<String> tempCommands = null;
    private List<String> minPlayerCommands = null;
    private boolean repeatable = false;
    private boolean randomize = false;
    private boolean duplicateRandomize = false;
    private boolean singleLinear = false;
    private long delay = 0;
    private long lastPerformedOn = 0;
    private List<SchedTime> time = null;
    private int MinPlayer = 0;
    private int MaxPlayer = 0;
    private boolean playerAmountFeedback = false;
    private double commandDelay = 0.0;
    private boolean dontTranslatePlaceholders = false;
    private boolean randomPlayer = false;
    Pattern placeholderKeepPatern = null;

    public Schedule(String name) {
    }

    public void reset() {
    }

    public String getDuplicatedRandomCommand() {
        return null;
    }

    public String getRandomCommand() {
        return null;
    }

    public String getSingleLinearCommand() {
        return null;
    }

    public List<String> getCommands() {
        return null;
    }

    public void setCommands(List<String> commands) {
    }

    public boolean isPerformed() {
        return false;
    }

    public void setPerformed(boolean performed) {
    }

    public boolean isPlayerAmountOk() {
        return false;
    }

    public boolean isPlayerMinOk() {
        return false;
    }

    public boolean isPlayerMaxOk() {
        return false;
    }

    public boolean itsTimeToPerform() {
        return false;
    }

    public void recalculateNext() {
    }

    public Long getPerformOn() {
        return null;
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
    }

    public boolean isRepeatable() {
        return false;
    }

    public void setRepeatable(boolean repeatable) {
    }

    public long getDelay() {
        return 0;
    }

    public void setDelay(long delay) {
    }

    public Long getLastPerformedOn() {
        return null;
    }

    public void setLastPerformedOn() {
    }

    public void setLastPerformedOn(Long lastPerformedOn) {
    }

    public List<SchedTime> getTime() {
        return null;
    }

    public void setTime(List<SchedTime> time) {
    }

    public Integer getMinPlayer() {
        return null;
    }

    public void setMinPlayer(Integer minPlayer) {
    }

    public Integer getMaxPlayer() {
        return null;
    }

    public void setMaxPlayer(Integer maxPlayer) {
    }

    public boolean isRandomize() {
        return false;
    }

    public void setRandomize(boolean randomize) {
    }

    public void safePerform() {
    }

    public void perform() {
    }

    public List<String> updateSchedCmds(List<String> cmds, Player player) {
        return null;
    }

    public Player getRandomPlayer() {
        return null;
    }

    public boolean isEnabled() {
        return false;
    }

    public void setEnabled(boolean enabled) {
    }

    public Boolean isPlayerAmountFeedback() {
        return null;
    }

    public void setPlayerAmountFeedback(Boolean playerAmountFeedback) {
    }

    public Double getTotalCommandDelay() {
        return null;
    }

    public boolean isSingleLinear() {
        return false;
    }

    public void setSingleLinear(boolean singleLinear) {
    }

    public boolean isDuplicateRandomize() {
        return false;
    }

    public void setDuplicateRandomize(boolean duplicateRandomize) {
    }

    public List<String> getMinPlayerCommands() {
        return null;
    }

    public void setMinPlayerCommands(List<String> minPlayerCommands) {
    }

    public boolean isDontTranslatePlaceholders() {
        return false;
    }

    public void setDontTranslatePlaceholders(boolean dontTranslatePlaceholders) {
    }
}
