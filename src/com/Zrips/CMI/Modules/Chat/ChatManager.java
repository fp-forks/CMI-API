package com.Zrips.CMI.Modules.Chat;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIEventPriority;

public class ChatManager {
    private CMI plugin = null;
    private boolean ModifyChatFormat = false;
    private boolean ChatClickHoverMessages = false;
    private boolean ChatDiscordSRV = false;
    private String ChatDiscordSRVGlobalChannel = null;
    private String DiscordSRVLabel = null;
    private String DiscordSRVUnlinkedLabel = null;
    private boolean DiscordSRVRanged = false;
    private boolean ChatDynMapChat = false;
    private boolean ChatReplyToLastMessenger = false;
    private int LastMessengerTimeOut = 0;
    private boolean PrivateMessagesGroups = false;
    private boolean ColorsPublicMessages = false;
    private CMIEventPriority ColorsPublicMessagesPriority = null;
    private CMIEventPriority formatPublicMessagesPriority = null;
    private boolean ColorsPrivateMessage = false;
    private boolean ChatIgnorePublicMessage = false;
    private boolean ColorsMe = false;
    private boolean ColorsNickName = false;
    private List<String> cleanUpWhiteList = null;
    private Set<CMIPlayerMessageColor> chatColors = null;
    private Map<UUID, CMIPlayerMessageColor> messageColorCache = null;
    public static String fileName = null;

    public ChatManager(CMI plugin) {
    }

    public void addToCache(UUID uuid, CMIPlayerMessageColor color) {
    }

    public void removeFromCache(UUID uuid) {
    }

    public CMIPlayerMessageColor getColorFromCache(UUID uuid) {
        return null;
    }

    public boolean loadConfig(boolean isReload) {
        return false;
    }

    public boolean isModifyChatFormat() {
        return false;
    }

    public boolean isChatClickHoverMessages() {
        return false;
    }

    public boolean isColorsPublicMessages() {
        return false;
    }

    public boolean isColorsPrivateMessage() {
        return false;
    }

    public boolean isChatIgnorePublicMessage() {
        return false;
    }

    public List<String> getCleanUpWhiteList() {
        return null;
    }

    public boolean isChatReplyToLastMessenger() {
        return false;
    }

    public int getLastMessengerTimeOut() {
        return 0;
    }

    public boolean isColorsMe() {
        return false;
    }

    public boolean isChatDynMapChat() {
        return false;
    }

    public boolean isPrivateMessagesGroups() {
        return false;
    }

    public boolean isChatDiscordSRV() {
        return false;
    }

    public String getChatDiscordSRVGlobalChannel() {
        return null;
    }

    public String getDiscordSRVLabel() {
        return null;
    }

    public String getDiscordSRVUnlinkedLabel() {
        return null;
    }

    public boolean isDiscordSRVRanged() {
        return false;
    }

    public boolean isColorsNickName() {
        return false;
    }

    public Set<CMIPlayerMessageColor> getChatColors() {
        return null;
    }

    public CMIEventPriority getColorsPublicMessagesPriority() {
        return null;
    }

    public CMIEventPriority getFormatPublicMessagesPriority() {
        return null;
    }
}
