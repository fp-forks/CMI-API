package com.Zrips.CMI.Modules.Chat;

import java.util.HashMap;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Components.CMIComponentBase;
import com.Zrips.CMI.Containers.CMIEventPriority;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class ChatBubbleManager {
    private HashMap<UUID, CMIChatBubble> bubbles = null;
    private CMI plugin = null;
    private boolean publicMessages = false;
    private CMIEventPriority priority = null;
    private double offset = 0.0;
    private double baseShowFor = 0.0;
    private double maxShowFor = 0.0;
    private double extraTime = 0.0;
    private double scale = 0.0;
    private boolean shadow = false;
    private int range = 0;
    private Color backgroundColor = null;
    private int LineWidth = 0;

    public ChatBubbleManager(CMI plugin) {
    }

    public void loadConfig(ConfigReader cfg) {
    }

    public void clearCache(UUID uuid) {
    }

    public CMIChatBubble getBubble(UUID uuid) {
        return null;
    }

    public void showBubble(Player sender, String text, Set<Player> receivers) {
    }

    public void showBubble(Player sender, CMIComponentBase text, Set<Player> receivers) {
    }

    public double getOffset() {
        return 0.0;
    }

    public double getShowFor(String text) {
        return 0.0;
    }

    public boolean inRange(Location loc1, Location loc2) {
        return false;
    }

    public double getScale() {
        return 0.0;
    }

    public int getLineWidth() {
        return 0;
    }

    public Color getBackgroundColor() {
        return null;
    }

    public boolean isShadow() {
        return false;
    }

    public CMIEventPriority getPriority() {
        return null;
    }
}
