package com.Zrips.CMI.Modules.ChatFilter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

import javax.annotation.Nullable;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIEventPriority;

public class ChatFilterManager {
    private CMI plugin = null;
    private Pattern simpleReplacer = null;
    private LinkedHashMap<String, String> simpleReplacerMap = null;
    private List<String> emojis = null;
    private HashMap<String, ChatFilterRule> rules = null;
    private ChatFilterRule whiteRules = null;
    private HashMap<UUID, MessageLog> spamMessages = null;
    private HashMap<UUID, MessageLog> spamCommands = null;
    private double similarityPercentage = 0.0;
    private boolean preventDoublicates = false;
    private int douplicateInterval = 0;
    private int douplicateChatMinAmount = 0;
    private double similarityComamndPercentage = 0.0;
    private boolean preventCommandDoublicates = false;
    private int douplicateCommandInterval = 0;
    private int douplicateCommandMinAmount = 0;
    private List<String> douplicateCommandWhiteList = null;
    private boolean capsFilter = false;
    private boolean lowerCase = false;
    private boolean cancelEvent = false;
    private int capsIgnoreUnder = 0;
    private int capsPercentage = 0;
    private List<String> capsCommands = null;
    private List<String> capsWhiteList = null;
    private CMIEventPriority capsCheckPriority = null;
    private CMIEventPriority filterCheckPriority = null;
    private CMIEventPriority simpleReplacerPriority = null;
    private CMIEventPriority commandSpamPriority = null;
    private CMIEventPriority chatSpamPriority = null;
    private CMIEventPriority signAdPriority = null;
    public final static String StringchatFilterFile = null;

    public ChatFilterManager(CMI plugin) {
    }

    public void clearCache(UUID uuid) {
    }

    public boolean checkCaps(Player player, String message) {
        return false;
    }

    public RuleResponse getCorrectMessage(Player player, String message) {
        return null;
    }

    @Nullable
    public String replaceEmoji(String message) {
        return null;
    }

    public RuleResponse getCorrectMessage(Player player, String message, boolean privateMessage) {
        return null;
    }

    public boolean isSpamedCommand(Player player, String message) {
        return false;
    }

    public boolean isSpam(Player player, String message) {
        return false;
    }

    public static double similarity(String s1, String s2) {
        return 0.0;
    }

    public static int editDistance(String s1, String s2) {
        return 0;
    }

    public void load() {
    }

    public void loadCommandFilters() {
    }

    public boolean isCancelCapEvent() {
        return false;
    }

    public boolean isCapToLowerCase() {
        return false;
    }

    public CMIEventPriority getCapsCheckPriority() {
        return null;
    }

    public CMIEventPriority getFilterCheckPriority() {
        return null;
    }

    public CMIEventPriority getSimpleReplacerPriority() {
        return null;
    }

    public CMIEventPriority getCommandSpamPriority() {
        return null;
    }

    public CMIEventPriority getChatSpamPriority() {
        return null;
    }

    public CMIEventPriority getSignAdvertisementPriority() {
        return null;
    }

    public HashMap<String, String> getEmojiReplacerMap() {
        return null;
    }

    public List<String> getEmojis() {
        return null;
    }
}
